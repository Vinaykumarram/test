package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashmapToArrayList {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Google", 5000);
    map.put("amazon", 1000);
    map.put("microsoft", 15000);
    map.put("flipkart", 47000);
    
    Iterator<String> itr = map.keySet().iterator();
    while(itr.hasNext()) {
       String key = (String)itr.next();
//      keyList.add(map.get(key);
      
    }
    
    System.out.println("Key List");

    List<String> keyList = new ArrayList<String>(map.keySet());
    for(String e : keyList) {
      System.out.println(e);
    }
    
    System.out.println("Value List");

    List<Integer> keyVal = new ArrayList<Integer>(map.values());
    for(Integer v : keyVal) {
      System.out.println(v);
    }
    
  }

}
