package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Vinay {

  String company;
  int salary;

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  Vinay(String company, int salary) {
    super();
    this.company = company;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Vinay [company=" + company + ", salary=" + salary + "]";
  }

}


class SalaryComparator implements Comparator<Vinay> {

  public int compare(Vinay obj1, Vinay obj2) {
    if (obj2.salary == obj1.salary)
      return 0;
    else if (obj2.salary > obj1.salary)
      return 1;
    else
      return -1;
  }
}



public class ComparatorInList {
  public static void main(String[] args) {
    List<Vinay> list = new ArrayList<Vinay>();
    list.add(new Vinay("amazon", 999));
    list.add(new Vinay("mni", 544));
    list.add(new Vinay("zomato", 888));

    Collections.sort(list, new SalaryComparator());
    
    list.forEach(v->{
      System.out.println(v);
    });

  }
}


