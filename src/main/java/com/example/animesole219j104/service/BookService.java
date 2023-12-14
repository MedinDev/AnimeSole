package com.example.animesole219j104.service;

import com.example.animesole219j104.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book saveBook(Book Book);

    Book getBookById(Long id);

    Book updateBook(Book Book);

    void deleteBookById(Long id);
}
