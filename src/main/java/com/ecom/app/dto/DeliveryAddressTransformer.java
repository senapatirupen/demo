package com.ecom.app.dto;

public class DeliveryAddressTransformer {
    public com.ecom.app.web.model.DeliveryAddress transfer(com.ecom.app.entity.DeliveryAddress fromDeliveryAddress){
        com.ecom.app.web.model.DeliveryAddress toDeliveryAddress = new com.ecom.app.web.model.DeliveryAddress();
        toDeliveryAddress.setDeadId(fromDeliveryAddress.getDeadId());
        toDeliveryAddress.setDeId(fromDeliveryAddress.getDeId());
        toDeliveryAddress.setAddressLineOne(fromDeliveryAddress.getAddressLineOne());
        toDeliveryAddress.setAddressLineTwo(fromDeliveryAddress.getAddressLineTwo());
        toDeliveryAddress.setLandmark(fromDeliveryAddress.getLandmark());
        toDeliveryAddress.setCountry(fromDeliveryAddress.getCountry());
        toDeliveryAddress.setState(fromDeliveryAddress.getState());
        toDeliveryAddress.setCityVillage(fromDeliveryAddress.getCityVillage());
        toDeliveryAddress.setZipcode(fromDeliveryAddress.getZipcode());
        toDeliveryAddress.setType(fromDeliveryAddress.getType());
        return toDeliveryAddress;
    }

    public com.ecom.app.entity.DeliveryAddress transfer(com.ecom.app.web.model.DeliveryAddress fromDeliveryAddress){
        com.ecom.app.entity.DeliveryAddress toDeliveryAddress = new com.ecom.app.entity.DeliveryAddress();
        toDeliveryAddress.setDeadId(fromDeliveryAddress.getDeadId());
        toDeliveryAddress.setDeId(fromDeliveryAddress.getDeId());
        toDeliveryAddress.setAddressLineOne(fromDeliveryAddress.getAddressLineOne());
        toDeliveryAddress.setAddressLineTwo(fromDeliveryAddress.getAddressLineTwo());
        toDeliveryAddress.setLandmark(fromDeliveryAddress.getLandmark());
        toDeliveryAddress.setCountry(fromDeliveryAddress.getCountry());
        toDeliveryAddress.setState(fromDeliveryAddress.getState());
        toDeliveryAddress.setCityVillage(fromDeliveryAddress.getCityVillage());
        toDeliveryAddress.setZipcode(fromDeliveryAddress.getZipcode());
        toDeliveryAddress.setType(fromDeliveryAddress.getType());
        return toDeliveryAddress;
    }
}
