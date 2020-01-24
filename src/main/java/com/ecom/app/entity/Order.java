package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="PE_ORDER")
@Data
public class Order extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="OD_ID", insertable = false, updatable = false, nullable = false)
    private Long odId;
    @Column(name="PE_ID")
    private Long peId;
    @Column(name="ORDER_STATUS", unique = false, nullable = false)
    private String orderStatus;
    @Column(name="IS_DELIVERED", unique = false, nullable = false)
    private String isDelivered;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    private Collection<Product> products;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    private Collection<Shipping> shippings;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    private Collection<Return> returns;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="PA_ID")
    private Payment payment;
}
