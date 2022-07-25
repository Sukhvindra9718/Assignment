// Write a Java program to enter two numbers and perform all arithmetic operations.
package com.basicQuestion;
import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a  = sc.nextInt();

        System.out.println("Enter the second number");
        int b  = sc.nextInt();

        System.out.println("The sum of two number is : " + (a+b));
        System.out.println("The difference of two number is : " + (a-b));
        System.out.println("The multiply of two number is : " + (a*b));
        System.out.println("The divide of two number is : " + (a/b));
        System.out.println("The remainder of two number is : " + (a%b));

        sc.close();
    }
}

