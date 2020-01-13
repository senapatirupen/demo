package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Collection;

@Data
@Slf4j
public class Cart implements Serializable {
    private static final long serialVersionUID=1L;
    private String caId;
    private String cartStatus;
    private String peId;
    private Collection<Product> products;
}
