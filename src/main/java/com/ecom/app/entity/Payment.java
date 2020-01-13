package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="PAYMENT")
public class Payment extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PA_ID", insertable = false, updatable = false, nullable = false)
    private Integer paId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="PRICE", unique = false, nullable = false)
    private Float price;
    @Column(name="OFFER_PERCENTAGE", unique = false, nullable = false)
    private Float offerPercentage;
    @Column(name="PAYMENT_STATUS", unique = false, nullable = false)
    private String paymentStatus;
    @Column(name="TYPE", unique = false, nullable = false)
    private String type;

    public Payment() {
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(Float offerPercentage) {
        this.offerPercentage = offerPercentage;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
