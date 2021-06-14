package com.arrayList;

import java.util.ArrayList;

public class ArrayListAddElements {

  public static void main(String[] args) {

    ArrayList<String> alist=new ArrayList<String>();  
    alist.add("Steve");
    alist.add("Tim");
    alist.add("Lucy");
    System.out.println(alist);
    
    
    ArrayList<String> alistnew=new ArrayList<String>(); 
    alistnew.add("Pat");
    alistnew.add("Angela");
    alistnew.add("Tom");
    System.out.println(alistnew);
    
    alist.addAll(alistnew);
    System.out.println(alist);
    
    alist.removeAll(alistnew);
    System.out.println(alist);

  }

}
