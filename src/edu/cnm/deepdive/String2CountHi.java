package edu.cnm.deepdive;

public class String2CountHi {

  public int countHi(String str){

    int counter = 0;

    String subCopy = "";


    for (int i = 0; i < str.length() - 1; i++) {
      subCopy = str.substring(i, i + 2);

      if (subCopy.equals("hi")) {
        counter++;
      }
    }


    return counter;
  }

}
