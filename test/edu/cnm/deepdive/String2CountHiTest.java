package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String2CountHiTest {

  String2CountHi string2CountHi = new String2CountHi();

  String test1 = "ABChi";
  String test2 = "AAhibbhi";
  String test3 = "ABC";


  @Test
  void countHi() {
    assertEquals(1, string2CountHi.countHi(test1));
    assertEquals(2, string2CountHi.countHi(test2));
    assertEquals(0, string2CountHi.countHi(test3));


  }
}