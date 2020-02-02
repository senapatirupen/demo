package com.ecom.app.dto;

import io.jsonwebtoken.lang.Collections;

import java.util.Collection;

public class ProductTransformer {
    public com.ecom.app.web.model.Product transfer(com.ecom.app.entity.Product fromProduct) {
        com.ecom.app.web.model.Product toProduct = new com.ecom.app.web.model.Product();
        toProduct.setPrId(fromProduct.getPrId());
        toProduct.setOdId(fromProduct.getOdId());
        toProduct.setCaId(fromProduct.getCaId());
        toProduct.setName(fromProduct.getName());
        toProduct.setModel(fromProduct.getModel());
        toProduct.setProductStatus(fromProduct.getProductStatus());
//        toProduct.setFeedback(fromProduct.getFeedback());
        toProduct.setIsStockAvailable(fromProduct.getIsStockAvailable());
        return toProduct;
    }

    public com.ecom.app.entity.Product transfer(com.ecom.app.web.model.Product fromProduct) {
        com.ecom.app.entity.Product toProduct = new com.ecom.app.entity.Product();
        toProduct.setPrId(fromProduct.getPrId());
        toProduct.setOdId(fromProduct.getOdId());
        toProduct.setCaId(fromProduct.getCaId());
        toProduct.setName(fromProduct.getName());
        toProduct.setModel(fromProduct.getModel());
        toProduct.setProductStatus(fromProduct.getProductStatus());
//        toProduct.setFeedback(fromProduct.getFeedback());
        toProduct.setIsStockAvailable(fromProduct.getIsStockAvailable());
        return toProduct;
    }

    public Collection<com.ecom.app.web.model.Product> transfer(Collection<com.ecom.app.entity.Product> fromProducts) {
        Collection<com.ecom.app.web.model.Product> toProducts = null;
        if (!Collections.isEmpty(fromProducts)) {
            for (com.ecom.app.entity.Product product : fromProducts) {
                toProducts.add(transfer(product));
            }
        }
        return toProducts;
    }
}
