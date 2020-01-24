package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
@Data
public class Product extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_ID", insertable = false, updatable = false, nullable = false)
    private Long prId;
    @Column(name="OD_ID", unique = false, nullable = false)
    private Long odId;
    @Column(name="CA_ID", unique = false, nullable = false)
    private Long caId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="model", unique = false, nullable = false)
    private String model;
    @Column(name="PRODUCT_STATUS", unique = false, nullable = false)
    private String productStatus;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="FE_ID")
    private Feedback feedback;
    @Column(name="IS_STOCK_AVAILABLE", unique = false, nullable = false)
    private Boolean isStockAvailable;
}
