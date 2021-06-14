package com.string;

import java.util.Date;

public class StringFormat {

  public static void main(String[] args) {
    Date today = new Date();
    System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today, today, today);

    System.out.printf("Today is %tB %te, %tY %n", today, today, today, today);


  }

}
