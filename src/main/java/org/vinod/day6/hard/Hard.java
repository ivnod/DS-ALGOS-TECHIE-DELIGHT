package org.vinod.day6.hard;

import java.util.Arrays;

// Rearrange such that A[A[i]] is set to i for every element
public class Hard {
  public static void main(String[] args) {
    int[] A = {1, 3, 4, 2, 0};

    rearrange(A);

    System.out.println(Arrays.toString(A));
  }

  private static void rearrange(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      arr[arr[i] % n] = arr[arr[i] % n] + (i * n);
    }
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] / n;
    }
  }
}
