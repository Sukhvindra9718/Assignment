package com.Strings;

import java.util.Scanner;

public class Question_9 {
    private static Scanner sc;
	public static void main(String[] args) {
		String disp_str;
		int i, vowels, consonents;
		vowels = consonents = 0;
		char ch;
		
		sc = new Scanner(System.in);
		System.out.print("\nPlease Enter A String =  ");
		disp_str = sc.nextLine();
		
		for(i = 0; i < disp_str.length(); i++)
		{
			ch = disp_str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				vowels++;
			}
			else {
				consonents++;
			}
		}		
		System.out.println("\nNumber of Vowel Characters  =  " + vowels);
		System.out.println("Number of Consonets Characters   =  " + consonents);
    }
}
