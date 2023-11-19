package org.vinod.october.day28.easy;

// Bit Hacks 1

public class Easy {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      if ((i & 1) != 0) {
        System.out.println(i + " odd");
      } else {
        System.out.println(i + " even");
      }
    }
    int x = 4;
    int y = -8;
    boolean isOpposite = ((x ^ y) < 0);
    if (isOpposite) {
      System.out.println(x + " and " + y + " have opposite signs");
    } else {
      System.out.println(x + " and " + y + " don't have opposite signs");
    }

    x = 4;
    System.out.println(x + " + " + 1 + " is " + - ~x);

    x = -5;
    System.out.println(x + " + " + 1 + " is " + - ~x);

    x = 0;
    System.out.println(x + " + " + 1 + " is " + - ~x);

    x = 3;
    y = 4;
    System.out.println(x + " " + y);
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println(x + " " + y);
  }
}
