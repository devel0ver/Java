package com.ahmed.postagram.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ahmed.postagram.models.Picture;
import com.ahmed.postagram.models.User;
import com.ahmed.postagram.models.UserLike;

public interface UserLikeRepository extends CrudRepository<UserLike, Long> {
	UserLike findByLikedPictureAndUserLikePic(User user, Picture pic);
	
}
