package com.domineospring.domain.repository;

import com.domineospring.domain.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    Optional<Author> findByName(String name);
    List<Author> findAll();
    Author save(Author author);
}
