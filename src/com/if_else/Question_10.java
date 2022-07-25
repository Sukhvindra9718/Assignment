// Write a Java program to check whether a character is uppercase or lowercase alphabet.
package com.if_else;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        int ch = sc.nextLine().charAt(0);
    

        if(ch >= 65 && ch <= 90){
            System.out.println("character is  Uppercase");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("character is Lowercase");
        }
        sc.close();
    }
}
