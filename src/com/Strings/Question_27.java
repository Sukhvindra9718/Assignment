// 27. Write a Java program to replace all occurrences of a character with another in a string.
package com.Strings;

public class Question_27 {
    public static void main(String[] args) {
        String str = "my name is sukhvindra singh";
        System.out.println("String = " + str);
        System.out.println("Replacing all occurrence of given character...");
        System.out.println("Updated string = " + str.replace("singh", ""));
    }
}
