// 33. Write a Java program to remove last occurrence of a word in given string.
package com.Strings;

public class Question_33 {
    public static void main(String[] args) {
        String str = "my name is sukhvindra singh";
        System.out.println("String = " + str);
        System.out.println("Replacing all occurrence of given character...");
        System.out.println("Updated string = " + str.replace("singh", ""));
    }
}
