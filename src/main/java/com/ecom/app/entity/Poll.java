package com.ecom.app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name="POLL")
public class Poll {
    @Id
    @GeneratedValue
    @Column(name="POLL_ID")
    private Long id;
    @Column(name="QUESTION")
    @NotEmpty
    private String question;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="POLL_ID")
    @OrderBy
    @Size(min=2, max=6)
    private Set<Option> options;

    public Poll() {
    }

    public Poll(Long id, @NotEmpty String question, @Size(min = 2, max = 6) Set<Option> options) {
        this.id = id;
        this.question = question;
        this.options = options;
    }

    public Poll(@NotEmpty String question, @Size(min = 2, max = 6) Set<Option> options) {
        this.question = question;
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + options +
                '}';
    }
}
