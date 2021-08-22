package com.learning.day6;

public class MyGenClass<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println("My Object: " + obj);
    }

    T getObj() {
        return this.obj;
    }
}
