package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RETURN")
public class Return extends AuditLog {
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
    public Return() {
    }

    public Long getReId() {
        return reId;
    }

    public void setReId(Long reId) {
        this.reId = reId;
    }

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public String getPrIds() {
        return prIds;
    }

    public void setPrIds(String prIds) {
        this.prIds = prIds;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getIsReturned() {
        return isReturned;
    }

    public void setIsReturned(String isReturned) {
        this.isReturned = isReturned;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public ReturnAddress getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(ReturnAddress returnAddress) {
        this.returnAddress = returnAddress;
    }
}
