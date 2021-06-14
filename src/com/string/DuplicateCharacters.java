package com.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
  public static void findDuplicate(String word) {
    char[] characters = word.toCharArray();

    // code to print duplicate alphabet and no. of times it occurs in string

    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (Character ch : characters) {
      if (charMap.containsKey(ch)) {
        charMap.put(ch, charMap.get(ch) + 1);
      } else {
        charMap.put(ch, 1);
      }
    }
    System.out.println("Duplicate alpha:");
    for (Map.Entry<Character, Integer> m : charMap.entrySet()) {
      if (m.getValue() > 1) {
        System.out.printf("%s : %d` %n", m.getKey(), m.getValue());
      }
    }


    //code to print first duplicate alphabet


    // List<Character> list = new ArrayList<Character>();
    // System.out.print("Duplicate alpha:");
    //
    // for(Character ch: characters) {
    // if(list.contains(ch)) {
    // System.out.println(ch);
    // break;
    // }
    // else
    // {
    // list.add(ch);
    // }
    // }
  }


  public static void main(String[] args) {
    findDuplicate("Malyalam");
  }

}
