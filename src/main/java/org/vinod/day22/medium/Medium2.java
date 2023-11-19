package org.vinod.day22.medium;

import java.util.Arrays;

// Print continuous subarray with maximum sum
public class Medium2 {
  public static void main(String[] args) {
    int[] arr = {8, -7, -3, 5, 6, -2, 3, -4, 2};

    System.out.println(
        "The maximum sum of a contiguous subarray is " + Arrays.toString(kadaneNeg(arr)));
  }

  private static int[] kadaneNeg(int[] arr) {
    int max_so_far = Integer.MIN_VALUE;
    int max_ending_here = 0;
    int start = 0, end = 0;
    int beg = 0;
    for (int i = 0; i < arr.length; i++) {
      max_ending_here = max_ending_here + arr[i];
      if (max_ending_here < arr[i]) {
        max_ending_here = arr[i];
        beg = i;
      }
      if (max_so_far < max_ending_here) {
        max_so_far = max_ending_here;
        start = beg;
        end = i;
      }
    }
    return Arrays.copyOfRange(arr, start, end + 1);
  }
}
