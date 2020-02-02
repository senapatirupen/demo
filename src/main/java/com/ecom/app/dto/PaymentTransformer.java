package com.ecom.app.dto;

public class PaymentTransformer {
    public com.ecom.app.web.model.Payment transfer(com.ecom.app.entity.Payment fromPayment){
        com.ecom.app.web.model.Payment toPayment = new com.ecom.app.web.model.Payment();
        toPayment.setPaId(fromPayment.getPaId());
        toPayment.setName(fromPayment.getName());
        toPayment.setPrice(fromPayment.getPrice());
        toPayment.setOfferPercentage(fromPayment.getOfferPercentage());
        toPayment.setPaymentStatus(fromPayment.getPaymentStatus());
        toPayment.setType(fromPayment.getType());
        return toPayment;
    }

    public com.ecom.app.entity.Payment transfer(com.ecom.app.web.model.Payment fromPayment){
        com.ecom.app.entity.Payment toPayment = new com.ecom.app.entity.Payment();
        toPayment.setPaId(fromPayment.getPaId());
        toPayment.setName(fromPayment.getName());
        toPayment.setPrice(fromPayment.getPrice());
        toPayment.setOfferPercentage(fromPayment.getOfferPercentage());
        toPayment.setPaymentStatus(fromPayment.getPaymentStatus());
        toPayment.setType(fromPayment.getType());
        return toPayment;
    }
}
