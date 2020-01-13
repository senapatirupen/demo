package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Data
@Slf4j
public class Shipping implements Serializable {
    private static final long serialVersionUID=1L;
    private String shId;
    private String prIds;
    private String odId;
    private String shippingStatus;
    private String productHealthStatus;
    private String packagingStatus;
    private String packagingCharge;
    private String startDate;
    private String expectedDeliveryDate;
    private String deliveredDate;
    private String courierPerson;
    private String fromAddress;
    private String toAddress;
}
