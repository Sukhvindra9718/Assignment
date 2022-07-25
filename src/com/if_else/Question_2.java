// Write a Java program to find maximum between three numbers.
package com.if_else;

public class Question_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 14;

        if(a>b){
            if(a>c){
                System.out.println("A is greater than B and C");
            }
            else{
                System.out.println("C is greater than A and B");
            }
        }
        else if(b > a){
            if(b > c){
                System.out.println("B is greater than A and C");
            }
            else{
                System.out.println("C is greater than A and B");
            }
        }
        else{
            System.out.println("C is greater than A and B");
        }
    }
}
