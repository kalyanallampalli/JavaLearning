package com.learning.day7.exercises;

public class Exercise1 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm a thread and my name is.. " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(exercise1, "Exercise 1 Thread");
        thread.start();
    }
}
