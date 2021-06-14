package com.string.programs;

public class CountVowelConsonant {

  public static void main(String[] args) {

    String name = "vinays";

    int vowels = 0, consonants = 0;

    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
          || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
         vowels++;
      }else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
        consonants++;
      }
    }
    
    System.out.println("number of vowels: " + vowels);
    System.out.println("number of consonants: " + consonants);

  }

}
