// Write a Java program to input month number and print number of days in that month.
package com.if_else;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month number");
        int num = sc.nextInt();

        if( num == 1){
            System.out.println("January 31 days in this month");
        }else if(num == 2){
            System.out.println("February 28 days in this month");
        }else if(num == 3){
            System.out.println("March 31 days in this month");
        }else if(num == 4){
            System.out.println("April 30 days in this month");
        }else if(num == 5){
            System.out.println("May 31 days in this month");
        }else if(num == 6){
            System.out.println("June 30 days in this month");
        }else if(num == 7){
            System.out.println("July 31 days in this month");
        }else if(num == 8){
            System.out.println("August 31 days in this month");
        }else if(num == 9){
            System.out.println("September 30 days in this month");
        }else if(num == 10){
            System.out.println("October 31 days in this month");
        }else if(num == 11){
            System.out.println("November 30 days in this month");
        }else if(num == 12){
            System.out.println("December 31 days in this month");
        }else{
            System.out.println("Invaid number");
        }
        sc.close();
    }
}
