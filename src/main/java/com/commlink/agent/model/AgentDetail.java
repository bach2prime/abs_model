package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


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
 * AgentDetail generated by hbm2java
 */
@Entity
@Table(name="AGENT_DETAIL"
    ,schema="AGENT"
)
public class AgentDetail  implements java.io.Serializable {


     private int id;
     private Customer customer;
     private AgentCommissionProfile agentCommissionProfile;
     private String agentCode;
     private Short status;
     private Boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private String modifiedBy;
     private Date modificationDate;

    public AgentDetail() {
    }

	
    public AgentDetail(int id, Customer customer, String agentCode) {
        this.id = id;
        this.customer = customer;
        this.agentCode = agentCode;
    }
    public AgentDetail(int id, Customer customer, AgentCommissionProfile agentCommissionProfile, String agentCode, Short status, Boolean isDeleted, String createdBy, Date creationDate, String modifiedBy, Date modificationDate) {
       this.id = id;
       this.customer = customer;
       this.agentCommissionProfile = agentCommissionProfile;
       this.agentCode = agentCode;
       this.status = status;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID", nullable=false)
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AGENT_COMMISSION_PROFILE_ID")
    public AgentCommissionProfile getAgentCommissionProfile() {
        return this.agentCommissionProfile;
    }
    
    public void setAgentCommissionProfile(AgentCommissionProfile agentCommissionProfile) {
        this.agentCommissionProfile = agentCommissionProfile;
    }

    
    @Column(name="AGENT_CODE", nullable=false, length=4)
    public String getAgentCode() {
        return this.agentCode;
    }
    
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    
    @Column(name="STATUS", precision=4, scale=0)
    public Short getStatus() {
        return this.status;
    }
    
    public void setStatus(Short status) {
        this.status = status;
    }

    
    @Column(name="IS_DELETED", precision=1, scale=0)
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
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


