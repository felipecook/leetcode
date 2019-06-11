package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemGStringTest {

  ProblemGString testGString = new ProblemGString();

  String testString = "xxggyygxx";



  @Test
  void gHappy() {
    assertEquals(true, testGString.gHappy(testString));

  }
}