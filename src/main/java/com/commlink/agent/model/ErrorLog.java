package com.commlink.agent.model;
// Generated Sep 18, 2019 3:24:34 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.Date;

/**
 * ErrorLog generated by hbm2java
 */
public class ErrorLog  implements java.io.Serializable {


     private BigDecimal id;
     private String title;
     private Clob info;
     private Date createdOn;
     private String createdBy;
     private Clob callstack;
     private Clob errorstack;
     private Clob errorbacktrace;

    public ErrorLog() {
    }

	
    public ErrorLog(BigDecimal id) {
        this.id = id;
    }
    public ErrorLog(BigDecimal id, String title, Clob info, Date createdOn, String createdBy, Clob callstack, Clob errorstack, Clob errorbacktrace) {
       this.id = id;
       this.title = title;
       this.info = info;
       this.createdOn = createdOn;
       this.createdBy = createdBy;
       this.callstack = callstack;
       this.errorstack = errorstack;
       this.errorbacktrace = errorbacktrace;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Clob getInfo() {
        return this.info;
    }
    
    public void setInfo(Clob info) {
        this.info = info;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Clob getCallstack() {
        return this.callstack;
    }
    
    public void setCallstack(Clob callstack) {
        this.callstack = callstack;
    }
    public Clob getErrorstack() {
        return this.errorstack;
    }
    
    public void setErrorstack(Clob errorstack) {
        this.errorstack = errorstack;
    }
    public Clob getErrorbacktrace() {
        return this.errorbacktrace;
    }
    
    public void setErrorbacktrace(Clob errorbacktrace) {
        this.errorbacktrace = errorbacktrace;
    }




}


