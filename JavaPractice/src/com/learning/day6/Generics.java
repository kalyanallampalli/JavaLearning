package com.learning.day6;

public class Generics<T, U> {
    T obj1;
    U obj2;

    // constructors
    public Generics(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display() {
        System.out.println("Object 1 value: " + obj1);
        System.out.println("Object 2 value: " + obj2);
    }

    public static void main(String[] args) {
        Generics<Integer, Float> generics = new Generics<>(10, 10.234f);
        generics.display();

        Generics<String, Integer> generics1 = new Generics<>("Hello World", 20);
        generics1.display();
    }
}
