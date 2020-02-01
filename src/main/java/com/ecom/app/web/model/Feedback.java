package com.ecom.app.web.model;

import lombok.Data;

@Data
public class Feedback extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long feId;
    private String orIds;
    private Long prId;
    private String rating;
    private String review;
    private String feedback;
}
