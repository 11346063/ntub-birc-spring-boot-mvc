package com.example.demo.dao;

import com.example.demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {
}
