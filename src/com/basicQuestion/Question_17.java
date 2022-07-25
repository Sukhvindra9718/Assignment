// Write a Java program to enter P, T, R and calculate Compound Interest.
package com.basicQuestion;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest");
        int rate = sc.nextInt();
        System.out.println("Enter the time in years");
        int time = sc.nextInt();
        
        double compound_interest = principal * (Math.pow((1+rate / 100), time))-principal;

        System.err.println("Compound interest is : " + compound_interest);
       
        sc.close();
    }
}
