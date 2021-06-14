package com.exeption;

public class TestException {

  public static void main(String[] args) {

    int a= 10;
    int c;
    
    try {
      c= 10/0;
    }
    catch(ArithmeticException ae){
      System.out.println( ae);
    }
    System.out.println("rest of the code");
    
  }
}
