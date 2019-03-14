package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCodeProblemsTest {



  @Test
  void maxSpan() {

    int[] test = {1, 2, 2, 6, 99, 99, 7};
    int[] test1 = {1, 1, 6, 7, 2};

    assertEquals(5, LeetCodeProblems.sum67(test));
    assertEquals(4, LeetCodeProblems.sum67(test1));
  }


}