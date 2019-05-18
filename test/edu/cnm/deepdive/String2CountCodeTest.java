package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String2CountCodeTest {

  String2CountCode string2CountCode = new String2CountCode();

  String test1 = "ABChicode";
  String test2 = "AAhibbhi";
  String test3 = "codeABCcode";

  @Test
  void countCode() {
    assertEquals(1, string2CountCode.countCode(test1));
    assertEquals(0, string2CountCode.countCode(test2));
    assertEquals(2, string2CountCode.countCode(test3));

  }
}