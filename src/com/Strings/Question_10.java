// 10. Write a Java program to count total number of words in a string.
package com.Strings;

import java.util.Scanner;


public class Question_10 {
    private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, words;
		words = 1;
		char ch;
		
		sc = new Scanner(System.in);
		System.out.print("\nPlease Enter the String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch == ' ') {
				words++;
			}
		}	
        if(aldisp_str.length() == 0)	
		System.out.println("\nNumber of words  =  " + (words-1));
        else if(aldisp_str.charAt(0) == ' ')
		System.out.println("\nNumber of words  =  " + (words-1));
        else 
		System.out.println("\nNumber of words  =  " + (words));

    }

}
