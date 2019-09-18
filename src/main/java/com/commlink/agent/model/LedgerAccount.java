package com.commlink.agent.model;
// Generated Sep 18, 2019 3:24:34 PM by Hibernate Tools 4.3.1



/**
 * LedgerAccount generated by hbm2java
 */
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
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAccNo() {
        return this.accNo;
    }
    
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public Integer getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }




}


