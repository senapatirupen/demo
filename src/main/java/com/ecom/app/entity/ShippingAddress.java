package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="SHIPPING_ADDRESS")
@Data
public class ShippingAddress extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="SHAD_ID", insertable = false, updatable = false, nullable = false)
    private Long shadId;
    @Column(name="SH_ID")
    private Long shId;
    @Column(name="ADDRESS_LINE_ONE", unique = false, nullable = false)
    private String addressLineOne;
    @Column(name="ADDRESS_LINE_TWO", unique = false, nullable = false)
    private String addressLineTwo;
    @Column(name="LANDMARK", unique = false, nullable = false)
    private String landmark;
    @Column(name="COUNTRY", unique = false, nullable = false)
    private String country;
    @Column(name="STATE", unique = false, nullable = false)
    private String state;
    @Column(name="CITY_VILLAGE", unique = false, nullable = false)
    private String cityVillage;
    @Column(name="ZIPCODE", unique = false, nullable = false)
    private String zipcode;
    @Column(name="TYPE", unique = false, nullable = false)
    private String type;
}
