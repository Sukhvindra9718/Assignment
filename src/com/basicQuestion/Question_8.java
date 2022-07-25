// Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)
package com.basicQuestion;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in fahrenheit");
        float fahrenheit  = sc.nextFloat();
        float celcius = ((fahrenheit-32)*5/9);
        System.out.println("The temperature in celsius is : " + celcius + " C");
       
        sc.close();
    }
}
