// Write a Java program to check whether a number is even or odd using bitwise operator.
package BitManupulation;

import java.util.Scanner;


public class Question_15 {
    static boolean isEven(int num){
        return ((num&1) != 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.err.println(isEven(num) == true ? "even":"odd");

        sc.close();

    }
}
