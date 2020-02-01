package com.ecom.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RETURN")
@Data
public class Return extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="RE_ID", insertable = false, updatable = false, nullable = false)
    private Long reId;
    @Column(name="OD_ID")
    private Long odId;
    @Column(name="PR_IDS")
    private String prIds;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "EXPECTED_DATE", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expectedDate;
    @Column(name="RETURN_STATUS", unique = false, nullable = false)
    private String returnStatus;
    @Column(name="IS_RETURNED", unique = false, nullable = false)
    private String isReturned;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="READ_ID")
    private ReturnAddress returnAddress;
}
