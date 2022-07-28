// Write a Java program to swap two numbers using bitwise operator.
package BitManupulation;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.format("Before swap a = %d and b = %d",a,b);
        System.out.println();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.format("After swap a = %d and b = %d",a,b);
        sc.close(); 
    }
}
