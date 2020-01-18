package com.ecom.app.service;

import com.ecom.app.entity.*;
import com.ecom.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;

public class GenericEcomServiceImpl {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    DeliveryRepository deliveryRepository;
    @Autowired
    FeedbackRepository feedbackRepository;
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ReturnRepository returnRepository;
    @Autowired
    ShippingRepository shippingRepository;
    @Autowired
    StockRepository stockRepository;
    @Autowired
    UserDetailRepository userDetailRepository;
    @Autowired
    WishListRepository wishListRepository;

    public Collection<Address> findAllAddress() {
        return addressRepository.findAll();
    }

    public Optional<Address> findAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public Address saveStock(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    public void deleteAddress(Address address) {
        addressRepository.delete(address);
    }

    public Boolean existsAddressById(Long id) {
        return addressRepository.existsById(id);
    }

    public Collection<Cart> findAllCart() {
        return cartRepository.findAll();
    }

    public Optional<Cart> findCartById(Long id) {
        return cartRepository.findById(id);
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    public void deleteCart(Cart cart) {
        cartRepository.delete(cart);
    }

    public Boolean existsCartById(Long id) {
        return cartRepository.existsById(id);
    }

    public Collection<Delivery> findAllDelivery() {
        return deliveryRepository.findAll();
    }

    public Optional<Delivery> findDeliveryById(Long id) {
        return deliveryRepository.findById(id);
    }

    public Delivery saveDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public void deleteDelivery(Long id) {
        deliveryRepository.deleteById(id);
    }

    public void deleteDelivery(Delivery delivery) {
        deliveryRepository.delete(delivery);
    }

    public Boolean existsDeliveryById(Long id) {
        return deliveryRepository.existsById(id);
    }

    public Collection<Feedback> findAllFeedback() {
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> findFeedbackById(Long id) {
        return feedbackRepository.findById(id);
    }

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }

    public void deleteFeedback(Feedback feedback) {
        feedbackRepository.delete(feedback);
    }

    public Boolean existsFeedbackById(Long id) {
        return feedbackRepository.existsById(id);
    }

    public Collection<Invoice> findAllInvoice() {
        return invoiceRepository.findAll();
    }

    public Optional<Invoice> findInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }

    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
    }

    public Boolean existsInvoiceById(Long id) {
        return invoiceRepository.existsById(id);
    }

    public Collection<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    public Optional<Order> findOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    public Boolean existsOrderById(Long id) {
        return orderRepository.existsById(id);
    }

    public Collection<Payment> findAllPayment() {
        return paymentRepository.findAll();
    }

    public Optional<Payment> findPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }

    public void deletePayment(Payment payment) {
        paymentRepository.delete(payment);
    }

    public Boolean existsPaymentById(Long id) {
        return paymentRepository.existsById(id);
    }

    public Collection<Person> findAllPerson() {
        return personRepository.findAll();
    }

    public Optional<Person> findPersonById(Long id) {
        return personRepository.findById(id);
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public void deletePerson(Person person) {
        personRepository.delete(person);
    }

    public Boolean existsPersonById(Long id) {
        return personRepository.existsById(id);
    }

    public Collection<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public Boolean existsProductById(Long id) {
        return productRepository.existsById(id);
    }

    public Collection<Return> findAllReturn() {
        return returnRepository.findAll();
    }

    public Optional<Return> findReturnById(Long id) {
        return returnRepository.findById(id);
    }

    public Return saveReturn(Return returns) {
        return returnRepository.save(returns);
    }

    public void deleteReturn(Long id) {
        returnRepository.deleteById(id);
    }

    public void deleteReturn(Return returns) {
        returnRepository.delete(returns);
    }

    public Boolean existsReturnById(Long id) {
        return returnRepository.existsById(id);
    }

    public Collection<Shipping> findAllShipping() {
        return shippingRepository.findAll();
    }

    public Optional<Shipping> findShippingById(Long id) {
        return shippingRepository.findById(id);
    }

    public Shipping saveShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    public void deleteShipping(Long id) {
        shippingRepository.deleteById(id);
    }

    public void deleteShipping(Shipping shipping) {
        shippingRepository.delete(shipping);
    }

    public Boolean existsShippingById(Long id) {
        return shippingRepository.existsById(id);
    }

    public Collection<Stock> findAllStock() {
        return stockRepository.findAll();
    }

    public Optional<Stock> findStockById(Long id) {
        return stockRepository.findById(id);
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    public void deleteStock(Stock stock) {
        stockRepository.delete(stock);
    }

    public Boolean existsStockById(Long id) {
        return stockRepository.existsById(id);
    }

    public Collection<UserDetail> findAllUserDetail() {
        return userDetailRepository.findAll();
    }

    public Optional<UserDetail> findUserDetailById(Long id) {
        return userDetailRepository.findById(id);
    }

    public UserDetail saveUserDetail(UserDetail userDetail) {
        return userDetailRepository.save(userDetail);
    }

    public void deleteUserDetail(Long id) {
        userDetailRepository.deleteById(id);
    }

    public void deleteUserDetail(UserDetail userDetail) {
        userDetailRepository.delete(userDetail);
    }

    public Boolean existsUserDetailById(Long id) {
        return userDetailRepository.existsById(id);
    }

    public Collection<WishList> findAllWishList() {
        return wishListRepository.findAll();
    }

    public Optional<WishList> findWishListById(Long id) {
        return wishListRepository.findById(id);
    }

    public WishList saveWishList(WishList wishList) {
        return wishListRepository.save(wishList);
    }

    public void deleteWishList(Long id) {
        wishListRepository.deleteById(id);
    }

    public void deleteWishList(WishList wishList) {
        wishListRepository.delete(wishList);
    }

    public Boolean existsWishListById(Long id) {
        return wishListRepository.existsById(id);
    }

}
