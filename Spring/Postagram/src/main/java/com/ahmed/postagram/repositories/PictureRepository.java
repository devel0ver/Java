package com.ahmed.postagram.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.postagram.models.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {
	
	public List<Picture> findAllByOrderByIdDesc();
}
