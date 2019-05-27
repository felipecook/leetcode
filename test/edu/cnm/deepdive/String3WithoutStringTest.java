package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String3WithoutStringTest {

  String3WithoutString string3WithoutString = new String3WithoutString();

  String testString1 = "This is a FISH";
  String testString2 = "xyzzy";
  String testString3 = "abxxxxab";
  String testString4 = "AA22bb";


  String removeString1 = "IS";
  String removeString2 = "Y";
  String removeString3 = "xx";
  String removeString4 = "2";

  String resultString1 = "Th  a FH";
  String resultString2 = "xzz";
  String resultString3 = "abab";
  String resultString4 = "AAbb";


  @Test
  void withoutString() {
    assertEquals(resultString4, string3WithoutString.withoutString(testString4, removeString4));
  }

}