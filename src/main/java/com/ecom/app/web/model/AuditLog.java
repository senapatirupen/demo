package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Data
public class AuditLog implements Serializable {
    private static final long serialVersionUID=1L;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private Boolean isActive;
    private String desc;
    private String status;
}
