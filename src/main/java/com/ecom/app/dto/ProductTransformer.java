package com.ecom.app.dto;

public class ProductTransformer {
    public com.ecom.app.web.model.Product transfer(com.ecom.app.entity.Product fromProduct){
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
}
