package com.ecom.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRole extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UR_ID")
    private Long urId;
    @Column(name = "ROLE", unique = false, nullable = false)
    private String role;
}
