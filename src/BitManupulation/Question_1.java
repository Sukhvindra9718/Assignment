// Write a Java program to check Least Significant Bit (LSB) of a number is set or not.
package BitManupulation;

import java.util.Scanner;

public class Question_1 {
    static String checkBit(int n){
        if(n == 0){
            return "Reset";
        }

        int res = n&1;
        return (res > 0)? "Set": "Reset";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println(checkBit(number));

        sc.close();
      
    }

}
