package edu.cnm.deepdive;

public class String3CountYZ {

  public int countYZ(String str) {
    // Counter to return number of instances Y and Z appear at the end of the word.
    int counter = 0;

    // Split the sentence string into multiple words.
    String[] strArr = str.split("\\W+");

    for (int i = 0; i < strArr.length; i++) {
      String testWord = strArr[i].toLowerCase();
      // This grabs each word in the string array
      // This checks to make sure the word has more than one letter in it.
      if (testWord.length() > 1) {
        // This tests to see if last letter is a y or a z.
        if (testWord.charAt(testWord.length() - 1) == 'y'
            || testWord.charAt(testWord.length() - 1) == 'z') {
          counter++;
        }
      }
    }

    // return the number of times that has been seen.
    return counter;



  }


}
