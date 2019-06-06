package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EqualIsNotTest {

  EqualIsNot equalIsNot = new EqualIsNot();

  String testString1 = "noisxxnotyynotxsi";
  String testString2 = "ABCZYXAB";
  String testString3 = "AZBYCX";


  @Test
  void equalIsNot() {

    assertEquals(false, equalIsNot.equalIsNot(testString1));


  }
}