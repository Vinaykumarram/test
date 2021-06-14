package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CovertTwoListIntoHashMap {

  public static void main(String[] args) {

    ArrayList<String> alist = new ArrayList<String>();
    alist.add("Steve");
    alist.add("Tim");
    alist.add("Lucy");


    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(20);
    numList.add(5);
    numList.add(100);
    numList.add(60);


    Map<Integer, String> map = new HashMap<>();
    for (Integer l : numList) {
      for (String s : alist) {
        map.put(l, s);
      }
    }
    System.out.println(map);
  }

}
