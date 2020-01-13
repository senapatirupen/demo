package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "INVOICE")
public class Invoice extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IN_ID", insertable = false, updatable = false, nullable = false)
    private Integer inId;
}
