package edu.cnm.deepdive;

public class String2DoubleChar {

  public String doubleChar(String str) {

    String returnString = "";

    for (char c: str.toCharArray()) {
      returnString += c + c;
    }

    return returnString;

  }

}
