package com.datApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaEightDate {

  public static void main(String[] args) {

    LocalDate date = LocalDate.now();
    System.out.println("current date: " + date);

    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d/MMM/uuuu HH:mm:ss")));
  }

}
