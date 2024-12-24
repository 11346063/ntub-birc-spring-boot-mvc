package com.example.demo.Service;

import com.example.demo.bean.BookBean;
import com.example.demo.entity.Book;
import java.util.List;

public interface BookService {
    List<BookBean> findAll();
    List<BookBean> findByBookAuthorId(Integer authorId);
}
