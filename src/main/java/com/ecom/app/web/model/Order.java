package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Collection;

@Data
@Slf4j
public class Order implements Serializable {
    private static final long serialVersionUID=1L;
    private String odId;
    private String peId;
    private String orderStatus;
    private String isDelivered;
    private Collection<Product> products;
    private Payment payment;
}
