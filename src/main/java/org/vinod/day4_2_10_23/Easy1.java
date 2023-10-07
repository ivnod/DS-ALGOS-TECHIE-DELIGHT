package org.vinod.day4_2_10_23;

// Implement Binary Search  Java arrays
public class Easy1 {
  public static void main(String[] args) {
    int[] nums = {2, 5, 6, 8, 9, 10};
    int target = 5;

    int index = binarySearchIterative(nums, target);

    if (index != -1) {
      System.out.println("Element found at index " + index);
    } else {
      System.out.println("Element not found in the array");
    }

    int left = 0;
    int right = nums.length - 1;

    int indexRecursive = binarySearchRecursive(nums, left, right, target);

    if (indexRecursive != -1) {
      System.out.println("Element found at index " + indexRecursive);
    } else {
      System.out.println("Element not found in the array");
    }
  }

  private static int binarySearchRecursive(int[] nums, int left, int right, int target) {
    if (left > right) return -1;
    int mid = (left + right) / 2;
    if (nums[mid] == target) return mid;
    else if (target < nums[mid]) return binarySearchRecursive(nums, left, mid - 1, target);
    else return binarySearchRecursive(nums, mid + 1, right, target);
  }

  private static int binarySearchIterative(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
