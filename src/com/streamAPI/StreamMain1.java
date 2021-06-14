package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain1 {

  public static void main(String[] args) {
 
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(21);
    list.add(22);
    list.add(50);
    list.add(67);
    
    
    Stream<Integer> stream = list.stream();
    stream.forEach(e->{
      System.out.println(e);
    });
  }

}
