package edu.cnm.deepdive;


/*
Returns true if for every '*' (star) in the string, if
there are chars both immediately before and after the star,
they are the same.
 */
public class SameStarChar {

  public boolean sameStarChar(String str) {

    if (str.length() <= 1) {
      return true;
    } else if (str.length() == 2) {
      return true;
    }

    boolean flag = true;
    int counter = 0;


    char[] chars = str.toCharArray();

    if (chars[str.length() - 1] == '*') {
      return false;
    }


    for (int i = 0; i < str.length() - 2; i++) {
      char middleChar = chars[i + 1];

      if (middleChar == '*' && i < str.length() - 1) {
        if (chars[i] != chars[i + 2]) {
          flag = false;
        }
        counter++;

      }

    }

    return flag;


  }


}
