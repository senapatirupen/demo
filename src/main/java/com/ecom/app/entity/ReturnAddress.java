package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="RETURN_ADDRESS")
public class ReturnAddress extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="READ_ID", insertable = false, updatable = false, nullable = false)
    private Long readId;
    @Column(name="RE_ID")
    private Integer reId;
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

    public ReturnAddress() {
    }

    public Long getReadId() {
        return readId;
    }

    public void setReadId(Long readId) {
        this.readId = readId;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
