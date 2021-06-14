package test;

public class MutableVSFinal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 final StringBuffer bf = new StringBuffer("Vinay");
 bf.append("kumar");
 System.out.println(bf);
// bf= bf.append("ram");   // gives error
 
 
 String str = "ram";
 str.concat("ram new");
 System.out.println(str);
    
  }

}
