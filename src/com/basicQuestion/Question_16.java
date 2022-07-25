package com.basicQuestion;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest");
        int rate = sc.nextInt();
        System.out.println("Enter the time in years");
        int years = sc.nextInt();
        
        System.out.println("Simple Interest is : " + ((principal*rate*years)/100));
       
        sc.close();
    }
}
