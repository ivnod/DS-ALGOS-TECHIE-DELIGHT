package org.vinod.day2.easy;

import java.util.Arrays;

// Bubble Sort
public class Easy {
  public static void main(String[] args) {
    int[] arr = {3, 5, 8, 4, 1, 9, -2};

    bubbleSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
