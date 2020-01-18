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
    @Column(name = "START_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "EXPECTED_DELIVERY_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDeliveryDate;
    @Column(name = "DELIVERED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DeliveredDate;
    @Column(name = "COURIER_PERSON", unique = false, nullable = false)
    private String courierPerson;
    @Column(name = "FROM_ADDRESS", unique = false, nullable = false)
    private String fromAddress;
    @Column(name = "TO_ADDRESS", unique = false, nullable = false)
    private String toAddress;
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

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public Date getDeliveredDate() {
        return DeliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        DeliveredDate = deliveredDate;
    }

    public String getCourierPerson() {
        return courierPerson;
    }

    public void setCourierPerson(String courierPerson) {
        this.courierPerson = courierPerson;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
