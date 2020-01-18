package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "FEEDBACK")
public class Feedback extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "FE_ID", insertable = false, updatable = false, nullable = false)
    private Long feId;
    @Column(name="OR_IDS")
    private String orIds;
    @Column(name="PR_ID", unique = false, nullable = false)
    private Long prId;
    @Column(name="RATING", unique = false, nullable = false)
    private String rating;
    @Column(name="REVIEW", unique = false, nullable = false)
    private String review;
    @Column(name="PR_ID", unique = false, nullable = false)
    private String feedback;

    public Feedback() {
    }

    public Long getFeId() {
        return feId;
    }

    public void setFeId(Long feId) {
        this.feId = feId;
    }

    public String getOrIds() {
        return orIds;
    }

    public void setOrIds(String orIds) {
        this.orIds = orIds;
    }

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
