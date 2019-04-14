package edu.cnm.deepdive;

public class LeetCodeProblems {

    public boolean only14(int[] nums) {

        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;



    }

}






