package com.TDDTutorial.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
public class Book {
    @Id
    private int id;

    private String author;
    private String title;
    private String genre;
    private String publisher;

    public void setID(int id)
    {
        this.id = id;
    }

    @javax.persistence.Id
    public int getID()
    {
        return id;
    }

    // Methods I need to add:
    // setAuthor(String)
    // setId(int)
    // setTitle(String)
    // setGenre(String)
    // setPublisher(String)
    // getId return int
    // getAuthor return string
    // getTitle
    // getGenre
    // getPublisher
}
