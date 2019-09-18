package com.commlink.agent.model;
// Generated Sep 18, 2019 4:58:14 PM by Hibernate Tools 4.3.1


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
 * Outlet generated by hbm2java
 */
@Entity
@Table(name="OUTLET"
    ,schema="AGENT"
)
public class Outlet  implements java.io.Serializable {


     private int id;
     private Branch branch;
     private String name;
     private Date openedOn;
     private String address;
     private String city;
     private boolean isDeleted;
     private String createdBy;
     private Date creationDate;
     private String modifiedBy;
     private Date modificationDate;
     private Set<UserInfo> userInfos = new HashSet<UserInfo>(0);

    public Outlet() {
    }

	
    public Outlet(int id, Branch branch, String name, String address, boolean isDeleted) {
        this.id = id;
        this.branch = branch;
        this.name = name;
        this.address = address;
        this.isDeleted = isDeleted;
    }
    public Outlet(int id, Branch branch, String name, Date openedOn, String address, String city, boolean isDeleted, String createdBy, Date creationDate, String modifiedBy, Date modificationDate, Set<UserInfo> userInfos) {
       this.id = id;
       this.branch = branch;
       this.name = name;
       this.openedOn = openedOn;
       this.address = address;
       this.city = city;
       this.isDeleted = isDeleted;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.modifiedBy = modifiedBy;
       this.modificationDate = modificationDate;
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
    @JoinColumn(name="BRANCH_ID", nullable=false)
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    
    @Column(name="NAME", nullable=false, length=200)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OPENED_ON")
    public Date getOpenedOn() {
        return this.openedOn;
    }
    
    public void setOpenedOn(Date openedOn) {
        this.openedOn = openedOn;
    }

    
    @Column(name="ADDRESS", nullable=false, length=200)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="CITY", length=200)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="IS_DELETED", nullable=false, precision=1, scale=0)
    public boolean isIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    
    @Column(name="CREATED_BY", length=200)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="outlet")
    public Set<UserInfo> getUserInfos() {
        return this.userInfos;
    }
    
    public void setUserInfos(Set<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }




}


