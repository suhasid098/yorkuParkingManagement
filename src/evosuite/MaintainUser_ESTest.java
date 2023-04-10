/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:19:48 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.MaintainUser;
import objects.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaintainUser_ESTest extends MaintainUser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-3857L));
      MaintainUser maintainUser0 = MaintainUser.getInstance();
      maintainUser0.clear();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      maintainUser0.path = "2014-02-14T20:21:21.320";
      maintainUser0.clear();
      maintainUser0.update();
      maintainUser0.users = null;
      System.setCurrentTimeMillis((-3857L));
      maintainUser0.load();
      MaintainUser maintainUser1 = MaintainUser.getInstance();
      assertSame(maintainUser1, maintainUser0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MaintainUser maintainUser0 = MaintainUser.getInstance();
      maintainUser0.clear();
      try { 
        maintainUser0.load();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaintainUser maintainUser0 = MaintainUser.getInstance();
      try { 
        maintainUser0.load();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File 2014-02-14T20:21:21.320 does not exist.
         //
         verifyException("com.csvreader.CsvReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      System.setCurrentTimeMillis((-3857L));
      MaintainUser maintainUser0 = MaintainUser.getInstance();
      maintainUser0.clear();
      maintainUser0.update();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      maintainUser0.path = "2014-02-14T20:21:21.320";
      maintainUser0.clear();
      maintainUser0.update();
      System.setCurrentTimeMillis((-3857L));
      maintainUser0.load();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MaintainUser maintainUser0 = MaintainUser.getInstance();
      maintainUser0.clear();
      maintainUser0.load();
      long long0 = (-4196L);
      System.setCurrentTimeMillis(long0);
      maintainUser0.update();
      MaintainUser maintainUser1 = MaintainUser.getInstance();
      ArrayList<User> arrayList0 = maintainUser1.users;
      maintainUser0.users = arrayList0;
      maintainUser0.load();
      maintainUser1.loggedInUser = maintainUser0.loggedInUser;
      String string0 = "";
      maintainUser0.path = string0;
      maintainUser0.clear();
      maintainUser0.clear();
      String string1 = "\"";
      maintainUser0.path = string1;
      maintainUser0.clear();
      maintainUser0.load();
      MaintainUser maintainUser2 = MaintainUser.getInstance();
      maintainUser2.clear();
      MaintainUser.getInstance();
      MaintainUser maintainUser3 = MaintainUser.getInstance();
      maintainUser3.load();
      MaintainUser maintainUser4 = MaintainUser.getInstance();
      assertSame(maintainUser4, maintainUser1);
  }
}
