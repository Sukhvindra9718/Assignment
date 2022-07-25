// Write a Java program to enter any number and calculate its square root.
package com.basicQuestion;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int base  = sc.nextInt();
       
        System.out.println("The square root is : " + (Math.sqrt(base)));
       
        sc.close();
    }
}
