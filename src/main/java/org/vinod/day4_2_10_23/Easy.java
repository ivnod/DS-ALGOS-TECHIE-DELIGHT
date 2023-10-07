package org.vinod.day4_2_10_23;

// Reverse a string using recursion
public class Easy {
  public static void main(String[] args) {
    String str = "Techie Delight";

    char[] c = str.toCharArray();
    reverse(c, 0, c.length - 1);
    str = new String(c);

    System.out.print("Reverse of the given string is " + str);
  }

  private static void reverse(char[] c, int l, int h) {
    if (l < h) {
      swap(c, l, h);
      reverse(c, l + 1, h - 1);
    }
  }

  private static void swap(char[] c, int i, int j) {
    char temp = c[i];
    c[i] = c[j];
    c[j] = temp;
  }
}
