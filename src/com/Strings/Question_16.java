// 16. Write a Java program to search all occurrences of a character in given string.
package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class Question_16 {
    public static void main(String args[])
    {
        
    String input = "aaaabbccAAdd";
    char search = 'a';             // Character to search is 'a'.
    
    List<Integer> searchPosition = new ArrayList<>();

    for(int i=0; i<input.length(); i++)
    {
        if(input.charAt(i) == search)
        searchPosition.add(i);
    }
    
    System.out.println("The Character '"+search+"' appears "+searchPosition + " in these positions");
    }
}
