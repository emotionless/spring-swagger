package io.java.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.java.swagger.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
