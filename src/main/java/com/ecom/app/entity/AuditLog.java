package com.ecom.app.entity;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

public class AuditLog implements Serializable {
    private static final long serialVersionUID=1L;
    @Column(name="CREATED_BY", nullable = false, unique = false)
    private String createdBy;
    @Column(name="CREATED_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name="LAST_MODIFIED_BY", nullable = false, unique = false)
    private String lastModifiedBy;
    @Column(name="LAST_MODIFIED_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name="IS_ACTIVE", nullable = false, unique = false)
    private Boolean isActive;
    @Column(name="DESC", nullable = false, unique = false)
    private String desc;
    @Column(name="STATUS", nullable = false, unique = false)
    private String status;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
