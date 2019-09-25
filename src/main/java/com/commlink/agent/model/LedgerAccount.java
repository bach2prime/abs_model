package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LedgerAccount generated by hbm2java
 */
@Entity
@Table(name="LEDGER_ACCOUNT"
    ,schema="AGENT"
)
public class LedgerAccount  implements java.io.Serializable {


     private int id;
     private String name;
     private String accNo;
     private Integer typeId;
     private Integer userId;

    public LedgerAccount() {
    }

	
    public LedgerAccount(int id) {
        this.id = id;
    }
    public LedgerAccount(int id, String name, String accNo, Integer typeId, Integer userId) {
       this.id = id;
       this.name = name;
       this.accNo = accNo;
       this.typeId = typeId;
       this.userId = userId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=8, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ACC_NO", length=20)
    public String getAccNo() {
        return this.accNo;
    }
    
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    
    @Column(name="TYPE_ID", precision=8, scale=0)
    public Integer getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    @Column(name="USER_ID", precision=8, scale=0)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }




}


