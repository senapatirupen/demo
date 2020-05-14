package com.ecom.app.dto;

public class ReturnTransformer {
    public com.ecom.app.web.model.Return transfer(com.ecom.app.entity.Return fromReturn){
        com.ecom.app.web.model.Return toReturn = new com.ecom.app.web.model.Return();
        toReturn.setReId(fromReturn.getReId());
        toReturn.setOdId(fromReturn.getShId());
        toReturn.setPrIds(fromReturn.getPrIds());
        toReturn.setStartDate(fromReturn.getStartDate());
        toReturn.setEndDate(fromReturn.getEndDate());
        toReturn.setExpectedDate(fromReturn.getExpectedDate());
        toReturn.setReturnStatus(fromReturn.getReturnStatus());
        toReturn.setIsReturned(Boolean.toString(fromReturn.getIsReturned()));
//        toReturn.setReturnAddress(fromReturn.getReturnAddress());
        return toReturn;
    }

    public com.ecom.app.entity.Return transfer(com.ecom.app.web.model.Return fromReturn){
        com.ecom.app.entity.Return toReturn = new com.ecom.app.entity.Return();
        toReturn.setReId(fromReturn.getReId());
        toReturn.setShId(fromReturn.getOdId());
        toReturn.setPrIds(fromReturn.getPrIds());
        toReturn.setStartDate(fromReturn.getStartDate());
        toReturn.setEndDate(fromReturn.getEndDate());
        toReturn.setExpectedDate(fromReturn.getExpectedDate());
        toReturn.setReturnStatus(fromReturn.getReturnStatus());
        toReturn.setIsReturned(Boolean.valueOf(fromReturn.getIsReturned()));
//        toReturn.setReturnAddress(fromReturn.getReturnAddress());
        return toReturn;
    }
}
