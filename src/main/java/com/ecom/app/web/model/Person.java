package com.ecom.app.web.model;

import com.ecom.app.entity.UserDetail;
import lombok.Data;

import java.util.Collection;
@Data
public class Person extends AuditLog {
    private static final long serialVersionUID=1L;
    private Long peId;
    private UserDetail userDetail;
    private Cart cart;
    private Collection<Product> products;
    private Collection<Address> addresses;
}
