package com.ecom.app.service;

import com.ecom.app.entity.Poll;
import com.ecom.app.repository.OptionRepository;
import com.ecom.app.repository.PollRepository;
import com.ecom.app.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuickPollServiceImpl implements QuickPollService {

    private PollRepository pollRepository;
    private OptionRepository optionRepository;
    private VoteRepository voteRepository;

    public QuickPollServiceImpl(PollRepository pollRepository, OptionRepository optionRepository, VoteRepository voteRepository){
        this.pollRepository = pollRepository;
        this.optionRepository = optionRepository;
        this.voteRepository = voteRepository;
    }

    @Override
    public Poll createPoll(Poll poll){
        return pollRepository.save(poll);
    }

    @Override
    public List<Poll> findAll(){
        return pollRepository.findAll();
    }


}
