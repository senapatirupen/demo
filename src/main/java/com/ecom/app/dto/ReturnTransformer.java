package com.ecom.app.dto;

import com.ecom.app.entity.ReturnProduct;

public class ReturnTransformer {
    public com.ecom.app.web.model.Return transfer(ReturnProduct fromReturnProduct){
        com.ecom.app.web.model.Return toReturn = new com.ecom.app.web.model.Return();
        toReturn.setReId(fromReturnProduct.getReId());
        toReturn.setOdId(fromReturnProduct.getShId());
        toReturn.setPrIds(fromReturnProduct.getPrIds());
        toReturn.setStartDate(fromReturnProduct.getStartDate());
        toReturn.setEndDate(fromReturnProduct.getEndDate());
        toReturn.setExpectedDate(fromReturnProduct.getExpectedDate());
        toReturn.setReturnStatus(fromReturnProduct.getReturnStatus());
        toReturn.setIsReturned(Boolean.toString(fromReturnProduct.getIsReturned()));
//        toReturn.setReturnAddress(fromReturn.getReturnAddress());
        return toReturn;
    }

    public ReturnProduct transfer(com.ecom.app.web.model.Return fromReturn){
        ReturnProduct toReturnProduct = new ReturnProduct();
        toReturnProduct.setReId(fromReturn.getReId());
        toReturnProduct.setShId(fromReturn.getOdId());
        toReturnProduct.setPrIds(fromReturn.getPrIds());
        toReturnProduct.setStartDate(fromReturn.getStartDate());
        toReturnProduct.setEndDate(fromReturn.getEndDate());
        toReturnProduct.setExpectedDate(fromReturn.getExpectedDate());
        toReturnProduct.setReturnStatus(fromReturn.getReturnStatus());
        toReturnProduct.setIsReturned(Boolean.valueOf(fromReturn.getIsReturned()));
//        toReturn.setReturnAddress(fromReturn.getReturnAddress());
        return toReturnProduct;
    }
}
