package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Collection;

@Data
public class Cart extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long caId;
    private String cartStatus;
    private Long peId;
    private Collection<Product> products;
}
