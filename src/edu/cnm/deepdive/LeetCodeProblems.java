package edu.cnm.deepdive;

public class LeetCodeProblems {

  public static boolean no14(int[] nums) {


    for (int num : nums) {
      if (num == 1) {
        for (int num1 : nums) {
          if (num1 != 4) {
            return true;
          } else {
            return false;
          }
        }
      }
    }

    for (int num : nums) {
      if (num == 4) {
        for (int num1 : nums) {
          if (num1 != 1) {
            return true;
          } else {
            return false;
          }
        }
      }
    }

    return true;


  }

  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4};
    no14(nums);
  }


}






