package com.learning.day6;

import java.util.Scanner;

public class Student implements Cloneable {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();

        Student student = new Student(age, name);
        student.display();

        Student student1 = (Student) student.clone();
        student1.display();
    }
}
