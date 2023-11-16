package org.vinod.day24;

import java.util.Arrays;

// Implement Binary Search in Java
public class Beginner {
  public static void main(String[] args) {
    int[] arr = {4, 6, 8, 10, 5};
    int key = 11;
    int index = Arrays.binarySearch(arr, key);
    if (index >= 0) {
      System.out.println("Element found at : " + index);
    } else {
      System.out.println("Element not found");
    }
  }
}
