// Write a Java program to concatenate two strings.
package com.Strings;

public class Question_3 {
    public static String concateString(String originalString,String stringToBeInserted) {

        // Create a new string
        String newString = new String();

        // Insert the original string character
        // into the new string
        newString = originalString;
        newString += stringToBeInserted;

        // return the modified String
        return newString;
    }

    public static void main(String[] args) {

        // Get the Strings
        String originalString = "my name is ";
        String stringToBeInserted = "sukhvidra singh";

        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);

        // Insert the String
        System.out.println("Modified String: " + concateString(originalString,stringToBeInserted));
    }
}
