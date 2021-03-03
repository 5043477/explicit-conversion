class Main {
  public static void main(String[] args) {
    double d = 100.4;

    // explicit type casting
    long l = (long)d;

    // explicit type casting
    int i = (int)l;
    System.out.println("Double value " + d);
  
  // fractional part lost
  System.out.println("long value " + l);
  
  // fractional part lost
  System.out.println("Int or integer value " + i);

  
  }
}