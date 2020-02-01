package com.ecom.app.dto;

public class ReturnTransformer {
    public com.ecom.app.web.model.Return transfer(com.ecom.app.entity.Return fromReturn){
        com.ecom.app.web.model.Return toReturn = new com.ecom.app.web.model.Return();
        toReturn.setReId(fromReturn.getReId());
        toReturn.setOdId(fromReturn.getOdId());
        toReturn.setPrIds(fromReturn.getPrIds());
        toReturn.setStartDate(fromReturn.getStartDate());
        toReturn.setEndDate(fromReturn.getEndDate());
        toReturn.setExpectedDate(fromReturn.getExpectedDate());
        toReturn.setReturnStatus(fromReturn.getReturnStatus());
        toReturn.setIsReturned(fromReturn.getIsReturned());
//        toReturn.setReturnAddress(fromReturn.getReturnAddress());
        return toReturn;
    }
}
