package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSortDesc {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(50);
    list.add(5);
    list.add(4);
    list.add(21);
    list.add(22);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    
    Iterator<Integer> itr= list.iterator();
    while(itr.hasNext()) {
      System.out.print(itr.next() +" ");
    }
  }

}
