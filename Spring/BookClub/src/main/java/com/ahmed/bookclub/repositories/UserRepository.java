package com.ahmed.bookclub.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.bookclub.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	//magic jpa methods. more info on magic jpa methods https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	Optional<User> findByEmail(String email);
}
