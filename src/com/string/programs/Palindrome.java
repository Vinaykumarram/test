package com.string.programs;

public class Palindrome {

  public static void main(String[] args) {

    String str = "nayan";

    StringBuilder sb = new StringBuilder(str);

    sb.reverse();

    String rev = sb.toString();
    
    if (str.equals(rev)) {
      System.out.println("String is palindrome");
    } else {
      System.out.println("String is not palindrome");
    }
  }

}
