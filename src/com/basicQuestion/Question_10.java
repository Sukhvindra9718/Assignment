// Write a Java program to find power of any number x ^ y.
package com.basicQuestion;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base value");
        int base  = sc.nextInt();
        System.out.println("Enter the exponent value");
        int exponent  = sc.nextInt();
       
        System.out.println("The ans is : " + (Math.pow(base,exponent)));
       
        sc.close();
    }
}
