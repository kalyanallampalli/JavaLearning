package com.learning.day7.exercises;

// Program to display all active threads
public class Exercise4 implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Thread Name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
        Exercise4 exercise41 = new Exercise4();

        Thread thread = new Thread(exercise4, "Thread 1");
        Thread thread1 = new Thread(exercise41, "Thread 2");

        thread.start();
        thread1.start();

        // get the group of current thread
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        int threadCount = threadGroup.activeCount();

        Thread threadList[] = new Thread[threadCount];
        // enumerate over the thread list
        threadGroup.enumerate(threadList);

        for (Thread th: threadList) {
            System.out.println("Active Thread Name: " + th.getName());
        }
    }
}
