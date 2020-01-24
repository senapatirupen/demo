package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PAYMENT")
@Data
public class Payment extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PA_ID", insertable = false, updatable = false, nullable = false)
    private Long paId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="PRICE", unique = false, nullable = false)
    private Float price;
    @Column(name="OFFER_PERCENTAGE", unique = false, nullable = false)
    private Float offerPercentage;
    @Column(name="PAYMENT_STATUS", unique = false, nullable = false)
    private String paymentStatus;
    @Column(name="TYPE", unique = false, nullable = false)
    private String type;
}
