package com.commlink.agent.model;
// Generated Sep 18, 2019 4:58:14 PM by Hibernate Tools 4.3.1


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

/**
 * Page generated by hbm2java
 */
@Entity
@Table(name="PAGE"
    ,schema="AGENT"
)
public class Page  implements java.io.Serializable {


     private int id;
     private Page page;
     private String name;
     private String url;
     private Integer type;
     private String nameBangla;
     private Set<RolePage> rolePages = new HashSet<RolePage>(0);
     private Set<Page> pages = new HashSet<Page>(0);

    public Page() {
    }

	
    public Page(int id) {
        this.id = id;
    }
    public Page(int id, Page page, String name, String url, Integer type, String nameBangla, Set<RolePage> rolePages, Set<Page> pages) {
       this.id = id;
       this.page = page;
       this.name = name;
       this.url = url;
       this.type = type;
       this.nameBangla = nameBangla;
       this.rolePages = rolePages;
       this.pages = pages;
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
    public Page getPage() {
        return this.page;
    }
    
    public void setPage(Page page) {
        this.page = page;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="URL", length=100)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="TYPE", precision=8, scale=0)
    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }

    
    @Column(name="NAME_BANGLA", length=200)
    public String getNameBangla() {
        return this.nameBangla;
    }
    
    public void setNameBangla(String nameBangla) {
        this.nameBangla = nameBangla;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<RolePage> getRolePages() {
        return this.rolePages;
    }
    
    public void setRolePages(Set<RolePage> rolePages) {
        this.rolePages = rolePages;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="page")
    public Set<Page> getPages() {
        return this.pages;
    }
    
    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }




}


