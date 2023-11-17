package org.vinod.day3.hard;
// Maximum Product Subarray Problem
public class Hard {
  public static void main(String[] args) {
    int[] A = { 40, 0, -20, -10 };

    System.out.print("The maximum product of a subarray is " + findMaxProduct(A));
  }

  private static int findMaxProduct(int[] A) {
    int max_ending = A[0];
    int min_ending = A[0];
    int max_so_far = A[0];
    for (int i = 1; i < A.length; i++) {
      int temp = max_ending;
      max_ending = Integer.max(A[i], Integer.max(A[i] * max_ending, A[i] * min_ending));
      min_ending = Integer.min(A[i], Integer.min(A[i] * temp, A[i] * min_ending));
      max_so_far = Integer.max(max_so_far, max_ending);
    }

    return max_so_far;
  }
}
