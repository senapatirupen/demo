package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CART")
@Data
public class Cart extends AuditLog {
    private static final long serialiVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CA_ID", insertable = false, updatable = false, nullable = false)
    private Long caId;
    @Column(name = "CART_STATUS", unique = false, nullable = false)
    private String cartStatus;
    @Column(name = "PE_ID", unique = false, nullable = false)
    private Long peId;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CA_ID")
    private Collection<Product> products;
}
