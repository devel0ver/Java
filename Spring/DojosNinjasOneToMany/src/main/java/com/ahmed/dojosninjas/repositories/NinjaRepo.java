package com.ahmed.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.dojosninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository <Ninja, Long>{

}
