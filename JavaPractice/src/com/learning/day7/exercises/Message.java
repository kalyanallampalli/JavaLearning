package com.learning.day7.exercises;

public class Message {
    private String message;

    Message(String message) {
        this.message = message;
    }

    String getMessage() {
        return this.message;
    }

    void printMessage() {
        System.out.println(getMessage());
    }
}
