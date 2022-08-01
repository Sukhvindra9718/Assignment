// 38. Write a Java program to remove all extra blank spaces from a given string.
package com.Strings;

public class Question_38 {
    public static void main(String[] args) {    
            
        String str1="Remove all extra    spaces";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", " ");    
            
        System.out.println("String after removing all the spaces : " + str1);    
    }    
}
