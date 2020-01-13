package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class Payment implements Serializable {
    private static final long serialVersionUID=1L;
    private String paId;
    private String name;
    private String price;
    private String offerPercentage;
    private String paymentStatus;
    private String type;
}

