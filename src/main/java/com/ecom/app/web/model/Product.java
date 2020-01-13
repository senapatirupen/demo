package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class Product implements Serializable {
    private static final long serialVersionUID=1L;
    private String prId;
    private String odId;
    private String name;
    private String price;
    private String offerPercentage;
    private String specification;
    private String productStatus;
    private Stock stock;
}
