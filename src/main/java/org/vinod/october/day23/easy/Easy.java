package org.vinod.october.day23.easy;

import java.util.HashMap;
import java.util.Map;

// Determine whether two strings are anagram or not
public class Easy {
  public static void main(String[] args) {
    String X = "silent"; // Tom Marvolo Riddle
    String Y = "listen"; // I am Lord Voldemort

    if (isAnagram(X, Y)) {
      System.out.print("Anagram");
    } else {
      System.out.print("Not an Anagram");
    }
  }

  private static boolean isAnagram(String x, String y) {
    if (x.length() != y.length()) return false;
    Map<Character, Integer> freqX = new HashMap<>();
    Map<Character, Integer> freqY = new HashMap<>();
    for (char c : x.toCharArray()) {
      freqX.put(c, freqX.getOrDefault(c, 0) + 1);
    }
    for (char c : y.toCharArray()) {
      freqY.put(c, freqY.getOrDefault(c, 0) + 1);
    }
    return freqX.equals(freqY);
  }
}
