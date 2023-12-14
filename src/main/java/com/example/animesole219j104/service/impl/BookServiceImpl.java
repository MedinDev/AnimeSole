package com.example.animesole219j104.service.impl;

import com.example.animesole219j104.entity.Book;
import com.example.animesole219j104.repository.BookRepository;
import com.example.animesole219j104.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book Book) {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public Book updateBook(Book Book) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {

    }
}
