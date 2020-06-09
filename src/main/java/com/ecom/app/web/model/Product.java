package com.ecom.app.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long prId;
    private Long odId;
    private Long caId;
    private String name;
    private String model;
    private String productStatus;
    private Feedback feedback;
    private Boolean isStockAvailable;
}
