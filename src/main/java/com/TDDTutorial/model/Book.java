package com.TDDTutorial.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Data
@Entity
public class Book {
    @Id
    private int id;

    private String author;
    private String title;
    private String genre;
    private String publisher;

    public void setId(int id)
    {
        this.id = id;
    }

    @javax.persistence.Id
    public int getId()
    {
        return id;
    }


    public void setAuthor(String author) {this.author = author;}

    public String getAuthor() {return author;}

    public void setTitle(String title) {this.title = title;}

    public String getTitle() {return title;}

    public void setGenre(String genre) {this.genre = genre;}

    public String getGenre() {return genre;}

    public void setPublisher(String publisher) {this.publisher = publisher;}

    public String getPublisher() {return publisher;}
}
