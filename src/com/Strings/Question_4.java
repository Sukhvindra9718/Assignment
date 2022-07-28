// Write a Java program to compare two strings.
package com.Strings;

public class Question_4 {
    public static boolean compareString(String firstString,String secondString) {
        int i = 0;
        if(firstString.length() != secondString.length()){
            return false;
        }

        while(i<firstString.length()){
            if(firstString.charAt(i) != secondString.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        // Get the Strings
        String firstString = "my name is ";
        String secondString = "my neme is ";

        System.out.println("Original String: " + firstString);
        System.out.println("String to be inserted: " + secondString);

        // Insert the String
        if(compareString(firstString,secondString)){
            System.out.println("Both strings are same");
        }else{
            System.out.println("Both strings are different");
        }
    }
}
