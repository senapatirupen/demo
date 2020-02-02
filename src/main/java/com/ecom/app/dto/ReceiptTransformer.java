package com.ecom.app.dto;

public class ReceiptTransformer {
    public com.ecom.app.web.model.Receipt transfer(com.ecom.app.entity.Receipt fromReceipt){
        com.ecom.app.web.model.Receipt toReceipt = new com.ecom.app.web.model.Receipt();
        return toReceipt;
    }

    public com.ecom.app.entity.Receipt transfer(com.ecom.app.web.model.Receipt fromReceipt){
        com.ecom.app.entity.Receipt toReceipt = new com.ecom.app.entity.Receipt();
        return toReceipt;
    }
}
