package edu.cnm.deepdive;

public class NoTriples {

  public boolean noTriples(int[] nums) {

    for (int i = 0; i < (nums.length - 2); i++) {
      int val = nums[i];


      if ((val == nums[i + 1]) && (val == nums[i + 2])) {
        return false;
      }

    }

    return true;


  }


}
