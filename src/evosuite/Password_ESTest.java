/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:23:56 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import password.Password;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Password_ESTest extends Password_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Password password0 = new Password();
      password0.addUpperCase(true);
      boolean boolean0 = password0.getincludeUpperCase();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Password password0 = new Password();
      password0.addLowerCase(true);
      boolean boolean0 = password0.getincludeLowerCase();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Password password0 = new Password();
      password0.setPassword1("");
      String string0 = password0.getPassword1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Password password0 = new Password();
      password0.setLength(2164);
      int int0 = password0.getLength();
      assertEquals(2164, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Password password0 = new Password();
      password0.setLength((-2125));
      int int0 = password0.getLength();
      assertEquals((-2125), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Password password0 = new Password();
      password0.addNumbers(true);
      boolean boolean0 = password0.getIncludeNumbers();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Password password0 = new Password();
      boolean boolean0 = password0.getIncludeNumbers();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Password password0 = new Password();
      boolean boolean0 = password0.getSymbols();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Password password0 = new Password();
      String string0 = password0.getPassword1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Password password0 = new Password();
      password0.addSymbols(true);
      boolean boolean0 = password0.getSymbols();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Password password0 = new Password();
      int int0 = password0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Password password0 = new Password();
      boolean boolean0 = password0.getincludeUpperCase();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Password password0 = new Password();
      boolean boolean0 = password0.getincludeLowerCase();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Password password0 = new Password();
      password0.setPassword1("|T|<9d.D4");
      String string0 = password0.getPassword1();
      assertEquals("|T|<9d.D4", string0);
  }
}
