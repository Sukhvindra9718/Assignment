// 31. Write a Java program to count occurrences of a word in a given string.
package com.Strings;

public class Question_31 {
    public static void main(String args[]) {
        String string = "Spring is beautiful but so is winter";
        String word = "is";
        String temp[] = string.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The string is: " + string);
        System.out.println("The word " + word + " occurs " + count + " times in the above string");
    }
}