package edu.cnm.deepdive;


/*
Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the
left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.
 */

public class XYZMiddle {

  public boolean xyzMiddle(String str) {
    int counterFront = 0;
    int counterBack = 0;

    if (str.length() < 3) {
      return false;
    }
    if (str.length() == 4 || str.length() == 5 || str.length() == 6) {
      return true;
    }

    return (str.charAt(str.length() / 2) == 'y'
        && str.charAt((str.length() / 2) + 1) == 'z'
        && str.charAt((str.length() / 2) - 1) == 'x');

  }

}
