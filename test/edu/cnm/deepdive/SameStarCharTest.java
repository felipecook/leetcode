package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SameStarCharTest {

  SameStarChar sameStarChar = new SameStarChar();

  String string1 = "";

  @Test
  void sameStarChar() {

    assertFalse(sameStarChar.sameStarChar(string1));


  }
}