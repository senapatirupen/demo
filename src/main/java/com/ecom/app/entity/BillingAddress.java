package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="DELIVERY_ADDRESS")
@Data
public class BillingAddress extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="BIAD_ID", insertable = false, updatable = false, nullable = false)
    private Long biadId;
    @Column(name="OD_ID")
    private Long odId;
    @Column(name="ADDRESS_LINE_ONE", unique = false, nullable = true)
    private String addressLineOne;
    @Column(name="ADDRESS_LINE_TWO", unique = false, nullable = true)
    private String addressLineTwo;
    @Column(name="LANDMARK", unique = false, nullable = true)
    private String landmark;
    @Column(name="COUNTRY", unique = false, nullable = true)
    private String country;
    @Column(name="STATE", unique = false, nullable = true)
    private String state;
    @Column(name="CITY_VILLAGE", unique = false, nullable = true)
    private String cityVillage;
    @Column(name="ZIPCODE", unique = false, nullable = true)
    private String zipcode;
    @Column(name="TYPE", unique = false, nullable = true)
    private String type;
}
