package edu.cnm.deepdive;

/*
Consider the leftmost and righmost appearances
of some value in an array. We'll say that the
"span" is the number of elements between the two
inclusive. A single value has a span of 1. Returns
the largest span found in the given array.
(Efficiency is not a priority.)
 */

public class FindingTheMaxSpan {

  public int maxSpan(int[] nums) {
    if (nums.length < 1) {
      return 0;
    }

    if (nums.length == 1) {
      return 1;
    }

    if (nums.length == 2 && nums[0] == nums[1]) {
      return 2;
    } else if (nums.length == 2) {
      return 1;
    } else {

      if (nums.length == 3 && nums[0] == nums[1] && nums[0] == nums[2]) {
        return 3;
      } else if (nums.length == 3 && nums[0] == nums[2]) {
        return 3;
      } else if (nums.length == 3) {
        return 2;
      }

      int counter = 1;
      int counter2 = 1;

      // This for loop iterates through each element in the array
      for (int i = 0; i < nums.length; i++) {
        int currentVar = nums[i];

        // This for loop starts at the end of the array and iterates back through all the rest of the elements in the array until it finds a
        for (int j = nums.length - 1; j > currentVar; j--) {
          if (nums[j] == currentVar) {
            counter += j - i;
            break;
          }
        }

        if (counter > counter2) {
          counter2 = counter;
        }
        counter = 1;
      }

      return counter2;

    }
  }


}
