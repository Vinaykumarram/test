package com.arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Employee {
  String name;
  int age;

  Employee(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", age=" + age + "]";
  }
}


class City {

  String cname;
  int pincode;

  City(String cname, int pincode) {
    super();
    this.cname = cname;
    this.pincode = pincode;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }

  @Override
  public String toString() {
    return "City [cname=" + cname + ", pincode=" + pincode + "]";
  }


}


public class ListToMap {

  public static void main(String[] args) {

    // List<String> names = Arrays.asList("apple,orange,pear".split(","));
    // List<String> things = Arrays.asList("123,456,789".split(","));
    //
    // Map<String, String> map = new LinkedHashMap<String, String>();
    //
    // for (int i = 0; i < names.size(); i++) {
    // map.put(names.get(i), things.get(i));
    // }
    //
    // System.out.println(map);

    List<Employee> elist = new ArrayList<Employee>();
    List<City> clist = new ArrayList<City>();

    elist.add(new Employee("vinay", 20));
    elist.add(new Employee("raj", 25));

    clist.add(new City("pune", 41103));
    clist.add(new City("mumbai", 411047));

    Map<Employee, City> map = new HashMap<Employee, City>();
    for (int i = 0; i < elist.size(); i++) {
      map.put(elist.get(i), clist.get(i));
    }

    System.out.println(map);


  }

}
