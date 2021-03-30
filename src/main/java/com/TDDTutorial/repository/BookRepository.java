package com.TDDTutorial.repository;

import com.TDDTutorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    void remove(int id);
    void put(Book book, int id);
}
