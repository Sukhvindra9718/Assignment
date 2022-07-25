// Write a Java program to convert days into years, weeks.
package com.basicQuestion;

import java.util.Scanner;

public class Qustion_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the days");
        int days  = sc.nextInt();
       
        System.out.println("The convert days into years is : " + (days/365) + " Years");
        System.out.println("The convert days into weeks is : " + (days/7) + " weeks");
       
        sc.close();
    }
}
