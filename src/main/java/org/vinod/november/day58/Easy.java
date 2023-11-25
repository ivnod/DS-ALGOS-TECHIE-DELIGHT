package org.vinod.november.day58;

// find no of negative elements in a sorted matrix
public class Easy {
  public static void main(String[] args) {
    //
    int M[][] = {
      {-7, -3, -1, 3, 5},
      {-3, -2, 2, 4, 6},
      {-1, 1, 3, 5, 8},
      {3, 4, 7, 8, 9}
    };

    System.out.println(countNegative(M, 3, 4));
  }

  private static int countNegative(int[][] mat, int m, int n) {
    int i = 0, j = n - 1;
    int count = 0;
    while (i < m && j >= 0) {
      if (mat[i][j] < 0) {
        count = count + j + 1;
        i++;
      } else {
        j--;
      }
    }
    return count;
  }
}
