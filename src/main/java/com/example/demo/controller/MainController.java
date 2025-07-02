package com.example.demo.controller;

import com.example.demo.model.PersonRequest;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @Operation(summary = "Save person", description = "Throws IllegalArgumentException")
    @PostMapping("/save")
    public void savePerson(){
        throw new IllegalArgumentException("illegal argument provided");
    }
    @PostMapping("/createUser")
    public void createPerson(@Valid @RequestBody PersonRequest personRequest){
        System.out.println("New person received and validated. Username: " + personRequest.getUserName());
        System.out.println( "Use created successfully:"+
                personRequest.getUserName() +
                personRequest.getPersonalNumber() +
                personRequest.getPassword() +
                personRequest.getName()+
                personRequest.getMail()) ;





    }
}
