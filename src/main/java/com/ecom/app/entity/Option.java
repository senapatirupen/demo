package com.ecom.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OPTION")
public class Option implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "OPTION_ID")
    private Long id;
    @Column(name = "OPTION_VALUE")
    private String value;

    public Option() {
    }

    public Option(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
