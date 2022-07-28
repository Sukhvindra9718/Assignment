// Write a Java program to get highest set bit of a number.
package BitManupulation;

import java.util.Scanner;

public class Question_7 {
    static int getHighestBit(int n){
        if(n == 0){
            return 0;
        }
        int msb = 1;
        n = n/2;
        while(n != 0){
            n = n/2;
            msb++;
        }
        // return (1 << msb);
        return msb;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        // System.out.println("Highest set bit value : " + getHighestBit(number));
        System.out.println("Highest set bit on position : " + getHighestBit(number));

        sc.close();
      
    }
}
