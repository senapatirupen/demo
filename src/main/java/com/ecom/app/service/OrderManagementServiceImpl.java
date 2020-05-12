package com.ecom.app.service;

import com.ecom.app.entity.*;
import com.ecom.app.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class OrderManagementServiceImpl implements OrderManagementService {

    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    BillingAddressRepository billingAddressRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    DeliveryRepository deliveryRepository;
    @Autowired
    ShippingRepository shippingRepository;

    @Override
    public Cart createCartByUserName(String userName, Cart cart) {
        Person person = personRepository.findByUserName(userName);
        cart.setPeId(person.getPeId());
        Cart newCart = cartRepository.save(cart);
        person.setCart(newCart);
        personRepository.save(person);
        log.info("Existing Person >>>>> {}", person.toString());
        log.info("New Cart >>>>> {}", newCart.toString());
        return newCart;
    }

    @Override
    public Cart getCartByUserName(String userName) {
        Cart cart = personRepository.findCartByUserName(userName);
        log.info("New Cart >>>>> {}", cart.toString());
        return cart;
    }

    @Override
    public Product createProduct(Product product) {
        Product newProduct = productRepository.save(product);
        log.info("New Product >>>>> {}", newProduct.toString());
        return newProduct;
    }

    @Override
    public Product getProductByName(String name) {
        Product product = productRepository.findByName(name);
        log.info("New Product >>>>> {}", product.toString());
        return product;
    }

    @Override
    public Cart addProductToCartWithProductByUserName(String userName, Product product) {
        Cart cart = personRepository.findCartByUserName(userName);
        setProductForCart(cart, product);
        cartRepository.save(cart);
        return cart;
    }

    @Override
    public Cart addProductToCartByNameForUserName(String userName, String name) {
        Person person = personRepository.findByUserName(userName);
        Cart cart = person.getCart();
        Product product = productRepository.findByName(name);
        setProductForCart(cart, product);
        cartRepository.save(cart);
        return cart;
    }

    @Override
    public Collection<Order> createOrderByTransferProductFromCartToOrderByUserName(String userName) {
        Person person = personRepository.findByUserName(userName);
        Cart cart = person.getCart();
        Order order = new Order();
        order.setPeId(person.getPeId());
        Order newOrder = orderRepository.save(order);
        Collection<Product> products = cart.getProducts();
        products.stream().forEach(product -> {
            product.setCaId(null);
            product.setOdId(newOrder.getOdId());
            productRepository.save(product);
        });
        order.setProducts(products);
        cart.setProducts(null);
        cartRepository.save(cart);
        setOrderForPerson(person, order);
        personRepository.save(person);
        orderRepository.save(order);
        log.info("New Order >>>>> {}", newOrder.toString());
        return person.getOrders();
    }

    @Override
    public Order addBillingAddressToOrder(String userName, Long orderId) {
        Person person = personRepository.findByUserName(userName);
        Order order = orderRepository.findOrderByPersonId(person.getPeId());
        Address address = addressRepository.findByType("BILLING");
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setZipcode(address.getZipcode());
        billingAddress.setOdId(orderId);
        billingAddressRepository.save(billingAddress);
        order.setBillingAddress(billingAddress);
        orderRepository.save(order);
        return order;
    }

    @Override
    public Order addShippingAndDeliveryAndDeliveryAddressToOrder(String userName, Long orderId, Long addressId,
                                                                 DeliveryAddress deliveryAddress) {
        Person person = personRepository.findByUserName(userName);
        Order order = orderRepository.findOrderByPersonId(person.getPeId());
        if(null != addressId) {
            Address address = addressRepository.findById(addressId).get();
            deliveryAddress.setZipcode(address.getZipcode());
            deliveryAddress.setType("DELIVERY");
        }
        Shipping shipping = new Shipping();
        Delivery delivery = new Delivery();
        delivery.setDeliveryAddress(deliveryAddress);
        deliveryRepository.save(delivery);
        shipping.setDelivery(delivery);
        shipping.setOdId(orderId);
        shippingRepository.save(shipping);
        delivery.setShId(shipping.getShId());
        setShippingForOrder(order, shipping);
        deliveryRepository.save(delivery);
        return order;
    }

//    @Override
    public Order addProductToOrderFromUserNameByProductName(String userName, String productName) {
//        Order newOrder = orderRepository.save(order);
//        log.info("New Order >>>>> {}", newOrder.toString());
        return null;
    }



    @Override
    public Order createOrderByProductNameByUserName(String userName, String productName) {
        Person person = personRepository.findByUserName(userName);
        Product product = productRepository.findByName(productName);
        Order order = new Order();
        order.setPeId(person.getPeId());
        setProductForOrder(order, product);
        Order newOrder = orderRepository.save(order);
        setOrderForPerson(person, newOrder);
        personRepository.save(person);
        log.info("New Order >>>>> {}", newOrder.toString());
        return newOrder;
    }

    @Override
    public Collection<Order> getOrderByUserName(String userName) {
        Person person = personRepository.findByUserName(userName);
        return person.getOrders();
    }

    private Order setProductForOrder(Order order, Product product){
        if(!CollectionUtils.isEmpty(order.getProducts())){
            order.getProducts().add(product);
        } else {
            Set<Product> productSet = new HashSet<Product>();
            productSet.add(product);
            order.setProducts(productSet);
        }
        return order;
    }

    private Person setOrderForPerson(Person person, Order order){
        if(!CollectionUtils.isEmpty(person.getOrders())){
            person.getOrders().add(order);
        } else {
            Set<Order> orderSet = new HashSet<Order>();
            orderSet.add(order);
            person.setOrders(orderSet);
        }
        return person;
    }

    private Person setProductForPerson(Person person, Product product){
        if(!CollectionUtils.isEmpty(person.getProducts())){
            person.getProducts().add(product);
        } else {
            Set<Product> productSet = new HashSet<Product>();
            productSet.add(product);
            person.setProducts(productSet);
        }
        return person;
    }

    private Cart setProductForCart(Cart cart, Product product){
        if(!CollectionUtils.isEmpty(cart.getProducts())){
            cart.getProducts().add(product);
        } else {
            Set<Product> productSet = new HashSet<Product>();
            productSet.add(product);
            cart.setProducts(productSet);
        }
        return cart;
    }

    private Order setShippingForOrder(Order order, Shipping shipping){
        if(!CollectionUtils.isEmpty(order.getShippings())){
            order.getShippings().add(shipping);
        } else {
            Set<Shipping> shippingSet = new HashSet<Shipping>();
            shippingSet.add(shipping);
            order.setShippings(shippingSet);
        }
        return order;
    }

}
