package test;

public class FabanacciSeries {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int m = 0, n = 1, k, count = 10;

    System.out.print(m + " " + n);
    for (int i = 2; i < count; i++) {
      k = m + n;
      System.out.print(k + " ");
      m = n;
      n = k;
    }

  }

}
