package com.ahmed.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="Title must not be blank!")
    @Size(min=5, max=50, message="Title must be between 5 and 50 characters")
    private String title;
    
    @NotEmpty(message="Author must not be blank!")
    @Size(min=3, max=30, message="Author must be between 3 and 30 characters")
    private String author;
    
    @Column(columnDefinition = "TEXT")
    @NotEmpty(message="Your thoughts must not be blank!")
    @Size(min=5, message="Your thoughts must contain at least 5 characters")
    private String thoughts;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    //empty constructor
    public Book() {}
    
    //loaded constructor
	public Book(String title, String author, String thoughts) {
		
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
	}
	
	
	// Many to One (Many books can be on only one User)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	// Many to One (Many books can be on only one User)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currentBorrower_id")
	private User currentBorrower;
	
	//getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getCurrentBorrower() {
		return currentBorrower;
	}
	public void setCurrentBorrower(User currentBorrower) {
		this.currentBorrower = currentBorrower;
	}
	
}
