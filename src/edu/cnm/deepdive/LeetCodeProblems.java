package edu.cnm.deepdive;

public class LeetCodeProblems {

    public static boolean isPalindrome (int number) {
      int reverse = 0;
      int numberToBeReversed = number;

      while (numberToBeReversed != 0) {
        int lastDigit = number % 10;
        reverse = (reverse * 10) + lastDigit;
        numberToBeReversed /= 10;
      }


      if (number == reverse) {
        return true;
      } else  {
        return false;
      }
    }

  public static void main(String[] args) {
    isPalindrome(-222);

  }

}




