package com.example.clientupdate.controllers;

import com.example.clientupdate.connectors.ClientServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/update")
public class ClientController {
    private final ClientServiceConnector clientServiceConnector;

    @Autowired
    public ClientController(ClientServiceConnector clientServiceConnector) {
        this.clientServiceConnector = clientServiceConnector;
    }

    @GetMapping
    public String update() {
        return clientServiceConnector.test();
    }
}