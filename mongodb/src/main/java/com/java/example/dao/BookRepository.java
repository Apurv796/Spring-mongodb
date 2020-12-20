package com.java.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.java.example.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer>{

}
