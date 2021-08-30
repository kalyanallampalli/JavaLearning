package com.learning.day7.exercises;

public class Exercise3 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();

        Thread thread = new Thread(exercise3, "First Thread");
        Thread thread1 = new Thread(exercise3, "Second Thread");
        Thread thread2 = new Thread(exercise3, "Third Thread");

        thread.setPriority(2);
        thread1.setPriority(6);
        thread2.setPriority(10);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
