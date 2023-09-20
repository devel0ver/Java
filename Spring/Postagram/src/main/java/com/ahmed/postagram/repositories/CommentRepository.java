package com.ahmed.postagram.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ahmed.postagram.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{
	@Override
	public List<Comment> findAll();
	public List<Comment> findAllByOrderByIdDesc();
}
