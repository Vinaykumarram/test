package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsOfStream {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(90);
    list.add(67);
    list.add(21);
    list.add(6);
    list.add(50);
    list.add(4);

    // List<Integer> newList = list.stream().map(i-> i*i).collect(Collectors.toList());
    // System.out.println(newList);

    Stream<Integer> filter = list.stream().filter(e -> e > 50);
    filter.forEach(f -> System.out.println("number greater than 50 " + f));

    list.stream().sorted().forEach(System.out::println);

    List<String> listOfString = new ArrayList<String>();
    listOfString.add("ajay");
    listOfString.add("vinay");
    listOfString.add("anita");
    listOfString.add("maansi");

    List<String> newNames =
        listOfString.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
    System.out.println(newNames);
  }

}
