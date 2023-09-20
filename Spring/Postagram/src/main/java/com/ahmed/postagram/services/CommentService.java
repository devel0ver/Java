package com.ahmed.postagram.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.postagram.models.Comment;
import com.ahmed.postagram.repositories.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository commentRepo;

	public List<Comment> findAllComments(){
		return commentRepo.findAll();
	}

	public Comment createComment(Comment comment) {
		return commentRepo.save(comment);
	}


}
