package com.ecom.app.dto;

public class ShippingTransformer {
    public com.ecom.app.web.model.Shipping transfer(com.ecom.app.entity.Shipping fromShipping){
        com.ecom.app.web.model.Shipping toShipping = new com.ecom.app.web.model.Shipping();
        toShipping.setShId(fromShipping.getShId());
        toShipping.setPrIds(fromShipping.getPrIds());
        toShipping.setOdId(fromShipping.getOdId());
        toShipping.setShippingStatus(fromShipping.getShippingStatus());
        toShipping.setProductHealthStatus(fromShipping.getProductHealthStatus());
        toShipping.setPackagingCharge(fromShipping.getPackagingCharge());
        toShipping.setStartDate(fromShipping.getStartDate());
        toShipping.setEndDate(fromShipping.getEndDate());
        toShipping.setExpectedDate(fromShipping.getExpectedDate());
        toShipping.setCourierPerson(fromShipping.getCourierPerson());
//        toShipping.setShippingAddress(fromShipping.getShippingAddress());
//        toShipping.setDelivery(fromShipping.getDelivery());
        return toShipping;
    }

    public com.ecom.app.entity.Shipping transfer(com.ecom.app.web.model.Shipping fromShipping){
        com.ecom.app.entity.Shipping toShipping = new com.ecom.app.entity.Shipping();
        toShipping.setShId(fromShipping.getShId());
        toShipping.setPrIds(fromShipping.getPrIds());
        toShipping.setOdId(fromShipping.getOdId());
        toShipping.setShippingStatus(fromShipping.getShippingStatus());
        toShipping.setProductHealthStatus(fromShipping.getProductHealthStatus());
        toShipping.setPackagingCharge(fromShipping.getPackagingCharge());
        toShipping.setStartDate(fromShipping.getStartDate());
        toShipping.setEndDate(fromShipping.getEndDate());
        toShipping.setExpectedDate(fromShipping.getExpectedDate());
        toShipping.setCourierPerson(fromShipping.getCourierPerson());
//        toShipping.setShippingAddress(fromShipping.getShippingAddress());
//        toShipping.setDelivery(fromShipping.getDelivery());
        return toShipping;
    }
}
