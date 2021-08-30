package com.learning.day7.exercises;

public class Exercise2 implements Runnable {

    @Override
    public void run() {
        System.out.println("My name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();

        Thread thread1 = new Thread(exercise2, "Thread 1");
        Thread thread2 = new Thread(exercise2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
