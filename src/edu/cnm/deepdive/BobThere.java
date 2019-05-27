package edu.cnm.deepdive;

/*
Return true if the given string contains a "bob" string,
but where the middle 'o' char can be any char.
 */

public class BobThere {

  public boolean bobThere(String str) {

    if (str.length() < 3) {
      return false;
    }

    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length - 2; i++) {
      if (chars[i] == 'b' && chars[i + 2] == 'b') {
        return true;
      }
    }

    return false;

  }


}
