// 36. Write a Java program to trim trailing white space characters in a string.
package com.Strings;

public class Question_36 {
    public static void main(String[] args) 
  {
    String originalString1 = "hello world   "; // 3 trailing spaces
 
    System.out.println(removeTrailingSpaces(originalString1));
    
  }
 
  public static String removeTrailingSpaces(String param) 
  {
    if (param == null)
      return null;
    int len = param.length();
    for (; len > 0; len--) {
      if (!Character.isWhitespace(param.charAt(len - 1)))
        break;
    }
    return param.substring(0, len);
  }
}
