package com.ecom.app.dto;

public class FeedbackTransformer {
    public com.ecom.app.web.model.Feedback transfer(com.ecom.app.entity.Feedback fromFeedback){
        com.ecom.app.web.model.Feedback toFeedback = new com.ecom.app.web.model.Feedback();
        toFeedback.setFeId(fromFeedback.getFeId());
        toFeedback.setOrIds(fromFeedback.getOrIds());
        toFeedback.setPrId(fromFeedback.getPrId());
        toFeedback.setRating(fromFeedback.getRating());
        toFeedback.setReview(fromFeedback.getReview());
        toFeedback.setFeedback(fromFeedback.getFeedback());
        return toFeedback;
    }

    public com.ecom.app.entity.Feedback transfer(com.ecom.app.web.model.Feedback fromFeedback){
        com.ecom.app.entity.Feedback toFeedback = new com.ecom.app.entity.Feedback();
        toFeedback.setFeId(fromFeedback.getFeId());
        toFeedback.setOrIds(fromFeedback.getOrIds());
        toFeedback.setPrId(fromFeedback.getPrId());
        toFeedback.setRating(fromFeedback.getRating());
        toFeedback.setReview(fromFeedback.getReview());
        toFeedback.setFeedback(fromFeedback.getFeedback());
        return toFeedback;
    }
}
