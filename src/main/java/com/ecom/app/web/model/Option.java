package com.ecom.app.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Option implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String value;
}
