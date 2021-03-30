package com.TDDTutorial.service;

import com.TDDTutorial.model.Book;
import com.TDDTutorial.repository.BookRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService{
    @Autowired
    private BookRepository bookRepo;

    public String saveBook(Book book)
    {
        bookRepo.put(book, book.getId());
        return "Successful Save";
    }

    public String deleteBook(int id)
    {
        bookRepo.remove(id);
        return "Successful Delete";
    }

    public Iterable<Book> getAllBooks()
    {
        return bookRepo.findAll();
    }

    public Book getBookById(int id)
    {
        return bookRepo.findById(id).get();
    }
}
