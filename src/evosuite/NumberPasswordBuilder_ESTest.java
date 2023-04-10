/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:23:49 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import password.NumberPasswordBuilder;
import password.Password;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberPasswordBuilder_ESTest extends NumberPasswordBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      Password password0 = numberPasswordBuilder0.getPassword();
      assertEquals("", password0.getPassword1());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      numberPasswordBuilder0.setIncludeSymbols();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      numberPasswordBuilder0.setLowerCase();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      numberPasswordBuilder0.setIncludeNumbers();
      Password password0 = numberPasswordBuilder0.getPassword();
      assertTrue(password0.getIncludeNumbers());
      assertEquals("", password0.getPassword1());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      numberPasswordBuilder0.setUpperCase();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumberPasswordBuilder numberPasswordBuilder0 = new NumberPasswordBuilder();
      numberPasswordBuilder0.setLength();
      Password password0 = numberPasswordBuilder0.getPassword();
      assertEquals("aaaa", password0.getPassword1());
  }
}
