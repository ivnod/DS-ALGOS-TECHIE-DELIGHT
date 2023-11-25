package org.vinod.november.day58;

// find a pair with given sum in rotated array
public class Medium {
  public static void main(String[] args) {
    int arr[] = { 9, 15, 2, 3, 7 };
    int X = 20;
    int N = arr.length;

    pairInSortedRotated(arr, N, X);
  }

  private static void pairInSortedRotated(int[] arr, int n, int sum) {
    int i;
    for (i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) break;
    }
    int l = i + 1;
    int r = i;
    while (l != r) {
      if (arr[l] + arr[r] == sum) {
        System.out.println(arr[l] + " " + arr[r]);
        return;
      } else if (arr[l] + arr[r] < sum) l = (l + 1) % n;
      else r = (n + r - 1) % n;
    }
  }
}
