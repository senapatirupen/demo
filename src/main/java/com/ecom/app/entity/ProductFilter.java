package com.ecom.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_FILTER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductFilter extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRFI_ID", insertable = false, updatable = false, nullable = false)
    private Long prfiId;
    @Column(name="FILTER", unique = false, nullable = false)
    private String filter;
}
