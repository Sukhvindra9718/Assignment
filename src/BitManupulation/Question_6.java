// Write a Java program to toggle nth bit of a number.
package BitManupulation;

import java.util.Scanner;

public class Question_6 {
    static void toggleNthBit(int n,int i){
        if(n == 0){
            System.out.println("unset bit");
        }
        int mask = (1 << i-1);
        int ans = ((mask & n) >= 1) ? 1 : 0;
        
        if(ans == 1){
            mask = ~mask;
            ans = mask & n;
            System.out.println(n + " --> " + ans);
        }else{
            ans = mask | n;
            System.out.println(n + " --> " + ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println("Enter the nth position");
        int i = sc.nextInt();

        toggleNthBit(number, i);
        sc.close();
      
    }
}
