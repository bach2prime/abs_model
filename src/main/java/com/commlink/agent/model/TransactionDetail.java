package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransactionDetail generated by hbm2java
 */
@Entity
@Table(name="TRANSACTION_DETAIL"
    ,schema="AGENT"
)
public class TransactionDetail  implements java.io.Serializable {


     private int id;
     private Account account;
     private Transaction transaction;
     private boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private Date modificationDate;
     private String modifiedBy;
     private Integer debitAmount;
     private String creditAmount;
     private String description;
     private BigDecimal runningBalance;

    public TransactionDetail() {
    }

	
    public TransactionDetail(int id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }
    public TransactionDetail(int id, Account account, Transaction transaction, boolean isDeleted, String createdBy, Date creationDate, Date modificationDate, String modifiedBy, Integer debitAmount, String creditAmount, String description, BigDecimal runningBalance) {
       this.id = id;
       this.account = account;
       this.transaction = transaction;
       this.isDeleted = isDeleted;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.modificationDate = modificationDate;
       this.modifiedBy = modifiedBy;
       this.debitAmount = debitAmount;
       this.creditAmount = creditAmount;
       this.description = description;
       this.runningBalance = runningBalance;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=8, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ACC_ID")
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRANSACTION_ID")
    public Transaction getTransaction() {
        return this.transaction;
    }
    
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    
    @Column(name="IS_DELETED", nullable=false, precision=1, scale=0)
    public boolean isIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    
    @Column(name="CREATED_BY", length=20)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATION_DATE")
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFICATION_DATE")
    public Date getModificationDate() {
        return this.modificationDate;
    }
    
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    
    @Column(name="MODIFIED_BY", length=20)
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    
    @Column(name="DEBIT_AMOUNT", precision=8, scale=0)
    public Integer getDebitAmount() {
        return this.debitAmount;
    }
    
    public void setDebitAmount(Integer debitAmount) {
        this.debitAmount = debitAmount;
    }

    
    @Column(name="CREDIT_AMOUNT", length=8)
    public String getCreditAmount() {
        return this.creditAmount;
    }
    
    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    
    @Column(name="DESCRIPTION", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="RUNNING_BALANCE", precision=22, scale=0)
    public BigDecimal getRunningBalance() {
        return this.runningBalance;
    }
    
    public void setRunningBalance(BigDecimal runningBalance) {
        this.runningBalance = runningBalance;
    }




}


