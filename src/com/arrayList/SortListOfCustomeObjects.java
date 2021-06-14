package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student {
  private String studentname;
  public int rollno;
  private int studentage;

  public Student(int rollno, String studentname, int studentage) {
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

}


class RatingComparator implements Comparator<Student> {
  public int compare(Student obj1, Student obj2) {
    // return (obj1.rollno<obj2.rollno) ? -1 : (obj1.rollno>obj2.rollno) ? 1 : 0; // for descending
    // order
    return (obj1.rollno < obj2.rollno) ? 1 : (obj1.rollno > obj2.rollno) ? -1 : 0; // for ascending
                                                                                   // order

  }
}



public class SortListOfCustomeObjects {

  public static void main(String[] args) {
    ArrayList<Student> arraylist = new ArrayList<Student>();
    arraylist.add(new Student(245, "Chaitanya", 26));
    arraylist.add(new Student(209, "Rahul", 24));
    arraylist.add(new Student(300, "Ajeet", 32));

    Collections.sort(arraylist, Collections.reverseOrder(new RatingComparator()));
    for (Student student : arraylist) {
      System.out.println(student);
    }

  }

}
