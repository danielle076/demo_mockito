package com.example.demo_mockito.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "/")
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok().body("/customers endpoint available");
    }
}
