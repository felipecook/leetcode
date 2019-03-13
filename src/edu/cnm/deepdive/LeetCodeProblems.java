package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeProblems {

  public static int maxSpan(int[] nums) {
    int tempCounter = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        int counter = 0;
        if (nums[i] == nums[j]) {
          counter++;
        }
        if (counter > tempCounter) {
          tempCounter = counter;
        }
      }
    }
  }
}


