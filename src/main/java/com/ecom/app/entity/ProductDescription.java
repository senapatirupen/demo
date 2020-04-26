package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_DESCRIPTION")
@Data
public class ProductDescription extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_DE_ID", insertable = false, updatable = false, nullable = false)
    private Long prDeId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="model", unique = false, nullable = false)
    private String model;
}
