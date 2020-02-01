package com.ecom.app.dto;

public class AddressTransformer {
    public com.ecom.app.web.model.Address transfer(com.ecom.app.entity.Address fromAddress){
        com.ecom.app.web.model.Address toAddress = new com.ecom.app.web.model.Address();
        toAddress.setAdId(fromAddress.getAdId());
        toAddress.setPeId(fromAddress.getPeId());
        toAddress.setAddressLineOne(fromAddress.getAddressLineOne());
        toAddress.setAddressLineTwo(fromAddress.getAddressLineTwo());
//        toAddress.setLandMark(fromAddress.getLandmark());
        toAddress.setCountry(fromAddress.getCountry());
        toAddress.setState(fromAddress.getState());
        toAddress.setCityVillage(fromAddress.getCityVillage());
        toAddress.setZipcode(fromAddress.getZipcode());
        toAddress.setType(fromAddress.getType());
        return toAddress;
    }
}
