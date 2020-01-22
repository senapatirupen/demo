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

    public Delivery() {
    }

    public Long getDeId() {
        return deId;
    }

    public void setDeId(Long deId) {
        this.deId = deId;
    }

    public String getPrIds() {
        return prIds;
    }

    public void setPrIds(String prIds) {
        this.prIds = prIds;
    }

    public Long getShId() {
        return shId;
    }

    public void setShId(Long shId) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
