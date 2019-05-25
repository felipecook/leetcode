package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

/*
Given two strings, base and remove, return a version of the base string
where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */

public class String3WithoutString {


  public String withoutString(String base, String remove) {
    
//    return base.replaceAll(remove, "");

    // Create StringBuilder in order to modify the base String
    StringBuilder baseBuilderString = new StringBuilder(base);

    String removeInUpperCase = remove.toUpperCase();
    String removeInLowerCase = remove.toLowerCase();

    if (remove.length() > base.length()) {
      return null;
    }
    // Create a substring of the length of remove from base and iterate up through base with that substring.

    for (int i = 0; i < baseBuilderString.length() - remove.length(); i++) {
      String testString = baseBuilderString.substring(i, i + remove.length());

      // if that substring equals the remove string, remove that substring from the string
      if (testString.equals(removeInLowerCase)) {
        baseBuilderString.delete(i, i + remove.length());
      }

      if (testString.equals(removeInUpperCase)) {
        baseBuilderString.delete(i, i + remove.length());
      }

    }

    return baseBuilderString.toString();

  }

}
