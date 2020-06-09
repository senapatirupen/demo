package com.ecom.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOCK")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stock extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ST_ID", insertable = false, updatable = false, nullable = false)
    private Long stId;
    @Column(name = "NAME", unique = false, nullable = false)
    private String name;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @Column(name = "IS_AVAILABLE", unique = false, nullable = false)
    private Boolean isAvailable;
    @Column(name = "QUANTITY", unique = false, nullable = false)
    private Integer quantity;
    @Column(name = "STOCK_STATUS", unique = false, nullable = false)
    private String stockStatus;
}
