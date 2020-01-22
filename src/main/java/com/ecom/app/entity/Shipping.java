package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SHIPPING")
public class Shipping extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SH_ID", insertable = false, updatable = false, nullable = false)
    private Long shId;
    @Column(name = "PR_IDS")
    private String prIds;
    @Column(name = "OD_ID", unique = false, nullable = false)
    private Long odId;
    @Column(name = "SHIPPING_STATUS", unique = false, nullable = false)
    private String shippingStatus;
    @Column(name = "PRODUCT_HEALTH_STATUS", unique = false, nullable = false)
    private String productHealthStatus;
    @Column(name = "PACKAGING_CHARGE", unique = false, nullable = false)
    private Float packagingCharge;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @Column(name = "COURIER_PERSON", unique = false, nullable = false)
    private String courierPerson;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="SHAD_ID")
    private ShippingAddress shippingAddress;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Delivery delivery;

    public Shipping() {
    }

    public Long getShId() {
        return shId;
    }

    public void setShId(Long shId) {
        this.shId = shId;
    }

    public String getPrIds() {
        return prIds;
    }

    public void setPrIds(String prIds) {
        this.prIds = prIds;
    }

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getProductHealthStatus() {
        return productHealthStatus;
    }

    public void setProductHealthStatus(String productHealthStatus) {
        this.productHealthStatus = productHealthStatus;
    }

    public Float getPackagingCharge() {
        return packagingCharge;
    }

    public void setPackagingCharge(Float packagingCharge) {
        this.packagingCharge = packagingCharge;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }



    public String getCourierPerson() {
        return courierPerson;
    }

    public void setCourierPerson(String courierPerson) {
        this.courierPerson = courierPerson;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
