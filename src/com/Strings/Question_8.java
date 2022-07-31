// 8. Write a Java program to find total number of alphabets, digits or special character in a string.
package com.Strings;

import java.util.Scanner;

public class Question_8 {
    private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, alphabets, digits, spacialCh;
		alphabets = digits = spacialCh = 0;
		char ch;
		
		sc = new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alphabets++;
			}
			else if(ch >= '0' && ch <= '9') {
				digits++;
			}
			else {
				spacialCh++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alphabets);
		System.out.println("Number of Digit Characters     =  " + digits);
		System.out.println("Number of Special Characters   =  " + spacialCh);
    }

}
