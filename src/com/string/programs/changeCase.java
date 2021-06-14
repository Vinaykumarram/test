package com.string.programs;

public class changeCase {

  public static void main(String[] args) {

    String name = "VinaY";
    StringBuffer newStr = new StringBuffer(name);

     for(int i=0; i<name.length();i++) {
       if(Character.isLowerCase(name.charAt(i))) {
         newStr.setCharAt(i, Character.toUpperCase(name.charAt(i)));
       }else if(Character.isUpperCase(name.charAt(i))) {
         newStr.setCharAt(i, Character.toLowerCase(name.charAt(i)));
       }
     }
     System.out.println(newStr);
  }

}
