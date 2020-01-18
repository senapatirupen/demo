package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE")
public class UserRole extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "UR_ID")
    private Long urId;
    @Column(name = "ROLE", unique = false, nullable = false)
    private String role;

    public UserRole() {
    }

    public Long getUrId() {
        return urId;
    }

    public void setUrId(Long urId) {
        this.urId = urId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
