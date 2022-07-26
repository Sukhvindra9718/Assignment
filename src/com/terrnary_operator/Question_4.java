// Write a Java program to check whether year is leap year or not using conditional/ternary
// operator.
package com.terrnary_operator;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = sc.nextInt();
        String d = (year%4 == 0 ? ((year%100 == 0)? ((year%400 == 0)? "Leap year":"Not a leap year"):"Leap year"): "Not a leap year");

        System.out.println(d);
        sc.close();
    }
}
