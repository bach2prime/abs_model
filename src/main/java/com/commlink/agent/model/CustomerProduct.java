package com.commlink.agent.model;
// Generated Sep 18, 2019 4:58:14 PM by Hibernate Tools 4.3.1


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
 * CustomerProduct generated by hbm2java
 */
@Entity
@Table(name="CUSTOMER_PRODUCT"
    ,schema="AGENT"
)
public class CustomerProduct  implements java.io.Serializable {


     private int id;
     private Product product;
     private Customer customer;
     private Short type;
     private Date dateTime;
     private Short status;

    public CustomerProduct() {
    }

	
    public CustomerProduct(int id) {
        this.id = id;
    }
    public CustomerProduct(int id, Product product, Customer customer, Short type, Date dateTime, Short status) {
       this.id = id;
       this.product = product;
       this.customer = customer;
       this.type = type;
       this.dateTime = dateTime;
       this.status = status;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID")
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    @Column(name="TYPE", precision=4, scale=0)
    public Short getType() {
        return this.type;
    }
    
    public void setType(Short type) {
        this.type = type;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_TIME")
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    
    @Column(name="STATUS", precision=4, scale=0)
    public Short getStatus() {
        return this.status;
    }
    
    public void setStatus(Short status) {
        this.status = status;
    }




}


