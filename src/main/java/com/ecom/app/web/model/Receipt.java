package com.ecom.app.web.model;

import lombok.Data;

@Data
public class Receipt extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long reId;
}
