package com.example.clientservice.services;

import com.example.clientservice.model.Book;

import java.util.List;

public interface ClientService {
    List<Book> getAllBooks();
}
