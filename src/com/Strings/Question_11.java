// 11. Write a Java program to find reverse of a string.
package com.Strings;

public class Question_11 {
    // User defined
    public static void reverseStr() {
        String str = "hello", nstr = "";
        char ch;

        System.out.println("Original word: " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
    // Built in method
    public static void main(String[] args) {
        // String input = "hello";

        // StringBuilder input1 = new StringBuilder();

        // // append a string into StringBuilder input1
        // input1.append(input);

        // // reverse StringBuilder input1
        // input1.reverse();

        // // print reversed String
        // System.out.println(input1);

        reverseStr();
    }

}
