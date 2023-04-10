package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        objects.Manager manager0 = controllers.ManagerController.generateManager();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = controllers.UserController.extendTime(291, (int) ' ');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str0 = controllers.UserController.getType();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controllers.UserController.addParkingSpot("Email not registered.", "hi!");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        objects.Manager manager0 = controllers.ManagerController.generateManagerWithPinPassword();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        views.ManageAccountsView manageAccountsView3 = new views.ManageAccountsView(main0);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        views.Main main0 = new views.Main();
        boolean boolean1 = main0.isUndecorated();
        int int2 = main0.getExtendedState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        views.EditBookingView editBookingView3 = new views.EditBookingView(main0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        password.Generator generator0 = new password.Generator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        generator0.generatePassword();
    }
}

