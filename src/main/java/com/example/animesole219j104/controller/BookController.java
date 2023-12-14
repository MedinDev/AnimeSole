package com.example.animesole219j104.controller;

import com.example.animesole219j104.entity.Book;
import com.example.animesole219j104.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("/books/new")
    public String createBookForm(Model model) {

        Book book = new Book();
        model.addAttribute("book", book);
        return "create_book";
    }


    @PostMapping("/books")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookFrom(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "edit_book";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute("book") Book book, Model model) {

        Book existingBook = bookService.getBookById(id);
        existingBook.setId(id);
        existingBook.setName(book.getName());
        existingBook.setYear(book.getYear());
        existingBook.setAge(book.getAge());
        existingBook.setEmail(book.getEmail());
        existingBook.setDirector(book.getDirector());
        existingBook.setAnimeType(book.getAnimeType());

        bookService.updateBook(existingBook);
        return "redirect:/books";
    }

    @GetMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
