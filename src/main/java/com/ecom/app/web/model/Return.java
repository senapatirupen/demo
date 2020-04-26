package com.ecom.app.web.model;

import lombok.Data;
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
