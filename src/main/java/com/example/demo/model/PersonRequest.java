//package com.example.demo.model;
//
//import jakarta.validation.constraints.*;
//
//public class PersonRequest {
//    @NotNull
//    @NotBlank(message = "name field required")
//    private String name;
//
//    @NotBlank(message = "PN should not be blank or less than 11 digit")
//    @Size(min = 11, max = 11, message = "pn should contain 11 digits")
//    private int personalNumber;
//
//    @Min(value = 6, message = "password must be contain 6 or more character")
//    private String password;
//
//    @NotBlank(message = "username field required")
//    @Max(value = 10, message = "username max letter is 10")
//    private String userName;
//
//    @Email
//    @NotBlank(message = "field required to be filled up")
//    private String mail;
//
//
//
//}
