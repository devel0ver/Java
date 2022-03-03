package com.ahmed.postagram.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.postagram.models.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {

}
