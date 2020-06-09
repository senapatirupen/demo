package com.ecom.app.dto;

public class ProductForInventoryTransformer {
    public com.ecom.app.web.model.ProductForInventory transfer(com.ecom.app.entity.ProductForInventory fromProductForInventory){
        com.ecom.app.web.model.ProductForInventory toProductForInventory = new com.ecom.app.web.model.ProductForInventory();
//        toProductForInventory.setPrId(fromProductForInventory.getPrId());
        toProductForInventory.setName(fromProductForInventory.getName());
        toProductForInventory.setModel(fromProductForInventory.getModel());
        toProductForInventory.setMfdDate(fromProductForInventory.getMfdDate());
        toProductForInventory.setExpDate(fromProductForInventory.getExpDate());
        toProductForInventory.setPrice(fromProductForInventory.getPrice());
        toProductForInventory.setOfferPercentage(fromProductForInventory.getOfferPercentage());
        toProductForInventory.setSpecification(fromProductForInventory.getSpecification());
        toProductForInventory.setProductForInventoryStatus(fromProductForInventory.getProductForInventoryStatus());
//        toProductForInventory.setStock(fromProductForInventory.getStock());
        return toProductForInventory;
    }

    public com.ecom.app.entity.ProductForInventory transfer(com.ecom.app.web.model.ProductForInventory fromProductForInventory){
        com.ecom.app.entity.ProductForInventory toProductForInventory = new com.ecom.app.entity.ProductForInventory();
//        toProductForInventory.setPrId(fromProductForInventory.getPrId());
        toProductForInventory.setName(fromProductForInventory.getName());
        toProductForInventory.setModel(fromProductForInventory.getModel());
        toProductForInventory.setMfdDate(fromProductForInventory.getMfdDate());
        toProductForInventory.setExpDate(fromProductForInventory.getExpDate());
        toProductForInventory.setPrice(fromProductForInventory.getPrice());
        toProductForInventory.setOfferPercentage(fromProductForInventory.getOfferPercentage());
        toProductForInventory.setSpecification(fromProductForInventory.getSpecification());
        toProductForInventory.setProductForInventoryStatus(fromProductForInventory.getProductForInventoryStatus());
//        toProductForInventory.setStock(fromProductForInventory.getStock());
        return toProductForInventory;
    }
}
