package com.learning.day7.exercises;

public class Exercise7 {
    public static void main(String[] args) {

        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);

        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer);

        thread.start();
        thread1.start();
    }
}
