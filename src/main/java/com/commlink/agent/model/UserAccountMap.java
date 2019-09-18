package com.commlink.agent.model;
// Generated Sep 18, 2019 4:58:14 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserAccountMap generated by hbm2java
 */
@Entity
@Table(name="USER_ACCOUNT_MAP"
    ,schema="AGENT"
)
public class UserAccountMap  implements java.io.Serializable {


     private int id;
     private Integer userId;
     private Integer accId;
     private Boolean isPrimary;

    public UserAccountMap() {
    }

	
    public UserAccountMap(int id) {
        this.id = id;
    }
    public UserAccountMap(int id, Integer userId, Integer accId, Boolean isPrimary) {
       this.id = id;
       this.userId = userId;
       this.accId = accId;
       this.isPrimary = isPrimary;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=8, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="USER_ID", precision=8, scale=0)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="ACC_ID", precision=8, scale=0)
    public Integer getAccId() {
        return this.accId;
    }
    
    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    
    @Column(name="IS_PRIMARY", precision=1, scale=0)
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }
    
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }




}


