package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

class Country implements Comparable<Country> {
  private String studentname;
  public int rollno;
  private int studentage;

  public Country(int rollno, String studentname, int studentage) {
    this.rollno = rollno;
    this.studentname = studentname;
    this.studentage = studentage;
  }

  public String getStudentname() {
    return studentname;
  }

  public void setStudentname(String studentname) {
    this.studentname = studentname;
  }

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public int getStudentage() {
    return studentage;
  }

  public void setStudentage(int studentage) {
    this.studentage = studentage;
  }

  @Override
  public String toString() {
    return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage="
        + studentage + "]";
  }

  @Override
  public int compareTo(Country o) {

    if (rollno == o.rollno)
      return 0;
    else if (rollno > o.rollno)
      return 1;
    else
      return -1;

  }

}


public class ComparableInList {
  public static void main(String[] args) {
    ArrayList<Country> arraylist = new ArrayList<Country>();
    arraylist.add(new Country(245, "Chaitanya", 26));
    arraylist.add(new Country(209, "Rahul", 24));
    arraylist.add(new Country(300, "Ajeet", 32));

    Collections.sort(arraylist);
    arraylist.forEach(value -> {
      System.out.println(value);
    });
  }
}
