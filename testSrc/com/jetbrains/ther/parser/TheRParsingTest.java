package com.jetbrains.ther.parser;

import com.intellij.testFramework.ParsingTestCase;
import com.intellij.testFramework.TestDataPath;
import com.jetbrains.ther.parsing.TheRParserDefinition;

@TestDataPath("/testData/psi/")
public class TheRParsingTest extends ParsingTestCase {
  private static final String DATA_PATH = System.getProperty("user.dir") + "/testData/psi/";

  public TheRParsingTest() {
    super("", "r", new TheRParserDefinition());
  }

  @Override
  protected String getTestDataPath() {
    return DATA_PATH;
  }

  public void testSlice() {
    doTest();
  }

  public void testAssignment() {
    doTest();
  }

  public void testBinary() {
    doTest();
  }

  public void testBinarySlice() {
    doTest();
  }

  public void testFunctionCall() {
    doTest();
  }

  public void testFunctionDefinition() {
    doTest();
  }

  public void testIfStatement() {
    doTest();
  }

  public void testForStatement() {
    doTest();
  }

  public void testRepeatStatement() {
    doTest();
  }

  public void testRepeatBlockStatement() {
    doTest();
  }

  public void testWhileStatement() {
    doTest();
  }

  public void doTest() {
    doTest(true);
  }
}