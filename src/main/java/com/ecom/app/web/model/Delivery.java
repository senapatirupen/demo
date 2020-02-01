package com.ecom.app.web.model;

import lombok.Data;

import java.util.Date;
@Data
public class Delivery extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long deId;
    private String prIds;
    private Long shId;
    private String deliveryStatus;
    private String productHealthStatus;
    private String packagingStatus;
    private Date startDate;
    private Date endDate;
    private Date expectedDate;
    private DeliveryAddress deliveryAddress;
}
