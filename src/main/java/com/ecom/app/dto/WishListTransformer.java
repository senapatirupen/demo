package com.ecom.app.dto;

public class WishListTransformer {
    public com.ecom.app.web.model.WishList transfer(com.ecom.app.entity.WishList fromWishList){
        com.ecom.app.web.model.WishList toWishList = new com.ecom.app.web.model.WishList();
        toWishList.setWiId(fromWishList.getWiId());
        toWishList.setWishListStatus(fromWishList.getWishListStatus());
//        toWishList.setProducts(fromWishList.getProducts());
        return toWishList;
    }
}
