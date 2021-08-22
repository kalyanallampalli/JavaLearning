package com.learning.day6;

public class GenericConstructor {
    public<T> GenericConstructor(T item) {
        System.out.println("Value of the item: " + item);
        System.out.println("Type of the item: " + item.getClass().getName());
    }
}

class MainGenerics {
    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor("Test String");
    }
}
