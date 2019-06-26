package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCodeProblemsTest {

  LeetCodeProblems leetCodeProblems = new LeetCodeProblems();

  String testString = "(()()(()))(())";
  String resultString = "()()(())()";



  @Test
  void removeOuterParentheses() {

    assertEquals(resultString, leetCodeProblems.removeOuterParentheses(testString));

  }

  @Test
  void fib() {
    assertEquals(6, leetCodeProblems.fib(3));

  }
}