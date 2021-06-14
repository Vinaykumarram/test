package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedCharacter {

  public static void findDuplicate(String word) {
    char[] characters = word.toCharArray();

    Set<Character> repeated = new HashSet<Character>();
    List<Character> nonRepeated = new ArrayList<Character>();

    for (Character ch : characters) {
      if (nonRepeated.contains(ch)) {
        nonRepeated.remove(ch);
        repeated.add(ch);
      } else {
        nonRepeated.add(ch);
      }
    }
   System.out.println(nonRepeated.get(0));
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    findDuplicate("vinayvin");

  }

}
