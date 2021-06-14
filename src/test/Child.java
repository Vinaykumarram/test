package test;

 class Parent{
  void test(){
    System.out.println(" parent ");
  }
}

public class Child extends Parent{

  void test(){
    System.out.println(" child ");
  }
  
  
  public static void main(String args[]) {
    Parent p = new Child();
    p.test();
  }
}
