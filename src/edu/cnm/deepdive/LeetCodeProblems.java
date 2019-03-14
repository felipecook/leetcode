package edu.cnm.deepdive;

public class LeetCodeProblems {

  public static int sum67(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int total = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        while (nums[i] != 7) {
          i++;
        }
        continue;
      }
      total += nums[i];
    }
    return total;
  }
}


