// Write a Java program to clear nth bit of a number.
package BitManupulation;

import java.util.Scanner;

public class Question_5 {
    static void clearNthBit(int n,int i){
        if(n == 0){
            System.out.println("unset bit");
        }
        int mask = ~(1 << i-1);
        
        int ans = (mask & n);
        // 101
        // 010

        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println("Enter the nth position");
        int i = sc.nextInt();

        clearNthBit(number, i);
        sc.close();
      
    }
}
