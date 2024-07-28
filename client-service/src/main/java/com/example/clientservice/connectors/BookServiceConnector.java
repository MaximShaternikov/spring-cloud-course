package com.example.clientservice.connectors;

import com.example.clientservice.config.FeignConfig;
import com.example.clientservice.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service", configuration = FeignConfig.class)
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooksList();
}