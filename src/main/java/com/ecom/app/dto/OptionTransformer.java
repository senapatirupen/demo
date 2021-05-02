package com.ecom.app.dto;

import com.ecom.app.entity.Opt;
import org.springframework.stereotype.Component;

@Component
public class OptionTransformer {

    public com.ecom.app.web.model.Option transfer(Opt fromOpt){
        com.ecom.app.web.model.Option toOption = new com.ecom.app.web.model.Option();
        toOption.setId(fromOpt.getId());
        toOption.setValue(fromOpt.getValue());
        return toOption;
    }
    public Opt transfer(com.ecom.app.web.model.Option fromOption){
        Opt toOpt = new Opt();
        toOpt.setId(fromOption.getId());
        toOpt.setValue(fromOption.getValue());
        return toOpt;
    }
}
