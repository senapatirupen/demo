package com.ecom.app.dto;

public class CartTransformer {
    public com.ecom.app.web.model.Cart transfer(com.ecom.app.entity.Cart fromCart){
        com.ecom.app.web.model.Cart toCart = new com.ecom.app.web.model.Cart();
        toCart.setCaId(fromCart.getCaId());
        toCart.setCartStatus(fromCart.getCartStatus());
        toCart.setPeId(fromCart.getPeId());
//        toCart.setProducts(fromCart.getProducts());
        return toCart;
    }
}
