package com.ecom.app.web.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class Stock implements Serializable {
    private static final long serialVersionUID=1L;
    private String stId;
    private String name;
    private String isAvailable;
    private String quantity;
    private String stockStatus;

}
