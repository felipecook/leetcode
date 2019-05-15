package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoTriplesTest {

  NoTriples noTriples = new NoTriples();

  int[] array1 = {1, 1, 2, 2, 1};
  int[] array2 = {1, 1, 2, 2, 2, 1};

  @Test
  void noTriples() {
    assertEquals(true, noTriples.noTriples(array1));
    assertEquals(false, noTriples.noTriples(array2));

  }
}