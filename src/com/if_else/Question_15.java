// Write a Java program to input all sides of a triangle and check whether triangle is valid or not
package com.if_else;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side");
        int first = sc.nextInt();
        System.out.println("Enter the angle side");
        int second = sc.nextInt();
        System.out.println("Enter the third side");
        int third = sc.nextInt();

        if(first+second > third){
            System.out.println("Valid triangle");
        }else if(first+third > second){
            System.out.println("Valid triangle");
        }else if(second + third > first){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not a Valid triangle");
        }
        sc.close();
    }
}
