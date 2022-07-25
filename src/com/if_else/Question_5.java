package com.if_else;

import java.util.Scanner;
// Write a Java program to check whether a number is even or odd.
public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
