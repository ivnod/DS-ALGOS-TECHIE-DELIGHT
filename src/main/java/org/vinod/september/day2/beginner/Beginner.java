package org.vinod.september.day2.beginner;

import java.util.Arrays;
import java.util.List;

// Difference between Subarray, Substring,  Subsequence, and Subset(any valid set)
public class Beginner {
  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
    printAllSubArrays(input);
    String str = "techie";
    printAllSubstrings(str);
    String subsequence = "apple";
    findPowerSet(subsequence);
  }

  private static void findPowerSet(String str) {
    int N = (int) Math.pow(2, str.length());
    for (int i = 0; i < N; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < str.length(); j++) {
        if ((i & (1 << j)) != 0) {
          sb.append(str.charAt(j));
        }
      }
      System.out.println(sb);
    }
  }

  private static void printAllSubstrings(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        System.out.println(" " + str.substring(i, j + 1) + " ");
      }
    }
  }

  private static void printAllSubArrays(List<Integer> input) {
    for (int i = 0; i < input.size(); i++) {
      for (int j = i; j < input.size(); j++) {
        System.out.println(input.subList(i, j + 1));
      }
    }
  }
}
