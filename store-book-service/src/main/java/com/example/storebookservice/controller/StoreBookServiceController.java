package com.example.storebookservice.controller;

import com.example.storebookservice.model.RemotePropertyField;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoreBookServiceController {
    private final RemotePropertyField field;

    @GetMapping(value = "/getRemoteField")
    public String getRemotePropertyField() {
        return "Data: " + field.getField();
    }
}