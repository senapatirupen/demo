package com.ecom.app.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="PERSON")
@Data
public class Person extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PE_ID", insertable = false, updatable = false, nullable = false)
    private Long peId;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="US_ID")
    private UserDetail userDetail;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="CA_ID")
    private Cart cart;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="PE_ID")
    private Collection<Address> addresses;
}
