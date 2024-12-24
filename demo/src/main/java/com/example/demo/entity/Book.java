package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "book", schema = "app")
public class Book {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "content", length = 200, nullable = false)
    private String content;
}
