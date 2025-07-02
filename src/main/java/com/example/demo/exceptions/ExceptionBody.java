package com.example.demo.exceptions;

public class ExceptionBody {
    private String message;
    private Long timeStamp;


    public ExceptionBody() {
    }

    public ExceptionBody(String message, Long timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
