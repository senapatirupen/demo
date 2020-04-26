package com.ecom.app.web.model;

import lombok.Data;

@Data
public class Address extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long adId;
    private Long peId;
    private String addressLineOne;
    private String addressLineTwo;
    private String landmark;
    private String country;
    private String state;
    private String cityVillage;
    private String zipcode;
    private String type;
}
