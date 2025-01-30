package com.example.clientservice.controllers;

import com.example.clientservice.model.Book;
import com.example.clientservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return clientService.getAllBooks();
    }

    @GetMapping("/test")
    public String test() {
        return "Hello client-service";
    }
}