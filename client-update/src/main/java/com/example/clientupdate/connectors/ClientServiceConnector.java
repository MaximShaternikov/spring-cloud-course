package com.example.clientupdate.connectors;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-service")
public interface ClientServiceConnector {
    @GetMapping("/api/client/test")
    String test();
}