import java.util.HashMap;
import java.util.Map;

public class Problem49 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1, 2, 1 };
    printArray(arr);
    System.out.println();
    arr = new int[] { 5, 4, 5, 5, 3, 1, 2, 2, 4 };
    printArray(arr);
  }

  private static void printArray(int[] arr) {
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int i : arr) {
      frequency.put(i, frequency.getOrDefault(i, 0) + 1);
    }
    for (int i : arr) {
      if (frequency.containsKey(i)) {
        int count = frequency.get(i);
        while (count != 0) {
          System.out.print(i + " ");
          count--;
        }

        frequency.remove(i);
      }
    }
  }
}
