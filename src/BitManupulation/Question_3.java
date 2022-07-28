// Write a Java program to get nth bit of a number.
package BitManupulation;

import java.util.Scanner;

public class Question_3 {
    static void checkBit(int n,int i){
        if(n == 0){
            System.out.println("unset bit");
        }
        int mask = (1 << i-1);
        int ans = ((mask & n) >= 1) ? 1 : 0;
        
        if(ans == 1){
            System.out.println("set bit");
        }else{
            System.out.println("unset bit");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println("Enter the nth position");
        int i = sc.nextInt();

        checkBit(number, i);
        sc.close();
      
    }
}
