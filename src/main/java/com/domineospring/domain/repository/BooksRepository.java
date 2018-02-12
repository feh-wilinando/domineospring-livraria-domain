package com.domineospring.domain.repository;

import com.domineospring.domain.models.Book;

import java.util.List;
import java.util.Optional;

public interface BooksRepository {

    Optional<Book> findById(Integer id);
    List<Book> findAll();
    Book save(Book book);

}
