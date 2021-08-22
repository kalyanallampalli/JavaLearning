package com.learning.day4.packageDemo.java;

public class Main {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[3];
        for (int i = 0; i < 3; i++) {
            DataObject dataObject = new DataObject(i);
            dataObjects[i] = dataObject;
        }
        int sum = 0;

        for (DataObject dataObject:
             dataObjects) {
            sum += dataObject.count;
        }
        System.out.println("Total sum of all data objects: " + sum);
    }
}
