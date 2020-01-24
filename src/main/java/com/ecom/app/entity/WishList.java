package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="WISH_LIST")
@Data
public class WishList extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="WI_ID", insertable = false, updatable = false, nullable = false)
    private Long wiId;
    @Column(name="WISH_LIST_STATUS", unique = false, nullable = false)
    private String wishListStatus;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="WI_ID")
    private Collection<Product> products;
}
