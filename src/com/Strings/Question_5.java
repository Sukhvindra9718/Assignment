// Write a Java program to convert lowercase string to uppercase.
package com.Strings;

public class Question_5 {
    public static String convertUpperCase(String originalString) {

        // Create a new string
        String newString = new String();

        for(int i = 0;i<originalString.length();i++){
            if(originalString.charAt(i) == ' '){
                newString += " ";
            }
            int ch_no = (int)originalString.charAt(i)-32;
            
            newString += (char)ch_no;
    
        }

        // return the modified String
        return newString;
    }

    public static void main(String[] args) {

        // Get the Strings
        String originalString = "my name is ";

        System.out.println("Original String: " + originalString);

        // Insert the String
        System.out.println("Modified String: " + convertUpperCase(originalString));
    }
}
