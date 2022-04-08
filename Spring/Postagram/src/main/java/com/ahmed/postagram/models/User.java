package com.ahmed.postagram.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="Username is required!")
    @Size(min=3, max=30, message="Username must be between 3 and 30 characters")
    private String userName;
    
    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Passwords does not match!")
    private String confirm;
    
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
    public User() {}

    //loaded constructor
	public User(String userName, String email, String password, String confirm) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
	}
	
	//==========================================
	// Many To Many for followers and following
	//==========================================
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "follows",
			joinColumns = @JoinColumn(name = "follower_id"),
			inverseJoinColumns = @JoinColumn(name = "following_id")
		)
	private List<User> folowing;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "follows",
			joinColumns = @JoinColumn(name = "following_id"),
			inverseJoinColumns = @JoinColumn(name = "follower_id")
		)
	private List<User> followers;
	
	
	//============================================
	// One To Manu Users can post many pictures
	//============================================
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Picture> pics;
	
	//============================================
	// One User can like many posts
	//============================================
	@OneToMany(mappedBy = "userLikePic", fetch=FetchType.LAZY)
	private List<UserLike> userWhoLikedPic;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "likes", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<Picture> pictures;
	
	
	//============================================
	// One To Many user can comment on many posts
	//============================================
	@OneToMany(mappedBy = "userComment", fetch = FetchType.LAZY)
	private List<Comment> comment;
	
	//Getters And Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
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
	public List<Picture> getPics() {
		return pics;
	}
	public void setPics(List<Picture> pics) {
		this.pics = pics;
	}
	public List<User> getFolowing() {
		return folowing;
	}
	public void setFolowing(List<User> folowing) {
		this.folowing = folowing;
	}
	public List<User> getFollowers() {
		return followers;
	}
	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}
	public List<UserLike> getUserWhoLikedPic() {
		return userWhoLikedPic;
	}
	public void setUserWhoLikedPic(List<UserLike> userWhoLikedPic) {
		this.userWhoLikedPic = userWhoLikedPic;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	
	
}
