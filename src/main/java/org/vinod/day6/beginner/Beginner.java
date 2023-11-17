package org.vinod.day6.beginner;

import java.util.HashMap;

// Intro to dynamic programming
// optimal substruture and overlapping subproblems
// Memoization and Tabulation
public class Beginner {
  public static void main(String[] args) {
    System.out.println(fibMemoization(8, new HashMap<Integer, Integer>()));
    System.out.println(fibTabulation(8));
  }

  private static int fibTabulation(int n) {
    int currentFib = 1, previousFib = 0;
    for (int i = 2; i <= n; i++) {
      int newFib = currentFib + previousFib;
      previousFib = currentFib;
      currentFib = newFib;
    }
    return currentFib;
  }

  private static int fibMemoization(int n, HashMap<Integer, Integer> lookup) {
    if (n <= 1) return n;
    if (!lookup.containsKey(n)) {
      int val = fibMemoization(n - 1, lookup) + fibMemoization(n - 2, lookup);
      lookup.put(n, val);
    }
    return lookup.get(n);
  }
}
