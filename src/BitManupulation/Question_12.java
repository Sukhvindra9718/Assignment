// Write a Java program to total number of zeros and ones in a binary number.
package BitManupulation;

import java.util.Scanner;

public class Question_12 {
    static void count1s0s(int n){
        int count1 = 0;
        int count0 = 0;
        while(n > 0){
            if((n%2==1)){
                count1++;
            }else{
                count0++;
            }
            n = n>>1;
        }
        System.out.println("Count of Os in number is : "+ count0);
        System.out.println("Count of 1s in number is : "+ count1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        count1s0s(number);
        sc.close();
    }
}
