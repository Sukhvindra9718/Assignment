// 17. Write a Java program to count occurrences of a character in given string.
package com.Strings;

public class Question_17 {
    public static void main(String args[])
    {
        
    String input = "aaaabbccAAdd";
    char search = 'a';             // Character to search is 'a'.
    
    int count = 0;

    for(int i=0; i<input.length(); i++)
    {
        if(input.charAt(i) == search)
        count++;
    }
    
    System.out.println("The Character '"+search+"' appears "+ count + " times");
    }
}
