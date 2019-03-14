package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeProblems {

  public static int maxSpan(int[] nums) {

    Arrays.sort(nums);

    int [] removedFirstAndLastNums =
        Arrays.copyOfRange(nums, 1, nums.length - 1);
    int total = 0;
    for (int i = 0; i < removedFirstAndLastNums.length - 1; i++) {
      total += removedFirstAndLastNums[i];

    }
    int average = 0;

    average = total / removedFirstAndLastNums.length;

    return average;



  }
}


