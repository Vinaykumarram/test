package test;


class A {
  A get() {
    return this;
  }
}


class CovarientType extends A {
  CovarientType get() {
    return this;
  }

  void message() {
    System.out.println("welcome to covariant return type");
  }

  public static void main(String args[]) {
    new CovarientType().get().message();
  }
}
