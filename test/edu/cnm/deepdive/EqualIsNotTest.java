package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EqualIsNotTest {

  private EqualIsNot equalIsNot = new EqualIsNot();

  String testString1 = "This is notnot";
  String testString2 = "sisnotno7Not";
  String testString3 = "AZBYCX";


  @Test
  void equalIsNot() {

    assertEquals(true, equalIsNot.equalIsNot(testString2));


  }
}