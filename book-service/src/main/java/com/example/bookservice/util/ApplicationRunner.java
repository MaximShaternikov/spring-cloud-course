package com.example.bookservice.util;

import com.example.bookservice.models.Book;
import com.example.bookservice.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ApplicationRunner implements CommandLineRunner {
    private final BooksRepository booksRepository;

    @Autowired
    public ApplicationRunner(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        booksRepository.deleteAll();
        booksRepository.save(new Book("1", "Java", "OOP","https://infopulse-univer.com.ua/images/trenings/java.png"));
        booksRepository.save(new Book("2", "Java", "Stream API","https://www.hdwallpaperslife.com/wp-content/uploads/2018/09/JAVA14-480x270.png"));
        booksRepository.save(new Book("3", "Java", "Collections","https://i.ytimg.com/vi/oOOESCvGGcI/hqdefault.jpg"));
        booksRepository.save(new Book("4", ".NET", "Basic","https://upload.wikimedia.org/wikipedia/commons/0/0e/Microsoft_.NET_logo.png"));
        booksRepository.save(new Book("5", "C++", "Basic","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmgIz9Ug-MVzBQJMcgXedOXTqHWGmbSu5pPDivz8hrfo_GE0HZEA"));
        booksRepository.save(new Book("6", "JavaScript", "Angular 8","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg41zepuyHbew8bIsTYeKWJ9RYOnnV922lNa85-fQTVrKDG19K2w"));
    }
}