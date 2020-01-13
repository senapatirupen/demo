package com.ecom.app.web.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Data
@Slf4j
public class Return implements Serializable {
    private static final long serialVersionUID=1L;
    private String reId;
    private String odId;
    private String prIds;
    private String returnStatus;
    private String isReturned;
}
