package com.example.springboottest.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Controller.TestController;

public class TestUnitController {

  @Test
  public void testUnit() {
    TestController controller = new TestController();
    String result = controller.saudacao("DIO");
    assertEquals("Bem vindo, DIO", result);
  }

}
