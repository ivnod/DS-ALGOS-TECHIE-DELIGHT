package org.vinod.day1.beginner;

// Introduction to Pattern Matching
public class Beginner {
  public static void main(String[] args) {
    String text = "ABCABAABCABAC";
    String pattern = "CAB";
    findPattern(text, pattern);
  }

  private static void findPattern(String text, String pattern) {
    if (pattern == null || pattern.length() == 0) {
      System.out.println("Invalid Input");
      return;
    }
    if (text == null || text.length() < pattern.length()) {
      System.out.println("Invalid Input");
      return;
    }
    int n = text.length();
    int m = pattern.length();
    int i = 0;
    while (i <= n - m) {
      for (int j = 0; j < m; j++) {
        if (text.charAt(i + j) != pattern.charAt(j)) break;
        if (j == m - 1) {
          System.out.println("Match found at " + i);
        }
      }
      i++;
    }
  }
}
