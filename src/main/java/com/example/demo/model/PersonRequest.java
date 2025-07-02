package com.example.demo.model;

import jakarta.validation.constraints.*;

public class PersonRequest {
    @NotNull (message = "name should not be null")
    private String name;

    @NotBlank(message = "Required")
    @Min(value = 11, message = "pn should contain 11 digits")
    @Max(value = 11, message = "pn should contain 11 digits")
    private int personalNumber;

    @Size(min = 6, max = 12, message = "password must contain 6-12 character")
    private String password;

    @NotBlank(message = "required")
    @Size(min = 6, max = 12, message = "username should 4-12 letter")
    private String userName;

    @Email(message = "field required to be filled up")
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
