package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String3WithoutStringTest {

  String3WithoutString string3WithoutString = new String3WithoutString();

  String testString1 = "This is a FISH";
  String testString2 = "xyzzy";
  String testString3 = "co deABz Cco de y";

  String removeString1 = "IS";
  String removeString2 = "Y";

  String resultString1 = "Th a FH";
  String resultString2 = "xzz";


  @Test
  void withoutString() {
    assertEquals(resultString1, string3WithoutString.withoutString(testString1, removeString1));
    assertEquals(resultString2, string3WithoutString.withoutString(testString2, removeString2));

  }
}