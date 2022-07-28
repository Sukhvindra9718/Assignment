// Write a Java program to get lowest set bit of a number.
package BitManupulation;

import java.util.Scanner;

public class Question_8 {
    static int getLowestBit(int n){
        int rem = 0;
        if(n == 0){
            return 0;
        }
        int msb = 0;
        while(n != 0){
            rem = n%2;

            if(rem == 1){
                msb++;
                return msb;
            }
            n = n/2;
            msb++;
        }
        return (1 << msb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println("lowest set bit on position : " + getLowestBit(number));

        sc.close();
      
    }
}
