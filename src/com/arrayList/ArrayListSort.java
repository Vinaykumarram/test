package com.arrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(50);
    list.add(5);
    list.add(4);
    list.add(21);
    list.add(22);
    System.out.println(list instanceof Serializable);
    
    List<Integer> l1 = Collections.synchronizedList(list);

    System.out.println(list.size());

    System.out.println("Before sort" + list);

    Collections.sort(list);

    System.out.println("After sort" + list);

  }

}
