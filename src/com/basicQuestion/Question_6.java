// Write a Java program to enter length in centimeter and convert it into meter and kilometer.
package com.basicQuestion;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length in meter");
        int meter  = sc.nextInt();

        System.out.println("The length in kilometer is : " + (meter/1000) + " KM");
       
        sc.close();
    }
}
