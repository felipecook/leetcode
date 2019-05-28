package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MixStringTest {


  MixString mixString = new MixString();

  String testString1 = "ABC";
  String testString2 = "ZYX";
  String correctTest3 = "AZBYCX";

  @Test
  void mixString() {
    assertEquals(correctTest3, mixString.mixString(testString1, testString2));
  }
}