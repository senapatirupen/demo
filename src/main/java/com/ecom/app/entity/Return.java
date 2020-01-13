package com.ecom.app.entity;

import javax.persistence.*;

@Entity
@Table(name="RETURN")
public class Return extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="RE_ID", insertable = false, updatable = false, nullable = false)
    private Integer reId;
    @Column(name="OD_ID")
    private Integer odId;
    @Column(name="PR_IDS")
    private String prIds;
    @Column(name="RETURN_STATUS", unique = false, nullable = false)
    private String returnStatus;
    @Column(name="IS_RETURNED", unique = false, nullable = false)
    private String isReturned;

    public Return() {
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
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
}
