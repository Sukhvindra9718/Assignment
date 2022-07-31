// 13. Write a Java program to reverse order of words in a given string.
package com.Strings;

public class Question_13 {
    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    }  
    public static void main(String[] args) {
        System.out.println(reverseWord("my name is khan"));  
        System.out.println(reverseWord("I am sonoo jaiswal")); 
    }
}
