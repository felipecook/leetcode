package edu.cnm.deepdive;

public class String2CountCode {


  public int countCode(String str) {
    int counter = 0;
    String subCopy1 = "";
    String subCopy2 = "";

    for (int i = 0; i < str. length() - 4; i++) {
      subCopy1 = str.substring(i, i + 2);
      subCopy2 = str.substring(i + 3, i + 3);

      if (subCopy1.equals("co") && (subCopy2.equals("e"))) {
        counter++;
      }

    }

    return counter;

  }


}
