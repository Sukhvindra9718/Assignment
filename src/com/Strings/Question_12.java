package com.Strings;

public class Question_12 {
    public static boolean palindromeStr() {
        String str = "naman", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != nstr.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(palindromeStr()){
            System.out.println("Strings are palindrome");
        }else{
            System.out.println("Strings are not palindrome");
        }
    }
}
