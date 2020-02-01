package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
public class Order extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long odId;
    private Long peId;
    private String orderStatus;
    private String isDelivered;
    private Collection<Product> products;
    private Date startDate;
    private Date endDate;
    private Date expectedDate;
    private Collection<Shipping> shippings;
    private Collection<Return> returns;
    private Payment payment;
}
