package com.ecom.app.web.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Option implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String value;
}
