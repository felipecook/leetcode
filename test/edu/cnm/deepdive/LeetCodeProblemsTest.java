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

  @Test
  void stockSummary() {
    String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    String[] cd = new String[] {"A", "B"};
    assertEquals("(A : 200) - (B : 1140)",
        leetCodeProblems.stockSummary(art, cd));
  }

  @Test
  void longest() {
    assertEquals("aehrsty", leetCodeProblems.longest("aretheyhere", "yestheyarehere"));
    assertEquals("abcdefghilnoprstu", leetCodeProblems.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    assertEquals("acefghilmnoprstuy", leetCodeProblems.longest("inmanylanguages", "theresapairoffunctions"));
  }

  @Test
  void evaluate() {
    assertEquals(3, leetCodeProblems.evaluate("1 3 *"));
  }

  @Test
  void notReplace() {
    assertEquals("This is not isabell", leetCodeProblems.notReplace("This is isabell"));
  }

  @Test
  void pairStar() {
    assertEquals("ge*ek", leetCodeProblems.pairStar("geek", 0));
  }

  int[] inputArray = {0, 3, 2, 3};
  int[] returnArray = {1,3};

  @Test
  void twoSum() {
    assertEquals(returnArray, leetCodeProblems.twoSum(inputArray, 6));
  }

  @Test
  void bunnyEars() {
    assertEquals(6, leetCodeProblems.bunnyEars(3));
  }
}