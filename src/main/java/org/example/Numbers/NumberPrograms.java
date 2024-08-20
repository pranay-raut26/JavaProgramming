package org.example.Numbers;

public class NumberPrograms {

  public static void swapNumber(int a, int b) {
    System.out.println("Numbers before swap A = " + a + " B = " + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Numbers after swap A = " + a + " B = " + b);
  }
}
