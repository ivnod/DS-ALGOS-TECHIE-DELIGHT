package org.vinod.september.day1.medium;

import java.util.HashSet;

// Check if a subarray with 0 sum exists or not
public class Medium {
  public static void main(String[] args) {
    int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

    if (hasZeroSumSubarray(nums)) {
      System.out.println("Subarray exists");
    } else {
      System.out.println("Subarray does not exist");
    }
  }

  private static boolean hasZeroSumSubarray(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    int sum = 0;
    for (int num : nums) {
      sum = sum + num;
      if (set.contains(sum)) return true;
      set.add(sum);
    }

    return false;
  }
}
