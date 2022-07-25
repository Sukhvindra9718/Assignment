// Write a Java program to count total number of notes in given amount.
package com.if_else;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        System.out.println("Enter the notes value");
        int notes_value = sc.nextInt();

        System.out.println(amount/notes_value + " notes of " + notes_value + " rs");

        sc.close();
    }
}
