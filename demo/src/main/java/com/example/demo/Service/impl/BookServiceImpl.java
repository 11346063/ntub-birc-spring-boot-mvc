package com.example.demo.Service.impl;

import com.example.demo.Service.BookService;
import com.example.demo.bean.BookBean;
import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookDAO bookDAO;
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    @Override
    public List<BookBean> findAll() {
        List<BookBean> bookBeanList = new ArrayList<>();
        for (Book book : bookDAO.findAll()) {
            BookBean bookBean = new BookBean();
            BeanUtils.copyProperties(book, bookBean);
            bookBeanList.add(bookBean);
        }
        return bookBeanList;
    }

    @Override
    public List<BookBean> findByBookAuthorId(Integer authorId) {
        List<BookBean> bookBeanList = new ArrayList<>();
        for (Book book : bookDAO.findAllByAuthorId(authorId)) {
            BookBean bookBean = new BookBean();
            BeanUtils.copyProperties(book, bookBean);
            bookBeanList.add(bookBean);
        }
        return bookBeanList;
    }
}
