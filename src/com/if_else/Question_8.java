// Write a Java program to input any alphabet and check whether it is vowel or consonant.
package com.if_else;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sc.nextLine().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Character is vowel");
        }else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Character is vowel");
        }else{
            System.out.println("Character is consonent");
        }
        sc.close();
    }
}
