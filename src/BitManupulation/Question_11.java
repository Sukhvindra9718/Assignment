// Write a Java program to flip bits of a binary number using bitwise operator.
package BitManupulation;

import java.util.Scanner;
import java.util.Stack;

public class Question_11 {
    static int flipBits(int number){

        // count set bits // log2(n)
        int x = (int)(Math.log(number)/Math.log(2));

        int mask = 1 << x;

        mask = (mask-1)|mask;

        number = number ^ mask;

        return number;
    }
    static void showBits(int ans){
        int x = (int)(Math.log(ans)/Math.log(2));
        Stack<Integer> arr = new Stack<>();
        for(int i = 0;i<=x;i++){
            arr.add(ans%2);
            ans = ans/2;
        }
        while(!arr.empty()){
            System.out.print(arr.pop());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        int ans = flipBits(number);
        System.out.println("After the flip the bits : " + ans);
        showBits(ans);
        sc.close();

    }
}
