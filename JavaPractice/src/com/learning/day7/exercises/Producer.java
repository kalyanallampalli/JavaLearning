package com.learning.day7.exercises;

import java.util.ArrayList;

public class Producer extends Thread {

    ArrayList buffer;

    Producer() {
        this.buffer = new ArrayList();
    }

    @Override
    public void run() {
        synchronized (buffer) {
            for (int i = 0; i < 4; i++) {
                try {
                    String message = "Message " + i;
                    buffer.add(message);
                    System.out.println("Produced\t" + message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Buffer is full");
            System.out.println();
            buffer.notify();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
