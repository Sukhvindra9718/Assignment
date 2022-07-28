// Write a Java program to toggle case of each character of a string.
package com.Strings;

public class Question_7 {
    public static String convertToggleCase(String originalString) {

        // Create a new string
        String newString = new String();
        char ch;

        for(int i = 0; i < originalString.length(); i++)
		{
			if(originalString.charAt(i) >= 'A' && originalString.charAt(i) <= 'Z') {
				ch = (char) (originalString.charAt(i) + 32);
			}
			else if(originalString.charAt(i) >= 'a' && originalString.charAt(i) <= 'z') {
				ch = (char) (originalString.charAt(i)-32);
			}
            else{
				ch = (char) (originalString.charAt(i));
            }
			newString += ch;
		}

        // return the modified String
        return newString;
    }

    public static void main(String[] args) {

        // Get the Strings
        String originalString = "MY NAME is SUKHVINDRA SINGH";

        System.out.println("Original String: " + originalString);

        // Insert the String
        System.out.println("Modified String: " + convertToggleCase(originalString));
    }
}

