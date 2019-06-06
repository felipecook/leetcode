package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrefixAgainTest {

  PrefixAgain prefixAgain = new PrefixAgain();

  String testString1 = "ABC";
  String testString2 = "ABCZYXAB";
  String testString3 = "AZBYCX";

  @Test
  void prefixAgain() {
    assertEquals(false, prefixAgain.prefixAgain(testString1, 1));
    assertEquals(true, prefixAgain.prefixAgain(testString2, 2));
  }
}