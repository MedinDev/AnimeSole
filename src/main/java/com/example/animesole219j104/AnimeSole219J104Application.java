package com.example.animesole219j104;

import com.example.animesole219j104.entity.Book;
import com.example.animesole219j104.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimeSole219J104Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AnimeSole219J104Application.class, args);
    }

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
