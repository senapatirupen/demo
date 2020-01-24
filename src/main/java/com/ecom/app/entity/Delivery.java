package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "DELIVERY")
@Data
public class Delivery extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "DE_ID", insertable = false, updatable = false, nullable = false)
    private Long deId;
    @Column(name = "PR_IDS")
    private String prIds;
    @Column(name = "SH_ID", unique = false, nullable = false)
    private Long shId;
    @Column(name = "DELIVERY_STATUS", unique = false, nullable = false)
    private String deliveryStatus;
    @Column(name = "PRODUCT_HEALTH_STATUS", unique = false, nullable = false)
    private String productHealthStatus;
    @Column(name = "PACKAGING_STATUS", unique = false, nullable = false)
    private String packagingStatus;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="DEAD_ID")
    private DeliveryAddress deliveryAddress;
}
