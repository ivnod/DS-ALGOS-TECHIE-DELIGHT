package org.vinod.september.day1.hard;
// Find the index of 0 to be replaced to get the maximum length sequence of continuous ones in
// binary array
public class Hard {
  public static void main(String[] args) {
    int[] A = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};

    int index = findIndexofZero(A);

    if (index != -1) {
      System.out.print("Index to be replaced is " + index);
    } else {
      System.out.print("Invalid input");
    }
  }

  private static int findIndexofZero(int[] A) {
    int count = 0;
    int max_count = 0;
    int max_index = -1;
    int prev_zero_index = -1;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 1) {
        count++;
      } else {
        count = i - prev_zero_index;
        prev_zero_index = i;
        if (count > max_count) {
          max_count = count;
          max_index = prev_zero_index;
        }
      }
    }

    return max_index;
  }
}
