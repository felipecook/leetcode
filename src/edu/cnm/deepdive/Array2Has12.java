package edu.cnm.deepdive;

public class Array2Has12 {

  public boolean has12(int[] nums) {
    boolean marker1 = false;
    boolean marker2 = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        marker1 = true;
      }
      if (nums[i] == 2) {
        marker2 = true;
      }
    }
    return marker1 && marker2;
  }

}
