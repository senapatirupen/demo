package com.ecom.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_DESCRIPTION")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDescription extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRDE_ID", insertable = false, updatable = false, nullable = false)
    private Long prdeId;
    @Column(name="SHORT_DESC", unique = false, nullable = true)
    @Lob
    private byte[] shortDesc;
    @Column(name="LONG_DESC", unique = false, nullable = true)
    @Lob
    private byte[] longDesc;
}
