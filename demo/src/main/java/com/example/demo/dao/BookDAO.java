package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
    List<Book> findAllByAuthorId(Integer authorId);
}
