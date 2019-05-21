package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String3CountYZTest {

  String3CountYZ string3CountYZ = new String3CountYZ();

  String test1 = "ABCyy hicod z e";
  String test2 = "a AAhy ibb hiz";
  String test3 = "co deABz Cco de y";

  @Test
  void countYZ() {
    assertEquals(1, string3CountYZ.countYZ(test1));
    assertEquals(2, string3CountYZ.countYZ(test2));
    assertEquals(1, string3CountYZ.countYZ(test3));
  }
}