// Write a Java program to enter length and breadth of a rectangle and find its perimeter.
package com.basicQuestion;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle");
        int length  = sc.nextInt();

        System.out.println("Enter the breadth of a rectangle");
        int breadth  = sc.nextInt();

        System.out.println("The perimeter of rectangle is : " + (2*(length+breadth)));
    
        sc.close();
    }
}
