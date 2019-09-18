package com.commlink.agent.model;
// Generated Sep 18, 2019 3:24:34 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * District generated by hbm2java
 */
public class District  implements java.io.Serializable {


     private int id;
     private Division division;
     private String nameEn;
     private String nameBn;
     private String code;
     private Set customersForPresentDistrictId = new HashSet(0);
     private Set customersForPermanentDistrictId = new HashSet(0);
     private Set upazilas = new HashSet(0);
     private Set tempCustomersForPermanentDistrictId = new HashSet(0);
     private Set tempCustomersForPresentDistrictId = new HashSet(0);

    public District() {
    }

	
    public District(int id, Division division, String nameEn, String nameBn, String code) {
        this.id = id;
        this.division = division;
        this.nameEn = nameEn;
        this.nameBn = nameBn;
        this.code = code;
    }
    public District(int id, Division division, String nameEn, String nameBn, String code, Set customersForPresentDistrictId, Set customersForPermanentDistrictId, Set upazilas, Set tempCustomersForPermanentDistrictId, Set tempCustomersForPresentDistrictId) {
       this.id = id;
       this.division = division;
       this.nameEn = nameEn;
       this.nameBn = nameBn;
       this.code = code;
       this.customersForPresentDistrictId = customersForPresentDistrictId;
       this.customersForPermanentDistrictId = customersForPermanentDistrictId;
       this.upazilas = upazilas;
       this.tempCustomersForPermanentDistrictId = tempCustomersForPermanentDistrictId;
       this.tempCustomersForPresentDistrictId = tempCustomersForPresentDistrictId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Division getDivision() {
        return this.division;
    }
    
    public void setDivision(Division division) {
        this.division = division;
    }
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameBn() {
        return this.nameBn;
    }
    
    public void setNameBn(String nameBn) {
        this.nameBn = nameBn;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Set getCustomersForPresentDistrictId() {
        return this.customersForPresentDistrictId;
    }
    
    public void setCustomersForPresentDistrictId(Set customersForPresentDistrictId) {
        this.customersForPresentDistrictId = customersForPresentDistrictId;
    }
    public Set getCustomersForPermanentDistrictId() {
        return this.customersForPermanentDistrictId;
    }
    
    public void setCustomersForPermanentDistrictId(Set customersForPermanentDistrictId) {
        this.customersForPermanentDistrictId = customersForPermanentDistrictId;
    }
    public Set getUpazilas() {
        return this.upazilas;
    }
    
    public void setUpazilas(Set upazilas) {
        this.upazilas = upazilas;
    }
    public Set getTempCustomersForPermanentDistrictId() {
        return this.tempCustomersForPermanentDistrictId;
    }
    
    public void setTempCustomersForPermanentDistrictId(Set tempCustomersForPermanentDistrictId) {
        this.tempCustomersForPermanentDistrictId = tempCustomersForPermanentDistrictId;
    }
    public Set getTempCustomersForPresentDistrictId() {
        return this.tempCustomersForPresentDistrictId;
    }
    
    public void setTempCustomersForPresentDistrictId(Set tempCustomersForPresentDistrictId) {
        this.tempCustomersForPresentDistrictId = tempCustomersForPresentDistrictId;
    }




}


