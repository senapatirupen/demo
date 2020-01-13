package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="RECEIPT")
public class Receipt extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="RE_ID", insertable = false, updatable = false, nullable = false)
    private Integer reId;
}
