package edu.cnm.deepdive;


/*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
 */


public class MixString {

  public String mixString(String a, String b) {

    if (a.length() < 1) {
      return b;
    }
    if (b.length() < 1) {
      return a;
    }

    boolean flag = true;

    char[] charsA = a.toCharArray();
    char[] charsB = b.toCharArray();

    int lengthA = a.length();
    int lengthB = b.length();

    int counter = 0;

    boolean aIsLongerThanB = false;
    boolean bIsLongerThanA = false;
    boolean bAndAAreEqual = false;

    if (lengthA > lengthB) {
      aIsLongerThanB = true;
    }
    if (lengthB > lengthA) {
      bIsLongerThanA = true;
    }
    if (lengthB == lengthA) {
      bAndAAreEqual = true;
    }


    StringBuilder returnStringBuilder = new StringBuilder();

    while (flag) {
      returnStringBuilder.append(charsA[counter]);
      returnStringBuilder.append(charsB[counter]);

      counter++;

    }
  }


}
