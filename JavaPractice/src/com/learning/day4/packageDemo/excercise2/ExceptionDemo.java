package com.learning.day4.packageDemo.excercise2;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("This exception thrown explictly");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'm in finally");
        }
    }
}
