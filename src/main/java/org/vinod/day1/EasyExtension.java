package org.vinod.day1;

import java.util.HashSet;

// Find all pairs with the given sum in an array
public class EasyExtension {
  public static void main(String[] args) {
    int nums[] = {1, 5, 7, -1, 5};
    int target = 6;
    findPairs(nums, target);
  }

  private static void findPairs(int[] nums, int target) {
    if (nums.length < 2) {
      System.out.println("Invalid input");
      return;
    }
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(target - nums[i])) {
        System.out.println("Pair found :: " + nums[i] + " , " + (target - nums[i]));
      }
      set.add(nums[i]);
    }
  }
}
