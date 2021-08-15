package com.learning.day2;

class ParentClass {
    public void displayParent() {
        System.out.println("This is Parent class");
    }
}

class SubClass extends ParentClass {
    public void displayChild() {
        System.out.println("This is Child class");
    }

}

public class Exercise1Demo {
    public static void main(String[] args) {
        // method of parent class by object of parent class
        ParentClass parentClass = new ParentClass();
        parentClass.displayParent();

        // method of child class by object of child class
        SubClass subClass = new SubClass();
        subClass.displayChild();

        // method of parent class by object of child class
        subClass.displayParent();
    }
}
