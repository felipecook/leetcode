package edu.cnm.deepdive;

/*
Given a string, consider the prefix string made of the first
N chars of the string. Does that prefix string appear somewhere
else in the string? Assume that the string is not empty and
that N is in the range 1..str.length().
 */

public class PrefixAgain {

  public boolean prefixAgain(String str, int n) {

    int valueOfN = n + n;
    String prefixOfStr = str.substring(0, n);
    StringBuilder prefixOfStrBuilder = new StringBuilder(str.substring(0, n));

    for (int i = n; i < str.length() - n; i++) {

      String testString = str.substring(i, valueOfN);

      if (testString.equals(prefixOfStr)) {
        return true;
      }

      valueOfN++;

    }

    return false;
  }


}
