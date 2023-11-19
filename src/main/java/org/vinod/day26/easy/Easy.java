package org.vinod.day26.easy;

// Clock Angle problem

public class Easy {
  public static void main(String[] args) {
    int hh = 5;
    int mm = 30;

    System.out.println(findAngle(hh, mm));
  }

  private static int findAngle(int hh, int mm) {
    int hAngle = (hh * 360) / 12 + (mm * 360) / (12 * 60);
    int mAngle = (mm * 360) / 60;
    int angle = Math.abs(hAngle - mAngle);
    return Math.min(angle, 360 - angle);
  }
}
