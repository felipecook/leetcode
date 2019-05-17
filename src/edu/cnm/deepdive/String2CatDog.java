package edu.cnm.deepdive;

public class String2CatDog {



  public boolean catDog(String str) {
    int counter1 = 0;
    int counter2 = 0;
    boolean flag = false;

    String subCopy = "";


    for (int i = 0; i < str.length() - 2; i++) {
      subCopy = str.substring(i, i + 3);

      if (subCopy.equals("cat")) {
        counter1++;
      }
      if (subCopy.equals("dog")) {
        counter2++;
      }
    }

    if (counter1 == counter2) {
      flag = true;
    }

    return flag;
  }

}
