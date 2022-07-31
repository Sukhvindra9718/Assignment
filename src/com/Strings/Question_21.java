// 21. Write a Java program to remove first occurrence of a character from string.
package com.Strings;

import java.util.Scanner;

public class Question_21 {
    private static Scanner sc;
	public static void main(String[] args) {
		String delFirstCharStr;
		char del_ch;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to Delete Character =  ");
		delFirstCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Delete =  ");
		del_ch = sc.next().charAt(0);
		
		int i = delFirstCharStr.indexOf(del_ch);
		String out = delFirstCharStr.substring(0, i) + delFirstCharStr.substring(i + 1);
		
		System.out.println("\nThe Final String after Deleting " + del_ch + " = " + out);
	}
}
