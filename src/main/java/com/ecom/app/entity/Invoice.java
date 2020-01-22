package com.ecom.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "INVOICE")
public class Invoice extends AuditLog {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IN_ID", insertable = false, updatable = false, nullable = false)
    private Long inId;
    @Column(name = "OD_ID", unique = false, nullable = false)
    private Long odId;
    @Column(name = "SH_ID", unique = false, nullable = false)
    private Long shId;
    @Column(name="ORDER_START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderStartDate;
    @Column(name = "INVOICE_NUMBER", unique = false, nullable = false)
    private String invoiceNumber;
    @Column(name="START_DATE", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "PR_ID", unique = false, nullable = false)
    private Long prId;
    @Column(name = "PRODUCT_NAME", unique = false, nullable = false)
    private String productName;
    @Column(name = "PRODUCT_DETAIL", unique = false, nullable = false)
    private String productDetail;
    @Column(name = "QTY", unique = false, nullable = false)
    private Long qty;
    @Column(name = "COMMUNICATION_ADDRESS", unique = false, nullable = false)
    private String communicationAddress;
    @Column(name = "GROSS_AMOUNT", unique = false, nullable = false)
    private Float grossAmount;
    @Column(name = "DISCOUNT", unique = false, nullable = false)
    private Float discount;
    @Column(name = "TAXABLE_AMOUNT", unique = false, nullable = false)
    private Float taxableAmount;
    @Column(name = "CGST", unique = false, nullable = false)
    private Float cgst;
    @Column(name = "SGST", unique = false, nullable = false)
    private Float sgst;
    @Column(name = "TOTAL_AMOUNT", unique = false, nullable = false)
    private Float totalAmount;
    @Column(name = "GRAND_TOTAL", unique = false, nullable = false)
    private Float grandTotal;
    @Column(name = "AUTHORIZED_SIGNATURE", unique = false, nullable = false)
    private String authorizedSignature;
    @Column(name = "CIN", unique = false, nullable = false)
    private String cin;
    @Column(name = "PAN", unique = false, nullable = false)
    private String pan;
    @Column(name = "GSTIN", unique = false, nullable = false)
    private String gstin;
    @Column(name = "PE_ID", unique = false, nullable = false)
    private Long peId;
    @Column(name = "CUSTOMER_NAME", unique = false, nullable = false)
    private String customerName;
    @Column(name = "CUSTOMER_DETAIL", unique = false, nullable = false)
    private String customerDetail;
    @Column(name = "SHIP_FROM_ADDRESS", unique = false, nullable = false)
    private String shipFromAddress;
    @Column(name = "SHIP_TO_ADDRESS", unique = false, nullable = false)
    private String shipToAddress;

    public Long getInId() {
        return inId;
    }

    public void setInId(Long inId) {
        this.inId = inId;
    }

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public Long getShId() {
        return shId;
    }

    public void setShId(Long shId) {
        this.shId = shId;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }

    public Float getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Float grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(Float taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public Float getCgst() {
        return cgst;
    }

    public void setCgst(Float cgst) {
        this.cgst = cgst;
    }

    public Float getSgst() {
        return sgst;
    }

    public void setSgst(Float sgst) {
        this.sgst = sgst;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getAuthorizedSignature() {
        return authorizedSignature;
    }

    public void setAuthorizedSignature(String authorizedSignature) {
        this.authorizedSignature = authorizedSignature;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public Long getPeId() {
        return peId;
    }

    public void setPeId(Long peId) {
        this.peId = peId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(String customerDetail) {
        this.customerDetail = customerDetail;
    }

    public String getShipFromAddress() {
        return shipFromAddress;
    }

    public void setShipFromAddress(String shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }
}
