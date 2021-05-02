package com.ecom.app.dto;

public class AuditLogTransformer {
    public com.ecom.app.web.model.AuditLog transfer(com.ecom.app.entity.AuditLog fromAuditLog){
        com.ecom.app.web.model.AuditLog toAuditLog = new com.ecom.app.web.model.AuditLog();
        toAuditLog.setCreatedBy(fromAuditLog.getCreatedBy());
        toAuditLog.setCreatedDate(fromAuditLog.getCreatedDate());
        toAuditLog.setLastModifiedBy(fromAuditLog.getLastModifiedBy());
        toAuditLog.setLastModifiedDate(fromAuditLog.getLastModifiedDate());
        toAuditLog.setIsActive(fromAuditLog.getIsActive());
        toAuditLog.setStatus(fromAuditLog.getStatus());
        return toAuditLog;
    }

    public com.ecom.app.entity.AuditLog transfer(com.ecom.app.web.model.AuditLog fromAuditLog){
        com.ecom.app.entity.AuditLog toAuditLog = new com.ecom.app.entity.AuditLog();
        toAuditLog.setCreatedBy(fromAuditLog.getCreatedBy());
        toAuditLog.setCreatedDate(fromAuditLog.getCreatedDate());
        toAuditLog.setLastModifiedBy(fromAuditLog.getLastModifiedBy());
        toAuditLog.setLastModifiedDate(fromAuditLog.getLastModifiedDate());
        toAuditLog.setIsActive(fromAuditLog.getIsActive());
        toAuditLog.setStatus(fromAuditLog.getStatus());
        return toAuditLog;
    }
}
