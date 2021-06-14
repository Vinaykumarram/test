package oops;


class Test {
  public void add(int a, int b) {
    System.out.println(a + b);
  }

  public void add(int a, int b, int c) {
    System.out.println(a + b + c);
  }
}


public class OverLoading {

  public static void main(String[] args) {
    Test t = new Test();
    t.add(5, 5);
  }

}
