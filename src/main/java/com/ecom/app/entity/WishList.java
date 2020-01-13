package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="WISH_LIST")
public class WishList extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="WI_ID", insertable = false, updatable = false, nullable = false)
    private Integer wiId;
    @Column(name="WISH_LIST_STATUS", unique = false, nullable = false)
    private String wishListStatus;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="WI_ID")
    private Collection<Product> products;

    public WishList() {
    }

    public Integer getWiId() {
        return wiId;
    }

    public void setWiId(Integer wiId) {
        this.wiId = wiId;
    }

    public String getWishListStatus() {
        return wishListStatus;
    }

    public void setWishListStatus(String wishListStatus) {
        this.wishListStatus = wishListStatus;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
