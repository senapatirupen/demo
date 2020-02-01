package com.ecom.app.web.model;

import lombok.Data;

import java.util.Date;
@Data
public class ProductForInventory extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long prId;
    private String name;
    private String model;
    private Date mfdDate;
    private Date expDate;
    private Float price;
    private Float offerPercentage;
    private String specification;
    private String productForInventoryStatus;
    private Stock stock;
}
