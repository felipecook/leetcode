package edu.cnm.deepdive;

/*
Given a string, return true if the number of appearances of
"is" anywhere in the string is equal to the number of appearances
of "not" anywhere in the string (case sensitive).
 */

public class EqualIsNot {

  public boolean equalIsNot(String str) {

    String strIs = "Is";
    String stris = "is";
    String strIS = "IS";
    String striS = "iS";

    String strnot = "not";
    String strNot = "Not";
    String strNOt = "NOt";
    String strNOT = "NOT";
    String strnoT = "noT";
    String strnOt = "nOt";

    int varForIs = 0;
    int varForNot = 0;

    int var1 = 2;
    int var2 = 3;

    for (int i = 0; i <= str.length() - 2; i++) {



      String testString = str.substring(i, var1);

      if (testString.equals(strIs) || testString.equals(stris)
          || testString.equals(strIS) || testString.equals(striS)) {
        varForIs++;
        var1++;
      } else {
        var1++;
      }



    }

    for (int i = 0; i <= str.length() - 3; i++) {


      String testString = str.substring(i, var2);

      if (testString.equals(strnoT) || testString.equals(strnOt)
          || testString.equals(strNOT) || testString.equals(strNOt)
          || testString.equals(strNot) || testString.equals(strnot)) {
        varForNot++;
        var2++;
      } else {
        var2++;
      }


    }

    return varForIs == varForNot;


  }


}
