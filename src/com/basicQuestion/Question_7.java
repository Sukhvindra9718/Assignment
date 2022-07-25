// Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
package com.basicQuestion;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in celcius");
        int celsius  = sc.nextInt();

        System.out.println("The temperature in fahrenheit is : " + (float)((celsius*9/5)+32) + " F");
       
        sc.close();
    }
}
