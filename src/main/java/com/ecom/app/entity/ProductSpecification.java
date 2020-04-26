package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_SPECIFICATION")
@Data
public class ProductSpecification extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_SP_ID", insertable = false, updatable = false, nullable = false)
    private Long prSpId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="model", unique = false, nullable = false)
    private String model;
}
