// Write a Java program to check whether a character is alphabet or not.
package com.if_else;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        int ch = sc.nextLine().charAt(0);
    

        if(ch >= 65 && ch <= 90){
            System.out.println("character is a alphabet");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("character is a alphabet");
        }else{
            System.out.println("character is not a alphabet");
        }
        sc.close();
    }
}
