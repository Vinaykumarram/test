package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {

  public static void main(String[] args) {

    Demo d = new Demo();
    Map m = new HashMap();
    
    m.put(d, "Hello");
    System.out.println(m);
    
    d=null;
    
    System.gc(); 

    System.out.println(m);
  }

}

class Demo{

  public String toString()
  {
      return "demo";
  }
  
}
