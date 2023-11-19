package org.vinod.october.day8.medium;

import java.util.Arrays;
import java.util.Random;

// Shuffle an array using Fisher Yates algorithm
public class Medium {

  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6};

    shuffle(A);

    // print the shuffled array
    System.out.println(Arrays.toString(A));
  }

  private static void shuffle(int[] arr) {
    for (int i = 0; i <= arr.length - 2; i++) {
      Random random = new Random();
      int j = i + random.nextInt(arr.length - i);
      swap(arr, i, j);
    }
  }

  private static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}
