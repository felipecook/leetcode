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
  void factorial() {
    assertEquals(6, leetCodeProblems.factorial(3));

  }

  @Test
  void fib() {
    assertEquals(1, leetCodeProblems.fib(2));
  }

  @Test
  void disemvowel() {
//    assertEquals("Ths wbst s fr lsrs LL!",leetCodeProblems.disemvowel("This website is for losers LOL!")
//    );
    assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", leetCodeProblems.disemvowel(
        "No offense but,\nYour writing is among the worst I've ever read"));
  }
}