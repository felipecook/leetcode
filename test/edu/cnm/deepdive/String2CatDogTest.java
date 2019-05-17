package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String2CatDogTest {

  String2CatDog string2CatDog = new String2CatDog();

  String test1 = "catABChidog";
  String test2 = "dogAAhibbhi";
  String test3 = "AcatcatdogdogBC";

  @Test
  void catDog() {

    assertEquals(true, string2CatDog.catDog(test1));
    assertEquals(false, string2CatDog.catDog(test2));
    assertEquals(true, string2CatDog.catDog(test3));


  }
}