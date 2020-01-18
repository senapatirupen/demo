package com.ecom.app.service;

import com.ecom.app.entity.Payment;
import com.ecom.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EcomInitServiceImpl implements EcomInitService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CartRepository cartRepository;
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
    UserDetailRepository userDetailRepository;
    @Autowired
    UserRepository userRepository;
}
