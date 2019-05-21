package edu.cnm.deepdive;

public class String3CountYZ {

  public static int countYZ(String str) {
    // Counter to return number of instances Y and Z appear at the end of the word.
    int counter = 0;

    // Split the sentence string into multiple words.
    String[] strArr = str.split(" ");

    for (int i = 0; i < strArr.length; i++) {
      // This grabs each word in the string array
      String testWord = strArr[i];
      for (int j = 0; j < testWord.length(); j++) {
        char testCharacter = testWord.charAt(j);
        if (testCharacter == 'y' || testCharacter == 'z') {
          counter++;
        }
      }
    }





  }


}
