package com.ecom.app.mapper;

import com.ecom.app.web.model.Address;
import com.ecom.app.web.model.Cart;
import com.ecom.app.web.model.Product;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressMapperTest {
    MapperFactory mapperFactory;

    @Before
    public void setUp(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    @Test
    public void testAddressMapping(){
        Address address = new Address();
        address.setAddressLineOne("address line one");
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        com.ecom.app.entity.Address address1 = mapperFacade.map(address, com.ecom.app.entity.Address.class);
        assertEquals(address.getAddressLineOne(), address1.getAddressLineOne());
    }

    @Test
    public void testCartMapping(){
        Cart cart = new Cart();
        cart.setCartStatus("not empty");
        Product product = new Product();
        product.setName("phone");
        List<Product> products = new ArrayList<Product>();
        products.add(product);
        cart.setProducts(products);
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        com.ecom.app.entity.Cart cart1 = mapperFacade.map(cart, com.ecom.app.entity.Cart.class);
        assertEquals(cart.getCartStatus(), cart1.getCartStatus());
        assertEquals(cart.getProducts().iterator().next().getModel(), cart1.getProducts().iterator().next().getModel());
    }
}
