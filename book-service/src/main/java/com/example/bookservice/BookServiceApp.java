package com.example.bookservice;

import com.example.bookservice.repositories.BooksRepository;
import com.example.bookservice.util.ApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookServiceApp {
    private final BooksRepository booksRepository;

    @Autowired
    public BookServiceApp(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApp.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner(booksRepository);
    }
}