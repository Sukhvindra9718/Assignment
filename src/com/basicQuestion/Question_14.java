// Write a Java program to calculate area of an equilateral triangle.
package com.basicQuestion;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int a = sc.nextInt();
        double ans = Math.sqrt(3)*a*a/4;
        System.out.println("The area of equilateral triangle is : " + ans);
       
        sc.close();
    }
}
