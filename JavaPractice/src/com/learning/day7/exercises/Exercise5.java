package com.learning.day7.exercises;

public class Exercise5 {
    public static void main(String[] args) {
        Table table = new Table();
        Integer[] numbers = {2, 5, 10};

        // Iterate over numbers array and print table
        for (int number: numbers) {
            // anonymous threads
            Thread thread = new Thread(() -> table.printTable(number));
            // start a new thread for every number
            thread.start();
        }
    }
}
