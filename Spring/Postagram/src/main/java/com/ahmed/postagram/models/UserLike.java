package com.ahmed.postagram.models;

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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="likes")
public class UserLike {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    public UserLike() {}

    public UserLike(Picture likedPicture,User userLikePic) {
    	this.likedPicture= likedPicture;
    	this.userLikePic= userLikePic;
    }


    // ===============================
    // Many to One
    //===============================
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	private Picture likedPicture;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
    private User userLikePic;

    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Picture getLikedPicture() {
		return likedPicture;
	}
	public void setLikedPicture(Picture likedPicture) {
		this.likedPicture = likedPicture;
	}
	public User getUserLikePic() {
		return userLikePic;
	}
	public void setUserLikePic(User userLikePic) {
		this.userLikePic = userLikePic;
	}
}
