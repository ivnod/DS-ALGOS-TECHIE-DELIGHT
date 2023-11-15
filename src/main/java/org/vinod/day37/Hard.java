package org.vinod.day17;

// Find the maximum absolute difference between the sum of two non-overlapping subarrays
public class Hard {
  public static void main(String[] args) {
    int[] A = {-3, -2, 6, -3, 5, -9, 3, 4, -1, -8, 2};

    System.out.print("The maximum absolute difference is " + findMaxAbsDiff(A));
  }

  private static int findMaxAbsDiff(int[] arr) {
    int n = arr.length;
    // left_max[i] array stores max sum of subarray in arr(0,i)
    // right_max[i] array stores max sum of subarray in arr(i,n-1)
    // left_min[i] array stores min sum of subarray in arr(0,i)
    // right_min[i] array stores min sum of subarray in arr(0,i)
    int[] left_max = new int[n];
    int[] right_max = new int[n];
    int[] left_min = new int[n];
    int[] right_min = new int[n];

    fillArrays(arr, left_max, right_max, left_min, right_min, n);
    int max_abs_diff = Integer.MIN_VALUE;
    for (int i = 0; i < n - 1; i++) {
      int abs =
          Integer.max(
              Math.abs(left_max[i] - right_min[i + 1]), Math.abs(left_min[i] - right_max[i + 1]));
      max_abs_diff = Integer.max(max_abs_diff, abs);
    }
    return max_abs_diff;
  }

  private static void fillArrays(
      int[] arr, int[] left_max, int[] right_max, int[] left_min, int[] right_min, int n) {
    findMaxSumSubarray(arr, left_max, 0, n - 1, 1);
    findMaxSumSubarray(arr, left_max, 0, n - 1, 1);
    for (int i = 0; i < n; i++) {
      arr[i] = -arr[i];
    }

    findMaxSumSubarray(arr, left_min, 0, n - 1, 1);
    findMaxSumSubarray(arr, right_min, n - 1, 0, -1);

    // negate `left_min[]` and `right_min[]` to get the minimum sum of subarrays
    for (int i = 0; i < n; i++) {
      left_min[i] = -left_min[i];
    }

    for (int i = 0; i < n; i++) {
      right_min[i] = -right_min[i];
    }

    // restore the sign of `A[]`
    for (int i = 0; i < n; i++) {
      arr[i] = -arr[i];
    }
  }

  public static void findMaxSumSubarray(int[] A, int[] aux, int i, int j, int diff) {
    int max_so_far = A[i];
    int max_ending_here = A[i];
    aux[i] = A[i];

    for (int k = i + diff; k != j; k += diff) {
      // update the maximum sum of subarray "ending" or "starting" at index `k`
      max_ending_here = Integer.max(A[k], max_ending_here + A[k]);

      // update the result if the current subarray sum is found to be greater
      max_so_far = Integer.max(max_so_far, max_ending_here);
      aux[k] = max_so_far;
    }
  }
}
