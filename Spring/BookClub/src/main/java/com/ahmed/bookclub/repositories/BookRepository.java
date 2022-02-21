package com.ahmed.bookclub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
