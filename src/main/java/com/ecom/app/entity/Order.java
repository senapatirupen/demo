package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="PE_ORDER")
public class Order extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="OD_ID", insertable = false, updatable = false, nullable = false)
    private Integer odId;
    @Column(name="PE_ID")
    private Integer peId;
    @Column(name="ORDER_STATUS", unique = false, nullable = false)
    private String orderStatus;
    @Column(name="IS_DELIVERED", unique = false, nullable = false)
    private String isDelivered;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="OD_ID")
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

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Integer getPeId() {
        return peId;
    }

    public void setPeId(Integer peId) {
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
