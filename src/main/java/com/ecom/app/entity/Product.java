package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_ID", insertable = false, updatable = false, nullable = false)
    private Long prId;
    @Column(name="OD_ID", unique = false, nullable = false)
    private Long odId;
    @Column(name="CA_ID", unique = false, nullable = false)
    private Long caId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="model", unique = false, nullable = false)
    private String model;
    @Column(name="PRODUCT_STATUS", unique = false, nullable = false)
    private String productStatus;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="FE_ID")
    private Feedback feedback;
    @Column(name="IS_STOCK_AVAILABLE", unique = false, nullable = false)
    private Boolean isStockAvailable;

    public Product() {
    }

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public Long getCaId() {
        return caId;
    }

    public void setCaId(Long caId) {
        this.caId = caId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public Boolean getStockAvailable() {
        return isStockAvailable;
    }

    public void setStockAvailable(Boolean stockAvailable) {
        isStockAvailable = stockAvailable;
    }
}
