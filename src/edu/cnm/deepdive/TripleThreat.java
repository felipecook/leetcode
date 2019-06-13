package edu.cnm.deepdive;


/*
We'll say that a "triple" in a string is a char
appearing three times in a row. Return the number
of triples in the given string. The triples may overlap.
 */
public class TripleThreat {


  public int countTriple(String str) {

    if (str.length() < 3) {
      return 0;
    }


    int counter = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      char holderCharA = str.charAt(i);
      char holderCharB = str.charAt(i + 1);
      char holderCharC = str.charAt(i + 2);


      if (holderCharA == holderCharB && holderCharA == holderCharC) {
        counter++;
      }

    }

    return counter;

  }


}
