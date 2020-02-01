package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Data
public class Return extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long reId;
    private Long odId;
    private String prIds;
    private Date startDate;
    private Date endDate;
    private Date expectedDate;
    private String returnStatus;
    private String isReturned;
    private ReturnAddress returnAddress;
}
