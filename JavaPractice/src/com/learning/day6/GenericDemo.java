package com.learning.day6;

public class GenericDemo {
    public static void main(String[] args) {
        MyGenClass<Integer> myGenClass = new MyGenClass<>();
        myGenClass.add(10);
        myGenClass.display();

        MyGenClass<String> myGenClass1 = new MyGenClass<>();
        myGenClass1.add("Hello");
        myGenClass1.display();
    }
}
