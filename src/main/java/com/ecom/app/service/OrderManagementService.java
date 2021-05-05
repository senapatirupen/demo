package com.ecom.app.service;

import com.ecom.app.entity.*;

import java.util.Collection;
import java.util.List;

public interface OrderManagementService {

    public Cart createCartByUserName(String userName, Cart cart);
    public Cart getCartByUserName(String userName);
    public Product createProduct(Product product);
    public Product getProductByName(String name);

    Collection<Product> viewAllProducts();

    public Cart addProductToCartWithProductByUserName(String userName, Product product);
    public Cart addProductToCartByNameForUserName(String userName, String name);
    public Cart removeProductFromCartByNameForUserName(String userName, String productName, Long cartId);
    public Collection<Order> createOrderByTransferProductFromCartToOrderByUserName(String userName);
    public Order createOrderByProductNameByUserName(String userName, String productName);
    public Collection<Order> getOrderByUserName(String userName);
    public Order addBillingAddressToOrder(String userName, Long orderId);
    public Order addShippingAndDeliveryAndDeliveryAddressToOrder(String userName, Long orderId, Long addressId,
                                                                 DeliveryAddress deliveryAddress);

    Order addShippingAddressToShippingForOrder(String userName, Long orderId, Long shippingId,
                                               ShippingAddress shippingAddress);

    Order setDeliverAndShippingAsDoneForOrder(String userName, Long orderId);

    Order setPaymentAsDoneForOrder(String userName, Long orderId);

    Order updateOrderAsDone(String userName, Long orderId);

    public Order addShippingAndReturnAndReturnAddressToOrder(String userName, Long orderId, Long addressId,
                                                             ReturnAddress returnAddress);

    Collection<Order> removeProductFromOrderByIds(String userName, Long orderId, List<Long> productIds);

    Collection<Order> viewProductsFromOrder(String userName, Long orderId);

    public Order addPaymentToOrder(String userName, Long orderId);

}
