package com.ahmed.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahmed.dojosninjas.models.Dojo;
import com.ahmed.dojosninjas.models.Ninja;
import com.ahmed.dojosninjas.repositories.DojoRepo;
import com.ahmed.dojosninjas.repositories.NinjaRepo;

@Service
public class DojoNinjaService {
	// adding the dojo repository as a dependency
	private final DojoRepo dojoRepo;
	// adding the ninja repository as a dependency
	private final NinjaRepo ninjaRepo;
	
	//constructor that has the repository injected into it (dependency injection) --> initializes the Service with connection to the repository
	public DojoNinjaService(DojoRepo dojoRepo, NinjaRepo ninjarepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjarepo;
	}
	
	//methods that can use the repository to talk to db
    // returns the Dojo
	public List<Dojo> dojo() {
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	//create a dojo
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	//get all the dojos
	public List<Dojo> allDojos(){
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	//create ninja
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	
	//Get one dojo
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}

}
