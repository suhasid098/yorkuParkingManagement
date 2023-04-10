/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:21:01 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import objects.Manager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Manager_ESTest extends Manager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Manager manager0 = new Manager();
      assertNull(manager0.getPassword());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Manager manager0 = new Manager("objects.Manager", (-1), "objects.Manager");
      assertEquals("objects.Manager", manager0.getPassword());
  }
}
