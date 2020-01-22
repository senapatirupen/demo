package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PRODUCT_INVENTORY")
public class ProductForInventory extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PR_ID", insertable = false, updatable = false, nullable = false)
    private Long prId;
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    @Column(name="MODEL", unique = false, nullable = false)
    private String model;
    @Column(name = "MFD_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date mfdDate;
    @Column(name = "EXP_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Column(name="PRICE", unique = false, nullable = false)
    private Float price;
    @Column(name="OFFER_PERCENTAGE", unique = false, nullable = false)
    private Float offerPercentage;
    @Column(name="SPECIFICATION", unique = false, nullable = false)
    private String specification;
    @Column(name="PRODUCT_STATUS", unique = false, nullable = false)
    private String productForInventoryStatus;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="ST_ID")
    private Stock stock;

    public ProductForInventory() {
    }

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
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

    public String getProductForInventoryStatus() {
        return productForInventoryStatus;
    }

    public void setProductForInventoryStatus(String productForInventoryStatus) {
        this.productForInventoryStatus = productForInventoryStatus;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
