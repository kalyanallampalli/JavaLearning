package com.learning.day2;

class Member {
    String name, address, phoneNumber;
    int age;
    double salary;
    String specialization, department;

    Member(String name, int age, String phoneNumber, double salary, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Member Age: " + age);
        System.out.println("Member Salary: " + salary);
        System.out.println("Member Phone number: " + phoneNumber);
        System.out.println("Member Specialization: " + specialization);
        System.out.println("Member Department: " + department);
        System.out.println("Member Address: " + address);
        System.out.println();
    }
}

class Employee extends Member {
    Employee(String name, int age, String phoneNumber, double salary, String address, String specialization, String department) {
        super(name, age, phoneNumber, salary, address);
        this.specialization = specialization;
        this.department = department;
    }
}

class Manager extends Member {
    String specialization, department;
    Manager(String name, int age, String phoneNumber, double salary, String address, String specialization, String department) {
        super(name, age, phoneNumber, salary, address);
        this.specialization = specialization;
        this.department = department;
    }
}

public class Exercise2Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("Tony", 28, "4699899876", 130000,
                "123 main rd", "IT", "IT");
        employee.displayDetails();

        Manager manager = new Manager("Heather Brown", 42, "123456789", 160000,
                "456 main rd", "Delivery", "IT Management");
        manager.displayDetails();
    }
}
