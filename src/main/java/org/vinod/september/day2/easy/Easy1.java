package org.vinod.september.day2.easy;
// Maximum Sum Subarray Problem
public class Easy1 {
  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    System.out.println("The maximum sum of a contiguous subarray is " + kadaneNeg(arr));
  }

  private static int kadaneNeg(int[] arr) {
    int max_so_far = Integer.MIN_VALUE;
    int max_ending_here = 0;
    for (int i = 0; i < arr.length; i++) {
      max_ending_here = max_ending_here + arr[i];
      max_ending_here = Integer.max(max_ending_here, arr[i]);
      max_so_far = Integer.max(max_so_far, max_ending_here);
    }
    return max_so_far;
  }
}
