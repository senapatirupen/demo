package com.ecom.app.web.model;

import com.ecom.app.entity.ProductDescription;
import com.ecom.app.entity.ProductSpecification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductForInventory extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long prId;
    private String name;
    private String model;
    private Date mfdDate;
    private Date expDate;
    private Float price;
    private Float offerPercentage;
    private String specification;
    private String productForInventoryStatus;
    private Stock stock;
    private ProductDescription productDescription;
    private ProductSpecification productSpecification;
}
