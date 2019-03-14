package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCodeProblemsTest {



  @Test
  void maxSpan() {

    int[] test = {1, 2, 3, 4, 100};
    int[] test1 = {1, 1, 5, 5, 10, 8, 7};

    assertEquals(3, LeetCodeProblems.maxSpan(test));
    assertEquals(5, LeetCodeProblems.maxSpan(test1));
  }


}