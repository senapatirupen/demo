package com.ecom.app.service;

import com.ecom.app.entity.Poll;

import java.util.List;

public interface QuickPollService {

    public Poll createPoll(Poll poll);
    public List<Poll> findAll();
}
