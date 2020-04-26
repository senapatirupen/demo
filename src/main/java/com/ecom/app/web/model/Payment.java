package com.ecom.app.web.model;

import lombok.Data;

@Data
public class Payment extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long paId;
    private String name;
    private Float price;
    private Float offerPercentage;
    private String paymentStatus;
    private String type;
}

