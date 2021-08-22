package com.learning.day4.packageDemo.excercise2;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = i + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'm in finally block");
        }
    }
}
