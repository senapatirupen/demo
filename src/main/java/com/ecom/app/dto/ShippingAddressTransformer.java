package com.ecom.app.dto;

public class ShippingAddressTransformer {
    public com.ecom.app.web.model.ShippingAddress transfer(com.ecom.app.entity.ShippingAddress fromShippingAddress){
        com.ecom.app.web.model.ShippingAddress toShippingAddress = new com.ecom.app.web.model.ShippingAddress();
        toShippingAddress.setShadId(fromShippingAddress.getShadId());
        toShippingAddress.setShId(fromShippingAddress.getShId());
        toShippingAddress.setAddressLineOne(fromShippingAddress.getAddressLineOne());
        toShippingAddress.setAddressLineTwo(fromShippingAddress.getAddressLineTwo());
        toShippingAddress.setLandmark(fromShippingAddress.getLandmark());
        toShippingAddress.setCountry(fromShippingAddress.getCountry());
        toShippingAddress.setState(fromShippingAddress.getState());
        toShippingAddress.setCityVillage(fromShippingAddress.getCityVillage());
        toShippingAddress.setZipcode(fromShippingAddress.getZipcode());
        toShippingAddress.setType(fromShippingAddress.getType());
        return toShippingAddress;
    }

    public com.ecom.app.entity.ShippingAddress transfer(com.ecom.app.web.model.ShippingAddress fromShippingAddress){
        com.ecom.app.entity.ShippingAddress toShippingAddress = new com.ecom.app.entity.ShippingAddress();
        toShippingAddress.setShadId(fromShippingAddress.getShadId());
        toShippingAddress.setShId(fromShippingAddress.getShId());
        toShippingAddress.setAddressLineOne(fromShippingAddress.getAddressLineOne());
        toShippingAddress.setAddressLineTwo(fromShippingAddress.getAddressLineTwo());
        toShippingAddress.setLandmark(fromShippingAddress.getLandmark());
        toShippingAddress.setCountry(fromShippingAddress.getCountry());
        toShippingAddress.setState(fromShippingAddress.getState());
        toShippingAddress.setCityVillage(fromShippingAddress.getCityVillage());
        toShippingAddress.setZipcode(fromShippingAddress.getZipcode());
        toShippingAddress.setType(fromShippingAddress.getType());
        return toShippingAddress;
    }
}
