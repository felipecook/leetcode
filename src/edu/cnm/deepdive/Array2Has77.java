package edu.cnm.deepdive;

public class Array2Has77 {

  public boolean has77(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      int val = nums[i];
      if ((val == 7) && (val == nums[i + 1] || (val == nums[i + 2]))) {
        return true;
      }
      if (nums[i + 1] == 7 && nums[i + 2] == 7) {
        return true;
      }
    }
    return false;

  }


}
