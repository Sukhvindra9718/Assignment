// 15. Write a Java program to find last occurrence of a character in a given string.
package com.Strings;

import java.util.Scanner;

public class Question_15 {
    private static Scanner sc;
	public static void main(String[] args) {
		String firstCharStr;
		char ch;
		
		sc = new Scanner(System.in);
        
		System.out.print("\nEnter String to Find First Char Occur =  ");
		firstCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
		
		int flag = firstCharStr.length()-1;
        int i = firstCharStr.length()-1;
       
		while(i >= 0)
		{
			if(firstCharStr.charAt(i) ==  ch) {
				flag--;
				break;
			}
			i--;
		}
		if(flag == 0) {
			System.out.println("\nSorry! We haven't found the Character ");
		}
		else {
			System.out.format("\nThe First Character Occurrence of %c at %d position", ch, i);
		}
	}
}
