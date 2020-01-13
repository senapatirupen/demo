package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "DELIVERY")
public class Delivery extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "DE_ID", insertable = false, updatable = false, nullable = false)
    private Integer deId;
    @Column(name = "PR_IDS")
    private String prIds;
    @Column(name = "SH_ID", unique = false, nullable = false)
    private Integer shId;
    @Column(name = "DELIVERY_STATUS", unique = false, nullable = false)
    private String deliveryStatus;
    @Column(name = "PRODUCT_HEALTH_STATUS", unique = false, nullable = false)
    private String productHealthStatus;
    @Column(name = "PACKAGING_STATUS", unique = false, nullable = false)
    private String packagingStatus;
    @Column(name = "DELIVERY_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @Column(name = "DELIVERED_TO", unique = false, nullable = false)
    private String derliveredTo;
    @Column(name = "DELIVERY_ADDRESS", unique = false, nullable = false)
    private String deliveryAddress;

    public Delivery() {
    }

    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    public String getPrIds() {
        return prIds;
    }

    public void setPrIds(String prIds) {
        this.prIds = prIds;
    }

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getProductHealthStatus() {
        return productHealthStatus;
    }

    public void setProductHealthStatus(String productHealthStatus) {
        this.productHealthStatus = productHealthStatus;
    }

    public String getPackagingStatus() {
        return packagingStatus;
    }

    public void setPackagingStatus(String packagingStatus) {
        this.packagingStatus = packagingStatus;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDerliveredTo() {
        return derliveredTo;
    }

    public void setDerliveredTo(String derliveredTo) {
        this.derliveredTo = derliveredTo;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
