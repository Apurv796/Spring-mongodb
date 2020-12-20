package com.java.example.service;

import com.java.example.model.Book;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    public void save(Book book);
    public List<Book> findAll();
    public Optional<Book> getBook(int id);
    public String deleteBook(int id);


}
