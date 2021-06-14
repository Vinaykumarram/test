package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Google", 5000);
    map.put("amazon", 1000);
    map.put("microsoft", 15000);
    map.put("flipkart", 47000);
    map.put(null, null);
    map.put("zomato", null);
    
    System.out.println(map);
    
    System.out.println("------------------------------------->");
     System.out.println("fetch using for loop");
     for (Map.Entry<String, Integer> values : map.entrySet()) {
      System.out.println(values.getKey()+ ","+ values.getValue());
    }
     
     System.out.println("------------------------------------->");
     System.out.println("fetch using Iterator");
     Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
     while(itr.hasNext()) {
       System.out.println(itr.next());
     }
     
     System.out.println("------------------------------------->");
     System.out.println("fetch key set");
     Iterator iterator = map.entrySet().iterator();
     while(iterator.hasNext()) {
    Map.Entry<String, Integer> newValue = (Map.Entry<String, Integer>)iterator.next();
    System.out.println(newValue.getKey());
     }
  


  }

}
