package com.ahmed.postagram.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.postagram.models.Picture;
import com.ahmed.postagram.models.User;
import com.ahmed.postagram.models.UserLike;
import com.ahmed.postagram.repositories.UserLikeRepository;

@Service
public class UserLikeService {

	@Autowired
	private UserLikeRepository userLikeRepo;

	public UserLike saveLike(UserLike like) {
		return this.userLikeRepo.save(like);
	}

	public List<UserLike> getAllLikedUsers() {
		return (List<UserLike>) this.userLikeRepo.findAll();
	}

	public UserLike checkIfLiked(User user, Picture pic) {
		return this.userLikeRepo.findByLikedPictureAndUserLikePic(user, pic);
	}

}
