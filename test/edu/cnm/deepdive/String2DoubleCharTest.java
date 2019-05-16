package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String2DoubleCharTest {

  String2DoubleChar string2DoubleChar = new String2DoubleChar();

  String test1 = "ABC";
  String test2 = "AAbb";

  @Test
  void doubleChar() {
    assertEquals("AABBCC", string2DoubleChar.doubleChar(test1));
    assertEquals("AAAAbbbb", string2DoubleChar.doubleChar(test2));

  }
}