package com.ecom.app.service;

import com.ecom.app.entity.Cart;
import com.ecom.app.entity.DeliveryAddress;
import com.ecom.app.entity.Order;
import com.ecom.app.entity.Product;

import java.util.Collection;

public interface OrderManagementService {

    public Cart createCartByUserName(String userName, Cart cart);
    public Cart getCartByUserName(String userName);
    public Product createProduct(Product product);
    public Product getProductByName(String name);
    public Cart addProductToCartWithProductByUserName(String userName, Product product);
    public Cart addProductToCartByNameForUserName(String userName, String name);
    public Collection<Order> createOrderByTransferProductFromCartToOrderByUserName(String userName);
    public Order createOrderByProductNameByUserName(String userName, String productName);
    public Collection<Order> getOrderByUserName(String userName);
    public Order addBillingAddressToOrder(String userName, Long orderId);
    public Order addShippingAndDeliveryAndDeliveryAddressToOrder(String userName, Long orderId, Long addressId,
                                                                 DeliveryAddress deliveryAddress);

}
