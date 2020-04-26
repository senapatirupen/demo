package com.ecom.app.dto;

import org.springframework.stereotype.Component;

@Component
public class OptionTransformer {

    public com.ecom.app.web.model.Option transfer(com.ecom.app.entity.Option fromOption){
        com.ecom.app.web.model.Option toOption = new com.ecom.app.web.model.Option();
        toOption.setId(fromOption.getId());
        toOption.setValue(fromOption.getValue());
        return toOption;
    }
    public com.ecom.app.entity.Option transfer(com.ecom.app.web.model.Option fromOption){
        com.ecom.app.entity.Option toOption = new com.ecom.app.entity.Option();
        toOption.setId(fromOption.getId());
        toOption.setValue(fromOption.getValue());
        return toOption;
    }
}
