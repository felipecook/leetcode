package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCodeProblemsTest {



  @Test
  void getMiddleEvenTests() {
    assertEquals("es", LeetCodeProblems.getMiddle("test"));
    assertEquals("dd", LeetCodeProblems.getMiddle("middle"));
  }

  @Test
  void getMiddleOddTests() {
    assertEquals("t", LeetCodeProblems.getMiddle("testing"));
    assertEquals("A", LeetCodeProblems.getMiddle("A"));
  }
}