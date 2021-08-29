package com.learning.day5.exercises;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        System.out.println("Elements in the tree set:");
        colors.add("White");
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");

        for (String color:
             colors) {
            System.out.println(color);
        }
        System.out.println();

        System.out.println("First element of the set: " + colors.first());
        System.out.println("Last element of the set: " + colors.last());
        System.out.println("Number of elements in the set: " + colors.size());
        System.out.println("Remove element 'Red' from the set");
        colors.remove("Red");
        System.out.println();
        System.out.println("Elements in the set: " + colors);
        System.out.println();
        System.out.println("Print elements in reverse order");
        Iterator<String> iterator = colors.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
