/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 10 03:22:36 GMT 2023
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import objects.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      User user0 = new User("objects.Account", (-1795112073), "objects.Account", "-Ks5fZ,}RCW", "visitor");
      user0.setPayementType("debit");
      user0.refund((-1795112073));
      assertEquals((-1795111073), user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      User user0 = new User("objects.Account", (-1795112073), "objects.Account", "-Ks5fZ,}RCW", "visitor");
      user0.rate = (double) (-1795112073);
      double double0 = user0.getRate();
      assertEquals((-1.795112073E9), user0.rate, 0.01);
      assertEquals((-1.795112073E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      User user0 = new User();
      user0.addPrice(1);
      int int0 = user0.getPrice();
      assertEquals(1, user0.price);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      User user0 = new User();
      user0.addPrice((-2017));
      int int0 = user0.getPrice();
      assertEquals((-2017), user0.price);
      assertEquals((-2017), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      User user0 = new User();
      user0.setplateNumber(",_c9IIaXRBCO*");
      user0.getPlateNumber();
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      User user0 = new User();
      user0.setplateNumber("");
      user0.getPlateNumber();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      User user0 = new User();
      user0.paymentType = "B]";
      user0.getPaymentType();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      User user0 = new User("objects.Account", 1, "`S}G3^rQ", "objects.Account", "objects.Account");
      user0.setPaymentType("");
      user0.getPaymentType();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      User user0 = new User();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      user0.parkingStartTime = localDateTime0;
      user0.getParkingStartTime();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      User user0 = new User("objects.Account", 1, "`S}G3^rQ", "objects.Account", "objects.Account");
      user0.setParkingSpot("Student");
      user0.getParkingSpotName();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      User user0 = new User((String) null, 329, (String) null, (String) null, "NQ|w`U0:seB'5");
      user0.getParkingSpotName();
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0.0, user0.rate, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      User user0 = new User();
      user0.setParkingLot("*X");
      user0.getParkingLot();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      User user0 = new User("objects.Account", 1, "`S}G3^rQ", "objects.Account", "objects.Account");
      user0.getParkingLot();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      User user0 = new User();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      user0.parkingEndTime = localDateTime0;
      user0.getParkingEndTime();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      User user0 = new User();
      user0.setParkingLot("objects.Account");
      user0.getLotName();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      User user0 = new User("", (-172), "k3cqV>iQ?HK", "k3cqV>iQ?HK", "");
      user0.getLotName();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      User user0 = new User("", (-172), "k3cqV>iQ?HK", "k3cqV>iQ?HK", "");
      user0.getEmail();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      User user0 = new User("", 0, "", "", "");
      user0.getEmail();
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      User user0 = new User("|0!c.<(EBL(?.) hD", 0, "|0!c.<(EBL(?.) hD", "|0!c.<(EBL(?.) hD", "6-z/_lp$w|of)V");
      user0.setCvvNumber("|0!c.<(EBL(?.) hD");
      user0.getCvvNumber();
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User("raPhZ0KLJ56Jldz", (-3039), "raPhZ0KLJ56Jldz", "raPhZ0KLJ56Jldz", "");
      user0.setCvvNumber("");
      user0.getCvvNumber();
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      User user0 = new User();
      user0.cardNumber = "(Q";
      user0.getCardNumber();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      User user0 = new User((String) null, 329, (String) null, (String) null, "NQ|w`U0:seB'5");
      user0.cardNumber = "";
      user0.getCardNumber();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.parkingFee);
      assertEquals(0.0, user0.rate, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      User user0 = new User();
      user0.cardName = "%)";
      user0.getCardName();
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      User user0 = new User("e_8w ,!~|Fxw#,#4nb", (-1), "e_8w ,!~|Fxw#,#4nb", "e_8w ,!~|Fxw#,#4nb", "");
      user0.setCardName("");
      user0.getCardName();
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  /*@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      User user0 = new User();
      user0.approved = true;
      user0.getApproved();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }*/

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      User user0 = new User("raPhZ0KLJ56Jldz", (-3039), "raPhZ0KLJ56Jldz", "raPhZ0KLJ56Jldz", "");
      user0.getAccountType();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      User user0 = new User();
      // Undeclared exception!
      try { 
        user0.setDebitBalance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      User user0 = new User("Visitor", 1813, "Visitor", "", "Visitor");
      // Undeclared exception!
      try { 
        user0.setCreditBalance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      User user0 = new User("", 0, "", "", "");
      // Undeclared exception!
      try { 
        user0.refund(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      User user0 = new User();
      // Undeclared exception!
      try { 
        user0.getRate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      User user0 = new User("74|", 0, "74|", "", "74|");
      // Undeclared exception!
      try { 
        user0.chargeUser((String) null, (-308));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      User user0 = null;
      try {
        user0 = new User("[qK/W63B`{", 850, "[qK/W63B`{", (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      User user0 = new User("objects.Account", (-1795112073), "objects.Account", "-Ks5fZ,}RCW", "visitor");
      double double0 = user0.getRate();
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      User user0 = new User();
      user0.setAccountType("Visitor");
      double double0 = user0.getRate();
      assertEquals(15.0, user0.rate, 0.01);
      assertEquals(15.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      User user0 = new User("objects.Account", 2213, "objects.User", "Faculty", "Faculty");
      double double0 = user0.getRate();
      assertEquals(0, user0.creditBalnce);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
      assertEquals(8.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      User user0 = new User("UlMn?Qd+gN-Q-y9Z3U", (-1952257859), "UlMn?Qd+gN-Q-y9Z3U", "U\"7JU1;mig", "Student");
      double double0 = user0.getRate();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(5.0, double0, 0.01);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      User user0 = new User("Non-Faculty", 1643, "Non-Faculty", "Non-Faculty", "Non-Faculty");
      double double0 = user0.getRate();
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertFalse(user0.getApproved());
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      User user0 = new User();
      user0.chargeUser("creoit", 0);
      user0.refund(0);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      User user0 = new User();
      user0.chargeUser("debit", 0);
      user0.refund(0);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      User user0 = new User("objects.Account", 2213, "objects.User", "Faculty", "Faculty");
      // Undeclared exception!
      try { 
        user0.setDebitBalance("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      User user0 = new User();
      assertEquals(1000, user0.debitBalance);
      
      user0.setDebitBalance("0");
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      User user0 = new User("", (-2557), "", "kA94", "h%w=8bU");
      // Undeclared exception!
      try { 
        user0.setCreditBalance("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      User user0 = new User();
      assertEquals(0, user0.creditBalnce);
      
      user0.setCreditBalance("0");
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      User user0 = new User();
      user0.chargeUser("debit", (-453));
      assertEquals((-453), user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      User user0 = new User("Visitor", 2013, "Visitor", "Credit", "Visitor");
      user0.chargeUser("Credit", 2013);
      assertEquals(2013, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      User user0 = new User();
      user0.getApproved();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      User user0 = new User("+`'", 118, "credit", "+`'", "credit");
      int int0 = user0.getPrice();
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, int0);
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      User user0 = new User();
      user0.setParkingEndTime(user0.parkingStartTime);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      User user0 = new User();
      user0.getParkingSpotName();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      User user0 = new User("74|", 0, "74|", "", "74|");
      String string0 = user0.getCredittBalance();
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      User user0 = new User("X1oB'qI", 0, "X1oB'qI", "X1oB'qI", "X1oB'qI");
      user0.setCardNumber("X1oB'qI");
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertEquals(0.0, user0.rate, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      User user0 = new User();
      user0.getParkingStartTime();
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      User user0 = new User("X1oB'qI", 0, "X1oB'qI", "X1oB'qI", "X1oB'qI");
      user0.getCardName();
      assertEquals(1000, user0.debitBalance);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      User user0 = new User();
      user0.getParkingEndTime();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getDebitBalance();
      assertEquals(0, user0.parkingFee);
      assertEquals("1000", string0);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      User user0 = new User();
      user0.setPrice(0);
      assertEquals(0, user0.price);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      User user0 = new User();
      user0.setApproved(false);
      assertEquals(0, user0.creditBalnce);
      assertFalse(user0.getApproved());
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      User user0 = new User();
      user0.getCvvNumber();
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      User user0 = new User();
      user0.getLotName();
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      User user0 = new User();
      user0.getPlateNumber();
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      User user0 = new User();
      user0.getPaymentType();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      User user0 = new User("X1oB'qI", 0, "X1oB'qI", "X1oB'qI", "X1oB'qI");
      user0.setParkingStartTime((LocalDateTime) null);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0.0, user0.rate, 0.01);
      assertFalse(user0.getApproved());
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      User user0 = new User();
      user0.getEmail();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      User user0 = new User("+`'", 118, "credit", "+`'", "credit");
      user0.setPaymentType("credit");
      user0.refund(118);
      assertEquals((-118), user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      User user0 = new User();
      user0.getParkingLot();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.parkingFee);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      User user0 = new User();
      user0.setEmail((String) null);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      User user0 = new User();
      user0.setAccountType("'vSuS]9w&i2<%Z");
      user0.getAccountType();
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
      assertEquals(0, user0.parkingFee);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      User user0 = new User();
      user0.getAccountType();
      assertEquals(0, user0.parkingFee);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0, user0.creditBalnce);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      User user0 = new User("X1oB'qI", 0, "X1oB'qI", "X1oB'qI", "X1oB'qI");
      user0.getCardNumber();
      assertFalse(user0.getApproved());
      assertEquals(0, user0.creditBalnce);
      assertEquals(1000, user0.debitBalance);
      assertEquals(0.0, user0.rate, 0.01);
      assertEquals(0, user0.parkingFee);
  }
}
