// 18. Write a Java program to find highest frequency character in a string.
package com.Strings;

public class Question_18 {
    static final int ASCII_SIZE = 256;
    static char getMaxOccurringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        int len = str.length();

        for (int i=0; i<len; i++)
            count[str.charAt(i)] = count[str.charAt(i)] + 1;
            // count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Highest frequency  character is " + getMaxOccurringChar(str));
    }
}
