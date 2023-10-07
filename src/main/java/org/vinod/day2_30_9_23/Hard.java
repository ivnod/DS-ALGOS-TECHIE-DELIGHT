package org.vinod.day2_30_9_23;

import java.util.Arrays;

// Maximum Sum Circular Subarray
public class Hard {
  public static void main(String[] args) {
    int[] A = {2, 1, -5, 4, -3, 1, -3, 4, -1};

    System.out.println("The sum of the subarray with the largest sum is " + runCircularKadane(A));
  }

  private static int runCircularKadane(int[] arr) {
    Arrays.setAll(arr, i -> -arr[i]);
    int neg_max_sum = kadane(arr);
    Arrays.setAll(arr, i -> -arr[i]);
    return Integer.max(kadane(arr), Arrays.stream(arr).sum() + neg_max_sum);
  }

  private static int kadane(int[] arr) {
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
