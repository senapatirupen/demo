package com.ecom.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_FEATURE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductFeature extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRFE_ID", insertable = false, updatable = false, nullable = false)
    private Long prfeId;
    @Column(name="HIGHLIGHT", unique = false, nullable = false)
    private String highlight;
    @Column(name="CATEGORY", unique = false, nullable = false)
    private String category;
    @Column(name="TITLE", unique = false, nullable = false)
    private String title;
    @Column(name="DESCRIPTION", unique = false, nullable = false)
    @Lob
    private byte[] description;
}
