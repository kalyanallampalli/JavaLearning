package com.learning.day7.exercises;

public class Consumer extends Thread {
    Producer producer;

    Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        synchronized (producer.buffer) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Consumed\t" + producer.buffer.get(i));
            }
            producer.buffer.notify();
            System.out.println("\n Buffer is empty");
        }
    }
}
