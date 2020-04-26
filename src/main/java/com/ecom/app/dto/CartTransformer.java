package com.ecom.app.dto;

import com.ecom.app.web.model.Product;
import io.jsonwebtoken.lang.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CartTransformer {
    @Autowired
    ProductTransformer productTransformer;
    public com.ecom.app.web.model.Cart transfer(com.ecom.app.entity.Cart fromCart){
        com.ecom.app.web.model.Cart toCart = new com.ecom.app.web.model.Cart();
        toCart.setCaId(fromCart.getCaId());
        toCart.setCartStatus(fromCart.getCartStatus());
        toCart.setPeId(fromCart.getPeId());
        toCart.setProducts(productTransformer.transfer(fromCart.getProducts()));
        return toCart;
    }

    public com.ecom.app.entity.Cart transfer(com.ecom.app.web.model.Cart fromCart){
        com.ecom.app.entity.Cart toCart = new com.ecom.app.entity.Cart();
        toCart.setCaId(fromCart.getCaId());
        toCart.setCartStatus(fromCart.getCartStatus());
        toCart.setPeId(fromCart.getPeId());
//        toCart.setProducts(fromCart.getProducts());
        return toCart;
    }

}
