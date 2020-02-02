package com.ecom.app.dto;

public class ReturnAddressTransformer {
    public com.ecom.app.web.model.ReturnAddress transfer(com.ecom.app.entity.ReturnAddress fromReturnAddress){
        com.ecom.app.web.model.ReturnAddress toReturnAddress = new com.ecom.app.web.model.ReturnAddress();
        toReturnAddress.setReadId(fromReturnAddress.getReadId());
        toReturnAddress.setReId(fromReturnAddress.getReId());
        toReturnAddress.setAddressLineOne(fromReturnAddress.getAddressLineOne());
        toReturnAddress.setAddressLineTwo(fromReturnAddress.getAddressLineTwo());
        toReturnAddress.setLandmark(fromReturnAddress.getLandmark());
        toReturnAddress.setCountry(fromReturnAddress.getCountry());
        toReturnAddress.setState(fromReturnAddress.getState());
        toReturnAddress.setCityVillage(fromReturnAddress.getCityVillage());
        toReturnAddress.setZipcode(fromReturnAddress.getZipcode());
        toReturnAddress.setType(fromReturnAddress.getType());
        return toReturnAddress;
    }

    public com.ecom.app.entity.ReturnAddress transfer(com.ecom.app.web.model.ReturnAddress fromReturnAddress){
        com.ecom.app.entity.ReturnAddress toReturnAddress = new com.ecom.app.entity.ReturnAddress();
        toReturnAddress.setReadId(fromReturnAddress.getReadId());
        toReturnAddress.setReId(fromReturnAddress.getReId());
        toReturnAddress.setAddressLineOne(fromReturnAddress.getAddressLineOne());
        toReturnAddress.setAddressLineTwo(fromReturnAddress.getAddressLineTwo());
        toReturnAddress.setLandmark(fromReturnAddress.getLandmark());
        toReturnAddress.setCountry(fromReturnAddress.getCountry());
        toReturnAddress.setState(fromReturnAddress.getState());
        toReturnAddress.setCityVillage(fromReturnAddress.getCityVillage());
        toReturnAddress.setZipcode(fromReturnAddress.getZipcode());
        toReturnAddress.setType(fromReturnAddress.getType());
        return toReturnAddress;
    }
}
