package com.ecom.app.web.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Stock extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long stId;
    private String name;
    private Date startDate;
    private Date endDate;
    private Date expectedDate;
    private Boolean isAvailable;
    private Integer quantity;
    private String stockStatus;

}
