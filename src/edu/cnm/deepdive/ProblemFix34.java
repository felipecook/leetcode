package edu.cnm.deepdive;

/*
Return an array that contains exactly the same numbers as the
given array, but rearranged so that every 3 is immediately
followed by a 4. Do not move the 3's, but every other number
may move. The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3, and a 3 appears
in the array before any 4.
*/

public class ProblemFix34 {

  public int[] fix34(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      int holderVarA = 0;
      int holderVarB = 0;
      if (nums[i] == 3) {
        holderVarA = nums[i + 1];
        holderVarB = nums[i + 2];
      }

    }

    return nums;

  }

}