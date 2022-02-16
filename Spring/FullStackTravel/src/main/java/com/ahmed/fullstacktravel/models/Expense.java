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

@Entity
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//name
	@NotNull
	@Size(min = 2, max = 100, message = "Expense name must be between 2-100 characters")
	private String name;
	
	//vendor
	@NotNull
	@Size(min = 2, max = 60, message = "Expense vendor must be between 2-60 characters")
	private String vendor;
	
	//price
	@NotNull
	@Min(value= 1, message = "Price must be at least 1 dolla!")
	private double price;
	
	//description
	@NotNull
	@Size(min = 2, message = "Expense description must have at least 2 characters")
	private String description;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	//empty constructor
	public Expense() {
		
	}

	//loaded constructor
	public Expense(
			@NotNull @Size(min = 2, max = 100, message = "Expense name must be between 2-100 characters") String name,
			@NotNull @Size(min = 2, max = 60, message = "Expense vendor must be between 2-60 characters") String vendor,
			@NotNull @Min(value = 1, message = "Price must be at least 1 dolla!") double price,
			@NotNull @Size(min = 2, message = "Expense description must have at least 2 characters") String description) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.description = description;
	}
	
	// other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
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
