package edu.cnm.deepdive;

public class NoTriples {

  public boolean noTriples(int[] nums) {
    int val = 0;

    for (int i = 0; i < (nums.length - 2); i++) {
      val = nums[i];


      return val == nums[i + 1] && val == nums[i + 2];

    }

    return false;


  }


}
