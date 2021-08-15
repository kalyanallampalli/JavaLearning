package com.learning.day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();

        // Multiply 3 digits
        int result = multiplier.multiply(2, 3, 5);
        System.out.println("Product of 2, 3, 5 = " + result);

        // Read input from user and multiply the numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int number2 = scanner.nextInt();
        int result2 = multiplier.multiply(number1, number2);
        System.out.println("Product of " + number1 + ", " + number2 + " = " + result2);

        // Read input from user and print whether it is positive or negative
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        Numerator number = new Numerator(num);
        System.out.println(num + " is " + number.sign());

        // Print zero if number is Zero
        System.out.println("Enter a floating number: ");
        float floatNumber = scanner.nextFloat();
        Numerator numerator = new Numerator(floatNumber);
        System.out.println("Float number " + floatNumber + " is " + numerator.floatEvaluate());

        // Read input from user and print the week day
        System.out.println("Enter any number between 1 to 7:");
        int num2 = scanner.nextInt();
        WeekDay weekDay = new WeekDay();
        System.out.println(num2 + " is " + weekDay.day(num2));
    }
}
