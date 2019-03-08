package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeProblems {

  public static void main(String[] args) {
    LeetCodeProblems a = new LeetCodeProblems();
    System.out.println(a.numJewelsInStones("ha", "hahaomg"));
  }

  public int numJewelsInStones(String J, String S) {
    List holderList = new ArrayList<>();
    char[] stringJInArrayForm = J.toCharArray();
    for (int i = 0; i < J.length(); i++) {
      holderList.add(stringJInArrayForm[i]);
    }
    int counter = 0;
    System.out.println(holderList);
    char[] stringSInArrayForm = S.toCharArray();
    for (int i = 0; i < S.length(); i++) {
      for (int j = 0; j < J.length(); j++) {
        if (stringSInArrayForm[i] == stringJInArrayForm[j]) {
          counter++;
        }
      }
    }
    System.out.println(counter);
    return 1;
  }

}
