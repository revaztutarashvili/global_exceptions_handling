package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @Operation(summary = "Save person", description = "Throws IllegalArgumentException")
    @PostMapping("/save")
    public void savePerson(){
        throw new IllegalArgumentException("illegal argument provided");
    }
}
