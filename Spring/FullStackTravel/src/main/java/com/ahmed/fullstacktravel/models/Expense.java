package com.ahmed.fullstacktravel.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //@Entity annotation tells the class that it will represent a DB table (entity == table)
@Table(name="expenses")	//@Table annotation tells SQL that the class we are building will have a table name. Best practice for table names all lowercase and plural
public class Expense {

	@Id	//for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//this make the primary key auto-generate
	private Long id;
	
	//name
	@NotNull	//this is a validation that says that the name must not be null
	@Size(min = 2, max = 100, message = "Expense name must be between 2-100 characters") //@Size annotation is to validate strings and arrays lengths
	private String name;
	
	//vendor
	@NotNull
	@Size(min = 2, max = 60, message = "Expense vendor must be between 2-60 characters")
	private String vendor;
	
	//price
	@NotNull
	@Min(value= 1, message = "Price must be at least 1 dolla!") //@Min and @Max are validations for numbers/doubles/floats(decimal numbers)
	private double price;
	
	//description
	@NotNull
	@Size(min = 2, message = "Expense description must have at least 2 characters")
	private String description;
	
	// This will not allow the createdAt column to be updated after creation these are time stamp number variables
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	//empty constructor(needed when we want to pass an empty object to the create form)
	public Expense() {
		
	}

	//loaded constructor --> you do not to initialize the ID, and the created_at and updated_at  -because they get auto generated
	public Expense(String name,String vendor,double price,String description) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.description = description;
	}
	
	
    @PrePersist //@PrePersist means before saving into the DB, autogenerate the current time and set that as the created_at
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate //@PreUpdate means before updating, set the updated at to be the current time stamp
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
    //GETTERS AND SETTERS!!! REMEMBER TO HAVE THIS OR THINGS WILL NOT WORK IN THE TEMPLATES LATER
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
