package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="PE_ORDER")
public class Order extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="OD_ID", insertable = false, updatable = false, nullable = false)
    private Long odId;
    @Column(name="PE_ID")
    private Long peId;
    @Column(name="ORDER_STATUS", unique = false, nullable = false)
    private String orderStatus;
    @Column(name="IS_DELIVERED", unique = false, nullable = false)
    private String isDelivered;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    private Collection<Product> products;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    private Collection<Shipping> shippings;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
    private Collection<Return> returns;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="PA_ID")
    private Payment payment;

    public Order() {
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

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public Long getPeId() {
        return peId;
    }

    public void setPeId(Long peId) {
        this.peId = peId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(String isDelivered) {
        this.isDelivered = isDelivered;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Collection<Shipping> getShippings() {
        return shippings;
    }

    public void setShippings(Collection<Shipping> shippings) {
        this.shippings = shippings;
    }

    public Collection<Return> getReturns() {
        return returns;
    }

    public void setReturns(Collection<Return> returns) {
        this.returns = returns;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
