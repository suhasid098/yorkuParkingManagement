/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:21:21 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import objects.SuperManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SuperManager_ESTest extends SuperManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SuperManager superManager0 = new SuperManager();
      assertNull(superManager0.getPassword());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SuperManager superManager0 = new SuperManager("", 0, "");
      assertEquals("", superManager0.getPassword());
  }
}
