package org.vinod.day6;

import java.util.Arrays;

// In place merge two sorted arrays
public class Medium {

  public static void main(String[] args) {
    int[] X = {1, 4, 7, 8, 10};
    int[] Y = {2, 3, 9};

    merge(X, Y);

    System.out.println("X: " + Arrays.toString(X));
    System.out.println("Y: " + Arrays.toString(Y));
  }

  private static void merge(int[] x, int[] y) {
    int m = x.length;
    int n = y.length;
    for (int i = 0; i < m; i++) {
      if (x[i] > y[0]) {
        int temp = x[i];
        x[i] = y[0];
        y[0] = temp;
      }
      int first = y[0];
      int k;
      for (k = 1; k < n && y[k] < first; k++) {
        y[k - 1] = y[k];
      }
      y[k - 1] = first;
    }
  }
}
