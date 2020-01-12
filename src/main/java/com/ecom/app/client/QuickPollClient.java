package com.ecom.app.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class QuickPollClient {
    private static final String QUICK_POLL_URI_V1= "http://localhost:8081/polls";
    private RestTemplate restTemplate = new RestTemplate();

//    public Poll getPollById(Long pollId){
//        return restTemplate.getForObject(QUICK_POLL_URI_V1+"/{pollId}",Poll.class, pollId);
//    }
//
//    public List<Poll> getAllPolls(){
////        List<Poll> polls = restTemplate.getForObject(QUICK_POLL_URI_V1, List.class);
//        ParameterizedTypeReference<List<Poll>> responseType = new ParameterizedTypeReference<List<Poll>>() {
//        };
//        ResponseEntity<List<Poll>> responseEntity = restTemplate.exchange(QUICK_POLL_URI_V1, HttpMethod.GET,null, responseType);
//        List<Poll> polls = responseEntity.getBody();
//        return polls;
//    }
//
//    public URI createPoll(Poll poll){
//        return restTemplate.postForLocation(QUICK_POLL_URI_V1, poll);
//    }

}
