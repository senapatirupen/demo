package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Data
public class Shipping extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long shId;
    private String prIds;
    private Long odId;
    private String shippingStatus;
    private String productHealthStatus;
    private Float packagingCharge;
    private Date startDate;
    private Date endDate;
    private Date expectedDate;
    private String courierPerson;
    private ShippingAddress shippingAddress;
    private Delivery delivery;
}
