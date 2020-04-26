package com.ecom.app.web.model;

import lombok.Data;

import java.util.Collection;

@Data
public class Cart extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long caId;
    private String cartStatus;
    private Long peId;
    private Collection<Product> products;
}
