package test;


interface Interf{
    public void add(); 
}

public class FunctionalInterfaceTest {

  public static void main(String[] args) {

    Interf f= ()-> System.out.println("Hello java 8");
  }
}
