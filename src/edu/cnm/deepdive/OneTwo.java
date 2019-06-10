package edu.cnm.deepdive;

/*
Given a string, compute a new string by moving the first char
to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef"
yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 */

import java.util.LinkedList;

public class OneTwo {

  public String oneTwo(String str) {
    int counter = 1;


    if (str.length() < 1) {
      return str;
    }

    StringBuilder stringBuilder = new StringBuilder(str);
    int modCounter = 0;

    if (str.length() % 3 != 0) {
      modCounter = str.length() % 3;
      stringBuilder.delete(str.length() - modCounter, str.length());
    }


    String appendedString = stringBuilder.toString();


    char[] chars = appendedString.toCharArray();

//    LinkedList<Character> charsLinkedList = new LinkedList<>();
//
//    for (char c: chars
//    ) {
//      charsLinkedList.add(c);
//    }





    for (int i = 0; i < str.length(); i++){
      char varHolder = ' ';
      char varHolder1 = ' ';
      if (counter == 3) {
        varHolder = chars[i - 2];
        varHolder1 = chars[i - 1];
        chars[i - 1] = chars[i];
        chars[i] = varHolder;
        chars[i - 2] = varHolder1;
        counter = 1;
      } else {
        counter++;
      }
    }


    return String.valueOf(chars);

  }


}
