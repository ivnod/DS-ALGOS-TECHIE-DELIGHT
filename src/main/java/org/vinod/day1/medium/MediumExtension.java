package org.vinod.day1.medium;

import java.util.HashSet;

// Check if a subarray with given sum exists or not
public class MediumExtension {
  public static void main(String[] args) {
    int[] nums = {1, 4, 20, 3, 10, 5};

    if (hasGivenSumSubarray(nums, 33)) {
      System.out.println("Subarray exists");
    } else {
      System.out.println("Subarray does not exist");
    }
  }

  private static boolean hasGivenSumSubarray(int[] nums, int sum) {
    HashSet<Integer> set = new HashSet<>();
    set.add(sum);
    int curr_sum = 0;
    for (int num : nums) {
      curr_sum = curr_sum + num;
      if (set.contains(curr_sum - sum)) return true;
      set.add(curr_sum);
    }

    return false;
  }
}
