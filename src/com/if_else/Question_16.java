// Write a Java program to check whether the triangle is equilateral, isosceles or scalene
// triangle.
package com.if_else;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side");
        int first = sc.nextInt();
        System.out.println("Enter the angle side");
        int second = sc.nextInt();
        System.out.println("Enter the third side");
        int third = sc.nextInt();

        if(first == 60 && second == 60 && third == 60){
            System.out.println("Equilateral triangle");
        }else if((first == second) || (second == third) || (third == first)){
            System.out.println("Isosceles triangle");
        }else if(first + second + third == 180){
            System.out.println("Scalene triangle");
        }
        sc.close();
    }
}
