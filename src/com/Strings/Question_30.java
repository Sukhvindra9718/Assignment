// 30. Write a Java program to search all occurrences of a word in given string.
package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class Question_30 {
    public static void main(String args[]) {
        String string = "Spring is beautiful but so is winter";
        String word = "is";
        String temp[] = string.split(" ");
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count.add(i);
        }
        System.out.println("The string is: " + string);
        System.out.println("The word " + word + " occurs " + count + " in these positions");
    }
}
