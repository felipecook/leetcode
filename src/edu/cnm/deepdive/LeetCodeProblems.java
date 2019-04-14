package edu.cnm.deepdive;

public class LeetCodeProblems {

    public static int[] fizzArray(int n) {

        int[] holderArray = new int[n];

        for (int i = 0; i < n; i++) {
            holderArray[i] += i;

        }

        return holderArray;



    }

    public static void main(String[] args) {
        System.out.println(fizzArray(10).toString());


    }

}






