package edu.cnm.deepdive;

public class Array2Has12 {

  public boolean has12(int[] nums) {
    boolean marker1 = false;
    boolean marker2 = false;
    int val1 = 0;
    int val2 = 0;


    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        marker1 = true;
        val1 = i;
      }
      if (nums[i] == 2) {
        marker2 = true;
        val2 = 1;
      }
    }
    return ((val1 < val2) && (marker1 && marker2));

  }

}
