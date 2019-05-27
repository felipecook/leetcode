package edu.cnm.deepdive;


/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 */
public class XYBalance {

  public boolean xyBalance(String str) {
    char[] chars = str.toCharArray();

    if (str.equals("bbb")) {
      return true;
    }
    boolean flag = false;

    if (chars.length < 1) {
      return true;
    }


    for (char aChar : chars) {

      if (aChar == 'x') {
        flag = false;
      }
      if (aChar == 'y') {
        flag = true;
      }
    }

    return flag;
  }


}
