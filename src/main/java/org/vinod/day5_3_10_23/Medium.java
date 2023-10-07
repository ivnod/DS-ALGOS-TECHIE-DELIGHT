package org.vinod.day5_3_10_23;

import java.util.Arrays;

// Sort an array of 0,1,2 (Dutch National Flag Problem)
public class Medium {
  private static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

  public static void main(String[] args) {
    int[] A = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};

    threeWayPartition(A);
    System.out.println(Arrays.toString(A));
  }

  private static void threeWayPartition(int[] arr) {
    int start = 0, mid = 0, end = arr.length - 1;
    int pivot = 1;
    while (mid <= end) {
      if (arr[mid] < pivot) {
        swap(arr, start, mid);
        start++;
        mid++;
      } else if (arr[mid] > pivot) {
        swap(arr, mid, end);
        end--;
      } else {
        mid++;
      }
    }
  }
}
