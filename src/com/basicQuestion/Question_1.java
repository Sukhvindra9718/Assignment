// Write a Java program to enter two numbers and find their sum.
package com.basicQuestion;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a  = sc.nextInt();

        System.out.println("Enter the second number");
        int b  = sc.nextInt();

        System.out.println("The sum of two number is : " + (a+b));
        sc.close();

    }
}
