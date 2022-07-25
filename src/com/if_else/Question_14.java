// Write a Java program to input angles of a triangle and check whether triangle is valid or not.
package com.if_else;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first angle");
        int first = sc.nextInt();
        System.out.println("Enter the angle angle");
        int second = sc.nextInt();
        System.out.println("Enter the third angle");
        int third = sc.nextInt();

        if(first+second+third == 180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not Valid triangle");
        }
        sc.close();
    }
}
