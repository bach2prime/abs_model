package com.commlink.agent.model;
// Generated Sep 25, 2019 11:25:45 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RolePage generated by hbm2java
 */
@Entity
@Table(name="ROLE_PAGE"
    ,schema="AGENT"
)
public class RolePage  implements java.io.Serializable {


     private BigDecimal id;
     private Role role;
     private Page page;

    public RolePage() {
    }

    public RolePage(BigDecimal id, Role role, Page page) {
       this.id = id;
       this.role = role;
       this.page = page;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ROLE_ID", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PAGE_ID", nullable=false)
    public Page getPage() {
        return this.page;
    }
    
    public void setPage(Page page) {
        this.page = page;
    }




}


