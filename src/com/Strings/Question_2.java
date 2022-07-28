// Write a Java program to copy one string to another string.
package com.Strings;

public class Question_2 {
    public static String insertString(String originalString,String stringToBeInserted,int index) {

        // Create a new string
        String newString = new String();

        for (int i = 0; i < originalString.length(); i++) {

            // Insert the original string character
            // into the new string
            newString += originalString.charAt(i);

            if (i == index) {

                // Insert the string to be inserted
                // into the new string
                newString += stringToBeInserted;
            }
        }

        // return the modified String
        return newString;
    }

    public static void main(String[] args) {

        // Get the Strings
        String originalString = "my sukhvindra singh";
        String stringToBeInserted = "name ";
        int index = 2;

        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);

        // Insert the String
        System.out.println("Modified String: " + insertString(originalString,stringToBeInserted,index));
    }
}
