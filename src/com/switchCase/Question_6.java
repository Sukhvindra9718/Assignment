// Write a Java program to create Simple Calculator using switch case.
package com.switchCase;

import java.util.Scanner;


public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first_number = sc.nextInt();
        System.out.println("Enter the second number");
        int second_number = sc.nextInt();

        System.out.println("Enter the operator");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case '+':
                System.out.println("Sum of two number is : " + (first_number+second_number));
                break;
            case '-':
                System.out.println("Differece between two number is : " + (first_number-second_number));
                break;
            case '*':
                System.out.println("Multiply of two number is : " + (first_number*second_number));
                break;
            case '/':
                if(second_number != 0)
                System.out.println("Divide of two number is : " + (first_number/second_number));
                else 
                System.out.println("Cannot divide by zero");
                break;
            case '%':
                System.out.println("Remainder of two number is : " + (first_number%second_number));
                break;
        }
        sc.close();
    }
}
