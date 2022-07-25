// Write a Java program to input any character and check whether it is alphabet, digit or special
// character.
package com.if_else;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        int ch = sc.nextLine().charAt(0);
    

        if(ch >= 65 && ch <= 90){
            System.out.println("character is a alphabet");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("character is a alphabet");
        }else if(ch >= 50 && ch <= 59){
            System.out.println("character is a number");
        }else{
            System.out.println("character is a special character");
        }
        sc.close();
    }
}
