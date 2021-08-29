package com.learning.day5.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
    List<String> colors = new ArrayList<>();

    void printAllColors() {
        // print the collection
        if (colors.isEmpty()) {
            System.out.println("No colors found in the list");
        } else {
            System.out.println("Colors in the list: ");
            for (String color : colors) {
                System.out.println(color);
            }
            System.out.println();
        }
    }

    void addDefaultColorsToList() {
        // Add colors to the list.
        colors.add("Blue");
        colors.add("Red");
        colors.add("White");
        colors.add("Purple");
        colors.add("Pink");
    }

    void printColorFromIndex(int index) {
        System.out.println("Color at index " + index + ": " + colors.get(index));
    }

    void replaceColorAtIndex(int index, String color) {
        colors.set(index, color);
        printAllColors();
    }

    void removeElementAtIndex(int index) {
        colors.remove(index);
        printAllColors();
    }

    protected void search(String searchQuery) {
        String result = null;

        for (String color : colors) {
            if (color.contains(searchQuery)) {
                result = color;
                break;
            }
        }

        if (result == null) {
            System.out.println("No matching record found");
        } else
            System.out.println("Matching color found: " + result);
    }

    protected void sortColorsAndPrint() {
        System.out.println("Sorting colors list");
        Collections.sort(colors);
        printAllColors();
    }

    void clearListAndPrint() {
        System.out.println("Clearing the list");
        colors.clear();
        printAllColors();
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.addDefaultColorsToList();
        exercise1.printAllColors();
        // insert element in the list at first position
        exercise1.colors.add(0, "Green");
        exercise1.printAllColors();
        exercise1.printColorFromIndex(1);
        exercise1.replaceColorAtIndex(2, "Yellow");
        exercise1.removeElementAtIndex(2);
        exercise1.search("Purple");
        exercise1.sortColorsAndPrint();
        exercise1.clearListAndPrint();
    }
}
