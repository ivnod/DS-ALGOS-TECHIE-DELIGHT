package org.vinod.day2;

import java.util.ArrayList;
import java.util.List;

// Generate the power set of a given set
public class Medium3 {
  public static void main(String[] args) {
    int[] S = {1, 2, 3};
    findPowerSet(S);
  }

  private static void findPowerSet(int[] str) {
    int N = (int) Math.pow(2, str.length);
    for (int i = 0; i < N; i++) {
      List<Integer> set = new ArrayList<>();
      for (int j = 0; j < str.length; j++) {
        if ((i & (1 << j)) != 0) {
          set.add(str[j]);
        }
      }
      System.out.println(set);
    }
  }
}
