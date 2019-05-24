package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class String3WithoutString {

  public String withoutString(String base, String remove) {

    // Array list to hold converted base string
    ArrayList<Character> baseToList = new ArrayList<Character>();

    // Adds elements of base string to Array List
    for (char c: base.toCharArray()) {
      baseToList.add(c);
    }

    // Iterate over the elements in the list
    for (int i = 0; i < baseToList.size(); i++) {

      // If an element in the list is similar to the String, remove it
      if (baseToList.get(i).equals(remove)) {
        baseToList.remove(i);
      }


    }

    

  }

}
