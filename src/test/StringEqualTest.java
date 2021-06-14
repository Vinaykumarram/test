package test;

public class StringEqualTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String s1 = "String 1";
    String s2 = "String 1";

    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);

    System.out.println("**************************************************************");

    String s3 = new String("String 3");
    String s4 = new String("String 3");
    String s5 = new String("String 1");

    System.out.println(s3.equals(s4));
    System.out.println(s1 == s4);
    
    
    System.out.println("****************************************************************");
    System.out.println(s1.equals(s5));
    System.out.println(s1==s5);

    // StringBuffer sb1 = new StringBuffer("StringBuffer1");
    // StringBuffer sb2 = new StringBuffer("StringBuffer1");
    //
    // System.out.println(s3 == s4);
    //
    // Boolean result = s3.equalsIgnoreCase(s4);
    // System.out.println(result);
    //
    //
    //
    // System.out.println(sb1 == sb2);
    // System.out.println(sb1.equals(sb2));

  }

}
