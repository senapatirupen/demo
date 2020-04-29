package com.ecom.app.service;

import com.ecom.app.entity.Poll;
import com.ecom.app.entity.Vote;

import java.util.List;
import java.util.Optional;

public interface QuickPollService {

    public Poll createPoll(Poll poll);
    public List<Poll> findAllPolls();
    public Optional<Poll> findOnePoll(Long id);
    public void deletePoll(Long id);
    public Vote createVote(Vote vote);
    public Iterable<Vote> findByPoll(Long  id);
    public List<Vote> findAllVotes();
    public Optional<Vote> findOneVote(Long id);
    public void deleteVote(Long id);
}
