// 28. Write a Java program to find first occurrence of a word in a given string.
package com.Strings;

public class Question_28 {
    public static void main(String[] args) {
        String str = "my name is sukhvindra singh sukhvindra sukhvindra";
        String replaceStr = "sukhvindra";
        String newStr = "jogindar";
        System.out.println("String = " + str);
        System.out.println("Replacing all occurrence of given character...");
        System.out.println("Updated string = " + str.replace(replaceStr, newStr));
    }
}
