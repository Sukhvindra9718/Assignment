// Write a Java program to enter length and breadth of a rectangle and find its area.
package com.basicQuestion;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle");
        int length  = sc.nextInt();

        System.out.println("Enter the breadth of a rectangle");
        int breadth  = sc.nextInt();

        System.out.println("The area of rectangle is : " + (length*breadth));
    
        sc.close();
    }
}
