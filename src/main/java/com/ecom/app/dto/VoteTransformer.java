package com.ecom.app.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VoteTransformer {

    @Autowired
    OptionTransformer optionTransformer;

    public com.ecom.app.web.model.Vote transfer(com.ecom.app.entity.Vote fromVote){
        com.ecom.app.web.model.Vote toVote = new com.ecom.app.web.model.Vote();
        toVote.setId(fromVote.getId());
        toVote.setOption(optionTransformer.transfer(fromVote.getOption()));
        return toVote;
    }
    public com.ecom.app.entity.Vote transfer(com.ecom.app.web.model.Vote fromVote){
        com.ecom.app.entity.Vote toVote = new com.ecom.app.entity.Vote();
        toVote.setId(fromVote.getId());
        toVote.setOption(optionTransformer.transfer(fromVote.getOption()));
        return toVote;
    }

}
