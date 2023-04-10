/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:18:39 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.MaintainManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaintainManager_ESTest extends MaintainManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaintainManager maintainManager0 = MaintainManager.getInstance();
      FileSystemHandling.shouldAllThrowIOExceptions();
      maintainManager0.clear();
      try { 
        maintainManager0.load();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaintainManager maintainManager0 = MaintainManager.getInstance();
      maintainManager0.update();
      maintainManager0.load();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaintainManager maintainManager0 = MaintainManager.getInstance();
      try { 
        maintainManager0.load();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File C:\\Users\\natal\\eecs3311project\\manager.csv does not exist.
         //
         verifyException("com.csvreader.CsvReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaintainManager maintainManager0 = MaintainManager.getInstance();
      maintainManager0.clear();
      maintainManager0.load();
      MaintainManager maintainManager1 = MaintainManager.getInstance();
      maintainManager0.clear();
      maintainManager0.clear();
      maintainManager1.load();
      maintainManager0.update();
      maintainManager1.update();
      maintainManager0.load();
  }
}
