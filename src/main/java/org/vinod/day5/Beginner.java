package org.vinod.day5;

import java.util.Arrays;

// Ternary Search vs Binary Search
// Ternary is not faster than Bianry because of the comparisons involved
public class Beginner {
  public static void main(String[] args) {
    int[] A = {2, 5, 6, 8, 9, 10};
    int key = 6;

    int index = ternarySearch(A, key);

    if (index != -1) {
      System.out.println("Element found at index " + index);
    } else {
      System.out.println("Element not found in the array");
    }
  }

  private static int ternarySearch(int[] arr, int key) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int leftMid = left + (right - left) / 3;
      int rightMid = right - (right - left) / 3;
      if (arr[leftMid] == key) return leftMid;
      else if (arr[rightMid] == key) return rightMid;
      else if (arr[leftMid] < key) left = leftMid + 1;
      else if (arr[rightMid] > key) right = rightMid - 1;
      else {
        left = rightMid + 1;
        right = leftMid - 1;
      }
    }
    return -1;
  }
}
