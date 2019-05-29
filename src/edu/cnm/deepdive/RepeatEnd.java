package edu.cnm.deepdive;

/*
Given a string and an int n, return a string made of n repetitions of the last
n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 */

public class RepeatEnd {

  public String repeatEnd(String str, int n) {

    int i = 0;

    StringBuilder subStr = new StringBuilder(str.substring(n));
    
    do {

      subStr.append(str.substring(n));
      i++;
    } while (i < n);

    return subStr.toString();

  }

}
