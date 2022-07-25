// Write a Java program to enter base and height of a triangle and find its area.
package com.basicQuestion;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base");
        int base  = sc.nextInt();

        System.out.println("Enter the height");
        int height  = sc.nextInt();

        System.out.println("The area of a triangle is : " + (base*height)/2);
        sc.close();

    }
}
