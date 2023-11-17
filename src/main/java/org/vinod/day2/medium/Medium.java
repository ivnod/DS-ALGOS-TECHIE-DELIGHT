package org.vinod.day2.medium;

import java.util.*;

// Print all subarrays with 0 sum
public class Medium {
  public static void main(String[] args) {
    int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

    printAllSubarrays(nums);
  }

  private static void printAllSubarrays(int[] nums) {
    Map<Integer, List<Integer>> hashMap = new HashMap<>();
    insert(hashMap, 0, -1);
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (hashMap.containsKey(sum)) {
        List<Integer> list = hashMap.get(sum);
        for (Integer value : list) {
          System.out.println("Subarray " + (value + 1) + "...." + i);
        }
      }
      insert(hashMap, sum, i);
    }
  }

  private static void insert(Map<Integer, List<Integer>> hashMap, int key, int value) {
    hashMap.putIfAbsent(key, new ArrayList<>());
    hashMap.get(key).add(value);
  }
}
