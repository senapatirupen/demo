package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "VOTE")
@Data
public class Vote extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;
}
