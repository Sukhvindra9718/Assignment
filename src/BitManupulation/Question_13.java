// Write a Java program to convert decimal to binary number system using bitwise operator.
package BitManupulation;

import java.util.Scanner;

public class Question_13 {
    static void decToBinary(int n){
        int [] binaryNum = new int[32];
        int i = 0;

        while(n>0){
            binaryNum[i++] = n%2;
            n = n>>1;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        decToBinary(number);
        sc.close();
    }
}
