package com.example.clientservice.controllers;

import com.example.clientservice.model.Book;
import com.example.clientservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return clientService.getAllBooks();
    }

    @GetMapping("/test")
    public String test() {
        return "Hello client-service";
    }
}