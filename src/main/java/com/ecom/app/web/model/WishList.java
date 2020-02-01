package com.ecom.app.web.model;

import lombok.Data;

import java.util.Collection;
@Data
public class WishList extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long wiId;
    private String wishListStatus;
    private Collection<Product> products;
}
