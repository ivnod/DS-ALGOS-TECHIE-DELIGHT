package org.vinod.day5;

import java.util.HashMap;
import java.util.Map;

// FInd the longest subarray length with same sum in given binary arrays
public class Hard {
  public static void main(String[] args) {
    int[] X = {0, 0, 1, 1, 1, 1};
    int[] Y = {0, 1, 1, 0, 1, 0};

    System.out.println(
        "The length of the longest continuous sequence "
            + "with the same sum is "
            + findMaxSubarrayLength(X, Y));
  }

  private static int findMaxSubarrayLength(int[] x, int[] y) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int result = 0;
    int sum_x = 0;
    int sum_y = 0;
    for (int i = 0; i < x.length; i++) {
      sum_x += x[i];
      sum_y += y[i];
      int difference = sum_x - sum_y;
      if (!map.containsKey(difference)) {
        map.put(difference, i);
      } else {
        result = Integer.max(result, i - map.get(difference));
      }
    }
    return result;
  }
}
