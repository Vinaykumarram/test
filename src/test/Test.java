package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    List<String> listGame = new ArrayList<String>();
    listGame.add("cricket");
    listGame.add("football");
    listGame.add("hockey");
    listGame.add("Tennis");
    
    System.out.println("List of Games"+ listGame );



    List<String> list = new ArrayList<String>();
    list.add("Vinay");
    list.add("test");

    list.add("Mango");
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    System.out.println(list);
    Collections.sort(list);
    System.out.println("After Arralist sorting" + list);
    list.addAll(listGame);
    System.out.println("After adding AL to another Arralist sorting" + list);
    
    Iterator<String> itr=list.iterator();//getting the Iterator  
    while(itr.hasNext()){//check if iterator has the elements  
     System.out.println(itr.next());//
    }
    
    LinkedList<String> ll=new LinkedList<String>();  
    ll.add("Ravi");  
    ll.add("Vijay");  
    ll.add("Ajay");  
    //Traversing the list of elements in reverse order  
    Iterator i=ll.descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  
    
  }

}
