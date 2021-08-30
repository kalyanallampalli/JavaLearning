package com.learning.day7.exercises;

public class Table {
    protected synchronized void printTable(int number) {
        System.out.println("I'm running in a thread called: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
