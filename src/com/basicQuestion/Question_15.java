// Write a Java program to enter marks of five subjects and calculate total, average and
// percentage.
package com.basicQuestion;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0;i<5;i++){
            System.err.println("Enter the marks of all subject one by one");
            int a = sc.nextInt();
            total += a;
        }
        double average = total/5;
        double percentage = total/5;

        System.out.println("Total marks of 5 subjects is : " + total);
        System.out.println("Total average of 5 subjects is : " + average);
        System.out.println("Total percentage of 5 subjects is : " + percentage + "%");
        sc.close();
    }
}
