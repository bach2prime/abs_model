package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


import java.sql.Blob;
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
 * UserInfo generated by hbm2java
 */
@Entity
@Table(name="USER_INFO"
    ,schema="AGENT"
)
public class UserInfo  implements java.io.Serializable {


     private int id;
     private UserInfo userInfo;
     private Role role;
     private Customer customer;
     private Outlet outlet;
     private String userName;
     private String passwordHash;
     private String pin;
     private boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private String modifiedBy;
     private Date modificationDate;
     private Blob fingerprint;
     private int authType;
     private Short type;
     private Integer status;
     private Integer isFpRequired;
     private Set<UserInfo> userInfos = new HashSet<UserInfo>(0);

    public UserInfo() {
    }

	
    public UserInfo(int id, String userName, String pin, boolean isDeleted, int authType) {
        this.id = id;
        this.userName = userName;
        this.pin = pin;
        this.isDeleted = isDeleted;
        this.authType = authType;
    }
    public UserInfo(int id, UserInfo userInfo, Role role, Customer customer, Outlet outlet, String userName, String passwordHash, String pin, boolean isDeleted, String createdBy, Date creationDate, String modifiedBy, Date modificationDate, Blob fingerprint, int authType, Short type, Integer status, Integer isFpRequired, Set<UserInfo> userInfos) {
       this.id = id;
       this.userInfo = userInfo;
       this.role = role;
       this.customer = customer;
       this.outlet = outlet;
       this.userName = userName;
       this.passwordHash = passwordHash;
       this.pin = pin;
       this.isDeleted = isDeleted;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.modifiedBy = modifiedBy;
       this.modificationDate = modificationDate;
       this.fingerprint = fingerprint;
       this.authType = authType;
       this.type = type;
       this.status = status;
       this.isFpRequired = isFpRequired;
       this.userInfos = userInfos;
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
    @JoinColumn(name="PARENT_ID")
    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ROLE_ID")
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID")
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OUTLET_ID")
    public Outlet getOutlet() {
        return this.outlet;
    }
    
    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    
    @Column(name="USER_NAME", nullable=false, length=20)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="PASSWORD_HASH", length=200)
    public String getPasswordHash() {
        return this.passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    
    @Column(name="PIN", nullable=false, length=20)
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
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

    
    @Column(name="FINGERPRINT")
    public Blob getFingerprint() {
        return this.fingerprint;
    }
    
    public void setFingerprint(Blob fingerprint) {
        this.fingerprint = fingerprint;
    }

    
    @Column(name="AUTH_TYPE", nullable=false, precision=8, scale=0)
    public int getAuthType() {
        return this.authType;
    }
    
    public void setAuthType(int authType) {
        this.authType = authType;
    }

    
    @Column(name="TYPE", precision=4, scale=0)
    public Short getType() {
        return this.type;
    }
    
    public void setType(Short type) {
        this.type = type;
    }

    
    @Column(name="STATUS", precision=8, scale=0)
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    
    @Column(name="IS_FP_REQUIRED", precision=8, scale=0)
    public Integer getIsFpRequired() {
        return this.isFpRequired;
    }
    
    public void setIsFpRequired(Integer isFpRequired) {
        this.isFpRequired = isFpRequired;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userInfo")
    public Set<UserInfo> getUserInfos() {
        return this.userInfos;
    }
    
    public void setUserInfos(Set<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }




}


