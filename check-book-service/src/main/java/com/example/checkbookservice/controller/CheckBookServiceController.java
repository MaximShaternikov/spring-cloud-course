package com.example.checkbookservice.controller;

import com.example.checkbookservice.model.RemotePropertyField;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CheckBookServiceController {
    private final RemotePropertyField field;

    @GetMapping(value = "/getRemoteField")
    public String getRemotePropertyField() {
        return "Data: " + field.getField();
    }
}