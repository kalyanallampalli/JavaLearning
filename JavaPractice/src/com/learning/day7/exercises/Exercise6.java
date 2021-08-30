package com.learning.day7.exercises;

public class Exercise6 {
    public static void main(String[] args) {
        Message[] messages = new Message[] {new Message("Hello Java!"), new Message("Hello Golang!")};

        // iterate over until current thread is interrupted
        while(!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (Message message: messages) {
                // Thread can start only once in its life time.
                // Once it has been started and finished its work, it cannot be started again.
                // So we have to create a new instance of Thread and start it.
                Thread thread = new Thread(() -> { message.printMessage(); });
                thread.start();
            }
        }
    }
}
