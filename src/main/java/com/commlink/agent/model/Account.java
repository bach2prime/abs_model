package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="ACCOUNT"
    ,schema="AGENT"
)
public class Account  implements java.io.Serializable {


     private int id;
     private Product product;
     private Boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private String modifiedBy;
     private Date modificationDate;
     private String accNo;
     private String productCode;
     private String description;
     private Short status;
     private Date openOn;
     private Date closeOn;
     private Date freezeOn;
     private Integer associatedAgentAcc;
     private Integer makerId;
     private Integer checkerId;
     private Integer operatorType;
     private String name;
     private Integer accountType;
     private Set<Transaction> transactionsForSrcAccId = new HashSet<Transaction>(0);
     private Set<AccountCustomer> accountCustomers = new HashSet<AccountCustomer>(0);
     private Set<Transaction> transactionsForAgentAccId = new HashSet<Transaction>(0);
     private Set<Transaction> transactionsForDestAccId = new HashSet<Transaction>(0);
     private Set<TransactionDetail> transactionDetails = new HashSet<TransactionDetail>(0);

    public Account() {
    }

	
    public Account(int id, String accNo, String productCode) {
        this.id = id;
        this.accNo = accNo;
        this.productCode = productCode;
    }
    public Account(int id, Product product, Boolean isDeleted, String createdBy, Date creationDate, String modifiedBy, Date modificationDate, String accNo, String productCode, String description, Short status, Date openOn, Date closeOn, Date freezeOn, Integer associatedAgentAcc, Integer makerId, Integer checkerId, Integer operatorType, String name, Integer accountType, Set<Transaction> transactionsForSrcAccId, Set<AccountCustomer> accountCustomers, Set<Transaction> transactionsForAgentAccId, Set<Transaction> transactionsForDestAccId, Set<TransactionDetail> transactionDetails) {
       this.id = id;
       this.product = product;
       this.isDeleted = isDeleted;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.modifiedBy = modifiedBy;
       this.modificationDate = modificationDate;
       this.accNo = accNo;
       this.productCode = productCode;
       this.description = description;
       this.status = status;
       this.openOn = openOn;
       this.closeOn = closeOn;
       this.freezeOn = freezeOn;
       this.associatedAgentAcc = associatedAgentAcc;
       this.makerId = makerId;
       this.checkerId = checkerId;
       this.operatorType = operatorType;
       this.name = name;
       this.accountType = accountType;
       this.transactionsForSrcAccId = transactionsForSrcAccId;
       this.accountCustomers = accountCustomers;
       this.transactionsForAgentAccId = transactionsForAgentAccId;
       this.transactionsForDestAccId = transactionsForDestAccId;
       this.transactionDetails = transactionDetails;
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
    @JoinColumn(name="PRODUCT_ID")
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
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

    
    @Column(name="ACC_NO", nullable=false, length=20)
    public String getAccNo() {
        return this.accNo;
    }
    
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    
    @Column(name="PRODUCT_CODE", nullable=false, length=3)
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    
    @Column(name="DESCRIPTION", length=20)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="STATUS", precision=4, scale=0)
    public Short getStatus() {
        return this.status;
    }
    
    public void setStatus(Short status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OPEN_ON")
    public Date getOpenOn() {
        return this.openOn;
    }
    
    public void setOpenOn(Date openOn) {
        this.openOn = openOn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CLOSE_ON")
    public Date getCloseOn() {
        return this.closeOn;
    }
    
    public void setCloseOn(Date closeOn) {
        this.closeOn = closeOn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FREEZE_ON")
    public Date getFreezeOn() {
        return this.freezeOn;
    }
    
    public void setFreezeOn(Date freezeOn) {
        this.freezeOn = freezeOn;
    }

    
    @Column(name="ASSOCIATED_AGENT_ACC", precision=8, scale=0)
    public Integer getAssociatedAgentAcc() {
        return this.associatedAgentAcc;
    }
    
    public void setAssociatedAgentAcc(Integer associatedAgentAcc) {
        this.associatedAgentAcc = associatedAgentAcc;
    }

    
    @Column(name="MAKER_ID", precision=8, scale=0)
    public Integer getMakerId() {
        return this.makerId;
    }
    
    public void setMakerId(Integer makerId) {
        this.makerId = makerId;
    }

    
    @Column(name="CHECKER_ID", precision=8, scale=0)
    public Integer getCheckerId() {
        return this.checkerId;
    }
    
    public void setCheckerId(Integer checkerId) {
        this.checkerId = checkerId;
    }

    
    @Column(name="OPERATOR_TYPE", precision=8, scale=0)
    public Integer getOperatorType() {
        return this.operatorType;
    }
    
    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ACCOUNT_TYPE", precision=8, scale=0)
    public Integer getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountBySrcAccId")
    public Set<Transaction> getTransactionsForSrcAccId() {
        return this.transactionsForSrcAccId;
    }
    
    public void setTransactionsForSrcAccId(Set<Transaction> transactionsForSrcAccId) {
        this.transactionsForSrcAccId = transactionsForSrcAccId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<AccountCustomer> getAccountCustomers() {
        return this.accountCustomers;
    }
    
    public void setAccountCustomers(Set<AccountCustomer> accountCustomers) {
        this.accountCustomers = accountCustomers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountByAgentAccId")
    public Set<Transaction> getTransactionsForAgentAccId() {
        return this.transactionsForAgentAccId;
    }
    
    public void setTransactionsForAgentAccId(Set<Transaction> transactionsForAgentAccId) {
        this.transactionsForAgentAccId = transactionsForAgentAccId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountByDestAccId")
    public Set<Transaction> getTransactionsForDestAccId() {
        return this.transactionsForDestAccId;
    }
    
    public void setTransactionsForDestAccId(Set<Transaction> transactionsForDestAccId) {
        this.transactionsForDestAccId = transactionsForDestAccId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<TransactionDetail> getTransactionDetails() {
        return this.transactionDetails;
    }
    
    public void setTransactionDetails(Set<TransactionDetail> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }




}

