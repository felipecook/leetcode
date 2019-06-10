package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneTwoTest {

  OneTwo oneTwo = new OneTwo();

  String testString = "abc";

  @Test
  void oneTwo() {
    assertEquals("bca", oneTwo.oneTwo(testString));
  }
}