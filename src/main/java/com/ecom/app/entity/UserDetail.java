package com.ecom.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "USER_DETAIL")
@Data
public class UserDetail extends AuditLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "US_ID", insertable = false, updatable = false, nullable = false)
    private Long usId;
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
}
