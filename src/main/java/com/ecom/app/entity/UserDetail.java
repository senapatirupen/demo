package com.ecom.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "USER_DETAIL")
public class UserDetail extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "US_ID", insertable = false, updatable = false, nullable = false)
    private Integer usId;
    @Column(name = "USER_NAME", unique = false, nullable = false)
    private String userName;
    @Column(name = "EMAIL_ID", unique = false, nullable = false)
    private String emailId;
    @Column(name = "PHONE_NUMBER", unique = false, nullable = false)
    private String phoneNumber;
    @Column(name = "PASSWORD", unique = false, nullable = false)
    private String password;
    @Column(name = "DOB", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;

    public UserDetail() {
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
