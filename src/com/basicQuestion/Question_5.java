// Write a Java program to enter radius of a circle and find its diameter, circumference and area
package com.basicQuestion;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        final float pie = 3.14f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the redius of a circle");
        int radius  = sc.nextInt();

        System.out.println("The diameter of circle is : " + (2*radius));
        System.out.println("The circumference of circle is : " + (2*pie*radius));
        System.out.println("The area of circle is : " + (pie*radius*radius));
    
        sc.close();
    }
}

