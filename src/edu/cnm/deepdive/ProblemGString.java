package edu.cnm.deepdive;

public class ProblemGString {

  public boolean gHappy(String str) {

    if (str.length() == 0) {
      return true;
    }
    if (str.length() == 1 && (str.charAt(0) != 'g' || str.charAt(0) != 'G')) {
      return false;
    }
    if ((str.length() == 2) && (str.charAt(str.length() -1) == 'g'
        || str.charAt(str.length() - 1) == 'G')
        && (str.charAt(str.length() - 2) == 'g'
        || str.charAt(str.length() - 2)  == 'G')) {
      return true;
    }


    boolean flag = false;

    char[] chars = str.toCharArray();

    for (int i = 0; i < str.length() - 1; i++) {
      if (chars[i] == 'g' || chars[i] =='G') {
//        if (i == 0) {
//          if (chars[i + 1] == 'g' || chars[i + 1] == 'G') {
//            flag = true;
//          }
//        }

        if ((chars[i + 1] == 'g' || chars[i + 1] == 'G') || (chars[i - 1] == 'g' || chars[i - 1] == 'G')) {
          flag = true;
        } else {
          flag = false;
        }

      }
      if (i == str.length() - 2 && chars[i] != 'g' && chars[i + 1] == 'g') {
        return false;
      }

    }
    return flag;


  }


}
