// Write a Java program to check whether a year is leap year or not.
package com.if_else;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%4 == 0){
            if(num%100 == 0){
                if(num%400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not A Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Not A Leap Year");
        }
        sc.close();
    }
}
