/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:21:15 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import objects.Sensor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sensor_ESTest extends Sensor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[4];
      sensor0.carModel = stringArray0;
      String string0 = sensor0.getRandArrayElement2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      sensor0.carModel = stringArray0;
      String string0 = sensor0.getRandArrayElement2();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[4];
      sensor0.carType = stringArray0;
      String string0 = sensor0.getRandArrayElement1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      sensor0.carType = stringArray0;
      String string0 = sensor0.getRandArrayElement1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.carModel = null;
      // Undeclared exception!
      try { 
        sensor0.getRandArrayElement2();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("objects.Sensor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[0];
      sensor0.carModel = stringArray0;
      // Undeclared exception!
      try { 
        sensor0.getRandArrayElement2();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.carType = null;
      // Undeclared exception!
      try { 
        sensor0.getRandArrayElement1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("objects.Sensor", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String[] stringArray0 = new String[0];
      sensor0.carType = stringArray0;
      // Undeclared exception!
      try { 
        sensor0.getRandArrayElement1();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String string0 = sensor0.getRandArrayElement1();
      assertEquals("Sedan", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      String string0 = sensor0.getRandArrayElement2();
      assertNotNull(string0);
      assertEquals("Nissan", string0);
  }
}
