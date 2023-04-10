/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:21:08 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import objects.ParkingSpot;
import objects.Sensor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParkingSpot_ESTest extends ParkingSpot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParkingSpot parkingSpot0 = new ParkingSpot("objects.ParkingSpot");
      parkingSpot0.code = null;
      String string0 = parkingSpot0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParkingSpot parkingSpot0 = new ParkingSpot("WbK^SFh8bqS@OPi");
      parkingSpot0.code = "";
      String string0 = parkingSpot0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParkingSpot parkingSpot0 = new ParkingSpot("objects.ParkingSpot");
      Sensor sensor0 = parkingSpot0.getSensor();
      assertNull(sensor0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParkingSpot parkingSpot0 = new ParkingSpot("objects.ParkingSpot");
      Sensor sensor0 = new Sensor();
      parkingSpot0.setSensor(sensor0);
      Sensor sensor1 = parkingSpot0.getSensor();
      assertSame(sensor1, sensor0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParkingSpot parkingSpot0 = new ParkingSpot("WbK^SFh8bqS@OPi");
      String string0 = parkingSpot0.getCode();
      assertEquals("WbK^SFh8bqS@OPi", string0);
  }
}
