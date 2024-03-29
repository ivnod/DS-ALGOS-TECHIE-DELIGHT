package org.vinod.october.day24.hard;
// Trapping rain water problem. Find the maximum amount of water that can be trapped within a given
// set of bars where each bar’s width is 1 unit.
public class Hard {
  public static void main(String[] args) {
    int[] heights = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};

    System.out.print("The maximum amount of water that can be trapped is " + trap(heights));
  }

  public static int trap(int[] heights)
  {
    // maintain two pointers left and right, pointing to the leftmost and
    // rightmost index of the input array
    int left = 0, right = heights.length - 1, water = 0;

    int maxLeft = heights[left];
    int maxRight = heights[right];

    while (left < right)
    {
      if (heights[left] <= heights[right])
      {
        left++;
        maxLeft = Integer.max(maxLeft, heights[left]);
        water += (maxLeft - heights[left]);
      }
      else {
        right--;
        maxRight = Integer.max(maxRight, heights[right]);
        water += (maxRight - heights[right]);
      }
    }

    return water;
  }
}
