package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CART")
public class Cart extends AuditLog {
    private static final long serialiVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CA_ID", insertable = false, updatable = false, nullable = false)
    private Integer caId;
    @Column(name = "CART_STATUS", unique = false, nullable = false)
    private String cartStatus;
    @Column(name = "PE_ID", unique = false, nullable = false)
    private Integer peId;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CA_ID")
    private Collection<Product> products;

    public Cart() {
    }

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public String getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(String cartStatus) {
        this.cartStatus = cartStatus;
    }

    public Integer getPeId() {
        return peId;
    }

    public void setPeId(Integer peId) {
        this.peId = peId;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
