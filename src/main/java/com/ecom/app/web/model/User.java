package com.ecom.app.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends AuditLog {
    private static final long serialVersionUID=1L;
    private String id;
    private String userName;
    private String phoneNumber;
    private String emailId;
    private String dob;
    private String password;
    private String role;
    private String userType;
    private String userNameEmailId;
}
