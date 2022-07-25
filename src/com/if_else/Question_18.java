// Write a Java program to calculate profit or loss.
package com.if_else;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price");
        int sp = sc.nextInt();

        if(sp-cp > 0){
            System.out.println("Profit : " + (sp - cp));
        }else{
            System.out.println("Loss : " + (cp - sp));
        }
        sc.close();
    }
}
