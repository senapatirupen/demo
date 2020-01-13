package com.ecom.app.web.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class Address implements Serializable {
    private static final long serialVersionUID=1L;
    private String adId;
    private String peId;
    private String addressLineOne;
    private String addressLineTwo;
    private String landMark;
    private String country;
    private String state;
    private String cityVillage;
    private String zipcode;
    private String type;
    private String contactNumber;
    private String contactName;
}
