// Write a Java program to enter two angles of a triangle and find the third angle.
package com.basicQuestion;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first angle");
        int a  = sc.nextInt();

        System.out.println("Enter the second angle");
        int b  = sc.nextInt();

        System.out.println("The third angle is : " + (180-(a+b)));
        sc.close();

    }
}
