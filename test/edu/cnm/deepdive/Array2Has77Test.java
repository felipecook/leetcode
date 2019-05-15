package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Has77Test {

  Array2Has77 array2Has77 = new Array2Has77();

  int array1[] = {1, 7, 7};
  int array2[] = {1, 7, 1, 7};
  int[] array3 = {1, 7, 1, 1, 7};

  @Test
  void has77() {
    assertEquals(true, array2Has77.has77(array1));
    assertEquals(true, array2Has77.has77(array2));
    assertEquals(false, array2Has77.has77(array3));


  }
}