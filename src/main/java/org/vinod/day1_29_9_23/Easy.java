package org.vinod.day1_29_9_23;

import java.util.HashSet;

// Find a pair with the given sum in an array
public class Easy {
  public static void main(String[] args) {
    int nums[] = {5, 2, 6, 8, 1, 9};
    int target = 12;
    findPairs(nums, target);
  }

  private static void findPairs(int[] nums, int target) {
    if (nums.length < 2) {
      System.out.println("Invalid input");
      return;
    }
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (set.contains(target - nums[i])) {
        System.out.println("Pair found :: " + nums[i] + " , " + (target - nums[i]));
        return;
      } else {
        set.add(nums[i]);
      }
    }
    System.out.println("No Pair found");
  }
}
