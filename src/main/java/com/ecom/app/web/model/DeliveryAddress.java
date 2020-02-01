package com.ecom.app.web.model;

import lombok.Data;

@Data
public class DeliveryAddress extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long deadId;
    private Integer deId;
    private String addressLineOne;
    private String addressLineTwo;
    private String landmark;
    private String country;
    private String state;
    private String cityVillage;
    private String zipcode;
    private String type;
}
