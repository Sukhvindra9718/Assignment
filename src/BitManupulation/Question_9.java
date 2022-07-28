// Write a Java program to count trailing zeros in a binary number
package BitManupulation;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        int count = 0;

        while((number & 1) == 0){
            number = number >> 1;
            count++;
        }
        System.out.println("Number of trailing zeros is : " + count);

        sc.close();
    }
}
