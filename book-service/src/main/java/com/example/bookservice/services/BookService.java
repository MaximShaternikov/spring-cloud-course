package com.example.bookservice.services;

import com.example.bookservice.models.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
}