package com.learning.day6;

public class GenericTest {
    public<T> void showItemDetails(T item) {
        System.out.println("Value of the item: " + item);
        System.out.println("Type of the item: " + item.getClass().getName());
    }
}

class MainTest {
    public static void main(String[] args) {
        GenericTest genericTest = new GenericTest();
        genericTest.showItemDetails("Hello World");
        genericTest.showItemDetails(1000);
        genericTest.showItemDetails(100.12f);
    }
}
