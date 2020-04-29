package com.ecom.app.dto;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.stream.Collectors;

@Component
@Getter
public class PollTransformer {

    @Autowired
    OptionTransformer optionTransformer;

    public com.ecom.app.web.model.Poll transfer(com.ecom.app.entity.Poll fromPoll){
        com.ecom.app.web.model.Poll toPoll = new com.ecom.app.web.model.Poll();
        toPoll.setId(fromPoll.getId());
        toPoll.setQuestion(fromPoll.getQuestion());
        toPoll.getDefaultOptions().addAll(fromPoll.getOptions().stream().map(fromOption ->
                optionTransformer.transfer(fromOption)).collect(Collectors.toList()));
        return toPoll;
    }

    public com.ecom.app.entity.Poll transfer(com.ecom.app.web.model.Poll fromPoll){
        com.ecom.app.entity.Poll toPoll = new com.ecom.app.entity.Poll();
        toPoll.setId(fromPoll.getId());
        toPoll.setQuestion(fromPoll.getQuestion());
        toPoll.getDefaultOptions().addAll(fromPoll.getOptions().stream().map(fromOption ->
                optionTransformer.transfer(fromOption)).collect(Collectors.toSet()));
        return toPoll;
    }

}
