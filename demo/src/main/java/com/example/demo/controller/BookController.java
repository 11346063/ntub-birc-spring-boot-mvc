package com.example.demo.controller;

import com.example.demo.Service.BookService;
import com.example.demo.json.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/book")
public class BookController {
    private final BookService bookService;

    @GetMapping(path = "/list")
    public ResponseData<Map<String, Object>> getBook() {
        Map<String, Object> data = new HashMap<>();
        data.put("bool list", bookService.findAll());

        return ResponseDataUtil.buildSuccess(data);
    }

    @GetMapping(path = "/get", params = {"author_id"})
    public ResponseData<Map<String, Object>> getBookByAuthorId(@RequestParam(name = "author_id")
                                                                   Integer author_id) {
        Map<String, Object> data = new HashMap<>();
        data.put("book", bookService.findByBookAuthorId(author_id));
        return ResponseDataUtil.buildSuccess(data);
    }
}
