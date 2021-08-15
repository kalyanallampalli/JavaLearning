package com.learning.day3;

// String methods demo.

import java.util.Arrays;

public class Exercise1Demo {
    public static void main(String[] args) {
        // split()
        String quote = "Quote: The Quick brown fox jumps over a lazy dog";
        String[] quoteSplit = quote.split(":");
        System.out.println(Arrays.toString(quoteSplit));

        // length()
        String str = "Refrigerator";
        System.out.println("Length of " + str + " is " + str.length());

        // concat()
        String java = "Java Programming";
        System.out.println(java.concat(" Language"));

        // replace()
        String str1 = "String: this is java";
        str1 = str1.replace("String: ", "");
        System.out.println(str1);
    }
}
