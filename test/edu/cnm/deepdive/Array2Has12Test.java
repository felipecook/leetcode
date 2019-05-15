package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Has12Test {

  Array2Has12 array2Has12 = new Array2Has12();
  int[] array1 = {1, 3, 2};
  int[] array2 = {3, 1, 2};
  int[] array3 = {3, 1, 4, 5, 2};

  @Test
  void has12() {
    assertEquals(true, array2Has12.has12(array1));
    assertEquals(true, array2Has12.has12(array2));
    assertEquals(true, array2Has12.has12(array3));

  }
}