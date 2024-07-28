package com.example.clientservice.services;

import com.example.clientservice.connectors.BookServiceConnector;
import com.example.clientservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final BookServiceConnector bookServiceConnector;

    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooksList();
    }
}
