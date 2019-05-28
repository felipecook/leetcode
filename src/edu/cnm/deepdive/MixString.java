package edu.cnm.deepdive;


/*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
 */


public class MixString {

  public String mixString(String a, String b) {

    // Create Counters
    int i = 0, j = 0;

    // Create return stringBuilder
    StringBuilder stringBuilder = new StringBuilder();

    // Use while loop to iterate up through strings taking the first characters from each and appending it to StringBuilder
    while (i < a.length() && j < b.length()) {
      stringBuilder.append(a.charAt(i));
      stringBuilder.append(b.charAt(i));
      i++;
      j++;

    }


    // if i is less than the length of a, the rest of the string of a starting from the index of i needs to be added to the substring.
    if (i < a.length()) {
      stringBuilder.append(a.substring(i));
    }

    // if j is less than the length of b, the rest of the string of b starting from the index of i needs to be added to the substring.
    if (j < b.length()) {
      stringBuilder.append(b.substring(j));
    }

    return stringBuilder.toString();



  }


}
