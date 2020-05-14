package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="RETURN_ADDRESS")
@Data
public class ReturnAddress extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="READ_ID", insertable = false, updatable = false, nullable = false)
    private Long readId;
    @Column(name="RE_ID")
    private Long reId;
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
    @Column(name="ZIPCODE", unique = false, nullable = false)
    private String zipcode;
    @Column(name="TYPE", unique = false, nullable = false)
    private String type;
}
