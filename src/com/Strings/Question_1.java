// Write a Java program to find length of a string.
package com.Strings;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();
       
        System.out.println(str.length());

        sc.close();
    }
}
