package com.example.animesole219j104.controller;

import com.example.animesole219j104.service.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }




}
