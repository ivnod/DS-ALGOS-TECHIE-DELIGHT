public class Problem50 {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
    int diff = minDiff(arr, 2, 5);
    if (diff != Integer.MAX_VALUE) System.out.println("min diff is " + diff);
    else System.out.println("min diff is not present");
  }

  private static int minDiff(int[] arr, int x, int y) {
    int diff = Integer.MAX_VALUE;
    int n = arr.length;
    int x_index = n;
    int y_index = n;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        x_index = i;
        if (y_index != Integer.MAX_VALUE) {
          diff = Integer.min(diff, Math.abs(x_index - y_index));
        }
      }
      if (arr[i] == y) {
        y_index = i;
        if (x_index != Integer.MAX_VALUE) {
          diff = Integer.min(diff, Math.abs(x_index - y_index));
        }
      }
    }
    return diff;
  }
}
