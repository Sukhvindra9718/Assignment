// Write a Java program to check Most Significant Bit (MSB) of a number is set or not.
package BitManupulation;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        int bits = 32;
        int msb = (1 << bits-1);
        int res = number&msb;


        if(res >= 1 || res < 0)
        System.out.format("MSB of %d is set (1). ",number);
        else
        System.out.format("MSB of %d is unset (0). ",number);

        sc.close();
      
    }
}
