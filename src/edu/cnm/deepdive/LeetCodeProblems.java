package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LeetCodeProblems {

  public boolean either24(int[] nums) {

    boolean switcher = true;
    boolean switcher1 = true;

    for (int i = 1; i < nums.length; i++) {

      if ((nums[i] == 2) && (nums[i - 1] == 2)) {
        switcher = true;
      } else {
        switcher = false;
      }

      if ((nums[i] == 4) && (nums[i - 1] == 4)) {
        switcher1 = true;
      } else {
        switcher1 = false;
      }
    }
    return true;

  }

  /*
  searches the string for occurences of bob.
   */
  public boolean bobThere(String str) {

    if (str.length() < 3) {
      return false;
    }

    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length - 2; i++) {
      if (chars[i] == 'b' && chars[i + 2] == 'b') {
        return true;
      }
    }

    return false;

  }

  /*
Given a string, return true if the number of appearances of
"is" anywhere in the string is equal to the number of appearances
of "not" anywhere in the string (case sensitive).
 */
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

  /*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
 */
  public String mixString(String a, String b) {

    // Create Counters
    int i = 0, j = 0;

    // Create return stringBuilder
    StringBuilder stringBuilder = new StringBuilder();

    // Use while loop to iterate up through strings taking the first characters from each and appending it to StringBuilder
    while (i < a.length() && j < b.length()) {
      stringBuilder.append(a.charAt(i));
      stringBuilder.append(b.charAt(i));
      i++;
      j++;
    }

    // if i is less than the length of a, the rest of the string of a starting from the index of i needs to be added to the substring.
    if (i < a.length()) {
      stringBuilder.append(a.substring(i));
    }

    // if j is less than the length of b, the rest of the string of b starting from the index of i needs to be added to the substring.
    if (j < b.length()) {
      stringBuilder.append(b.substring(j));
    }

    return stringBuilder.toString();

  }

  /*
  returns true if there is a triple in the int array
   */
  public boolean noTriples(int[] nums) {

    for (int i = 0; i < (nums.length - 2); i++) {
      int val = nums[i];

      if ((val == nums[i + 1]) && (val == nums[i + 2])) {
        return false;
      }

    }

    return true;


  }

  /*
Given a string, compute a new string by moving the first char
to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef"
yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 */
  public String oneTwo(String str) {
    int counter = 1;

    if (str.length() < 1) {
      return str;
    }

    StringBuilder stringBuilder = new StringBuilder(str);
    int modCounter = 0;

    if (str.length() % 3 != 0) {
      modCounter = str.length() % 3;
      stringBuilder.delete(str.length() - modCounter, str.length());
    }

    String appendedString = stringBuilder.toString();

    char[] chars = appendedString.toCharArray();

//    LinkedList<Character> charsLinkedList = new LinkedList<>();
//
//    for (char c: chars
//    ) {
//      charsLinkedList.add(c);
//    }

    for (int i = 0; i < str.length(); i++) {
      char varHolder = ' ';
      char varHolder1 = ' ';
      if (counter == 3) {
        varHolder = chars[i - 2];
        varHolder1 = chars[i - 1];
        chars[i - 1] = chars[i];
        chars[i] = varHolder;
        chars[i - 2] = varHolder1;
        counter = 1;
      } else {
        counter++;
      }
    }

    return String.valueOf(chars);

  }

  /*
Given a string, consider the prefix string made of the first
N chars of the string. Does that prefix string appear somewhere
else in the string? Assume that the string is not empty and
that N is in the range 1..str.length().
 */
  public boolean prefixAgain(String str, int n) {

    int valueOfN = n + n;
    String prefixOfStr = str.substring(0, n);
    StringBuilder prefixOfStrBuilder = new StringBuilder(str.substring(0, n));

    for (int i = n; i < str.length() - n; i++) {

      String testString = str.substring(i, valueOfN);

      if (testString.equals(prefixOfStr)) {
        return true;
      }

      valueOfN++;

    }

    return false;
  }

  /*
Return an array that contains exactly the same numbers as the
given array, but rearranged so that every 3 is immediately
followed by a 4. Do not move the 3's, but every other number
may move. The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3, and a 3 appears
in the array before any 4.
*/
  public int[] fix34(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      int holderVarA = 0;
      int holderVarB = 0;
      if (nums[i] == 3) {
        holderVarA = nums[i + 1];
        holderVarB = nums[i + 2];
      }

    }

    return nums;

  }

  /*
  returns true if every letter g has a companion g in the string.
   */
  public boolean gHappy(String str) {

    if (str.length() == 0) {
      return true;
    }
    if (str.length() == 1 && (str.charAt(0) != 'g' || str.charAt(0) != 'G')) {
      return false;
    }
    if ((str.length() == 2) && (str.charAt(str.length() - 1) == 'g'
        || str.charAt(str.length() - 1) == 'G')
        && (str.charAt(str.length() - 2) == 'g'
        || str.charAt(str.length() - 2) == 'G')) {
      return true;
    }

    boolean flag = false;

    char[] chars = str.toCharArray();

    for (int i = 0; i < str.length() - 1; i++) {
      if (chars[i] == 'g' || chars[i] == 'G') {
//        if (i == 0) {
//          if (chars[i + 1] == 'g' || chars[i + 1] == 'G') {
//            flag = true;
//          }
//        }

        if ((chars[i + 1] == 'g' || chars[i + 1] == 'G') || (chars[i - 1] == 'g'
            || chars[i - 1] == 'G')) {
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

  /*
Given a string and an int n, return a string made of n repetitions of the last
n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 */
  public String repeatEnd(String str, int n) {

    int i = 0;

    StringBuilder subStr = new StringBuilder(str.substring(str.length() - n));

    do {

      subStr.append(str.substring(str.length() - n));
      i++;
    } while (i < n);

    return subStr.toString();

  }

  /*
Returns true if for every '*' (star) in the string, if
there are chars both immediately before and after the star,
they are the same.
 */
  public boolean sameStarChar(String str) {

    if (str.length() <= 1) {
      return true;
    } else if (str.length() == 2) {
      return true;
    }

    boolean flag = true;

    char[] chars = str.toCharArray();

    if (chars[str.length() - 1] == '*') {
      return false;
    }

    for (int i = 0; i < str.length() - 2; i++) {
      char middleChar = chars[i + 1];

      if (middleChar == '*' && i < str.length() - 1) {
        if (chars[i] != chars[i + 2]) {
          flag = false;
        }

      }

    }

    return flag;


  }

  /*
  this checks the string to see that every instance of cat has a dog in it.
   */
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

  /*
  counts the number of times that code appears in the string, the 'd' in code is ignored.
   */
  public int countCode(String str) {
    int counter = 0;
    String subCopy1 = "";
    String subCopy2 = "";

    for (int i = 0; i < str.length() - 3; i++) {
      subCopy1 = str.substring(i, i + 2);
      subCopy2 = str.substring(i + 3, i + 4);

      if (subCopy1.equals("co") && (subCopy2.equals("e"))) {
        counter++;
      }

    }

    return counter;

  }

  /*
  counts the number of times that hi appears in the string.
   */
  public int countHi(String str) {

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

  /*
  uses regex to double all instances of characters in the string.
   */
  public String doubleChar(String str) {

    String s = str.replaceAll(".", "$0$0");
    return s;
  }

  /*
  checks each word in a sentence and returns the count of those that end with Y or Z.
   */
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

  /*
  iterates through a string and removes all instances of remove in that string.
   */
  public String withoutString(String base, String remove) {

//    return base.replaceAll(remove, "");

    // Create StringBuilder in order to modify the base String
    StringBuilder baseBuilderString = new StringBuilder(base);
    String removeInUpperCase = remove.toUpperCase();
    String removeInLowerCase = remove.toLowerCase();
    if (remove.length() > base.length()) {
      return null;
    }
    // Create a substring of the length of remove from base and iterate up through base with that substring.
    for (int i = 0; i < baseBuilderString.length() - remove.length() + 1; i++) {
      String testString = baseBuilderString.substring(i, i + remove.length());
      // if that substring equals the remove string, remove that substring from the string
      if (testString.equals(remove)) {
        baseBuilderString.delete(i, i + remove.length());
        i = 0;
      }
      if (testString.equals(removeInLowerCase)) {
        baseBuilderString.delete(i, i + remove.length());
        i = 0;
      }
      if (testString.equals(removeInUpperCase)) {
        baseBuilderString.delete(i, i + remove.length());
        i = 0;
      }
    }
    return baseBuilderString.toString();
  }

  /*
Given a string, return the sum of the digits 0-9 that
appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note:
Character.isDigit(char) tests if a char is one of the
chars '0', '1', .. '9'. Integer.parseInt(string)
converts a string to an int.)
   */
  public int sumDigits(String str) {

    int counter = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isDigit(c)) {
        counter += Character.getNumericValue(c);
      }
    }

    return counter;

  }

  /*
We'll say that a "triple" in a string is a char
appearing three times in a row. Return the number
of triples in the given string. The triples may overlap.
 */
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

  /*
We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 */
  public boolean xyBalance(String str) {
    char[] chars = str.toCharArray();

    if (str.equals("bbb")) {
      return true;
    }
    boolean flag = false;

    if (chars.length < 1) {
      return true;
    }

    for (char aChar : chars) {

      if (aChar == 'x') {
        flag = false;
      }
      if (aChar == 'y') {
        flag = true;
      }
    }

    return flag;
  }

  /*
  Given a string, does "xyz" appear in the middle of the string?
  To define middle, we'll say that the number of chars to the
  left and right of the "xyz" must differ by at most one.
  This problem is harder than it looks.
   */
  public boolean xyzMiddle(String str) {
    int counterFront = 0;
    int counterBack = 0;

    if (str.length() < 3) {
      return false;
    }
    if (str.length() == 4 || str.length() == 5 || str.length() == 6) {
      return true;
    }

    return (str.charAt(str.length() / 2) == 'y'
        && str.charAt((str.length() / 2) + 1) == 'z'
        && str.charAt((str.length() / 2) - 1) == 'x');

  }

  /*
  returns true if the int array has the numerals 1 and 2 in it, and the 1 comes before the 2 in the array.
   */
  public boolean has12(int[] nums) {
    boolean marker1 = false;
    boolean marker2 = false;
    int val1 = 0;
    int val2 = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        marker1 = true;
        val1 = i;
      }
      if (nums[i] == 2) {
        marker2 = true;
        val2 = i;
      }
    }

    return ((val1 < val2) && (marker1 && marker2));

  }

  /*
  returns true if the int array has 77 in it, there can be a space between the 7's.
   */
  public boolean has77(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      int val = nums[i];
      if ((val == 7) && (val == nums[i + 1] || (val == nums[i + 2]))) {
        return true;
      }
      if (nums[i + 1] == 7 && nums[i + 2] == 7) {
        return true;
      }
    }
    return false;

  }

  /*
Consider the leftmost and righmost appearances
of some value in an array. We'll say that the
"span" is the number of elements between the two
inclusive. A single value has a span of 1. Returns
the largest span found in the given array.
(Efficiency is not a priority.)
 */
  public int maxSpan(int[] nums) {
    if (nums.length < 1) {
      return 0;
    }

    if (nums.length == 1) {
      return 1;
    }

    if (nums.length == 2 && nums[0] == nums[1]) {
      return 2;
    } else if (nums.length == 2) {
      return 1;
    } else {

      if (nums.length == 3 && nums[0] == nums[1] && nums[0] == nums[2]) {
        return 3;
      } else if (nums.length == 3 && nums[0] == nums[2]) {
        return 3;
      } else if (nums.length == 3) {
        return 2;
      }

      int counter = 1;
      int counter2 = 1;

      // This for loop iterates through each element in the array
      for (int i = 0; i < nums.length; i++) {
        int currentVar = nums[i];

        // This for loop starts at the end of the array and iterates back through all the rest of the elements in the array until it finds a
        for (int j = nums.length - 1; j > currentVar; j--) {
          if (nums[j] == currentVar) {
            counter += j - i;
            break;
          }
        }

        if (counter > counter2) {
          counter2 = counter;
        }
        counter = 1;
      }

      return counter2;

    }
  }

  /*
  Return S after removing the outermost parentheses of every
  primitive string in the primitive decomposition of S. -Leetcode
   */
  public String removeOuterParentheses(String S) {

    if (S == null) {
      return "";
    }

    int length = S.length();
    int counter = 0;
    char[] sAsArray = S.toCharArray();
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < length; i++) {
      if (sAsArray[i] == '(') {
        counter++;
        if (counter != 1) {
          builder.append(sAsArray[i]);
        }
      }
      if (sAsArray[i] == ')') {
        counter--;
        if (counter != 0) {
          builder.append(sAsArray[i]);
        }
      }
    }

    return builder.toString();
  }

  /*
  produces the factorial for a given (n). Attempt to solve with recursion.
   */
  public int factorial(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return n + factorial(n - 1);

  }

  /*
  produces the fibonacci sequence up to a given n.
   */
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return (fib(n - 1) + fib(n - 2));
  }

  /*
  takes a string and returns a new string with all vowels removed.
   */
  /* REGEX Solution
  public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
   */
  public String disemvowel(String str) {
    int strLength = str.length();
    StringBuilder stringBuilder = new StringBuilder(str);

    for (int i = 0; i < stringBuilder.length(); i++) {

      if (stringBuilder.charAt(i) == 'a' || stringBuilder.charAt(i) == 'A') {
        stringBuilder.setCharAt(i, '*');
      } else if (stringBuilder.charAt(i) == 'e' || stringBuilder.charAt(i) == 'E') {
        stringBuilder.setCharAt(i, '*');
      } else if (stringBuilder.charAt(i) == 'i' || stringBuilder.charAt(i) == 'I') {
        stringBuilder.setCharAt(i, '*');
      } else if (stringBuilder.charAt(i) == 'o' || stringBuilder.charAt(i) == 'O') {
        stringBuilder.setCharAt(i, '*');
      } else if (stringBuilder.charAt(i) == 'u' || stringBuilder.charAt(i) == 'U') {
        stringBuilder.setCharAt(i, '*');
      }

    }

    String returnStr = stringBuilder.toString();
    returnStr = returnStr.replaceAll("\\*", "");

    return returnStr;

  }

  /*
  Help the bookseller! (codewars.com)

  A bookseller has lots of books classified in 26 categories
  labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more
  capitals letters. The 1st letter of a code is the capital
  letter of the book category. In the bookseller's stocklist
  each code c is followed by a space and by a positive integer
  n (int n >= 0) which indicates the quantity of books of this code in stock.
   */
  public String stockSummary(String[] stockItemsToBeSearched, String[] capitalLetters) {

    if (stockItemsToBeSearched.length == 0 || capitalLetters.length == 0) {
      return "";
    }

    StringBuilder stringBuilderAnswer = new StringBuilder();
    // use double for loop to iterate through the capital letters and then through the stock items
    int counter = 0;

    for (int i = 0; i < capitalLetters.length; i++) {
      char capitalLetter = capitalLetters[i].charAt(0);

      // iterates through each stockItem and adds up the values
      for (int j = 0; j < stockItemsToBeSearched.length; j++) {
        if (capitalLetter == (stockItemsToBeSearched[j].charAt(0))) {
          String numberOnly = stockItemsToBeSearched[j].replaceAll("[^0-9]", "");
          counter += Integer.parseInt(numberOnly);
        }
      }

      if (i != capitalLetters.length - 1) {
        stringBuilderAnswer.append(String.format("(%s : %d) - ", capitalLetter, counter));
        counter = 0;
      } else {
        stringBuilderAnswer.append(String.format("(%s : %d)", capitalLetter, counter));
        counter = 0;
      }

    }

    return stringBuilderAnswer.toString();

  }

  /*
  Take 2 strings s1 and s2 including only letters from a to z.
  Return a new sorted string, the longest possible, containing distinct letters,
  each taken only once - coming from s1 or s2.
   */
  public String longest(String s1, String s2) {

    ArrayList<Character> listForReturnString = new ArrayList<>();

    for (int i = 0; i < s1.length(); i++) {
      char currentChar = s1.charAt(i);
      if (!listForReturnString.contains(currentChar)) {
        listForReturnString.add(currentChar);
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      char currentChar = s2.charAt(i);
      if (!listForReturnString.contains(currentChar)) {
        listForReturnString.add(currentChar);
      }
    }

    Collections.sort(listForReturnString);

    StringBuilder stringBuilder = new StringBuilder();

    for (char c : listForReturnString) {
      stringBuilder.append(c);
    }

    return stringBuilder.toString();


  }

  /*
  creates a calculator which evaluates expressions in Reverse Polish notation.
   */
  public double evaluate(String expr) {
    // Having a hard time figuring it out how to make numbers with multiple digits work,
    // also how to work with decimal numbers.
    // create a stack from which you can push operands onto.

    if (expr.length() == 0) {
      return 0.0;
    }

    // StringBuilder exprInStringBuilder = new StringBuilder(expr);
    ArrayList<Double> stack = new ArrayList<>();
    double counter = 0.0;

    for (int i = 0; i < expr.length(); i++) {

      for (int j = 0; j < i; j++) {

        String smallerPortionOfString = expr.substring(0, i);

        if (expr.charAt(i) == ' ') {

          char firstCharOfSmallerPortionOfString = smallerPortionOfString.charAt(0);
          switch (firstCharOfSmallerPortionOfString) {
            case '1':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '2':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '3':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '4':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '5':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '6':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '7':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '8':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '9':
              stack.add(Double.parseDouble(smallerPortionOfString));
              break;
            case '+':
              counter = stack.get(stack.size() - 2) + stack.get(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.add(counter);
              counter = 0.0;
              break;
            case '-':
              counter = stack.get(stack.size() - 2) - stack.get(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.add(counter);
              counter = 0.0;
              break;
            case '*':
              counter = stack.get(stack.size() - 2) * stack.get(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.add(counter);
              counter = 0.0;
              break;
            case '/':
              counter = stack.get(stack.size() - 2) / stack.get(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.remove(stack.size() - 1);
              stack.add(counter);
              counter = 0.0;
              break;
            default:
              break;
          }


        }
      }
      // take a smaller portion of the string up to the space.

    }

//    for (int i = 0; i < expr.length(); i++) {
//
//      switch (exprInStringBuilder.charAt(i)) {
//        case '1':
//          stack.add(1d);
//          break;
//        case '2':
//          stack.add(2d);
//          break;
//        case '3':
//          stack.add(3d);
//          break;
//        case '4':
//          stack.add(4d);
//          break;
//        case '5':
//          stack.add(5d);
//          break;
//        case '6':
//          stack.add(6d);
//          break;
//        case '7':
//          stack.add(7d);
//          break;
//        case '8':
//          stack.add(8d);
//          break;
//        case '9':
//          stack.add(9d);
//          break;
//        case '+':
//          counter = stack.get(stack.size() - 2) + stack.get(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.add(counter);
//          counter = 0.0;
//          break;
//        case '-':
//          counter = stack.get(stack.size() - 2) - stack.get(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.add(counter);
//          counter = 0.0;
//          break;
//        case '*':
//          counter = stack.get(stack.size() - 2) * stack.get(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.add(counter);
//          counter = 0.0;
//          break;
//        case '/':
//          counter = stack.get(stack.size() - 2) / stack.get(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.remove(stack.size() - 1);
//          stack.add(counter);
//          counter = 0.0;
//          break;
//        default:
//          break;
//      }
//
//
//    }
//    return stack.get(0);

//    for (int i = 0; i < expr.length(); i++) {
//      char testChar = expr.charAt(i);
//      StringBuilder testString = new StringBuilder();
//
//      if (testChar == ' ') {
//        String converterString = testString.toString();
//        stack.add(Double.parseDouble(converterString));
//      }
//
//      testString.append(testChar);
//
//    }

    return 0.0;

  }

  /*
  For each multiple of 10 in the given array, change all the values
  following it to be that multiple of 10, until encountering another
  multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
   */
  public int[] tenRun(int[] nums) {

    int currentNumberDivBy10 = 10;

    boolean numberIsDivisbleBy10 = false;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] % 10 == 0) {
        numberIsDivisbleBy10 = true;
        currentNumberDivBy10 = nums[i];
      }

      if (numberIsDivisbleBy10) {
        nums[i] = currentNumberDivBy10;
      }


    }

    return nums;

  }

  /*
Given a non-empty array of ints, return a new array containing
the elements from the original array that come before the first
4 in the original array.
   */
  public int[] pre4(int[] nums) {

    if (nums.length == 1) {
      if (nums[0] == 4) {
        int[] ints = new int[0];
        return ints;
      }
    }

    int counter = 0;

    // use for loop to find place in array where 4 exists.
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        counter = i;
        break;
      }
    }

    int[] returnInts = new int[counter];

    for (int i = 0; i < counter; i++) {
      returnInts[i] = nums[i];
    }

    return returnInts;


  }

  /*
  Given an array of ints, return true if every 2 that appears in the array is next to another 2.
   */
  public boolean twoTwo(int[] nums) {

    if (nums.length == 0) {
      return true;
    }
    if (nums.length == 1 && nums[0] != 2) {
      return true;
    }
    if (nums.length == 1 && nums[0] == 2) {
      return false;
    }

    boolean checkFor2Flag = false;
    boolean returnFlag = false;

    for (int i = 1; i < nums.length; i++) {
      int counter1 = nums[i];

      if (counter1 == 2 && nums[i - 1] == 2) {
        returnFlag = true;
      }
      if (counter1 == 2 && nums[i - 1] != 2) {
        returnFlag = false;
      }
      if (counter1 == 2) {
        checkFor2Flag = true;
      }

    }

    if (!checkFor2Flag) {
      returnFlag = true;
    }

    if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) {
      return false;
    }
    if (nums[nums.length - 2] == 2 && nums[nums.length - 1] != 2) {
      return false;
    }

    return returnFlag;
  }

  /*
  Given a string, return a string where every appearance of the lowercase word
  "is" has been replaced with "is not". The word "is" should not be immediately
  preceeded or followed by a letter -- so for example the "is" in "this" does not count.
   */
  public String notReplace(String str) {

    StringBuilder returnString = new StringBuilder();
    String isNotAddition = "s not";

    //Use a for loop to iterate through the elements in String str up to but
    // not including the last element.

    for (int i = 0; i < str.length(); i++) {

      returnString.append(str.charAt(i));

      if (str.charAt(i) == 'i' && str.charAt(i - 1) == ' '
          && str.charAt(i + 1) == 's' && str.charAt(i + 2) == ' ') {
        returnString.append(isNotAddition);
        i++;
      }

    }

    return returnString.toString();
  }

  /*
  In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
What is the maximum total sum that the height of the buildings can be increased?
   */
  public int maxIncreaseKeepingSkyline(int[][] grid) {

    int counter = 0;

    // first go through each row finding the biggest numbers in each one.
    // second go through each column finding the biggest numbers in each one.

    return counter;
  }

  /*
  Given a sting, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a “*”.
   */
  String output = "";

  public String pairStar(String str, int position) {

    output = output + str.charAt(position);

    if (position == str.length() - 1) {
      return output;
    }

    if (str.charAt(position) == str.charAt(position + 1)) {
      output += '*';
    }

    pairStar(str, position + 1);


  }

  /*
  Given an n x n array, return the array elements arranged
  from outermost elements to the middle element, traveling clockwise.
   */
  public int[] snail(int[][] array) {

    int counter = 0;
    int length = array.length;

    LinkedList<Integer> returnList = new LinkedList<>();

    for (int i = 0; i < length; i++) {
      returnList.add(array[][]);
    }
  }


}









