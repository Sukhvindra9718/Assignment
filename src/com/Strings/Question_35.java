// 35. Write a Java program to trim leading white space characters in a string.
package com.Strings;

public class Question_35 {
    public static void main(String[] args)
    {
        String str = "    hello sukhvindra";

        String new_str = str.trim();

        // Display the strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
    }
}
