package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_ID", insertable = false, updatable = false, nullable = false)
    private Integer prId;
    @Column(name="OD_ID", unique = false, nullable = false)
    private Integer odId;
    @Column(name="CA_ID", unique = false, nullable = false)
    private Integer caId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="PRICE", unique = false, nullable = false)
    private Float price;
    @Column(name="OFFER_PERCENTAGE", unique = false, nullable = false)
    private Float offerPercentage;
    @Column(name="SPECIFICATION", unique = false, nullable = false)
    private String specification;
    @Column(name="PRODUCT_STATUS", unique = false, nullable = false)
    private String productStatus;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="FE_ID")
    private Feedback feedback;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="ST_ID")
    private Stock stock;

    public Product() {
    }

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
