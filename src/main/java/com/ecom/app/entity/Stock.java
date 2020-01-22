package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOCK")
public class Stock extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ST_ID", insertable = false, updatable = false, nullable = false)
    private Long stId;
    @Column(name = "NAME", unique = false, nullable = false)
    private String name;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @Column(name = "IS_AVAILABLE", unique = false, nullable = false)
    private Boolean isAvailable;
    @Column(name = "QUANTITY", unique = false, nullable = false)
    private Integer quantity;
    @Column(name = "STOCK_STATUS", unique = false, nullable = false)
    private String stockStatus;

    public Stock() {
    }

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }
}
