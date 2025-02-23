package com.example.checkbookservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Book {
    private int id;
    private String name;
    private String description;
    private String status;
    private int price;

    public Book(int id, String name, String description, String status, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.price = price;
    }
}
