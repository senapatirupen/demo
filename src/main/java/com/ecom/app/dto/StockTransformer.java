package com.ecom.app.dto;

public class StockTransformer {
    public com.ecom.app.web.model.Stock transfer(com.ecom.app.entity.Stock fromStock){
        com.ecom.app.web.model.Stock toStock = new com.ecom.app.web.model.Stock();
        toStock.setStId(fromStock.getStId());
        toStock.setName(fromStock.getName());
        toStock.setStartDate(fromStock.getStartDate());
        toStock.setEndDate(fromStock.getEndDate());
        toStock.setExpectedDate(fromStock.getExpectedDate());
        toStock.setIsAvailable(fromStock.getIsAvailable());
        toStock.setQuantity(fromStock.getQuantity());
        toStock.setStockStatus(fromStock.getStockStatus());
        return toStock;
    }

    public com.ecom.app.entity.Stock transfer(com.ecom.app.web.model.Stock fromStock){
        com.ecom.app.entity.Stock toStock = new com.ecom.app.entity.Stock();
        toStock.setStId(fromStock.getStId());
        toStock.setName(fromStock.getName());
        toStock.setStartDate(fromStock.getStartDate());
        toStock.setEndDate(fromStock.getEndDate());
        toStock.setExpectedDate(fromStock.getExpectedDate());
        toStock.setIsAvailable(fromStock.getIsAvailable());
        toStock.setQuantity(fromStock.getQuantity());
        toStock.setStockStatus(fromStock.getStockStatus());
        return toStock;
    }
}
