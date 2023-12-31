/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:45:39 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import views.AlertStateContext;
import views.Unavailable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Unavailable_ESTest extends Unavailable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlertStateContext alertStateContext0 = new AlertStateContext();
      Unavailable unavailable0 = new Unavailable();
      String string0 = unavailable0.alert(alertStateContext0);
      assertEquals("Unavailable", string0);
  }
}
