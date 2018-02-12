package com.domineospring.domain.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private Set<Author> authors = new HashSet<>();

    /**
     * @deprecated framework's only
     */
    private Book(){}

    public Book(String title, Set<Author> authors) {
        this.title = title;
        this.authors = authors;
    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }
}
