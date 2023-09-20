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
@Table(name="comments")
public class Comment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String userCommentOnPost;


	public Comment() {}


	public Comment(String userCommentOnPost, User userComment, Picture pictureComment) {
		this.userCommentOnPost = userCommentOnPost;
		this.userComment = userComment;
		this.pictureComment = pictureComment;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User userComment;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "picture_id")
	private Picture pictureComment;



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


    //Getters and Setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserCommentOnPost() {
		return userCommentOnPost;
	}


	public void setUserCommentOnPost(String userCommentOnPost) {
		this.userCommentOnPost = userCommentOnPost;
	}


	public User getUserComment() {
		return userComment;
	}


	public void setUserComment(User userComment) {
		this.userComment = userComment;
	}


	public Picture getPictureComment() {
		return pictureComment;
	}


	public void setPictureComment(Picture pictureComment) {
		this.pictureComment = pictureComment;
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
