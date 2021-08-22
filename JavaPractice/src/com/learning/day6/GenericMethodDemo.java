package com.learning.day6;

public class GenericMethodDemo {
    public static<ANYNUM> void printArray(ANYNUM[] inputArray) {
        for(ANYNUM element : inputArray) {
            System.out.println("Element: " + element);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {10, 20, 30, 40};
        printArray(array);

        Double[] intDouble = {1.2, 1.3, 1.4};
        printArray(intDouble);
    }
}
