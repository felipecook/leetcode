package edu.cnm.deepdive;

public class String2DoubleChar {

  public String doubleChar(String str) {

    String returnString = "";

    for (int i = 0; i < str.length(); i++) {
      returnString += str.charAt(i) + str.charAt(i);
    }
    return returnString;

  }

}
