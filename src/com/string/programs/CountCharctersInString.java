package com.string.programs;

public class CountCharctersInString {

  public static void main(String[] args) {

    String name= "Vinay Kumar Ram";
    int count=0;
    
    for(int i=0; i<name.length(); i++) {
      if(name.charAt(i) !=' ') {
        count++;
      }
    }
    System.out.println(count);
  }

}
