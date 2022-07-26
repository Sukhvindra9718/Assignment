// Write a Java program to check whether a number is even or odd using conditional/ternary
// operator.
package com.terrnary_operator;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
        sc.close();
    }
}
