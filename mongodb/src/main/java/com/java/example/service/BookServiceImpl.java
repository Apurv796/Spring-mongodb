package com.java.example.service;

import com.java.example.dao.BookRepository;
import com.java.example.model.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository repository;

    @Override
    public void save(Book book){repository.save(Book);}
   @Override
    public List<Book> findAll(){return repository.findAll();}
   @Override
    public Optional<Book> getBook(int id)
    {return repository.findById(id);}
    @Override
    public void deleteBook(int id)
    {repository.deleteById(id);}
}
