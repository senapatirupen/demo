package com.ecom.app.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String status;
}
