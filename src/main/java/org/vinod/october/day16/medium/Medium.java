package org.vinod.october.day16.medium;

import java.util.Arrays;

// Merge two arrays by satisfying given constraints
public class Medium {

  public static void main(String[] args) {
    // vacant cells in `X[]` is represented by 0
    int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
    int[] Y = {1, 8, 9, 10, 15};

    /* Validate input before calling `rearrange()`
    1. Both arrays `X[]` and `Y[]` should be sorted (ignore 0's in `X[]`)
    2. Size of array `X[]` >= size of array `Y[]` (i.e., `m >= n`)
    3. Total number of vacant cells in array `X[]` = size of array `Y[]` */

    // merge `Y[]` into `X[]`
    rearrange(X, Y);

    // print merged array
    System.out.println(Arrays.toString(X));
  }

  private static void rearrange(int[] x, int[] y) {
    if (x.length == 0) return;
    int k = 0;
    for (int value : x) {
      if (value != 0) {
        x[k] = value;
        k++;
      }
    }
    merge(x, y, k - 1, y.length - 1);
  }

  private static void merge(int[] x, int[] y, int m, int n) {
    int k = m + n + 1;
    while (m >= 0 && n >= 0) {
      if (x[m] > y[n]) {
        x[k] = x[m];
        k--;
        m--;
      } else {
        x[k] = y[n];
        k--;
        n--;
      }
    }
    while (n >= 0) {
      x[k] = y[n];
      k--;
      n--;
    }
    Arrays.fill(y, 0);
  }
}
