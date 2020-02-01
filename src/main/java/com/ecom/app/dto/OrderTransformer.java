package com.ecom.app.dto;

public class OrderTransformer {
    public com.ecom.app.web.model.Order transfer(com.ecom.app.entity.Order fromOrder){
        com.ecom.app.web.model.Order toOrder = new com.ecom.app.web.model.Order();
        toOrder.setOdId(fromOrder.getOdId());
        toOrder.setPeId(fromOrder.getPeId());
        toOrder.setOrderStatus(fromOrder.getOrderStatus());
        toOrder.setIsDelivered(fromOrder.getIsDelivered());
//        toOrder.setProducts(fromOrder.getProducts());
        toOrder.setStartDate(fromOrder.getStartDate());
        toOrder.setEndDate(fromOrder.getEndDate());
        toOrder.setExpectedDate(fromOrder.getExpectedDate());
//        toOrder.setShippings(fromOrder.getShippings());
//        toOrder.setReturns(fromOrder.getReturns());
//        toOrder.setPayment(fromOrder.getPayment());
        return toOrder;
    }
}
