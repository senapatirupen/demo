package com.ecom.app.web.restcontroller;

import com.ecom.app.dto.OptionCount;
import com.ecom.app.dto.PollTransformer;
import com.ecom.app.dto.VoteResult;
import com.ecom.app.dto.VoteTransformer;
import com.ecom.app.exception.ResourceNotFoundException;
import com.ecom.app.service.QuickPollService;
import com.ecom.app.web.model.Poll;
import com.ecom.app.web.model.Vote;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class QuickPollController {

    @Inject
    QuickPollService quickPollService;

    @Inject
    PollTransformer pollTransformer;

    @Inject
    VoteTransformer voteTransformer;

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    @RequestMapping(value = "/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        List<com.ecom.app.entity.Poll> allEntityPolls = quickPollService.findAllPolls();
        List<com.ecom.app.web.model.Poll> allModelPolls = allEntityPolls.stream().map(poll -> pollTransformer.transfer(poll)).collect(Collectors.toList());
        return new ResponseEntity<>(allModelPolls, HttpStatus.OK);
    }

    @RequestMapping(value = "/polls", method = RequestMethod.POST)
    public ResponseEntity<?> createPoll(@Valid @RequestBody Poll poll) {
        com.ecom.app.entity.Poll pollEntity = quickPollService.createPoll(pollTransformer.transfer(poll));
        poll = pollTransformer.transfer(pollEntity);
        // Set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(poll.getId())
                .toUri();
        responseHeaders.setLocation(newPollUri);
        log.info("poll id >> " + poll.getId().toString());
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
    public ResponseEntity<?> getPoll(@PathVariable Long pollId) {
        verifyPoll(pollId);
        Optional<com.ecom.app.entity.Poll> pollOptional = quickPollService.findOnePoll(pollId);
        return new ResponseEntity<>(pollTransformer.transfer(pollOptional.get()), HttpStatus.OK);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
        Optional<com.ecom.app.entity.Poll> pollOptional = quickPollService.findOnePoll(pollId);
        if (!pollOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        // Save the entity
        com.ecom.app.entity.Poll pollEntity = quickPollService.createPoll(pollTransformer.transfer(poll));
        poll = pollTransformer.transfer(pollEntity);
        return new ResponseEntity<>(poll, HttpStatus.OK);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        Optional<com.ecom.app.entity.Poll> pollOptional = quickPollService.findOnePoll(pollId);
        if (!pollOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        quickPollService.deletePoll(pollId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.POST)
    public ResponseEntity<?> createVote(@PathVariable Long pollId, @RequestBody Vote vote) {
        com.ecom.app.entity.Vote voteEntity = quickPollService.createVote(voteTransformer.transfer(vote));
        vote = voteTransformer.transfer(voteEntity);
        // Set the headers for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(ServletUriComponentsBuilder.
                fromCurrentRequest().path("/{id}").buildAndExpand(vote.getId()).toUri());
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.GET)
    public Iterable<com.ecom.app.entity.Vote> getAllVotes(@PathVariable Long pollId) {
        return quickPollService.findByPoll(pollId);
    }

    @RequestMapping(value = "/polls/votes", method = RequestMethod.GET)
    public Iterable<com.ecom.app.entity.Vote> getVotes() {
        return quickPollService.findAllVotes();
    }

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<com.ecom.app.entity.Vote> allVotes = quickPollService.findByPoll(pollId);
        // Algorithm to count votes
        int totalVotes = 0;
        Map<Long, OptionCount> tempMap = new HashMap<Long, OptionCount>();
        for (com.ecom.app.entity.Vote v : allVotes) {
            totalVotes++;
            // Get the OptionCount corresponding to this Option
            OptionCount optionCount = tempMap.get(v.getOption().getId());
            if (optionCount == null) {
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                tempMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount() + 1);
        }
        voteResult.setTotalVotes(totalVotes);
        voteResult.setResults(tempMap.values());
        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }

    protected void verifyPoll(Long pollId) throws ResourceNotFoundException {
        Optional<com.ecom.app.entity.Poll> poll = quickPollService.findOnePoll(pollId);
        if (!poll.isPresent()) {
            throw new ResourceNotFoundException("Poll with id " + pollId + " not found");
        }
    }

}
