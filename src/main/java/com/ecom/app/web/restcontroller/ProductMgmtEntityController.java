package com.ecom.app.web.restcontroller;

import com.ecom.app.entity.*;
import com.ecom.app.repository.ProductRepository;
import com.ecom.app.repository.UserDetailRepository;
import com.ecom.app.service.OrderManagementService;
import com.ecom.app.service.UserInteractionService;
import com.ecom.app.web.model.Poll;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController(value="/mgmt")
public class ProductMgmtEntityController {

    @Inject
    UserInteractionService userInteractionService;

    @Inject
    ProductRepository productRepository;

    @Inject
    UserDetailRepository userDetailRepository;

    @Inject
    ObjectMapper objectMapper;

    @Inject
    OrderManagementService orderManagementService;

    @PostMapping(value = "/createuser")
    public ResponseEntity<UserDetail> createUser(@RequestBody UserDetail userDetail) {
        userDetail  = userInteractionService.createUserDetail(userDetail);
        displayObjectAsJson(userDetail);
        return new ResponseEntity<>(userDetail, HttpStatus.OK);
    }

    @GetMapping(value = "/getuser/{userName}")
    public ResponseEntity<UserDetail> getUserByUserName(@PathVariable String userName) {
        UserDetail userDetail = userInteractionService.findUserDetailByUserName(userName);
        displayObjectAsJson(userDetail);
        return new ResponseEntity<>(userDetail, HttpStatus.OK);
    }

    @GetMapping(value = "/getperson/{userName}")
    public ResponseEntity<Person> getPersonByUserName(@PathVariable String userName) {
        Person person = userInteractionService.findPersonByUserName(userName);
        displayObjectAsJson(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping(value = "/createaddress/{userName}")
    public ResponseEntity<Address> createAddress(@PathVariable String userName, @RequestBody Address address) {
        Address newAddress  = userInteractionService.createAddress(userName, address);
        displayObjectAsJson(newAddress);
        return new ResponseEntity<>(newAddress, HttpStatus.OK);
    }

    @GetMapping(value = "/getaddress/{userName}")
    public ResponseEntity<Collection<Address>> getAddresses(@PathVariable String userName) {
        Collection<Address> newAddress  = userInteractionService.findPersonAddressesByUserName(userName);
        displayObjectAsJson(newAddress);
        return new ResponseEntity<>(newAddress, HttpStatus.OK);
    }

    @PostMapping(value = "/createcart/{userName}")
    public ResponseEntity<Cart> createCart(@PathVariable String userName, @RequestBody Cart cart) {
        cart  = orderManagementService.createCartByUserName(userName, cart);
        displayObjectAsJson(cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @GetMapping(value = "/getcart/{userName}")
    public ResponseEntity<Cart> getCart(@PathVariable String userName) {
        Cart cart  = orderManagementService.getCartByUserName(userName);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PostMapping(value = "/createproduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        product  = orderManagementService.createProduct(product);
        displayObjectAsJson(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping(value = "/getproduct/{productName}")
    public ResponseEntity<Product> getProduct(@PathVariable String productName) {
        Product product  = orderManagementService.getProductByName(productName);
        displayObjectAsJson(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping(value = "/addproducttocart/{userName}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable String userName, @RequestBody Product product) {
        Cart cart  = orderManagementService.addProductToCartWithProductByUserName(userName, product);
        displayObjectAsJson(cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PutMapping(value = "/addproducttocartbyname/{userName}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable String userName, @RequestParam String productName) {
        Cart cart  = orderManagementService.addProductToCartByNameForUserName(userName, productName);
        displayObjectAsJson(cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PutMapping(value = "/removeproductfromcartbyname/{userName}")
    public ResponseEntity<Cart> removeProductFromCart(@PathVariable String userName, @RequestParam String productName, @RequestParam Long cartId) {
        Cart cart  = orderManagementService.removeProductFromCartByNameForUserName(userName, productName, cartId);
        displayObjectAsJson(cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PostMapping(value = "/createorderbyproductname/{userName}")
    public ResponseEntity<Order> createProduct(@PathVariable String userName, @RequestParam String productName ) {
        Order order  = orderManagementService.createOrderByProductNameByUserName(userName, productName);
        displayObjectAsJson(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping(value = "/transferproductfromcarttoorder/{userName}")
    public ResponseEntity<Collection<Order>> transferProductFromCartToOrder(@PathVariable String userName) {
        Collection<Order> orders  = orderManagementService.createOrderByTransferProductFromCartToOrderByUserName(userName);
        displayObjectAsJson(orders);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PutMapping(value = "/addbillingaddresstoorder/{userName}")
    public ResponseEntity<Order> addBillingAddressToOrder(@PathVariable String userName, @RequestParam Long orderId) {
        Order order  = orderManagementService.addBillingAddressToOrder(userName, orderId);
        displayObjectAsJson(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping(value = "/addpaymenttoorder/{userName}")
    public ResponseEntity<Order> addPaymentToOrder(@PathVariable String userName, @RequestParam Long orderId) {
        Order order  = orderManagementService.addPaymentToOrder(userName, orderId);
        displayObjectAsJson(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping(value = "/addshippinganddeliveryanddeliveryaddresstoorder/{userName}")
    public ResponseEntity<Order> addShippingAndDeliveryAndDeliveryAddressToOrder(@PathVariable String userName, @RequestParam Long orderId, @RequestParam Long addressId, @RequestBody DeliveryAddress deliveryAddress) {
        Order order  = orderManagementService.addShippingAndDeliveryAndDeliveryAddressToOrder(userName, orderId, addressId, deliveryAddress);
        displayObjectAsJson(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping(value = "/addshippingandreturnandreturnaddresstoorder/{userName}")
    public ResponseEntity<Order> addShippingAndReturnAndReturnAddressToOrder(@PathVariable String userName, @RequestParam Long orderId, @RequestParam Long addressId, @RequestBody ReturnAddress returnAddress) {
        Order order  = orderManagementService.addShippingAndReturnAndReturnAddressToOrder(userName, orderId, addressId, returnAddress);
        displayObjectAsJson(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    private void displayObjectAsJson(Object obj) {
        try{
            log.info("object as json >>>>>> {}",objectMapper.writeValueAsString(obj));
        } catch (JsonProcessingException e){
            log.error(e.getMessage(), e);
        }
    }
}
