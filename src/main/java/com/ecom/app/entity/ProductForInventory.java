package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PRODUCT_INVENTORY")
@Data
public class ProductForInventory extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_ID", insertable = false, updatable = false, nullable = false)
    private Long prId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="MODEL", unique = false, nullable = false)
    private String model;
    @Column(name = "MFD_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date mfdDate;
    @Column(name = "EXP_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Column(name="PRICE", unique = false, nullable = false)
    private Float price;
    @Column(name="OFFER_PERCENTAGE", unique = false, nullable = false)
    private Float offerPercentage;
    @Column(name="SPECIFICATION", unique = false, nullable = false)
    private String specification;
    @Column(name="PRODUCT_STATUS", unique = false, nullable = false)
    private String productForInventoryStatus;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="ST_ID")
    private Stock stock;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="PR_DE_ID")
    private ProductDescription productDescription;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="PR_SP_ID")
    private ProductSpecification productSpecification;
}
