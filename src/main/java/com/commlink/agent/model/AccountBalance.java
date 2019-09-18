package com.commlink.agent.model;
// Generated Sep 18, 2019 4:58:14 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AccountBalance generated by hbm2java
 */
@Entity
@Table(name="ACCOUNT_BALANCE"
    ,schema="AGENT"
)
public class AccountBalance  implements java.io.Serializable {


     private int id;
     private BigDecimal amount;
     private Date updatedAt;
     private Integer balanceType;
     private Integer accountId;
     private boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private String modifiedBy;
     private Date modificationDate;

    public AccountBalance() {
    }

	
    public AccountBalance(int id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }
    public AccountBalance(int id, BigDecimal amount, Date updatedAt, Integer balanceType, Integer accountId, boolean isDeleted, String createdBy, Date creationDate, String modifiedBy, Date modificationDate) {
       this.id = id;
       this.amount = amount;
       this.updatedAt = updatedAt;
       this.balanceType = balanceType;
       this.accountId = accountId;
       this.isDeleted = isDeleted;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.modifiedBy = modifiedBy;
       this.modificationDate = modificationDate;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=8, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="AMOUNT", precision=10)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="UPDATED_AT", length=7)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
    @Column(name="BALANCE_TYPE", precision=8, scale=0)
    public Integer getBalanceType() {
        return this.balanceType;
    }
    
    public void setBalanceType(Integer balanceType) {
        this.balanceType = balanceType;
    }

    
    @Column(name="ACCOUNT_ID", precision=8, scale=0)
    public Integer getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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

    
    @Column(name="MODIFIED_BY", length=20)
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFICATION_DATE")
    public Date getModificationDate() {
        return this.modificationDate;
    }
    
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }




}


