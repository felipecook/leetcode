package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindingTheMaxSpanTest {

  FindingTheMaxSpan findingTheMaxSpan = new FindingTheMaxSpan();

  private int[] intArray = {3, 4, 5, 6, 3, 4};


  @Test
  void maxSpan() {
    assertEquals(5, findingTheMaxSpan.maxSpan(intArray));
  }
}