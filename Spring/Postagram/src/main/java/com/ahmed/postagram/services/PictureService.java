package com.ahmed.postagram.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahmed.postagram.models.Picture;
import com.ahmed.postagram.models.User;
import com.ahmed.postagram.repositories.PictureRepository;

@Service
public class PictureService {
	
	private final PictureRepository picRepo;
	
	public PictureService(PictureRepository picRepo) {
		this.picRepo = picRepo;
	}
	
	//add a new picture to the db
	public void uploadPic(User user, String url, String desc) {
		Picture newPic = new Picture(url, desc, user);
		this.picRepo.save(newPic);
	}
	
	//Get pic by id
	public Picture findOnePic(Long id) {
		return this.picRepo.findById(id).orElse(null);
	}
	
	public Picture updatePic(Picture pic) {
		return this.picRepo.save(pic);
	}
	
	public List<Picture> findByOrderId() {
		return this.picRepo.findAllByOrderByIdDesc();
	}
	
}
