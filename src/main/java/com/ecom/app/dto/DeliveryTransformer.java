package com.ecom.app.dto;

public class DeliveryTransformer {
    public com.ecom.app.web.model.Delivery transfer(com.ecom.app.entity.Delivery fromDelivery){
        com.ecom.app.web.model.Delivery toDelivery = new com.ecom.app.web.model.Delivery();
        toDelivery.setDeId(fromDelivery.getDeId());
        toDelivery.setPrIds(fromDelivery.getPrIds());
        toDelivery.setShId(fromDelivery.getShId());
        toDelivery.setDeliveryStatus(fromDelivery.getDeliveryStatus());
        toDelivery.setProductHealthStatus(fromDelivery.getProductHealthStatus());
        toDelivery.setPackagingStatus(fromDelivery.getPackagingStatus());
        toDelivery.setStartDate(fromDelivery.getStartDate());
        toDelivery.setEndDate(fromDelivery.getEndDate());
        toDelivery.setExpectedDate(fromDelivery.getExpectedDate());
//        toDelivery.setDeliveryAddress(fromDelivery.getDeliveryAddress());
        return toDelivery;
    }

    public com.ecom.app.entity.Delivery transfer(com.ecom.app.web.model.Delivery fromDelivery){
        com.ecom.app.entity.Delivery toDelivery = new com.ecom.app.entity.Delivery();
        toDelivery.setDeId(fromDelivery.getDeId());
        toDelivery.setPrIds(fromDelivery.getPrIds());
        toDelivery.setShId(fromDelivery.getShId());
        toDelivery.setDeliveryStatus(fromDelivery.getDeliveryStatus());
        toDelivery.setProductHealthStatus(fromDelivery.getProductHealthStatus());
        toDelivery.setPackagingStatus(fromDelivery.getPackagingStatus());
        toDelivery.setStartDate(fromDelivery.getStartDate());
        toDelivery.setEndDate(fromDelivery.getEndDate());
        toDelivery.setExpectedDate(fromDelivery.getExpectedDate());
//        toDelivery.setDeliveryAddress(fromDelivery.getDeliveryAddress());
        return toDelivery;
    }
}
