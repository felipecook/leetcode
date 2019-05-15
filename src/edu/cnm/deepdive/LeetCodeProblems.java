package edu.cnm.deepdive;

public class LeetCodeProblems {

  public boolean either24(int[] nums) {

    boolean switcher = true;
    boolean switcher1 = true;

    for (int i = 1; i < nums.length; i++) {

      if ((nums[i] == 2) && (nums[i - 1] == 2)) {
        switcher = true;
      } else {
        switcher = false;
      }

      if ((nums[i] == 4) && (nums[i - 1]== 4)) {
        switcher1 = true;
      } else {
        switcher1 = false;
      }
    }
    return true;

  }


  public static void main(String[] args) {

  }


}






