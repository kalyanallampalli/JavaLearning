package com.learning.day4.packageDemo.excercise2;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = null;
        try {
            exceptionDemo.getClass();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
