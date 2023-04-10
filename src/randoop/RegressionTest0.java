package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        controllers.LotController.resetLots();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        views.Main main0 = null;
        // The following exception was thrown during execution in test generation
        try {
            views.ManagerActionsView managerActionsView1 = new views.ManagerActionsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        controllers.UserController.clear();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        org.junit.Assert.assertNotNull(frameArray0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = javax.swing.JFrame.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        objects.SuperManager superManager3 = new objects.SuperManager("hi!", (-1), "hi!");
        java.lang.Class<?> wildcardClass4 = superManager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        controllers.UserController userController0 = new controllers.UserController();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Point point4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bethuneLotView1.contains(point4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.io.PrintStream printStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.event.WindowStateListener[] windowStateListenerArray6 = bethuneLotView5.getWindowStateListeners();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setComponentZOrder((java.awt.Component) bethuneLotView5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowStateListenerArray6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        bethuneLotView8.toBack();
        bethuneLotView8.setFocusableWindowState(true);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setComponentZOrder((java.awt.Component) bethuneLotView8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point5 = bethuneLotView1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        views.Main main0 = null;
        // The following exception was thrown during execution in test generation
        try {
            views.BookingActionsView bookingActionsView1 = new views.BookingActionsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        objects.Manager manager3 = new objects.Manager("", 6, "hi!");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.list(printWriter22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str2 = controllers.UserController.logInUser("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Rectangle rectangle22 = bethuneLotView13.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.createBufferStrategy((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        controllers.ManagerController.resetManager();
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Dimension dimension25 = null;
        java.awt.Dimension dimension26 = bethuneLotView24.getSize(dimension25);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component27 = bethuneLotView13.add("hi!", (java.awt.Component) bethuneLotView24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Rectangle rectangle22 = bethuneLotView13.getBounds();
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Font font25 = null;
        bethuneLotView24.setFont(font25);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior27 = bethuneLotView24.getBaselineResizeBehavior();
        bethuneLotView24.addNotify();
        bethuneLotView24.firePropertyChange("", '4', ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component33 = bethuneLotView13.add((java.awt.Component) bethuneLotView24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior27 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior27.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        bethuneLotView9.toBack();
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Dimension dimension15 = null;
        java.awt.Dimension dimension16 = bethuneLotView14.getSize(dimension15);
        bethuneLotView9.setMinimumSize(dimension16);
        java.awt.Point point18 = null;
        java.awt.Point point19 = bethuneLotView9.getLocation(point18);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component20 = bethuneLotView1.findComponentAt(point18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNotNull(point19);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.io.PrintStream printStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.Font font6 = null;
        bethuneLotView5.setFont(font6);
        bethuneLotView5.toBack();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Dimension dimension11 = null;
        java.awt.Dimension dimension12 = bethuneLotView10.getSize(dimension11);
        bethuneLotView5.setMinimumSize(dimension12);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component14 = bethuneLotView1.add((java.awt.Component) bethuneLotView5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.doLayout();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        float float12 = bethuneLotView1.getAlignmentY();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = bethuneLotView1.createVolatileImage((int) 'a', 10, imageCapabilities12);
        java.io.PrintStream printStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str1 = controllers.UserController.checkEmail("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Email invalid." + "'", str1, "Email invalid.");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        java.awt.Event event7 = null;
        boolean boolean10 = bethuneLotView1.mouseEnter(event7, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point11 = bethuneLotView1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        objects.Manager manager0 = new objects.Manager();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.ArrayList<objects.User> userList0 = controllers.UserController.getUnapprovedUsers();
        org.junit.Assert.assertNotNull(userList0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.enable(true);
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        bethuneLotView6.toBack();
        java.awt.Event event10 = null;
        boolean boolean13 = bethuneLotView6.mouseDrag(event10, 0, 1);
        java.awt.Image image14 = null;
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Font font19 = null;
        bethuneLotView18.setFont(font19);
        bethuneLotView18.toBack();
        java.awt.Event event22 = null;
        boolean boolean25 = bethuneLotView18.mouseDrag(event22, 0, 1);
        boolean boolean26 = bethuneLotView6.prepareImage(image14, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView18);
        java.awt.MenuBar menuBar27 = null;
        bethuneLotView18.setMenuBar(menuBar27);
        bethuneLotView18.firePropertyChange("", (long) (short) 100, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component33 = bethuneLotView1.add((java.awt.Component) bethuneLotView18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getCardNumber();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        controllers.UserController.clearUsers();
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.setState((int) (byte) 0);
        bethuneLotView1.enable(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.setState((int) (byte) 0);
        java.awt.Image image7 = null;
        boolean boolean13 = bethuneLotView1.imageUpdate(image7, 4, (int) (short) 10, 6, 16, 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str2 = controllers.UserController.addPlateNumber("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid plate number" + "'", str2, "Invalid plate number");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        boolean boolean2 = controllers.UserController.isSpotTaken("Email not registered.", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        controllers.LotController.removeLot("Email invalid.");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean2 = controllers.UserController.isSpotTaken("Email not registered.", "Email invalid.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        views.Main main0 = null;
        // The following exception was thrown during execution in test generation
        try {
            views.EditBookingView editBookingView1 = new views.EditBookingView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.countComponents();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str2 = controllers.UserController.logInUser("Invalid plate number", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point7 = bethuneLotView1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str5 = controllers.UserController.registerUser("Email not registered.", "hi!", "Invalid plate number", "Invalid plate number", "Email invalid.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email invalid." + "'", str5, "Email invalid.");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray10 = bethuneLotView1.getWindowFocusListeners();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowFocusListenerArray10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        java.awt.Graphics graphics8 = null;
        bethuneLotView1.paint(graphics8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
        bethuneLotView1.setFocusTraversalPolicy(focusTraversalPolicy11);
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Font font15 = null;
        bethuneLotView14.setFont(font15);
        int int17 = bethuneLotView14.getY();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component19 = bethuneLotView1.add((java.awt.Component) bethuneLotView14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str5 = controllers.UserController.registerUser("hi!", "Invalid plate number", "", "hi!", "Invalid plate number");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email invalid." + "'", str5, "Email invalid.");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        java.awt.LayoutManager layoutManager24 = null;
        bethuneLotView1.setLayout(layoutManager24);
        java.io.PrintStream printStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        boolean boolean5 = bethuneLotView1.isVisible();
        java.awt.Graphics graphics6 = null;
        bethuneLotView1.paintComponents(graphics6);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.cvvNumber;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        bethuneLotView6.toBack();
        java.awt.Event event10 = null;
        boolean boolean13 = bethuneLotView6.mouseDrag(event10, 0, 1);
        java.awt.Image image14 = null;
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Font font19 = null;
        bethuneLotView18.setFont(font19);
        bethuneLotView18.toBack();
        java.awt.Event event22 = null;
        boolean boolean25 = bethuneLotView18.mouseDrag(event22, 0, 1);
        boolean boolean26 = bethuneLotView6.prepareImage(image14, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView18);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray28 = bethuneLotView18.getPropertyChangeListeners("Email not registered.");
        bethuneLotView18.layout();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component30 = bethuneLotView1.add((java.awt.Component) bethuneLotView18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray28);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        int int6 = bethuneLotView1.getX();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1055 + "'", int6 == 1055);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.event.FocusListener focusListener5 = null;
        bethuneLotView1.addFocusListener(focusListener5);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        bethuneLotView1.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener26);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Font font30 = null;
        bethuneLotView29.setFont(font30);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        bethuneLotView29.addPropertyChangeListener("", propertyChangeListener33);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Point point38 = bethuneLotView36.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        bethuneLotView36.addHierarchyListener(hierarchyListener39);
        boolean boolean41 = bethuneLotView36.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer42 = null;
        java.awt.Image image43 = bethuneLotView36.createImage(imageProducer42);
        boolean boolean49 = bethuneLotView29.imageUpdate(image43, (int) (short) 10, 10, (-1), 3, 291);
        views.Main main50 = null;
        views.BethuneLotView bethuneLotView51 = new views.BethuneLotView(main50);
        java.awt.Font font52 = null;
        bethuneLotView51.setFont(font52);
        bethuneLotView51.toBack();
        java.awt.Event event55 = null;
        boolean boolean58 = bethuneLotView51.mouseDrag(event55, 0, 1);
        java.awt.Image image59 = null;
        views.Main main62 = null;
        views.BethuneLotView bethuneLotView63 = new views.BethuneLotView(main62);
        java.awt.Font font64 = null;
        bethuneLotView63.setFont(font64);
        bethuneLotView63.toBack();
        java.awt.Event event67 = null;
        boolean boolean70 = bethuneLotView63.mouseDrag(event67, 0, 1);
        boolean boolean71 = bethuneLotView51.prepareImage(image59, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView63);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = bethuneLotView1.prepareImage(image43, (java.awt.image.ImageObserver) bethuneLotView51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(image43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray24 = bethuneLotView1.getMouseMotionListeners();
        bethuneLotView1.reshape(0, (int) (byte) 1, 4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.applyResourceBundle("Email invalid.");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name Email invalid., locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray24);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str0 = controllers.LotController.getLotList();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Vanier,Bethune,Calumet,Schulich" + "'", str0, "Vanier,Bethune,Calumet,Schulich");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        int int12 = bethuneLotView1.getHeight();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 450 + "'", int12 == 450);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        objects.SuperManager superManager3 = new objects.SuperManager("Invalid plate number", (int) (short) -1, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str2 = controllers.UserController.logInUser("Email not registered.", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        bethuneLotView1.firePropertyChange("hi!", ' ', '4');
        java.awt.Component component22 = bethuneLotView1.locate((int) (byte) 0, (int) (short) 100);
        boolean boolean23 = component22.isVisible();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.MenuComponent menuComponent15 = null;
        bethuneLotView8.remove(menuComponent15);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        bethuneLotView13.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color28 = bethuneLotView13.getForeground();
        java.awt.Event event29 = null;
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        java.awt.Container container34 = bethuneLotView31.getFocusCycleRootAncestor();
        bethuneLotView31.setOpacity((float) (short) 1);
        java.awt.event.FocusListener[] focusListenerArray37 = bethuneLotView31.getFocusListeners();
        boolean boolean38 = bethuneLotView13.lostFocus(event29, (java.lang.Object) focusListenerArray37);
        boolean boolean39 = bethuneLotView13.isVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
        org.junit.Assert.assertNull(container34);
        org.junit.Assert.assertNotNull(focusListenerArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        boolean boolean34 = bethuneLotView29.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = bethuneLotView29.createImage(imageProducer35);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        bethuneLotView40.removeInputMethodListener(inputMethodListener44);
        int int46 = bethuneLotView1.checkImage(image36, 8, 291, (java.awt.image.ImageObserver) bethuneLotView40);
        boolean boolean47 = bethuneLotView40.isFocused();
        bethuneLotView40.pack();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.BufferCapabilities bufferCapabilities8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.createBufferStrategy((int) (short) 0, bufferCapabilities8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        bethuneLotView1.firePropertyChange("Email not registered.", (byte) -1, (byte) 0);
        java.awt.Window window28 = bethuneLotView1.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            window28.enableInputMethods(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(window28);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        boolean boolean5 = bethuneLotView1.isFocusOwner();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        bethuneLotView9.toBack();
        java.awt.Event event13 = null;
        boolean boolean16 = bethuneLotView9.mouseDrag(event13, 0, 1);
        bethuneLotView9.remove(0);
        bethuneLotView9.setFocusTraversalPolicyProvider(false);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView9);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        bethuneLotView9.addPropertyChangeListener("Email not registered.", propertyChangeListener23);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        bethuneLotView1.firePropertyChange("Email not registered.", (byte) -1, (byte) 0);
        boolean boolean28 = bethuneLotView1.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.reshape(291, 100, (int) '4', 450);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        controllers.LotController.removeLot("Honda");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        java.awt.MenuComponent menuComponent39 = null;
        bethuneLotView30.remove(menuComponent39);
        java.awt.Point point42 = bethuneLotView30.getMousePosition(true);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(point42);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Point point13 = bethuneLotView11.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener14 = null;
        bethuneLotView11.addHierarchyListener(hierarchyListener14);
        java.awt.event.WindowListener windowListener16 = null;
        bethuneLotView11.removeWindowListener(windowListener16);
        java.awt.event.WindowListener windowListener18 = null;
        bethuneLotView11.removeWindowListener(windowListener18);
        java.awt.Window.Type type20 = bethuneLotView11.getType();
        bethuneLotView1.setType(type20);
        java.awt.Event event22 = null;
        boolean boolean24 = bethuneLotView1.keyDown(event22, (int) (short) 1);
        boolean boolean25 = bethuneLotView1.isAutoRequestFocus();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + java.awt.Window.Type.NORMAL + "'", type20.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        bethuneLotView13.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color28 = bethuneLotView13.getForeground();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
        bethuneLotView13.addHierarchyBoundsListener(hierarchyBoundsListener29);
        java.util.ResourceBundle resourceBundle31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.applyResourceBundle(resourceBundle31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = controllers.UserController.checkEmail("Honda");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Email invalid." + "'", str1, "Email invalid.");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        objects.User user0 = controllers.UserController.getLoggedInUser();
        org.junit.Assert.assertNull(user0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        bethuneLotView13.hide();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        controllers.ManagerController managerController0 = new controllers.ManagerController();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        int int6 = bethuneLotView1.getX();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        bethuneLotView9.addHierarchyListener(hierarchyListener12);
        java.awt.GraphicsConfiguration graphicsConfiguration14 = bethuneLotView9.getGraphicsConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = bethuneLotView1.add("hi!", (java.awt.Component) bethuneLotView9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1055 + "'", int6 == 1055);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertNotNull(graphicsConfiguration14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        bethuneLotView1.removeMouseWheelListener(mouseWheelListener7);
        java.awt.Component[] componentArray9 = bethuneLotView1.getComponents();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(componentArray9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray13 = bethuneLotView1.getMouseMotionListeners();
        java.awt.ComponentOrientation componentOrientation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.applyComponentOrientation(componentOrientation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        objects.Manager manager0 = controllers.ManagerController.getLoggedInManager();
        org.junit.Assert.assertNull(manager0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        bethuneLotView1.setFocusableWindowState(true);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        bethuneLotView8.toBack();
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Dimension dimension14 = null;
        java.awt.Dimension dimension15 = bethuneLotView13.getSize(dimension14);
        bethuneLotView8.setMinimumSize(dimension15);
        java.awt.Point point17 = null;
        java.awt.Point point18 = bethuneLotView8.getLocation(point17);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component19 = bethuneLotView1.getComponentAt(point17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(point18);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str2 = controllers.UserController.logInUser("Invalid plate number", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        views.Main main2 = null;
        views.BethuneLotView bethuneLotView3 = new views.BethuneLotView(main2);
        java.awt.Point point5 = bethuneLotView3.getMousePosition(false);
        int int6 = bethuneLotView3.getHeight();
        // The following exception was thrown during execution in test generation
        try {
            lotChoiceView1.setContentPane((java.awt.Container) bethuneLotView3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 450 + "'", int6 == 450);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        user5.addPrice((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        views.Main main6 = null;
        views.BethuneLotView bethuneLotView7 = new views.BethuneLotView(main6);
        java.awt.Font font8 = null;
        bethuneLotView7.setFont(font8);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = bethuneLotView7.getBaselineResizeBehavior();
        java.awt.Image image11 = null;
        boolean boolean17 = bethuneLotView7.imageUpdate(image11, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar18 = null;
        bethuneLotView7.setMenuBar(menuBar18);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setGlassPane((java.awt.Component) bethuneLotView7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.Window.Type type10 = bethuneLotView1.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
        bethuneLotView1.addHierarchyBoundsListener(hierarchyBoundsListener11);
        java.awt.Color color13 = null;
        bethuneLotView1.setForeground(color13);
        java.awt.event.MouseListener mouseListener15 = null;
        bethuneLotView1.removeMouseListener(mouseListener15);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.awt.event.WindowListener windowListener5 = null;
        bethuneLotView1.removeWindowListener(windowListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component8 = bethuneLotView1.getComponent(291);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        objects.SuperManager superManager0 = new objects.SuperManager();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        boolean boolean3 = main0.isMaximumSizeSet();
        java.awt.Event event4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.deliverEvent(event4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        java.awt.Dialog.ModalExclusionType modalExclusionType9 = bethuneLotView6.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        bethuneLotView6.addPropertyChangeListener(propertyChangeListener10);
        java.awt.Component[] componentArray12 = bethuneLotView6.getComponents();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setContentPane((java.awt.Container) bethuneLotView6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + modalExclusionType9 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType9.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(componentArray12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        boolean boolean9 = controllers.UserController.approveUser(user5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Rectangle rectangle7 = bethuneLotView1.bounds();
        java.awt.BufferCapabilities bufferCapabilities9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.createBufferStrategy(10, bufferCapabilities9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            views.ManageAccountsView manageAccountsView6 = new views.ManageAccountsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        objects.Sensor sensor0 = new objects.Sensor();
        java.util.Random random1 = null;
        sensor0.rand1 = random1;
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        bethuneLotView30.setEnabled(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.io.PrintStream printStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream24, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String str2 = controllers.ManagerController.logInManager("Email invalid.", "Invalid plate number");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Account does not exist." + "'", str2, "Account does not exist.");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = bethuneLotView1.createVolatileImage((int) 'a', 10, imageCapabilities12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        bethuneLotView1.removePropertyChangeListener(propertyChangeListener14);
        java.awt.Event event16 = null;
        boolean boolean19 = bethuneLotView1.mouseEnter(event16, 6, 6);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        user5.setApproved(false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        java.awt.Window[] windowArray12 = bethuneLotView1.getOwnedWindows();
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.deliverEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowArray12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        boolean boolean34 = bethuneLotView29.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = bethuneLotView29.createImage(imageProducer35);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        bethuneLotView40.removeInputMethodListener(inputMethodListener44);
        int int46 = bethuneLotView1.checkImage(image36, 8, 291, (java.awt.image.ImageObserver) bethuneLotView40);
        bethuneLotView1.setBounds(1, 10, (int) ' ', 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        float float6 = bethuneLotView1.getAlignmentX();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = bethuneLotView1.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        bethuneLotView8.toBack();
        java.awt.Event event12 = null;
        boolean boolean15 = bethuneLotView8.mouseDrag(event12, 0, 1);
        java.awt.Image image16 = null;
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        bethuneLotView20.toBack();
        java.awt.Event event24 = null;
        boolean boolean27 = bethuneLotView20.mouseDrag(event24, 0, 1);
        boolean boolean28 = bethuneLotView8.prepareImage(image16, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView20);
        java.awt.Cursor cursor29 = null;
        bethuneLotView8.setCursor(cursor29);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray31 = bethuneLotView8.getWindowFocusListeners();
        boolean boolean34 = bethuneLotView8.contains((int) (short) 1, (int) (short) 10);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Point point38 = bethuneLotView36.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        bethuneLotView36.addHierarchyListener(hierarchyListener39);
        boolean boolean41 = bethuneLotView36.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer42 = null;
        java.awt.Image image43 = bethuneLotView36.createImage(imageProducer42);
        views.Main main46 = null;
        views.BethuneLotView bethuneLotView47 = new views.BethuneLotView(main46);
        java.awt.Dimension dimension48 = null;
        java.awt.Dimension dimension49 = bethuneLotView47.getSize(dimension48);
        java.awt.Dialog.ModalExclusionType modalExclusionType50 = bethuneLotView47.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        bethuneLotView47.removeInputMethodListener(inputMethodListener51);
        int int53 = bethuneLotView8.checkImage(image43, 8, 291, (java.awt.image.ImageObserver) bethuneLotView47);
        views.Main main56 = null;
        views.BethuneLotView bethuneLotView57 = new views.BethuneLotView(main56);
        java.awt.Dimension dimension58 = null;
        java.awt.Dimension dimension59 = bethuneLotView57.getSize(dimension58);
        java.awt.Dialog.ModalExclusionType modalExclusionType60 = bethuneLotView57.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        bethuneLotView57.addPropertyChangeListener(propertyChangeListener61);
        views.Main main63 = null;
        views.BethuneLotView bethuneLotView64 = new views.BethuneLotView(main63);
        java.awt.Dimension dimension65 = null;
        java.awt.Dimension dimension66 = bethuneLotView64.getSize(dimension65);
        java.awt.Dialog.ModalExclusionType modalExclusionType67 = bethuneLotView64.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        bethuneLotView64.addPropertyChangeListener(propertyChangeListener68);
        bethuneLotView57.remove((java.awt.Component) bethuneLotView64);
        java.awt.MenuComponent menuComponent71 = null;
        bethuneLotView57.remove(menuComponent71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = main0.prepareImage(image43, 291, (int) (short) 1, (java.awt.image.ImageObserver) bethuneLotView57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(image43);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + modalExclusionType50 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType50.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dimension59);
        org.junit.Assert.assertTrue("'" + modalExclusionType60 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType60.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension66);
        org.junit.Assert.assertTrue("'" + modalExclusionType67 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType67.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = null; // flaky: controllers.UserController.getRefundAmount();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int13 = bethuneLotView1.getY();
        java.awt.event.WindowListener windowListener14 = null;
        bethuneLotView1.addWindowListener(windowListener14);
        boolean boolean18 = bethuneLotView1.inside(1, (int) (byte) 100);
        java.awt.Component component19 = null;
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Point point23 = bethuneLotView21.getMousePosition(false);
        int int24 = bethuneLotView21.getHeight();
        java.awt.Event event25 = null;
        boolean boolean27 = bethuneLotView21.gotFocus(event25, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add(component19, (java.lang.Object) event25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 450 + "'", int24 == 450);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.ArrayList<objects.Manager> managerList0 = controllers.ManagerController.getManagers();
        org.junit.Assert.assertNotNull(managerList0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        java.lang.String str13 = bethuneLotView1.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "frame14" + "'", str13, "frame14");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        java.lang.Object obj10 = bethuneLotView1.getTreeLock();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        java.awt.LayoutManager layoutManager24 = null;
        bethuneLotView1.setLayout(layoutManager24);
        bethuneLotView1.setVisible(false);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Dimension dimension30 = null;
        java.awt.Dimension dimension31 = bethuneLotView29.getSize(dimension30);
        java.awt.Dialog.ModalExclusionType modalExclusionType32 = bethuneLotView29.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        bethuneLotView29.addPropertyChangeListener(propertyChangeListener33);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Dimension dimension37 = null;
        java.awt.Dimension dimension38 = bethuneLotView36.getSize(dimension37);
        java.awt.Dialog.ModalExclusionType modalExclusionType39 = bethuneLotView36.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        bethuneLotView36.addPropertyChangeListener(propertyChangeListener40);
        bethuneLotView29.remove((java.awt.Component) bethuneLotView36);
        java.awt.Rectangle rectangle43 = bethuneLotView29.getBounds();
        java.awt.Rectangle rectangle44 = bethuneLotView1.getBounds(rectangle43);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertTrue("'" + modalExclusionType32 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType32.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle43);
        org.junit.Assert.assertNotNull(rectangle44);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        controllers.UserController.load();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        bethuneLotView10.toBack();
        views.Main main14 = null;
        views.BethuneLotView bethuneLotView15 = new views.BethuneLotView(main14);
        java.awt.Dimension dimension16 = null;
        java.awt.Dimension dimension17 = bethuneLotView15.getSize(dimension16);
        bethuneLotView10.setMinimumSize(dimension17);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Point point22 = bethuneLotView20.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bethuneLotView20.addHierarchyListener(hierarchyListener23);
        java.awt.event.WindowListener windowListener25 = null;
        bethuneLotView20.removeWindowListener(windowListener25);
        java.awt.event.WindowListener windowListener27 = null;
        bethuneLotView20.removeWindowListener(windowListener27);
        java.awt.Window.Type type29 = bethuneLotView20.getType();
        bethuneLotView10.setType(type29);
        bethuneLotView1.setType(type29);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = bethuneLotView1.getBaseline((int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width and height must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNull(point22);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + java.awt.Window.Type.NORMAL + "'", type29.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        int int9 = bethuneLotView6.getY();
        bethuneLotView6.disable();
        boolean boolean11 = bethuneLotView6.isValidateRoot();
        java.awt.Font font12 = bethuneLotView6.getFont();
        java.awt.Graphics graphics13 = null;
        bethuneLotView6.update(graphics13);
        bethuneLotView1.setLocationRelativeTo((java.awt.Component) bethuneLotView6);
        javax.accessibility.AccessibleContext accessibleContext16 = bethuneLotView6.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 291 + "'", int9 == 291);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNotNull(accessibleContext16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        boolean boolean2 = controllers.UserController.isSpotTaken("Hyundai", "Honda");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.enable();
        java.awt.event.FocusListener focusListener12 = null;
        bethuneLotView1.removeFocusListener(focusListener12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        java.awt.Component component4 = main0.getGlassPane();
        org.junit.Assert.assertNotNull(component4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.MouseListener mouseListener10 = null;
        bethuneLotView1.addMouseListener(mouseListener10);
        java.awt.Container container12 = bethuneLotView1.getParent();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(container12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        javax.swing.JMenuBar jMenuBar10 = null;
        bethuneLotView1.setJMenuBar(jMenuBar10);
        java.awt.Graphics graphics12 = null;
        bethuneLotView1.update(graphics12);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        bethuneLotView30.setVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point41 = bethuneLotView30.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.setTitle("Invalid plate number");
        bethuneLotView13.reshape((int) (short) -1, (int) (short) 10, (int) (byte) 1, 1055);
        bethuneLotView13.firePropertyChange("hi!", (byte) 0, (byte) 0);
        float float35 = bethuneLotView13.getAlignmentY();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.5f + "'", float35 == 0.5f);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        java.lang.String str17 = user5.accountType;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        bethuneLotView1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        objects.SuperManager superManager3 = new objects.SuperManager("frame14", (int) '#', "frame9");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = bethuneLotView1.createVolatileImage((int) 'a', 10, imageCapabilities12);
        java.awt.AWTEvent aWTEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.dispatchEvent(aWTEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        bethuneLotView1.setResizable(true);
        java.awt.Graphics graphics9 = null;
        bethuneLotView1.printAll(graphics9);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setDefaultCloseOperation((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        boolean boolean10 = bethuneLotView1.isOpaque();
        views.Main main11 = new views.Main();
        java.awt.Cursor cursor12 = null;
        main11.setCursor(cursor12);
        boolean boolean16 = main11.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView17 = null; // flaky: new views.CheckoutView(main11);
        javax.swing.JTextField jTextField18 = null; // flaky: checkoutView17.cvvField;
        java.awt.Cursor cursor19 = null;
// flaky:         checkoutView17.setCursor(cursor19);
        views.Main main21 = new views.Main();
        java.awt.Cursor cursor22 = null;
        main21.setCursor(cursor22);
        boolean boolean26 = main21.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView27 = null; // flaky: new views.CheckoutView(main21);
        javax.swing.JTextField jTextField28 = null; // flaky: checkoutView27.cvvField;
        javax.swing.JLabel jLabel29 = null; // flaky: checkoutView27.nameCard;
// flaky:         checkoutView17.nameCard = jLabel29;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component32 = null; // flaky: bethuneLotView1.add((java.awt.Component) checkoutView17, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField28);
// flaky:         org.junit.Assert.assertNotNull(jLabel29);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        java.awt.Graphics graphics8 = null;
        bethuneLotView1.update(graphics8);
        java.io.PrintStream printStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        bethuneLotView1.addPropertyChangeListener("Email invalid.", propertyChangeListener25);
        java.awt.PopupMenu popupMenu27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add(popupMenu27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        int int17 = user5.debitBalance;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        bethuneLotView1.setResizable(true);
        java.awt.Graphics graphics9 = null;
        bethuneLotView1.printComponents(graphics9);
        int int11 = bethuneLotView1.getWidth();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 450 + "'", int11 == 450);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        java.awt.Event event39 = null;
        boolean boolean41 = bethuneLotView1.keyDown(event39, 5);
        java.io.PrintWriter printWriter42 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printWriter42, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        numberPasswordBuilder5.setLength();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        boolean boolean6 = bethuneLotView1.isBackgroundSet();
        java.awt.BufferCapabilities bufferCapabilities8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.createBufferStrategy((int) ' ', bufferCapabilities8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        int int6 = bethuneLotView1.getHeight();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 450 + "'", int6 == 450);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        int int6 = bethuneLotView1.getX();
        java.awt.event.ComponentListener componentListener7 = null;
        bethuneLotView1.addComponentListener(componentListener7);
        bethuneLotView1.setIgnoreRepaint(true);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1055 + "'", int6 == 1055);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.deliverEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = null; // flaky: checkoutView6.creditRadioButton;
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        bethuneLotView10.toBack();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             checkoutView6.setGlassPane((java.awt.Component) bethuneLotView10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        objects.User user0 = new objects.User();
        user0.parkingFee = 12;
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Point point10 = null;
        java.awt.Point point11 = bethuneLotView1.getLocation(point10);
        bethuneLotView1.firePropertyChange("Invalid plate number", 0L, (long) 8);
        java.awt.Color color16 = null;
        bethuneLotView1.setBackground(color16);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        java.time.LocalDateTime localDateTime17 = null;
        user5.setParkingEndTime(localDateTime17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        user5.paymentType = "hi!";
        user5.debitBalance = (short) 10;
        int int15 = user5.debitBalance;
        java.lang.String str16 = user5.parkingSpotName;
        java.time.LocalDateTime localDateTime17 = null;
        user5.setParkingStartTime(localDateTime17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Point point13 = bethuneLotView11.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener14 = null;
        bethuneLotView11.addHierarchyListener(hierarchyListener14);
        java.awt.event.WindowListener windowListener16 = null;
        bethuneLotView11.removeWindowListener(windowListener16);
        java.awt.event.WindowListener windowListener18 = null;
        bethuneLotView11.removeWindowListener(windowListener18);
        java.awt.Window.Type type20 = bethuneLotView11.getType();
        bethuneLotView1.setType(type20);
        boolean boolean22 = bethuneLotView1.isForegroundSet();
        java.awt.Graphics graphics23 = null;
        bethuneLotView1.paintComponents(graphics23);
        bethuneLotView1.list();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + java.awt.Window.Type.NORMAL + "'", type20.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.setTitle("Invalid plate number");
        java.awt.Font font26 = bethuneLotView13.getFont();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(font26);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        java.awt.Event event28 = null;
        boolean boolean31 = bethuneLotView1.mouseDown(event28, 11, 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Rectangle rectangle22 = bethuneLotView13.getBounds();
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Font font25 = null;
        bethuneLotView24.setFont(font25);
        bethuneLotView24.toBack();
        java.awt.Event event28 = null;
        boolean boolean31 = bethuneLotView24.mouseDrag(event28, 0, 1);
        java.awt.Image image32 = null;
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Font font37 = null;
        bethuneLotView36.setFont(font37);
        bethuneLotView36.toBack();
        java.awt.Event event40 = null;
        boolean boolean43 = bethuneLotView36.mouseDrag(event40, 0, 1);
        boolean boolean44 = bethuneLotView24.prepareImage(image32, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView36);
        bethuneLotView24.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.event.HierarchyListener hierarchyListener49 = null;
        bethuneLotView24.addHierarchyListener(hierarchyListener49);
        java.awt.event.KeyListener keyListener51 = null;
        bethuneLotView24.removeKeyListener(keyListener51);
        password.NumberPasswordBuilder numberPasswordBuilder53 = new password.NumberPasswordBuilder();
        password.Password password54 = numberPasswordBuilder53.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.add((java.awt.Component) bethuneLotView24, (java.lang.Object) password54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(password54);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        bethuneLotView1.removeAll();
        java.awt.Event event11 = null;
        objects.User user17 = new objects.User("hi!", (int) '4', "", "", "");
        double double18 = user17.getRate();
        java.lang.String str19 = user17.parkingSpotName;
        boolean boolean20 = bethuneLotView1.gotFocus(event11, (java.lang.Object) user17);
        java.awt.Event event21 = null;
        boolean boolean24 = bethuneLotView1.mouseExit(event21, (int) (short) 100, (int) (short) 10);
        java.awt.Shape shape25 = bethuneLotView1.getShape();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        numberPasswordBuilder1.setIncludeSymbols();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        generator0.generatePassword();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        bethuneLotView1.transferFocusDownCycle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        java.time.LocalDateTime localDateTime8 = user5.getParkingStartTime();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        bethuneLotView1.removeAll();
        boolean boolean11 = bethuneLotView1.isFocused();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        boolean boolean2 = controllers.UserController.isSpotTaken("Hyundai", "Email not registered.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        views.Main main0 = null;
        views.ManageLotsView manageLotsView1 = new views.ManageLotsView(main0);
        // The following exception was thrown during execution in test generation
        try {
            manageLotsView1.createBufferStrategy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        java.lang.String str10 = user5.getCredittBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        java.awt.Point point3 = main0.getMousePosition();
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        int int39 = bethuneLotView30.getComponentCount();
        boolean boolean40 = bethuneLotView30.isMinimumSizeSet();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        bethuneLotView1.removeMouseMotionListener(mouseMotionListener10);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        java.awt.Event event14 = null;
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        bethuneLotView16.toBack();
        java.awt.Event event20 = null;
        boolean boolean23 = bethuneLotView16.mouseDrag(event20, 0, 1);
        bethuneLotView16.remove(0);
        bethuneLotView16.doLayout();
        bethuneLotView16.disable();
        java.awt.Component component30 = bethuneLotView16.locate((int) (short) -1, 12);
        boolean boolean31 = bethuneLotView1.action(event14, (java.lang.Object) bethuneLotView16);
        javax.accessibility.AccessibleContext accessibleContext32 = bethuneLotView16.getAccessibleContext();
        java.awt.Component component35 = bethuneLotView16.getComponentAt(8, 64);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(accessibleContext32);
        org.junit.Assert.assertNotNull(component35);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        java.awt.Graphics graphics8 = null;
        bethuneLotView1.update(graphics8);
        java.awt.MenuBar menuBar10 = null;
        bethuneLotView1.setMenuBar(menuBar10);
        boolean boolean12 = bethuneLotView1.isMaximumSizeSet();
        java.awt.Component component15 = bethuneLotView1.getComponentAt((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(component15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getLotName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int13 = bethuneLotView1.getY();
        java.awt.event.WindowListener windowListener14 = null;
        bethuneLotView1.addWindowListener(windowListener14);
        boolean boolean18 = bethuneLotView1.inside(1, (int) (byte) 100);
        bethuneLotView1.disable();
        java.awt.PopupMenu popupMenu20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add(popupMenu20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        bethuneLotView9.toBack();
        java.awt.Event event13 = null;
        boolean boolean16 = bethuneLotView9.mouseDrag(event13, 0, 1);
        java.awt.Image image17 = null;
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        bethuneLotView21.toBack();
        java.awt.Event event25 = null;
        boolean boolean28 = bethuneLotView21.mouseDrag(event25, 0, 1);
        boolean boolean29 = bethuneLotView9.prepareImage(image17, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView21);
        java.awt.Rectangle rectangle30 = bethuneLotView21.getBounds();
        bethuneLotView1.setBounds(rectangle30);
        java.io.PrintStream printStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangle30);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.setTitle("Invalid plate number");
        java.awt.Container container26 = bethuneLotView13.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component.BaselineResizeBehavior baselineResizeBehavior27 = container26.getBaselineResizeBehavior();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(container26);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        numberPasswordBuilder5.setLength();
        numberPasswordBuilder5.setIncludeSymbols();
        numberPasswordBuilder5.setUpperCase();
        numberPasswordBuilder5.setLength();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        boolean boolean6 = bethuneLotView1.isBackgroundSet();
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        bethuneLotView8.toBack();
        java.awt.Event event12 = null;
        boolean boolean15 = bethuneLotView8.mouseDrag(event12, 0, 1);
        java.awt.Image image16 = null;
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        bethuneLotView20.toBack();
        java.awt.Event event24 = null;
        boolean boolean27 = bethuneLotView20.mouseDrag(event24, 0, 1);
        boolean boolean28 = bethuneLotView8.prepareImage(image16, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView20);
        java.awt.Cursor cursor29 = null;
        bethuneLotView8.setCursor(cursor29);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray31 = bethuneLotView8.getWindowFocusListeners();
        boolean boolean34 = bethuneLotView8.contains((int) (short) 1, (int) (short) 10);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Point point38 = bethuneLotView36.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        bethuneLotView36.addHierarchyListener(hierarchyListener39);
        boolean boolean41 = bethuneLotView36.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer42 = null;
        java.awt.Image image43 = bethuneLotView36.createImage(imageProducer42);
        views.Main main46 = null;
        views.BethuneLotView bethuneLotView47 = new views.BethuneLotView(main46);
        java.awt.Dimension dimension48 = null;
        java.awt.Dimension dimension49 = bethuneLotView47.getSize(dimension48);
        java.awt.Dialog.ModalExclusionType modalExclusionType50 = bethuneLotView47.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        bethuneLotView47.removeInputMethodListener(inputMethodListener51);
        int int53 = bethuneLotView8.checkImage(image43, 8, 291, (java.awt.image.ImageObserver) bethuneLotView47);
        views.Main main56 = new views.Main();
        java.awt.MenuComponent menuComponent57 = null;
        main56.remove(menuComponent57);
        main56.resetContentPane();
        int int60 = main56.getExtendedState();
        java.awt.Container container61 = main56.getOriginalContentPane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = bethuneLotView1.prepareImage(image43, 2, (int) (byte) 100, (java.awt.image.ImageObserver) main56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(image43);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + modalExclusionType50 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType50.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(container61);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        bethuneLotView8.repaint();
        java.awt.Component component18 = bethuneLotView8.locate(4, (int) ' ');
        java.awt.event.ComponentListener[] componentListenerArray19 = component18.getComponentListeners();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(componentListenerArray19);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = component15.isFontSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.setTitle("Invalid plate number");
        java.awt.Font font26 = bethuneLotView13.getFont();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        bethuneLotView13.addPropertyChangeListener("Vanier,Bethune,Calumet,Schulich", propertyChangeListener28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(font26);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        boolean boolean7 = bethuneLotView1.isCursorSet();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener8);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray10 = bethuneLotView1.getMouseWheelListeners();
        bethuneLotView1.setSize(3, 3);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        bethuneLotView13.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color28 = bethuneLotView13.getForeground();
        boolean boolean29 = bethuneLotView13.isAutoRequestFocus();
        javax.swing.JRootPane jRootPane30 = bethuneLotView13.getRootPane();
        java.awt.PopupMenu popupMenu31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.add(popupMenu31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jRootPane30);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        boolean boolean3 = bethuneLotView1.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingEndTime = localDateTime9;
        boolean boolean11 = controllers.UserController.approveUser(user5);
        user5.setCardNumber("Mercedes");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        user5.chargeUser("Vanier,Bethune,Calumet,Schulich", 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str5 = controllers.UserController.registerUser("frame9", "Mercedes", "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "Email not registered.", "Honda");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email invalid." + "'", str5, "Email invalid.");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        java.lang.String str9 = user5.getCardNumber();
        java.time.LocalDateTime localDateTime10 = null;
        user5.setParkingEndTime(localDateTime10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        int int9 = bethuneLotView6.getY();
        bethuneLotView6.disable();
        boolean boolean11 = bethuneLotView6.isValidateRoot();
        java.awt.Font font12 = bethuneLotView6.getFont();
        java.awt.Graphics graphics13 = null;
        bethuneLotView6.update(graphics13);
        bethuneLotView1.setLocationRelativeTo((java.awt.Component) bethuneLotView6);
        java.awt.Event event16 = null;
        boolean boolean19 = bethuneLotView1.mouseEnter(event16, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 291 + "'", int9 == 291);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             controllers.UserController.addParkingSpot("Honda", "Honda");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.awt.Cursor cursor11 = bethuneLotView1.getCursor();
        boolean boolean12 = bethuneLotView1.isValidateRoot();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        controllers.LotController.removeLot("0");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        boolean boolean2 = password0.getincludeLowerCase();
        password0.addLowerCase(true);
        boolean boolean5 = password0.getincludeLowerCase();
        java.lang.String str6 = password0.getPassword1();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.Window.Type type10 = bethuneLotView1.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
        bethuneLotView1.addHierarchyBoundsListener(hierarchyBoundsListener11);
        java.awt.Color color13 = null;
        bethuneLotView1.setForeground(color13);
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior19 = bethuneLotView16.getBaselineResizeBehavior();
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        int int24 = bethuneLotView21.getY();
        bethuneLotView21.disable();
        boolean boolean26 = bethuneLotView21.isValidateRoot();
        java.awt.Font font27 = bethuneLotView21.getFont();
        java.awt.Graphics graphics28 = null;
        bethuneLotView21.update(graphics28);
        bethuneLotView16.setLocationRelativeTo((java.awt.Component) bethuneLotView21);
        java.awt.image.BufferStrategy bufferStrategy31 = bethuneLotView21.getBufferStrategy();
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Dimension dimension34 = null;
        java.awt.Dimension dimension35 = bethuneLotView33.getSize(dimension34);
        java.awt.Dialog.ModalExclusionType modalExclusionType36 = bethuneLotView33.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener37 = null;
        bethuneLotView33.removeInputMethodListener(inputMethodListener37);
        java.awt.Rectangle rectangle39 = bethuneLotView33.bounds();
        javax.swing.JRootPane jRootPane40 = bethuneLotView33.getRootPane();
        views.Main main41 = null;
        views.BethuneLotView bethuneLotView42 = new views.BethuneLotView(main41);
        java.awt.Point point44 = bethuneLotView42.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener45 = null;
        bethuneLotView42.addHierarchyListener(hierarchyListener45);
        java.awt.event.WindowListener windowListener47 = null;
        bethuneLotView42.removeWindowListener(windowListener47);
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Font font51 = null;
        bethuneLotView50.setFont(font51);
        bethuneLotView50.toBack();
        java.awt.Event event54 = null;
        boolean boolean57 = bethuneLotView50.mouseDrag(event54, 0, 1);
        java.awt.Image image58 = null;
        views.Main main61 = null;
        views.BethuneLotView bethuneLotView62 = new views.BethuneLotView(main61);
        java.awt.Font font63 = null;
        bethuneLotView62.setFont(font63);
        bethuneLotView62.toBack();
        java.awt.Event event66 = null;
        boolean boolean69 = bethuneLotView62.mouseDrag(event66, 0, 1);
        boolean boolean70 = bethuneLotView50.prepareImage(image58, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView62);
        java.awt.Rectangle rectangle71 = bethuneLotView62.getBounds();
        bethuneLotView42.setBounds(rectangle71);
        java.awt.Rectangle rectangle73 = jRootPane40.getBounds(rectangle71);
        bethuneLotView21.setMaximizedBounds(rectangle73);
        bethuneLotView1.setLocationRelativeTo((java.awt.Component) bethuneLotView21);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior19 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior19.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(font27);
        org.junit.Assert.assertNull(bufferStrategy31);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertTrue("'" + modalExclusionType36 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType36.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle39);
        org.junit.Assert.assertNotNull(jRootPane40);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(rectangle71);
        org.junit.Assert.assertNotNull(rectangle73);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray24 = bethuneLotView1.getMouseMotionListeners();
        bethuneLotView1.reshape(0, (int) (byte) 1, 4, (int) (short) 100);
        java.awt.Rectangle rectangle30 = bethuneLotView1.getMaximizedBounds();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray24);
        org.junit.Assert.assertNull(rectangle30);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        java.awt.Graphics graphics8 = null;
        bethuneLotView1.update(graphics8);
        java.awt.MenuBar menuBar10 = null;
        bethuneLotView1.setMenuBar(menuBar10);
        boolean boolean12 = bethuneLotView1.isMaximumSizeSet();
        java.awt.GraphicsConfiguration graphicsConfiguration13 = bethuneLotView1.getGraphicsConfiguration();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(graphicsConfiguration13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        views.Main main2 = null;
        views.BethuneLotView bethuneLotView3 = new views.BethuneLotView(main2);
        java.awt.Font font4 = null;
        bethuneLotView3.setFont(font4);
        bethuneLotView3.toBack();
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        bethuneLotView3.setMinimumSize(dimension10);
        java.awt.Point point12 = null;
        java.awt.Point point13 = bethuneLotView3.getLocation(point12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = lotChoiceView1.contains(point12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNotNull(point13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        java.awt.peer.ComponentPeer componentPeer7 = bethuneLotView1.getPeer();
        java.awt.Window.Type type8 = bethuneLotView1.getType();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(componentPeer7);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + java.awt.Window.Type.NORMAL + "'", type8.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        java.awt.PopupMenu popupMenu39 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add(popupMenu39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        java.awt.Container container5 = main0.getOriginalContentPane();
        java.awt.event.MouseListener mouseListener6 = null;
        container5.removeMouseListener(mouseListener6);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray8 = container5.getMouseMotionListeners();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str2 = null; // flaky: controllers.UserController.extendTime((int) (byte) 10, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Can not change booking time" + "'", str2, "Can not change booking time");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Point point10 = bethuneLotView8.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        bethuneLotView8.addHierarchyListener(hierarchyListener11);
        boolean boolean13 = bethuneLotView8.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = bethuneLotView8.createImage(imageProducer14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Font font18 = null;
        bethuneLotView17.setFont(font18);
        bethuneLotView17.toBack();
        java.awt.Event event21 = null;
        boolean boolean24 = bethuneLotView17.mouseDrag(event21, 0, 1);
        bethuneLotView17.remove(0);
        bethuneLotView17.enable();
        int int28 = bethuneLotView1.checkImage(image15, (java.awt.image.ImageObserver) bethuneLotView17);
        java.awt.Font font29 = bethuneLotView17.getFont();
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = bethuneLotView31.getBaselineResizeBehavior();
        java.awt.Image image35 = null;
        boolean boolean41 = bethuneLotView31.imageUpdate(image35, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView17.setComponentZOrder((java.awt.Component) bethuneLotView31, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(font29);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        boolean boolean10 = bethuneLotView1.isOpaque();
        boolean boolean11 = bethuneLotView1.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        java.awt.Graphics graphics16 = null;
        bethuneLotView1.print(graphics16);
        boolean boolean18 = bethuneLotView1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        controllers.UserController.logOutUser();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Rectangle rectangle7 = bethuneLotView1.bounds();
        javax.swing.TransferHandler transferHandler8 = bethuneLotView1.getTransferHandler();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNull(transferHandler8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Point point10 = null;
        java.awt.Point point11 = bethuneLotView1.getLocation(point10);
        bethuneLotView1.nextFocus();
        int int13 = bethuneLotView1.getCursorType();
        bethuneLotView1.setLocationByPlatform(true);
        java.awt.event.WindowListener[] windowListenerArray16 = bethuneLotView1.getWindowListeners();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(windowListenerArray16);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean2 = controllers.UserController.isSpotTaken("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "Vanier,Bethune,Calumet,Schulich");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.ImageCapabilities imageCapabilities8 = null;
        java.awt.image.VolatileImage volatileImage9 = bethuneLotView1.createVolatileImage((int) (byte) 100, (int) (short) 1, imageCapabilities8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNull(volatileImage9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        boolean boolean6 = bethuneLotView1.isBackgroundSet();
        java.awt.event.FocusListener[] focusListenerArray7 = bethuneLotView1.getFocusListeners();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        bethuneLotView9.toBack();
        java.awt.Event event13 = null;
        boolean boolean16 = bethuneLotView9.mouseDrag(event13, 0, 1);
        java.awt.Image image17 = null;
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        bethuneLotView21.toBack();
        java.awt.Event event25 = null;
        boolean boolean28 = bethuneLotView21.mouseDrag(event25, 0, 1);
        boolean boolean29 = bethuneLotView9.prepareImage(image17, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView21);
        java.awt.MenuBar menuBar30 = null;
        bethuneLotView21.setMenuBar(menuBar30);
        bethuneLotView21.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color36 = bethuneLotView21.getForeground();
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Font font39 = null;
        bethuneLotView38.setFont(font39);
        bethuneLotView38.toBack();
        java.awt.Event event42 = null;
        boolean boolean45 = bethuneLotView38.mouseDrag(event42, 0, 1);
        java.awt.Image image46 = null;
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Font font51 = null;
        bethuneLotView50.setFont(font51);
        bethuneLotView50.toBack();
        java.awt.Event event54 = null;
        boolean boolean57 = bethuneLotView50.mouseDrag(event54, 0, 1);
        boolean boolean58 = bethuneLotView38.prepareImage(image46, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView50);
        java.awt.Cursor cursor59 = null;
        bethuneLotView38.setCursor(cursor59);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray61 = bethuneLotView38.getWindowFocusListeners();
        boolean boolean64 = bethuneLotView38.contains((int) (short) 1, (int) (short) 10);
        views.Main main65 = null;
        views.BethuneLotView bethuneLotView66 = new views.BethuneLotView(main65);
        java.awt.Point point68 = bethuneLotView66.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener69 = null;
        bethuneLotView66.addHierarchyListener(hierarchyListener69);
        boolean boolean71 = bethuneLotView66.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer72 = null;
        java.awt.Image image73 = bethuneLotView66.createImage(imageProducer72);
        views.Main main76 = null;
        views.BethuneLotView bethuneLotView77 = new views.BethuneLotView(main76);
        java.awt.Dimension dimension78 = null;
        java.awt.Dimension dimension79 = bethuneLotView77.getSize(dimension78);
        java.awt.Dialog.ModalExclusionType modalExclusionType80 = bethuneLotView77.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener81 = null;
        bethuneLotView77.removeInputMethodListener(inputMethodListener81);
        int int83 = bethuneLotView38.checkImage(image73, 8, 291, (java.awt.image.ImageObserver) bethuneLotView77);
        views.Main main86 = null;
        views.BethuneLotView bethuneLotView87 = new views.BethuneLotView(main86);
        java.awt.Font font88 = null;
        bethuneLotView87.setFont(font88);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior90 = bethuneLotView87.getBaselineResizeBehavior();
        bethuneLotView87.addNotify();
        bethuneLotView87.firePropertyChange("", '4', ' ');
        boolean boolean96 = bethuneLotView21.prepareImage(image73, (int) ' ', 0, (java.awt.image.ImageObserver) bethuneLotView87);
        java.awt.image.ImageObserver imageObserver97 = null;
        int int98 = bethuneLotView1.checkImage(image73, imageObserver97);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(focusListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(color36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(point68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(image73);
        org.junit.Assert.assertNotNull(dimension79);
        org.junit.Assert.assertTrue("'" + modalExclusionType80 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType80.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior90 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior90.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        bethuneLotView1.firePropertyChange("Email not registered.", (byte) -1, (byte) 0);
        java.awt.event.MouseListener[] mouseListenerArray28 = bethuneLotView1.getMouseListeners();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseListenerArray28);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             controllers.UserController.setPaymentType("Vanier,Bethune,Calumet,Schulich");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        bethuneLotView1.repaint((long) 10, (int) (short) -1, 1055, (int) '#', 1);
        bethuneLotView1.hide();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        boolean boolean7 = bethuneLotView1.isLightweight();
        bethuneLotView1.setAlwaysOnTop(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        boolean boolean34 = bethuneLotView29.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = bethuneLotView29.createImage(imageProducer35);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        bethuneLotView40.removeInputMethodListener(inputMethodListener44);
        int int46 = bethuneLotView1.checkImage(image36, 8, 291, (java.awt.image.ImageObserver) bethuneLotView40);
        boolean boolean47 = bethuneLotView40.isFocused();
        java.awt.Font font48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics49 = bethuneLotView40.getFontMetrics(font48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        bethuneLotView8.repaint();
        java.awt.Component component18 = bethuneLotView8.locate(4, (int) ' ');
        float float19 = bethuneLotView8.getAlignmentY();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        java.awt.Event event6 = null;
        boolean boolean9 = bethuneLotView1.mouseEnter(event6, 450, 3);
        boolean boolean10 = bethuneLotView1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.Graphics graphics10 = null;
        bethuneLotView1.printComponents(graphics10);
        java.awt.MenuComponent menuComponent12 = null;
        bethuneLotView1.remove(menuComponent12);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseDown(event4, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setDefaultCloseOperation(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             controllers.UserController.setPaymentType("0");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        java.awt.Window[] windowArray12 = bethuneLotView1.getOwnedWindows();
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Font font15 = null;
        bethuneLotView14.setFont(font15);
        int int17 = bethuneLotView14.getY();
        bethuneLotView14.disable();
        boolean boolean19 = bethuneLotView14.isValidateRoot();
        java.awt.Font font20 = bethuneLotView14.getFont();
        bethuneLotView1.setLocationRelativeTo((java.awt.Component) bethuneLotView14);
        java.awt.ComponentOrientation componentOrientation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView14.applyComponentOrientation(componentOrientation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(font20);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        bethuneLotView1.setOpacity((float) (short) 1);
        bethuneLotView1.setUndecorated(true);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener7);
        java.awt.Insets insets9 = bethuneLotView1.getInsets();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(insets9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        java.awt.Font font5 = null;
        bethuneLotView1.setFont(font5);
        bethuneLotView1.setBounds(12, (int) (byte) 100, 3, 4);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.Dimension dimension24 = bethuneLotView1.preferredSize();
        bethuneLotView1.setTitle("frame18");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Rectangle rectangle10 = bethuneLotView1.bounds();
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.deliverEvent(event11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(rectangle10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        java.awt.event.ComponentListener[] componentListenerArray7 = main0.getComponentListeners();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        main0.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(componentListenerArray7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setplateNumber("KIA");
        java.lang.String str8 = user5.getCvvNumber();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        objects.SuperManager superManager3 = new objects.SuperManager("Vanier,Bethune,Calumet,Schulich", (-1), "Hyundai");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Point point10 = null;
        java.awt.Point point11 = bethuneLotView1.getLocation(point10);
        bethuneLotView1.nextFocus();
        java.awt.im.InputContext inputContext13 = bethuneLotView1.getInputContext();
        boolean boolean14 = bethuneLotView1.isEnabled();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.parkingFee = (short) 10;
        user5.accountType = "Mercedes";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        boolean boolean39 = bethuneLotView1.isAlwaysOnTop();
        javax.swing.JRootPane jRootPane40 = bethuneLotView1.getRootPane();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jRootPane40);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.enable(true);
        java.awt.event.HierarchyListener hierarchyListener5 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener5);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.remove(1055);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1055");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        controllers.LotController.clear();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        bethuneLotView1.firePropertyChange("hi!", ' ', '4');
        bethuneLotView1.requestFocus();
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Font font23 = null;
        bethuneLotView22.setFont(font23);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = bethuneLotView22.getBaselineResizeBehavior();
        bethuneLotView22.addNotify();
        bethuneLotView22.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        bethuneLotView22.addPropertyChangeListener(propertyChangeListener31);
        java.awt.Graphics graphics33 = bethuneLotView22.getGraphics();
        bethuneLotView1.printComponents(graphics33);
        bethuneLotView1.setState((int) 'a');
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior25 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior25.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics33);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.lang.String str8 = user5.accountType;
        user5.email = "hi!";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        password0.addSymbols(false);
        password0.addUpperCase(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int13 = bethuneLotView1.getY();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener14);
        java.awt.ComponentOrientation componentOrientation16 = bethuneLotView1.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(componentOrientation16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = bethuneLotView6.getBaselineResizeBehavior();
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        int int14 = bethuneLotView11.getY();
        bethuneLotView11.disable();
        boolean boolean16 = bethuneLotView11.isValidateRoot();
        java.awt.Font font17 = bethuneLotView11.getFont();
        java.awt.Graphics graphics18 = null;
        bethuneLotView11.update(graphics18);
        bethuneLotView6.setLocationRelativeTo((java.awt.Component) bethuneLotView11);
        java.awt.image.BufferStrategy bufferStrategy21 = bethuneLotView11.getBufferStrategy();
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        bethuneLotView23.removeInputMethodListener(inputMethodListener27);
        java.awt.Rectangle rectangle29 = bethuneLotView23.bounds();
        javax.swing.JRootPane jRootPane30 = bethuneLotView23.getRootPane();
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Point point34 = bethuneLotView32.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener35 = null;
        bethuneLotView32.addHierarchyListener(hierarchyListener35);
        java.awt.event.WindowListener windowListener37 = null;
        bethuneLotView32.removeWindowListener(windowListener37);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Font font41 = null;
        bethuneLotView40.setFont(font41);
        bethuneLotView40.toBack();
        java.awt.Event event44 = null;
        boolean boolean47 = bethuneLotView40.mouseDrag(event44, 0, 1);
        java.awt.Image image48 = null;
        views.Main main51 = null;
        views.BethuneLotView bethuneLotView52 = new views.BethuneLotView(main51);
        java.awt.Font font53 = null;
        bethuneLotView52.setFont(font53);
        bethuneLotView52.toBack();
        java.awt.Event event56 = null;
        boolean boolean59 = bethuneLotView52.mouseDrag(event56, 0, 1);
        boolean boolean60 = bethuneLotView40.prepareImage(image48, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView52);
        java.awt.Rectangle rectangle61 = bethuneLotView52.getBounds();
        bethuneLotView32.setBounds(rectangle61);
        java.awt.Rectangle rectangle63 = jRootPane30.getBounds(rectangle61);
        bethuneLotView11.setMaximizedBounds(rectangle63);
        bethuneLotView1.setMaximizedBounds(rectangle63);
        java.awt.Component[] componentArray66 = bethuneLotView1.getComponents();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 291 + "'", int14 == 291);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(font17);
        org.junit.Assert.assertNull(bufferStrategy21);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(jRootPane30);
        org.junit.Assert.assertNull(point34);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(rectangle61);
        org.junit.Assert.assertNotNull(rectangle63);
        org.junit.Assert.assertNotNull(componentArray66);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        views.Main main6 = null;
        views.BethuneLotView bethuneLotView7 = new views.BethuneLotView(main6);
        java.awt.Font font8 = null;
        bethuneLotView7.setFont(font8);
        bethuneLotView7.toBack();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        bethuneLotView7.setMinimumSize(dimension14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        java.awt.event.WindowListener windowListener22 = null;
        bethuneLotView17.removeWindowListener(windowListener22);
        java.awt.event.WindowListener windowListener24 = null;
        bethuneLotView17.removeWindowListener(windowListener24);
        java.awt.Window.Type type26 = bethuneLotView17.getType();
        bethuneLotView7.setType(type26);
        bethuneLotView1.setType(type26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + java.awt.Window.Type.NORMAL + "'", type26.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        int int39 = bethuneLotView30.getComponentCount();
        int int40 = bethuneLotView30.getY();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 291 + "'", int40 == 291);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        bethuneLotView1.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener26);
        java.awt.event.KeyListener keyListener28 = null;
        bethuneLotView1.removeKeyListener(keyListener28);
        bethuneLotView1.setName("frame9");
        bethuneLotView1.setUndecorated(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.Event event10 = null;
        boolean boolean12 = bethuneLotView1.keyUp(event10, (int) (short) 0);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowListener windowListener24 = null;
        bethuneLotView1.addWindowListener(windowListener24);
        bethuneLotView1.firePropertyChange("Honda", (short) (byte) 0, (short) 10);
        javax.swing.JButton jButton30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setColorButton(jButton30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
// flaky:         checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = null; // flaky: new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = null; // flaky: checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = null; // flaky: checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = null; // flaky: checkoutView26.cvvField;
// flaky:         checkoutView6.cvvField = jTextField29;
        java.awt.event.KeyListener keyListener31 = null;
// flaky:         jTextField29.removeKeyListener(keyListener31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField27);
// flaky:         org.junit.Assert.assertNotNull(jLabel28);
// flaky:         org.junit.Assert.assertNotNull(jTextField29);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray24 = bethuneLotView1.getMouseMotionListeners();
        javax.swing.JRootPane jRootPane25 = bethuneLotView1.getRootPane();
        java.awt.Component component28 = jRootPane25.locate(11, 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray24);
        org.junit.Assert.assertNotNull(jRootPane25);
        org.junit.Assert.assertNull(component28);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = bethuneLotView1.createVolatileImage((int) (byte) -1, 10, imageCapabilities9);
        bethuneLotView1.invalidate();
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Dimension dimension19 = null;
        java.awt.Dimension dimension20 = bethuneLotView18.getSize(dimension19);
        bethuneLotView13.setMinimumSize(dimension20);
        java.awt.Point point22 = null;
        java.awt.Point point23 = bethuneLotView13.getLocation(point22);
        bethuneLotView13.nextFocus();
        int int25 = bethuneLotView13.getCursorType();
        bethuneLotView13.setLocationByPlatform(true);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setGlassPane((java.awt.Component) bethuneLotView13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseUp(event5, (int) '#', (int) (byte) 100);
        boolean boolean9 = bethuneLotView1.isUndecorated();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setUpperCase();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        password0.addSymbols(true);
        password0.setLength((int) '#');
        password0.addLowerCase(false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getName();
        java.time.LocalDateTime localDateTime12 = user5.getParkingStartTime();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        int int13 = bethuneLotView10.getY();
        bethuneLotView10.disable();
        java.awt.Dimension dimension15 = bethuneLotView10.getMinimumSize();
        main0.setMaximumSize(dimension15);
        // The following exception was thrown during execution in test generation
        try {
            main0.setCursor((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        java.awt.event.WindowListener windowListener11 = null;
        bethuneLotView1.addWindowListener(windowListener11);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        boolean boolean9 = bethuneLotView1.contains(5, 10);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printWriter10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        bethuneLotView8.repaint();
        javax.swing.JLayeredPane jLayeredPane16 = bethuneLotView8.getLayeredPane();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(jLayeredPane16);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray13 = bethuneLotView1.getMouseMotionListeners();
        bethuneLotView1.setIgnoreRepaint(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray13);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        java.awt.Event event6 = null;
        boolean boolean9 = bethuneLotView1.mouseEnter(event6, 450, 3);
        float float10 = bethuneLotView1.getAlignmentY();
        bethuneLotView1.repaint((long) 3, 32, 1, 3, (int) ' ');
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.MenuComponent menuComponent15 = null;
        bethuneLotView1.remove(menuComponent15);
        boolean boolean17 = bethuneLotView1.isOpaque();
        boolean boolean18 = bethuneLotView1.isActive();
        java.awt.dnd.DropTarget dropTarget19 = bethuneLotView1.getDropTarget();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dropTarget19);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        int int2 = password1.getLength();
        boolean boolean3 = password1.getincludeUpperCase();
        boolean boolean4 = password1.getIncludeNumbers();
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bethuneLotView1.getPropertyChangeListeners();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        bethuneLotView10.addPropertyChangeListener("", propertyChangeListener14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        boolean boolean22 = bethuneLotView17.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView17.createImage(imageProducer23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        bethuneLotView26.remove(0);
        bethuneLotView26.enable();
        int int37 = bethuneLotView10.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView26);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Point point41 = bethuneLotView39.getMousePosition(false);
        java.awt.Container container42 = bethuneLotView39.getFocusCycleRootAncestor();
        java.awt.Event event43 = null;
        java.lang.Object obj44 = null;
        boolean boolean45 = bethuneLotView39.lostFocus(event43, obj44);
        int int46 = bethuneLotView1.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView39);
        boolean boolean49 = bethuneLotView1.inside((int) 'a', 7);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.VolatileImage volatileImage52 = bethuneLotView1.createVolatileImage((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (1) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(point41);
        org.junit.Assert.assertNull(container42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        bethuneLotView1.setResizable(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = bethuneLotView1.getPropertyChangeListeners("");
        bethuneLotView1.transferFocusDownCycle();
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
// flaky:         checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = null; // flaky: checkoutView6.cardNumberField;
// flaky:         checkoutView6.price = "frame14";
        java.awt.im.InputContext inputContext23 = null; // flaky: checkoutView6.getInputContext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
// flaky:         org.junit.Assert.assertNotNull(jTextField20);
// flaky:         org.junit.Assert.assertNotNull(inputContext23);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        bethuneLotView1.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener9);
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        bethuneLotView12.show();
        bethuneLotView12.list();
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Dimension dimension21 = null;
        java.awt.Dimension dimension22 = bethuneLotView20.getSize(dimension21);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = bethuneLotView20.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        bethuneLotView20.removeInputMethodListener(inputMethodListener24);
        java.awt.Rectangle rectangle26 = bethuneLotView20.bounds();
        java.awt.Rectangle rectangle27 = bethuneLotView12.getBounds(rectangle26);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setGlassPane((java.awt.Component) bethuneLotView12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(rectangle27);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.Dimension dimension24 = bethuneLotView1.preferredSize();
        java.awt.Component component25 = bethuneLotView1.getFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNull(component25);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        java.lang.String str3 = lotChoiceView1.getLblMessage();
        java.awt.Font font4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics5 = lotChoiceView1.getFontMetrics(font4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        component12.move(7, 1055);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.awt.Cursor cursor11 = bethuneLotView1.getCursor();
        boolean boolean12 = bethuneLotView1.isValidateRoot();
        java.awt.MenuComponent menuComponent13 = null;
        bethuneLotView1.remove(menuComponent13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = bethuneLotView6.getBaselineResizeBehavior();
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        int int14 = bethuneLotView11.getY();
        bethuneLotView11.disable();
        boolean boolean16 = bethuneLotView11.isValidateRoot();
        java.awt.Font font17 = bethuneLotView11.getFont();
        java.awt.Graphics graphics18 = null;
        bethuneLotView11.update(graphics18);
        bethuneLotView6.setLocationRelativeTo((java.awt.Component) bethuneLotView11);
        java.awt.image.BufferStrategy bufferStrategy21 = bethuneLotView11.getBufferStrategy();
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        bethuneLotView23.removeInputMethodListener(inputMethodListener27);
        java.awt.Rectangle rectangle29 = bethuneLotView23.bounds();
        javax.swing.JRootPane jRootPane30 = bethuneLotView23.getRootPane();
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Point point34 = bethuneLotView32.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener35 = null;
        bethuneLotView32.addHierarchyListener(hierarchyListener35);
        java.awt.event.WindowListener windowListener37 = null;
        bethuneLotView32.removeWindowListener(windowListener37);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Font font41 = null;
        bethuneLotView40.setFont(font41);
        bethuneLotView40.toBack();
        java.awt.Event event44 = null;
        boolean boolean47 = bethuneLotView40.mouseDrag(event44, 0, 1);
        java.awt.Image image48 = null;
        views.Main main51 = null;
        views.BethuneLotView bethuneLotView52 = new views.BethuneLotView(main51);
        java.awt.Font font53 = null;
        bethuneLotView52.setFont(font53);
        bethuneLotView52.toBack();
        java.awt.Event event56 = null;
        boolean boolean59 = bethuneLotView52.mouseDrag(event56, 0, 1);
        boolean boolean60 = bethuneLotView40.prepareImage(image48, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView52);
        java.awt.Rectangle rectangle61 = bethuneLotView52.getBounds();
        bethuneLotView32.setBounds(rectangle61);
        java.awt.Rectangle rectangle63 = jRootPane30.getBounds(rectangle61);
        bethuneLotView11.setMaximizedBounds(rectangle63);
        bethuneLotView1.setMaximizedBounds(rectangle63);
        javax.accessibility.AccessibleContext accessibleContext66 = bethuneLotView1.getAccessibleContext();
        int int67 = bethuneLotView1.getState();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 291 + "'", int14 == 291);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(font17);
        org.junit.Assert.assertNull(bufferStrategy21);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(jRootPane30);
        org.junit.Assert.assertNull(point34);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(rectangle61);
        org.junit.Assert.assertNotNull(rectangle63);
        org.junit.Assert.assertNotNull(accessibleContext66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingEndTime = localDateTime9;
        java.lang.String str11 = user5.getPaymentType();
        java.lang.String str12 = user5.getAccountType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        float float5 = bethuneLotView1.getOpacity();
        boolean boolean6 = bethuneLotView1.isFocusable();
        java.awt.image.BufferStrategy bufferStrategy7 = bethuneLotView1.getBufferStrategy();
        boolean boolean8 = bethuneLotView1.isResizable();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        controllers.LotController lotController0 = new controllers.LotController();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        bethuneLotView1.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener26);
        java.awt.event.KeyListener keyListener28 = null;
        bethuneLotView1.removeKeyListener(keyListener28);
        bethuneLotView1.setName("frame9");
        bethuneLotView1.setResizable(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingEndTime = localDateTime9;
        java.time.LocalDateTime localDateTime11 = null;
        user5.parkingStartTime = localDateTime11;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        controllers.ManagerController.clear();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Toolkit toolkit22 = bethuneLotView13.getToolkit();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener23 = null;
        bethuneLotView13.addHierarchyBoundsListener(hierarchyBoundsListener23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(toolkit22);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Component component6 = bethuneLotView1.getGlassPane();
        boolean boolean7 = bethuneLotView1.requestFocusInWindow();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        boolean boolean2 = bethuneLotView1.isFocusableWindow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
// flaky:         checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        java.time.LocalDateTime localDateTime20 = null; // flaky: checkoutView6.endTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str2 = controllers.ManagerController.logInManager("Account does not exist.", "Honda");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Account does not exist." + "'", str2, "Account does not exist.");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setAccountType("YorkUParking - Bethune");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView25.removeWindowListener(windowListener30);
        bethuneLotView13.setLocationRelativeTo((java.awt.Component) bethuneLotView25);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = bethuneLotView25.getPropertyChangeListeners("Vanier,Bethune,Calumet,Schulich");
        bethuneLotView25.transferFocusBackward();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = bethuneLotView1.isUndecorated();
        boolean boolean8 = bethuneLotView1.isResizable();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        int int13 = bethuneLotView10.getY();
        bethuneLotView10.disable();
        java.awt.Dimension dimension15 = bethuneLotView10.getMinimumSize();
        bethuneLotView10.remove((int) (short) 0);
        bethuneLotView10.setLocationByPlatform(false);
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Point point23 = bethuneLotView21.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        bethuneLotView21.addHierarchyListener(hierarchyListener24);
        java.awt.event.WindowListener windowListener26 = null;
        bethuneLotView21.removeWindowListener(windowListener26);
        java.awt.event.WindowListener windowListener28 = null;
        bethuneLotView21.removeWindowListener(windowListener28);
        java.awt.event.MouseListener mouseListener30 = null;
        bethuneLotView21.addMouseListener(mouseListener30);
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Dimension dimension34 = null;
        java.awt.Dimension dimension35 = bethuneLotView33.getSize(dimension34);
        java.awt.Dialog.ModalExclusionType modalExclusionType36 = bethuneLotView33.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        bethuneLotView33.addPropertyChangeListener(propertyChangeListener37);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        bethuneLotView40.addPropertyChangeListener(propertyChangeListener44);
        bethuneLotView33.remove((java.awt.Component) bethuneLotView40);
        java.awt.Component component47 = bethuneLotView33.getFocusOwner();
        bethuneLotView33.firePropertyChange("hi!", ' ', '4');
        bethuneLotView33.requestFocus();
        views.Main main53 = null;
        views.BethuneLotView bethuneLotView54 = new views.BethuneLotView(main53);
        java.awt.Font font55 = null;
        bethuneLotView54.setFont(font55);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior57 = bethuneLotView54.getBaselineResizeBehavior();
        bethuneLotView54.addNotify();
        bethuneLotView54.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        bethuneLotView54.addPropertyChangeListener(propertyChangeListener63);
        java.awt.Graphics graphics65 = bethuneLotView54.getGraphics();
        bethuneLotView33.printComponents(graphics65);
        bethuneLotView21.printComponents(graphics65);
        bethuneLotView10.update(graphics65);
        bethuneLotView1.paint(graphics65);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertTrue("'" + modalExclusionType36 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType36.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component47);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior57 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior57.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics65);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        bethuneLotView1.show(true);
        java.awt.Event event6 = null;
        java.lang.Object obj7 = null;
        boolean boolean8 = bethuneLotView1.action(event6, obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = bethuneLotView1.getComponent(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
// flaky:         checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = null; // flaky: new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = null; // flaky: checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = null; // flaky: checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = null; // flaky: checkoutView26.cvvField;
// flaky:         checkoutView6.cvvField = jTextField29;
        int int31 = 0; // flaky: checkoutView6.getDefaultCloseOperation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField27);
// flaky:         org.junit.Assert.assertNotNull(jLabel28);
// flaky:         org.junit.Assert.assertNotNull(jTextField29);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        bethuneLotView8.repaint();
        java.awt.Component component18 = bethuneLotView8.locate(4, (int) ' ');
        bethuneLotView8.repaint((long) 291);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        java.awt.event.KeyListener keyListener6 = null;
        bethuneLotView1.removeKeyListener(keyListener6);
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        bethuneLotView1.repaint((-1), (int) (short) -1, (int) (short) 0, 0);
        bethuneLotView1.disable();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        java.awt.event.ComponentListener[] componentListenerArray7 = main0.getComponentListeners();
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.list(printStream8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(componentListenerArray7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        java.lang.String str17 = user5.getCardNumber();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        java.awt.peer.ComponentPeer componentPeer7 = bethuneLotView1.getPeer();
        java.awt.event.ComponentListener[] componentListenerArray8 = bethuneLotView1.getComponentListeners();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(componentPeer7);
        org.junit.Assert.assertNotNull(componentListenerArray8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        java.awt.Event event6 = null;
        boolean boolean9 = bethuneLotView1.mouseEnter(event6, 450, 3);
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = bethuneLotView11.getBaselineResizeBehavior();
        bethuneLotView11.addNotify();
        bethuneLotView11.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener20 = null;
        bethuneLotView11.removeWindowListener(windowListener20);
        bethuneLotView11.setTitle("Vanier,Bethune,Calumet,Schulich");
        java.awt.Dimension dimension24 = bethuneLotView11.getMaximumSize();
        bethuneLotView1.resize(dimension24);
        views.Main main26 = null;
        views.BethuneLotView bethuneLotView27 = new views.BethuneLotView(main26);
        java.awt.Dimension dimension28 = null;
        java.awt.Dimension dimension29 = bethuneLotView27.getSize(dimension28);
        java.awt.Dialog.ModalExclusionType modalExclusionType30 = bethuneLotView27.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        bethuneLotView27.removeInputMethodListener(inputMethodListener31);
        java.awt.Rectangle rectangle33 = bethuneLotView27.bounds();
        javax.swing.JRootPane jRootPane34 = bethuneLotView27.getRootPane();
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Point point38 = bethuneLotView36.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        bethuneLotView36.addHierarchyListener(hierarchyListener39);
        java.awt.event.WindowListener windowListener41 = null;
        bethuneLotView36.removeWindowListener(windowListener41);
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Font font45 = null;
        bethuneLotView44.setFont(font45);
        bethuneLotView44.toBack();
        java.awt.Event event48 = null;
        boolean boolean51 = bethuneLotView44.mouseDrag(event48, 0, 1);
        java.awt.Image image52 = null;
        views.Main main55 = null;
        views.BethuneLotView bethuneLotView56 = new views.BethuneLotView(main55);
        java.awt.Font font57 = null;
        bethuneLotView56.setFont(font57);
        bethuneLotView56.toBack();
        java.awt.Event event60 = null;
        boolean boolean63 = bethuneLotView56.mouseDrag(event60, 0, 1);
        boolean boolean64 = bethuneLotView44.prepareImage(image52, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView56);
        java.awt.Rectangle rectangle65 = bethuneLotView56.getBounds();
        bethuneLotView36.setBounds(rectangle65);
        java.awt.Rectangle rectangle67 = jRootPane34.getBounds(rectangle65);
        bethuneLotView1.setMaximizedBounds(rectangle65);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + modalExclusionType30 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType30.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNotNull(jRootPane34);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rectangle65);
        org.junit.Assert.assertNotNull(rectangle67);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        bethuneLotView1.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.Dimension dimension26 = bethuneLotView1.minimumSize();
        float float27 = bethuneLotView1.getAlignmentY();
        java.awt.Event event28 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.deliverEvent(event28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = null; // flaky: new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = null; // flaky: checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = null; // flaky: new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = null; // flaky: checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
// flaky:         checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = null; // flaky: new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = null; // flaky: checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = null; // flaky: checkoutView32.nameCard;
// flaky:         checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = null; // flaky: new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = null; // flaky: checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = null; // flaky: checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = null; // flaky: checkoutView42.cvvField;
// flaky:         checkoutView22.cvvField = jTextField45;
// flaky:         checkoutView14.cardNumberField = jTextField45;
// flaky:         checkoutView6.nameCardField = jTextField45;
        java.awt.Rectangle rectangle49 = null; // flaky: jTextField45.getBounds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField33);
// flaky:         org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField43);
// flaky:         org.junit.Assert.assertNotNull(jLabel44);
// flaky:         org.junit.Assert.assertNotNull(jTextField45);
// flaky:         org.junit.Assert.assertNotNull(rectangle49);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String str2 = controllers.UserController.logInUser("Mercedes", "BMW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseMove(event5, (int) '#', 4);
        bethuneLotView1.toBack();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        boolean boolean7 = bethuneLotView1.isFocusable();
        java.awt.Container container8 = bethuneLotView1.getFocusCycleRootAncestor();
        int int9 = bethuneLotView1.getDefaultCloseOperation();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(container8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.setVisible(true);
        main0.resetContentPane();
        boolean boolean8 = main0.isFocused();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        boolean boolean34 = bethuneLotView29.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = bethuneLotView29.createImage(imageProducer35);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        bethuneLotView40.removeInputMethodListener(inputMethodListener44);
        int int46 = bethuneLotView1.checkImage(image36, 8, 291, (java.awt.image.ImageObserver) bethuneLotView40);
        java.awt.Point point47 = bethuneLotView1.getMousePosition();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(point47);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        controllers.LotController.removeLot("Account does not exist.");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        int int39 = bethuneLotView30.getComponentCount();
        bethuneLotView30.setBounds(32, (int) (byte) 100, 4, (-1));
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        java.awt.Graphics graphics7 = null;
        bethuneLotView1.update(graphics7);
        java.awt.Event event9 = null;
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        boolean boolean14 = bethuneLotView11.isOpaque();
        bethuneLotView11.repaint();
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView11.removeHierarchyListener(hierarchyListener16);
        boolean boolean18 = bethuneLotView1.gotFocus(event9, (java.lang.Object) bethuneLotView11);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.applyResourceBundle("Sedan");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name Sedan, locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setParkingSpot("Email invalid.");
        java.time.LocalDateTime localDateTime11 = user5.parkingEndTime;
        boolean boolean12 = user5.getApproved();
        user5.setAccountType("Sedan");
        java.lang.String str15 = user5.getLotName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        bethuneLotView1.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener26);
        java.awt.event.KeyListener keyListener28 = null;
        bethuneLotView1.removeKeyListener(keyListener28);
        bethuneLotView1.setName("frame9");
        int int32 = bethuneLotView1.countComponents();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseUp(event5, (int) '#', (int) (byte) 100);
        bethuneLotView1.setFocusTraversalKeysEnabled(false);
        bethuneLotView1.show(true);
        java.awt.Dimension dimension13 = bethuneLotView1.getMinimumSize();
        java.lang.Object obj14 = bethuneLotView1.getTreeLock();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = bethuneLotView9.getSize(dimension10);
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = bethuneLotView9.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        bethuneLotView9.removeInputMethodListener(inputMethodListener13);
        java.awt.Rectangle rectangle15 = bethuneLotView9.bounds();
        java.awt.Rectangle rectangle16 = bethuneLotView1.getBounds(rectangle15);
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Font font19 = null;
        bethuneLotView18.setFont(font19);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        bethuneLotView18.addPropertyChangeListener("", propertyChangeListener22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        boolean boolean30 = bethuneLotView25.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer31 = null;
        java.awt.Image image32 = bethuneLotView25.createImage(imageProducer31);
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Font font35 = null;
        bethuneLotView34.setFont(font35);
        bethuneLotView34.toBack();
        java.awt.Event event38 = null;
        boolean boolean41 = bethuneLotView34.mouseDrag(event38, 0, 1);
        bethuneLotView34.remove(0);
        bethuneLotView34.enable();
        int int45 = bethuneLotView18.checkImage(image32, (java.awt.image.ImageObserver) bethuneLotView34);
        views.Main main46 = new views.Main();
        java.awt.MenuComponent menuComponent47 = null;
        main46.remove(menuComponent47);
        main46.resetContentPane();
        int int50 = main46.getExtendedState();
        main46.enable(true);
        java.awt.Component component53 = main46.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView54 = new views.LotChoiceView(main46);
        views.LassondeLotView lassondeLotView55 = new views.LassondeLotView(main46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = bethuneLotView1.prepareImage(image32, (java.awt.image.ImageObserver) lassondeLotView55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + modalExclusionType12 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType12.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(image32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(component53);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        bethuneLotView1.layout();
        java.awt.event.WindowListener windowListener29 = null;
        bethuneLotView1.removeWindowListener(windowListener29);
        boolean boolean31 = bethuneLotView1.isLocationByPlatform();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Sensor sensor2 = new objects.Sensor();
        java.lang.String str3 = sensor2.getRandArrayElement2();
        java.util.Random random4 = null;
        sensor2.rand2 = random4;
        parkingSpot1.setSensor(sensor2);
        parkingSpot1.code = "";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mercedes" + "'", str3, "Mercedes");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.parkingFee = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            user5.setCreditBalance("Honda");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Honda\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        int int11 = user5.debitBalance;
        java.time.LocalDateTime localDateTime12 = null;
        user5.parkingStartTime = localDateTime12;
        java.time.LocalDateTime localDateTime14 = null;
        user5.parkingEndTime = localDateTime14;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        user5.chargeUser("Account does not exist.", 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = null; // flaky: new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = null; // flaky: checkoutView14.cardNumberField;
        javax.swing.JRadioButton jRadioButton16 = null;
// flaky:         checkoutView14.debitRadioButton = jRadioButton16;
        views.Main main18 = new views.Main();
        java.awt.Cursor cursor19 = null;
        main18.setCursor(cursor19);
        boolean boolean23 = main18.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView24 = null; // flaky: new views.CheckoutView(main18);
        javax.swing.JTextField jTextField25 = null; // flaky: checkoutView24.cvvField;
        javax.swing.JLabel jLabel26 = null; // flaky: checkoutView24.nameCard;
// flaky:         checkoutView14.nameCard = jLabel26;
// flaky:         checkoutView6.cvvLabel = jLabel26;
// flaky:         jLabel26.validate();
        int int32 = 0; // flaky: jLabel26.getBaseline(2, 291);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField25);
// flaky:         org.junit.Assert.assertNotNull(jLabel26);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 150 + "'", int32 == 150);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.doLayout();
        bethuneLotView1.disable();
        java.awt.Component component15 = bethuneLotView1.locate((int) (short) -1, 12);
        float float16 = bethuneLotView1.getAlignmentY();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        java.time.LocalDateTime localDateTime8 = null; // flaky: checkoutView6.startTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        bethuneLotView1.firePropertyChange("hi!", ' ', '4');
        bethuneLotView1.requestFocus();
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Font font23 = null;
        bethuneLotView22.setFont(font23);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = bethuneLotView22.getBaselineResizeBehavior();
        bethuneLotView22.addNotify();
        bethuneLotView22.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        bethuneLotView22.addPropertyChangeListener(propertyChangeListener31);
        java.awt.Graphics graphics33 = bethuneLotView22.getGraphics();
        bethuneLotView1.printComponents(graphics33);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Point point38 = bethuneLotView36.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        bethuneLotView36.addHierarchyListener(hierarchyListener39);
        bethuneLotView36.show();
        bethuneLotView36.list();
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Font font45 = null;
        bethuneLotView44.setFont(font45);
        bethuneLotView44.toBack();
        java.awt.Event event48 = null;
        boolean boolean51 = bethuneLotView44.mouseDrag(event48, 0, 1);
        bethuneLotView44.remove(0);
        bethuneLotView44.setFocusTraversalPolicyProvider(false);
        bethuneLotView36.remove((java.awt.Component) bethuneLotView44);
        java.awt.Color color57 = bethuneLotView36.getBackground();
        bethuneLotView1.setBackground(color57);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior25 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior25.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics33);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        bethuneLotView1.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener9);
        bethuneLotView1.layout();
        views.Main main12 = new views.Main();
        java.awt.Cursor cursor13 = null;
        main12.setCursor(cursor13);
        boolean boolean17 = main12.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView18 = null; // flaky: new views.CheckoutView(main12);
        javax.swing.JTextField jTextField19 = null; // flaky: checkoutView18.cardNumberField;
        java.util.Locale locale20 = null;
// flaky:         checkoutView18.setLocale(locale20);
        javax.swing.JButton jButton22 = null; // flaky: checkoutView18.backButton;
// flaky:         bethuneLotView1.setColorButton(jButton22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        int int28 = bethuneLotView25.getHeight();
        java.awt.event.HierarchyListener hierarchyListener29 = null;
        bethuneLotView25.removeHierarchyListener(hierarchyListener29);
        bethuneLotView25.repaint((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component34 = null; // flaky: jButton22.add((java.awt.Component) bethuneLotView25, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField19);
// flaky:         org.junit.Assert.assertNotNull(jButton22);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 450 + "'", int28 == 450);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Toolkit toolkit22 = bethuneLotView13.getToolkit();
        bethuneLotView13.firePropertyChange("KIA", (double) (byte) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(toolkit22);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.util.ArrayList<objects.User> userList2 = controllers.UserController.getUsers();
        maintainLot0.users = userList2;
        model.MaintainLot maintainLot4 = model.MaintainLot.getInstance();
        maintainLot4.clear();
        java.util.ArrayList<objects.User> userList6 = controllers.UserController.getUsers();
        maintainLot4.users = userList6;
        maintainLot0.users = userList6;
        org.junit.Assert.assertNotNull(maintainLot0);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(maintainLot4);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        bethuneLotView1.repaint((-1), (int) (short) -1, (int) (short) 0, 0);
        java.awt.Container container14 = bethuneLotView1.getFocusCycleRootAncestor();
        bethuneLotView1.removeAll();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNull(container14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        bethuneLotView1.setResizable(true);
        int int9 = bethuneLotView1.getWidth();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 450 + "'", int9 == 450);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
// flaky:         checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = null; // flaky: checkoutView6.cardNumberLabel;
        java.awt.event.KeyListener keyListener11 = null;
// flaky:         jLabel10.addKeyListener(keyListener11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jLabel10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        boolean boolean2 = main0.isEnabled();
        main0.resetContentPane();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setplateNumber("KIA");
        user5.accountType = "frame9";
        user5.accountType = "BMW";
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        int int9 = bethuneLotView1.getHeight();
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Dimension dimension12 = null;
        java.awt.Dimension dimension13 = bethuneLotView11.getSize(dimension12);
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = bethuneLotView11.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        bethuneLotView11.addPropertyChangeListener(propertyChangeListener15);
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Dimension dimension19 = null;
        java.awt.Dimension dimension20 = bethuneLotView18.getSize(dimension19);
        java.awt.Dialog.ModalExclusionType modalExclusionType21 = bethuneLotView18.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        bethuneLotView18.addPropertyChangeListener(propertyChangeListener22);
        bethuneLotView11.remove((java.awt.Component) bethuneLotView18);
        java.awt.Component component25 = bethuneLotView11.getFocusOwner();
        java.awt.Dimension dimension26 = bethuneLotView11.getPreferredSize();
        bethuneLotView1.setSize(dimension26);
        bethuneLotView1.nextFocus();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 450 + "'", int9 == 450);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + modalExclusionType14 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType14.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + modalExclusionType21 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType21.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component25);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        boolean boolean2 = password0.getincludeLowerCase();
        password0.addLowerCase(true);
        password0.addLowerCase(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        user5.parkingFee = 10;
        boolean boolean12 = user5.getApproved();
        user5.email = "Vanier,Bethune";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean3 = main0.requestFocusInWindow();
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.Font font6 = null;
        bethuneLotView5.setFont(font6);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = bethuneLotView5.getBaselineResizeBehavior();
        bethuneLotView5.addNotify();
        boolean boolean10 = bethuneLotView5.isLocationByPlatform();
        bethuneLotView5.reshape((int) (byte) 10, 100, (int) '#', 1);
        boolean boolean16 = bethuneLotView5.isFocusCycleRoot();
        objects.User user22 = new objects.User("YorkUParking - Bethune", (int) (short) 100, "frame9", "Invalid plate number", "Account does not exist.");
        // The following exception was thrown during execution in test generation
        try {
            main0.add((java.awt.Component) bethuneLotView5, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setplateNumber("KIA");
        user5.accountType = "frame9";
        user5.accountType = "Minivan";
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.Dimension dimension24 = bethuneLotView1.preferredSize();
        int int25 = bethuneLotView1.getCursorType();
        boolean boolean26 = bethuneLotView1.isMinimumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        views.Main main3 = null;
        views.BethuneLotView bethuneLotView4 = new views.BethuneLotView(main3);
        java.awt.Point point6 = bethuneLotView4.getMousePosition(false);
        java.lang.String str7 = bethuneLotView4.getWarningString();
        java.awt.Font font8 = null;
        bethuneLotView4.setFont(font8);
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView4, "KIA");
        views.RegisterView registerView12 = new views.RegisterView(main0);
        boolean boolean13 = registerView12.isLocationByPlatform();
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        java.lang.String str9 = user5.getPassword();
        user5.setCardNumber("");
        user5.setAccountType("");
        java.time.LocalDateTime localDateTime14 = null;
        user5.parkingEndTime = localDateTime14;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        maintainLot0.lotOptions = "Minivan";
        org.junit.Assert.assertNotNull(maintainLot0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bethuneLotView1.getPropertyChangeListeners();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        bethuneLotView10.addPropertyChangeListener("", propertyChangeListener14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        boolean boolean22 = bethuneLotView17.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView17.createImage(imageProducer23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        bethuneLotView26.remove(0);
        bethuneLotView26.enable();
        int int37 = bethuneLotView10.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView26);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Point point41 = bethuneLotView39.getMousePosition(false);
        java.awt.Container container42 = bethuneLotView39.getFocusCycleRootAncestor();
        java.awt.Event event43 = null;
        java.lang.Object obj44 = null;
        boolean boolean45 = bethuneLotView39.lostFocus(event43, obj44);
        int int46 = bethuneLotView1.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView39);
        java.awt.Rectangle rectangle47 = bethuneLotView1.bounds();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(point41);
        org.junit.Assert.assertNull(container42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(rectangle47);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        boolean boolean7 = bethuneLotView1.isCursorSet();
        java.awt.event.FocusListener focusListener8 = null;
        bethuneLotView1.addFocusListener(focusListener8);
        bethuneLotView1.setFocusable(false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        boolean boolean6 = bethuneLotView1.isFocusTraversalPolicySet();
        boolean boolean7 = bethuneLotView1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.getFocusableWindowState();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        bethuneLotView12.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = bethuneLotView12.isFocusable();
        java.awt.Container container19 = bethuneLotView12.getFocusCycleRootAncestor();
        boolean boolean20 = bethuneLotView1.isAncestorOf((java.awt.Component) bethuneLotView12);
        bethuneLotView1.resize(8, 6);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        float float7 = bethuneLotView1.getAlignmentX();
        javax.swing.JButton jButton8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setColorButton(jButton8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        boolean boolean34 = bethuneLotView29.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = bethuneLotView29.createImage(imageProducer35);
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Dimension dimension41 = null;
        java.awt.Dimension dimension42 = bethuneLotView40.getSize(dimension41);
        java.awt.Dialog.ModalExclusionType modalExclusionType43 = bethuneLotView40.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        bethuneLotView40.removeInputMethodListener(inputMethodListener44);
        int int46 = bethuneLotView1.checkImage(image36, 8, 291, (java.awt.image.ImageObserver) bethuneLotView40);
        boolean boolean47 = bethuneLotView40.isFocused();
        java.awt.Component component50 = bethuneLotView40.locate(64, 150);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + modalExclusionType43 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType43.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(component50);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
// flaky:         checkoutView6.price = "Honda";
// flaky:         checkoutView6.setFocusCycleRoot(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.doLayout();
        boolean boolean12 = bethuneLotView1.isFocusCycleRoot();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        java.awt.event.ComponentListener[] componentListenerArray4 = main0.getComponentListeners();
        org.junit.Assert.assertNotNull(componentListenerArray4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        java.awt.MenuComponent menuComponent39 = null;
        bethuneLotView30.remove(menuComponent39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener41);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = null; // flaky: checkoutView6.creditRadioButton;
        javax.swing.JRadioButton jRadioButton9 = null; // flaky: checkoutView6.creditRadioButton;
// flaky:         jRadioButton9.repaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton8);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        java.lang.String str9 = user5.getPassword();
        user5.setCardNumber("");
        user5.setAccountType("");
        boolean boolean14 = controllers.UserController.approveUser(user5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        java.awt.Event event7 = null;
        boolean boolean10 = bethuneLotView1.mouseEnter(event7, (int) (short) 100, (int) (short) 0);
        bethuneLotView1.validate();
        boolean boolean12 = bethuneLotView1.isFontSet();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str2 = null; // flaky: controllers.UserController.extendTime(12, 6);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Can not change booking time" + "'", str2, "Can not change booking time");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        model.MaintainUser maintainUser0 = model.MaintainUser.getInstance();
        java.util.ArrayList<objects.User> userList1 = maintainUser0.users;
        maintainUser0.load();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = main0.getHierarchyListeners();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        bethuneLotView9.addHierarchyListener(hierarchyListener12);
        boolean boolean14 = bethuneLotView9.isFocusTraversable();
        bethuneLotView9.setLocation((-1), (int) '4');
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView9, "KIA");
        views.BookingActionsView bookingActionsView20 = null; // flaky: new views.BookingActionsView(main0);
        views.ManageLotsView manageLotsView21 = new views.ManageLotsView(main0);
        manageLotsView21.revalidate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = null; // flaky: checkoutView6.nameCard;
// flaky:         jLabel8.enable(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jLabel8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bethuneLotView1.getPropertyChangeListeners();
        bethuneLotView1.transferFocusUpCycle();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        java.awt.Graphics graphics16 = null;
        bethuneLotView1.print(graphics16);
        java.awt.Window.Type type18 = bethuneLotView1.getType();
        boolean boolean19 = bethuneLotView1.isPreferredSizeSet();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'", type18.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        int int14 = user5.getPrice();
        int int15 = user5.creditBalnce;
        boolean boolean16 = controllers.UserController.approveUser(user5);
        user5.setPassword("YorkUParking - Bethune");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.Rectangle rectangle12 = bethuneLotView1.getMaximizedBounds();
        boolean boolean13 = bethuneLotView1.hasFocus();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(rectangle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        float float7 = bethuneLotView1.getAlignmentX();
        bethuneLotView1.enableInputMethods(false);
        bethuneLotView1.transferFocusDownCycle();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        boolean boolean2 = password0.getincludeLowerCase();
        boolean boolean3 = password0.getIncludeNumbers();
        int int4 = password0.getLength();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        user5.parkingFee = 10;
        boolean boolean12 = user5.getApproved();
        java.time.LocalDateTime localDateTime13 = user5.getParkingEndTime();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        boolean boolean7 = bethuneLotView1.isCursorSet();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener8);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray10 = bethuneLotView1.getMouseWheelListeners();
        java.awt.Color color11 = null;
        bethuneLotView1.setBackground(color11);
        java.awt.dnd.DropTarget dropTarget13 = bethuneLotView1.getDropTarget();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray10);
        org.junit.Assert.assertNull(dropTarget13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = bethuneLotView1.createImage(imageProducer10);
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Dimension dimension14 = null;
        java.awt.Dimension dimension15 = bethuneLotView13.getSize(dimension14);
        java.awt.Dialog.ModalExclusionType modalExclusionType16 = bethuneLotView13.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        bethuneLotView13.addPropertyChangeListener(propertyChangeListener17);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Dimension dimension21 = null;
        java.awt.Dimension dimension22 = bethuneLotView20.getSize(dimension21);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = bethuneLotView20.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        bethuneLotView20.addPropertyChangeListener(propertyChangeListener24);
        bethuneLotView13.remove((java.awt.Component) bethuneLotView20);
        java.awt.Component component27 = bethuneLotView13.getFocusOwner();
        bethuneLotView13.firePropertyChange("hi!", ' ', '4');
        bethuneLotView13.requestFocus();
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Font font35 = null;
        bethuneLotView34.setFont(font35);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior37 = bethuneLotView34.getBaselineResizeBehavior();
        bethuneLotView34.addNotify();
        bethuneLotView34.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        bethuneLotView34.addPropertyChangeListener(propertyChangeListener43);
        java.awt.Graphics graphics45 = bethuneLotView34.getGraphics();
        bethuneLotView13.printComponents(graphics45);
        bethuneLotView1.print(graphics45);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + modalExclusionType16 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType16.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component27);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior37 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior37.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics45);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.MouseListener mouseListener10 = null;
        bethuneLotView1.addMouseListener(mouseListener10);
        bethuneLotView1.repaint((int) (short) 1, (int) '#', 0, (int) (byte) 10);
        views.Main main17 = new views.Main();
        java.awt.Cursor cursor18 = null;
        main17.setCursor(cursor18);
        boolean boolean22 = main17.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView23 = null; // flaky: new views.CheckoutView(main17);
        javax.swing.JTextField jTextField24 = null; // flaky: checkoutView23.cardNumberField;
        javax.swing.JRadioButton jRadioButton25 = null;
// flaky:         checkoutView23.debitRadioButton = jRadioButton25;
        views.Main main27 = new views.Main();
        java.awt.Cursor cursor28 = null;
        main27.setCursor(cursor28);
        boolean boolean32 = main27.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView33 = null; // flaky: new views.CheckoutView(main27);
        javax.swing.JTextField jTextField34 = null; // flaky: checkoutView33.cvvField;
        javax.swing.JLabel jLabel35 = null; // flaky: checkoutView33.nameCard;
// flaky:         checkoutView23.nameCard = jLabel35;
        java.awt.Container container37 = null; // flaky: checkoutView23.getFocusCycleRootAncestor();
        views.Main main38 = new views.Main();
        java.awt.Cursor cursor39 = null;
        main38.setCursor(cursor39);
        boolean boolean43 = main38.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView44 = null; // flaky: new views.CheckoutView(main38);
        javax.swing.JTextField jTextField45 = null; // flaky: checkoutView44.cvvField;
        javax.swing.JRadioButton jRadioButton46 = null; // flaky: checkoutView44.creditRadioButton;
        javax.swing.JRadioButton jRadioButton47 = null; // flaky: checkoutView44.creditRadioButton;
// flaky:         checkoutView23.debitRadioButton = jRadioButton47;
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Dimension dimension51 = null;
        java.awt.Dimension dimension52 = bethuneLotView50.getSize(dimension51);
        java.awt.Dialog.ModalExclusionType modalExclusionType53 = bethuneLotView50.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        bethuneLotView50.addPropertyChangeListener(propertyChangeListener54);
        java.awt.Graphics graphics56 = null;
        bethuneLotView50.update(graphics56);
        java.awt.Event event58 = null;
        views.Main main59 = null;
        views.BethuneLotView bethuneLotView60 = new views.BethuneLotView(main59);
        java.awt.Font font61 = null;
        bethuneLotView60.setFont(font61);
        boolean boolean63 = bethuneLotView60.isOpaque();
        bethuneLotView60.repaint();
        java.awt.event.HierarchyListener hierarchyListener65 = null;
        bethuneLotView60.removeHierarchyListener(hierarchyListener65);
        boolean boolean67 = bethuneLotView50.gotFocus(event58, (java.lang.Object) bethuneLotView60);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add((java.awt.Component) checkoutView23, (java.lang.Object) boolean67, 450);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField34);
// flaky:         org.junit.Assert.assertNotNull(jLabel35);
        org.junit.Assert.assertNull(container37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField45);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton46);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton47);
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertTrue("'" + modalExclusionType53 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType53.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        java.awt.Container container5 = main0.getOriginalContentPane();
        java.awt.Container container6 = main0.getOriginalContentPane();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet8 = main0.getFocusTraversalKeys((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNotNull(container6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView25.removeWindowListener(windowListener30);
        bethuneLotView13.setLocationRelativeTo((java.awt.Component) bethuneLotView25);
        java.awt.event.KeyListener[] keyListenerArray33 = bethuneLotView25.getKeyListeners();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Font font36 = null;
        bethuneLotView35.setFont(font36);
        bethuneLotView35.toBack();
        java.awt.Event event39 = null;
        boolean boolean42 = bethuneLotView35.mouseDrag(event39, 0, 1);
        bethuneLotView35.remove(0);
        bethuneLotView35.setFocusTraversalPolicyProvider(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray47 = bethuneLotView35.getMouseMotionListeners();
        java.awt.event.WindowFocusListener windowFocusListener48 = null;
        bethuneLotView35.addWindowFocusListener(windowFocusListener48);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component51 = bethuneLotView25.add((java.awt.Component) bethuneLotView35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(keyListenerArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray47);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        user5.accountType = "BMW";
        user5.accountType = "0";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        controllers.LotController.removeLot("BMW");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        java.awt.event.KeyListener keyListener6 = null;
        bethuneLotView1.removeKeyListener(keyListener6);
        boolean boolean8 = bethuneLotView1.isFocusTraversalPolicySet();
        java.awt.Image image9 = bethuneLotView1.getIconImage();
        boolean boolean10 = bethuneLotView1.isFocusTraversalPolicyProvider();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        bethuneLotView12.addPropertyChangeListener(propertyChangeListener16);
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Dimension dimension20 = null;
        java.awt.Dimension dimension21 = bethuneLotView19.getSize(dimension20);
        java.awt.Dialog.ModalExclusionType modalExclusionType22 = bethuneLotView19.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        bethuneLotView19.addPropertyChangeListener(propertyChangeListener23);
        bethuneLotView12.remove((java.awt.Component) bethuneLotView19);
        java.awt.Component component26 = bethuneLotView12.getFocusOwner();
        bethuneLotView12.firePropertyChange("hi!", ' ', '4');
        bethuneLotView12.requestFocus();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component32 = bethuneLotView1.add((java.awt.Component) bethuneLotView12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertTrue("'" + modalExclusionType22 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType22.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component26);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        bethuneLotView1.setState((int) (byte) 10);
        java.awt.Event event15 = null;
        boolean boolean17 = bethuneLotView1.keyUp(event15, 1055);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.remove(291);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        int int7 = bethuneLotView1.countComponents();
        boolean boolean8 = bethuneLotView1.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        objects.User user5 = new objects.User("", 100, "hi!", "Honda", "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        user5.setId(8);
        user5.plateNumber = "frame9";
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setplateNumber("KIA");
        user5.accountType = "frame9";
        user5.setEmail("Account does not exist.");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        boolean boolean7 = bethuneLotView1.getFocusableWindowState();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = bethuneLotView9.getSize(dimension10);
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = bethuneLotView9.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        bethuneLotView9.removeInputMethodListener(inputMethodListener13);
        java.awt.Rectangle rectangle15 = bethuneLotView9.bounds();
        javax.swing.JRootPane jRootPane16 = bethuneLotView9.getRootPane();
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Point point20 = bethuneLotView18.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener21 = null;
        bethuneLotView18.addHierarchyListener(hierarchyListener21);
        java.awt.event.WindowListener windowListener23 = null;
        bethuneLotView18.removeWindowListener(windowListener23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        java.awt.Image image34 = null;
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Font font39 = null;
        bethuneLotView38.setFont(font39);
        bethuneLotView38.toBack();
        java.awt.Event event42 = null;
        boolean boolean45 = bethuneLotView38.mouseDrag(event42, 0, 1);
        boolean boolean46 = bethuneLotView26.prepareImage(image34, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView38);
        java.awt.Rectangle rectangle47 = bethuneLotView38.getBounds();
        bethuneLotView18.setBounds(rectangle47);
        java.awt.Rectangle rectangle49 = jRootPane16.getBounds(rectangle47);
        bethuneLotView1.setBounds(rectangle47);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + modalExclusionType12 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType12.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(jRootPane16);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(rectangle49);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        objects.Manager manager3 = new objects.Manager("Account does not exist.", 450, "SUV");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        objects.Manager manager3 = maintainManager0.loggedInManager;
        model.MaintainManager maintainManager4 = model.MaintainManager.getInstance();
        objects.Manager manager5 = new objects.Manager();
        objects.SuperManager superManager9 = new objects.SuperManager("hi!", (-1), "hi!");
        objects.Manager[] managerArray10 = new objects.Manager[] { manager5, superManager9 };
        java.util.ArrayList<objects.Manager> managerList11 = new java.util.ArrayList<objects.Manager>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<objects.Manager>) managerList11, managerArray10);
        maintainManager4.managers = managerList11;
        maintainManager0.managers = managerList11;
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNull(manager3);
        org.junit.Assert.assertNotNull(maintainManager4);
        org.junit.Assert.assertNotNull(managerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        maintainLot0.load();
        maintainLot0.load();
        org.junit.Assert.assertNotNull(maintainLot0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        bethuneLotView13.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color28 = bethuneLotView13.getForeground();
        bethuneLotView13.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        bethuneLotView1.removeAll();
        java.awt.Event event11 = null;
        objects.User user17 = new objects.User("hi!", (int) '4', "", "", "");
        double double18 = user17.getRate();
        java.lang.String str19 = user17.parkingSpotName;
        boolean boolean20 = bethuneLotView1.gotFocus(event11, (java.lang.Object) user17);
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Font font23 = null;
        bethuneLotView22.setFont(font23);
        bethuneLotView22.toBack();
        java.awt.Event event26 = null;
        boolean boolean29 = bethuneLotView22.mouseDrag(event26, 0, 1);
        java.awt.Image image30 = null;
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Font font35 = null;
        bethuneLotView34.setFont(font35);
        bethuneLotView34.toBack();
        java.awt.Event event38 = null;
        boolean boolean41 = bethuneLotView34.mouseDrag(event38, 0, 1);
        boolean boolean42 = bethuneLotView22.prepareImage(image30, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView34);
        java.awt.Cursor cursor43 = null;
        bethuneLotView22.setCursor(cursor43);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray45 = bethuneLotView22.getWindowFocusListeners();
        boolean boolean48 = bethuneLotView22.contains((int) (short) 1, (int) (short) 10);
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Point point52 = bethuneLotView50.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener53 = null;
        bethuneLotView50.addHierarchyListener(hierarchyListener53);
        boolean boolean55 = bethuneLotView50.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer56 = null;
        java.awt.Image image57 = bethuneLotView50.createImage(imageProducer56);
        views.Main main60 = null;
        views.BethuneLotView bethuneLotView61 = new views.BethuneLotView(main60);
        java.awt.Dimension dimension62 = null;
        java.awt.Dimension dimension63 = bethuneLotView61.getSize(dimension62);
        java.awt.Dialog.ModalExclusionType modalExclusionType64 = bethuneLotView61.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        bethuneLotView61.removeInputMethodListener(inputMethodListener65);
        int int67 = bethuneLotView22.checkImage(image57, 8, 291, (java.awt.image.ImageObserver) bethuneLotView61);
        views.Main main68 = new views.Main();
        views.LotChoiceView lotChoiceView69 = new views.LotChoiceView(main68);
        main68.resetContentPane();
        boolean boolean71 = main68.isMaximumSizeSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = bethuneLotView1.prepareImage(image57, (java.awt.image.ImageObserver) main68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(point52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(image57);
        org.junit.Assert.assertNotNull(dimension63);
        org.junit.Assert.assertTrue("'" + modalExclusionType64 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType64.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
// flaky:         checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = null; // flaky: checkoutView6.cardNumberField;
// flaky:         checkoutView6.price = "frame14";
// flaky:         checkoutView6.dateConfirmed = false;
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        bethuneLotView26.addPropertyChangeListener("", propertyChangeListener30);
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Point point35 = bethuneLotView33.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener36 = null;
        bethuneLotView33.addHierarchyListener(hierarchyListener36);
        boolean boolean38 = bethuneLotView33.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = bethuneLotView33.createImage(imageProducer39);
        boolean boolean46 = bethuneLotView26.imageUpdate(image40, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation47 = bethuneLotView26.getComponentOrientation();
// flaky:         checkoutView6.setComponentOrientation(componentOrientation47);
        views.Main main49 = new views.Main();
        java.awt.Cursor cursor50 = null;
        main49.setCursor(cursor50);
        boolean boolean54 = main49.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView55 = null; // flaky: new views.CheckoutView(main49);
        javax.swing.JTextField jTextField56 = null; // flaky: checkoutView55.cvvField;
        javax.swing.JRadioButton jRadioButton57 = null; // flaky: checkoutView55.creditRadioButton;
        javax.swing.JRadioButton jRadioButton58 = null; // flaky: checkoutView55.creditRadioButton;
// flaky:         checkoutView6.mobilePaymentRadioButton = jRadioButton58;
        javax.swing.JTextField jTextField60 = null; // flaky: checkoutView6.nameCardField;
        boolean boolean61 = false; // flaky: checkoutView6.dateConfirmed;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
// flaky:         org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNull(point35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(componentOrientation47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField56);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton57);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton58);
// flaky:         org.junit.Assert.assertNotNull(jTextField60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Rectangle rectangle22 = bethuneLotView13.getBounds();
        java.awt.Window window23 = bethuneLotView13.getOwner();
        java.awt.ComponentOrientation componentOrientation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            window23.applyComponentOrientation(componentOrientation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNull(window23);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        bethuneLotView1.addPropertyChangeListener("KIA", propertyChangeListener10);
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = bethuneLotView13.getBaselineResizeBehavior();
        bethuneLotView13.addNotify();
        boolean boolean18 = bethuneLotView13.isLocationByPlatform();
        bethuneLotView13.reshape((int) (byte) 10, 100, (int) '#', 1);
        java.awt.Dimension dimension24 = bethuneLotView13.getPreferredSize();
        bethuneLotView1.resize(dimension24);
        java.awt.Shape shape26 = null;
        bethuneLotView1.setShape(shape26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.Window.Type type10 = bethuneLotView1.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
        bethuneLotView1.addHierarchyBoundsListener(hierarchyBoundsListener11);
        java.awt.Color color13 = null;
        bethuneLotView1.setForeground(color13);
        boolean boolean15 = bethuneLotView1.isVisible();
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener16);
        java.lang.Object obj18 = bethuneLotView1.getTreeLock();
        boolean boolean19 = bethuneLotView1.isVisible();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        java.awt.Point point13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = bethuneLotView1.contains(point13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.deliverEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        user5.email = "";
        int int13 = user5.price;
        user5.parkingSpotName = "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("SUV");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setIncludeSymbols();
        strongPasswordBuilder0.setLength();
        strongPasswordBuilder0.setIncludeNumbers();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setParkingSpot("Email invalid.");
        user5.cardName = "";
        java.lang.String str13 = user5.getPaymentType();
        user5.price = 8;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        bethuneLotView1.removeAll();
        java.awt.Event event11 = null;
        objects.User user17 = new objects.User("hi!", (int) '4', "", "", "");
        double double18 = user17.getRate();
        java.lang.String str19 = user17.parkingSpotName;
        boolean boolean20 = bethuneLotView1.gotFocus(event11, (java.lang.Object) user17);
        java.awt.Event event21 = null;
        boolean boolean24 = bethuneLotView1.mouseExit(event21, (int) (short) 100, (int) (short) 10);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Point point28 = bethuneLotView26.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener29 = null;
        bethuneLotView26.addHierarchyListener(hierarchyListener29);
        bethuneLotView26.show();
        bethuneLotView26.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray33 = bethuneLotView26.getPropertyChangeListeners();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Font font36 = null;
        bethuneLotView35.setFont(font36);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        bethuneLotView35.addPropertyChangeListener("", propertyChangeListener39);
        views.Main main41 = null;
        views.BethuneLotView bethuneLotView42 = new views.BethuneLotView(main41);
        java.awt.Point point44 = bethuneLotView42.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener45 = null;
        bethuneLotView42.addHierarchyListener(hierarchyListener45);
        boolean boolean47 = bethuneLotView42.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer48 = null;
        java.awt.Image image49 = bethuneLotView42.createImage(imageProducer48);
        views.Main main50 = null;
        views.BethuneLotView bethuneLotView51 = new views.BethuneLotView(main50);
        java.awt.Font font52 = null;
        bethuneLotView51.setFont(font52);
        bethuneLotView51.toBack();
        java.awt.Event event55 = null;
        boolean boolean58 = bethuneLotView51.mouseDrag(event55, 0, 1);
        bethuneLotView51.remove(0);
        bethuneLotView51.enable();
        int int62 = bethuneLotView35.checkImage(image49, (java.awt.image.ImageObserver) bethuneLotView51);
        views.Main main63 = null;
        views.BethuneLotView bethuneLotView64 = new views.BethuneLotView(main63);
        java.awt.Point point66 = bethuneLotView64.getMousePosition(false);
        java.awt.Container container67 = bethuneLotView64.getFocusCycleRootAncestor();
        java.awt.Event event68 = null;
        java.lang.Object obj69 = null;
        boolean boolean70 = bethuneLotView64.lostFocus(event68, obj69);
        int int71 = bethuneLotView26.checkImage(image49, (java.awt.image.ImageObserver) bethuneLotView64);
        views.Main main74 = null;
        views.BethuneLotView bethuneLotView75 = new views.BethuneLotView(main74);
        java.awt.Dimension dimension76 = null;
        java.awt.Dimension dimension77 = bethuneLotView75.getSize(dimension76);
        java.awt.Dialog.ModalExclusionType modalExclusionType78 = bethuneLotView75.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        bethuneLotView75.removeInputMethodListener(inputMethodListener79);
        boolean boolean81 = bethuneLotView75.isFocusable();
        java.awt.Container container82 = bethuneLotView75.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = bethuneLotView1.prepareImage(image49, (int) (short) 100, (-1), (java.awt.image.ImageObserver) container82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray33);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(image49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(point66);
        org.junit.Assert.assertNull(container67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(dimension77);
        org.junit.Assert.assertTrue("'" + modalExclusionType78 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType78.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(container82);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray13 = bethuneLotView1.getMouseMotionListeners();
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        bethuneLotView1.addWindowFocusListener(windowFocusListener14);
        java.lang.String str16 = bethuneLotView1.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "frame34" + "'", str16, "frame34");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = null; // flaky: checkoutView6.nameCard;
        javax.swing.JTextField jTextField9 = null; // flaky: checkoutView6.cvvField;
// flaky:         checkoutView6.setFocusTraversalPolicyProvider(false);
// flaky:         checkoutView6.dateConfirmed = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jLabel8);
// flaky:         org.junit.Assert.assertNotNull(jTextField9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        java.time.LocalDateTime localDateTime9 = user5.parkingEndTime;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Point point10 = bethuneLotView8.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        bethuneLotView8.addHierarchyListener(hierarchyListener11);
        boolean boolean13 = bethuneLotView8.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = bethuneLotView8.createImage(imageProducer14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Font font18 = null;
        bethuneLotView17.setFont(font18);
        bethuneLotView17.toBack();
        java.awt.Event event21 = null;
        boolean boolean24 = bethuneLotView17.mouseDrag(event21, 0, 1);
        bethuneLotView17.remove(0);
        bethuneLotView17.enable();
        int int28 = bethuneLotView1.checkImage(image15, (java.awt.image.ImageObserver) bethuneLotView17);
        java.awt.Color color29 = bethuneLotView17.getForeground();
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        bethuneLotView31.addPropertyChangeListener("", propertyChangeListener35);
        bethuneLotView31.setResizable(true);
        java.awt.Graphics graphics39 = null;
        bethuneLotView31.printComponents(graphics39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        bethuneLotView31.addInputMethodListener(inputMethodListener41);
        java.awt.dnd.DropTarget dropTarget43 = null;
        bethuneLotView31.setDropTarget(dropTarget43);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component45 = bethuneLotView17.add((java.awt.Component) bethuneLotView31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(color29);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
// flaky:         checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = null; // flaky: new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = null; // flaky: checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = null; // flaky: checkoutView16.nameCard;
// flaky:         checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = null; // flaky: checkoutView6.cardNumberField;
// flaky:         checkoutView6.price = "frame14";
// flaky:         checkoutView6.dateConfirmed = false;
        java.lang.String str25 = null; // flaky: checkoutView6.getWarningString();
// flaky:         checkoutView6.openWebPage("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
// flaky:         org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        component12.firePropertyChange("frame34", (double) 5, (double) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        java.awt.LayoutManager layoutManager24 = null;
        bethuneLotView1.setLayout(layoutManager24);
        bethuneLotView1.setVisible(false);
        views.Main main28 = null;
        views.BethuneLotView bethuneLotView29 = new views.BethuneLotView(main28);
        java.awt.Point point31 = bethuneLotView29.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        bethuneLotView29.addHierarchyListener(hierarchyListener32);
        java.awt.event.WindowListener windowListener34 = null;
        bethuneLotView29.removeWindowListener(windowListener34);
        java.awt.event.WindowListener windowListener36 = null;
        bethuneLotView29.removeWindowListener(windowListener36);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray38 = bethuneLotView29.getHierarchyBoundsListeners();
        views.Main main39 = null;
        views.BethuneLotView bethuneLotView40 = new views.BethuneLotView(main39);
        java.awt.Point point42 = bethuneLotView40.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener43 = null;
        bethuneLotView40.addHierarchyListener(hierarchyListener43);
        boolean boolean45 = bethuneLotView40.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = bethuneLotView40.createImage(imageProducer46);
        views.Main main50 = null;
        views.BethuneLotView bethuneLotView51 = new views.BethuneLotView(main50);
        java.awt.Dimension dimension52 = null;
        java.awt.Dimension dimension53 = bethuneLotView51.getSize(dimension52);
        java.awt.Dialog.ModalExclusionType modalExclusionType54 = bethuneLotView51.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        bethuneLotView51.addPropertyChangeListener(propertyChangeListener55);
        views.Main main57 = null;
        views.BethuneLotView bethuneLotView58 = new views.BethuneLotView(main57);
        java.awt.Dimension dimension59 = null;
        java.awt.Dimension dimension60 = bethuneLotView58.getSize(dimension59);
        java.awt.Dialog.ModalExclusionType modalExclusionType61 = bethuneLotView58.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        bethuneLotView58.addPropertyChangeListener(propertyChangeListener62);
        bethuneLotView51.remove((java.awt.Component) bethuneLotView58);
        bethuneLotView58.repaint();
        boolean boolean66 = bethuneLotView29.prepareImage(image47, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView58);
        java.awt.Event event67 = null;
        boolean boolean69 = bethuneLotView29.keyDown(event67, 5);
        views.Main main70 = null;
        views.BethuneLotView bethuneLotView71 = new views.BethuneLotView(main70);
        java.awt.Font font72 = null;
        bethuneLotView71.setFont(font72);
        int int74 = bethuneLotView71.getY();
        bethuneLotView71.disable();
        boolean boolean76 = bethuneLotView71.isValidateRoot();
        java.awt.Font font77 = bethuneLotView71.getFont();
        java.awt.Graphics graphics78 = null;
        bethuneLotView71.update(graphics78);
        java.awt.MenuBar menuBar80 = null;
        bethuneLotView71.setMenuBar(menuBar80);
        boolean boolean82 = bethuneLotView71.isMaximumSizeSet();
        java.awt.LayoutManager layoutManager83 = bethuneLotView71.getLayout();
        bethuneLotView29.setLayout(layoutManager83);
        bethuneLotView1.setLayout(layoutManager83);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point31);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray38);
        org.junit.Assert.assertNull(point42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertNotNull(dimension53);
        org.junit.Assert.assertTrue("'" + modalExclusionType54 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType54.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertTrue("'" + modalExclusionType61 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType61.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 291 + "'", int74 == 291);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(font77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(layoutManager83);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Point point10 = null;
        java.awt.Point point11 = bethuneLotView1.getLocation(point10);
        bethuneLotView1.nextFocus();
        int int13 = bethuneLotView1.getCursorType();
        views.Main main14 = null;
        views.BethuneLotView bethuneLotView15 = new views.BethuneLotView(main14);
        java.awt.Font font16 = null;
        bethuneLotView15.setFont(font16);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        bethuneLotView15.addPropertyChangeListener("", propertyChangeListener19);
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Point point24 = bethuneLotView22.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener25 = null;
        bethuneLotView22.addHierarchyListener(hierarchyListener25);
        boolean boolean27 = bethuneLotView22.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = bethuneLotView22.createImage(imageProducer28);
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        bethuneLotView31.toBack();
        java.awt.Event event35 = null;
        boolean boolean38 = bethuneLotView31.mouseDrag(event35, 0, 1);
        bethuneLotView31.remove(0);
        bethuneLotView31.enable();
        int int42 = bethuneLotView15.checkImage(image29, (java.awt.image.ImageObserver) bethuneLotView31);
        views.Main main45 = null;
        views.BethuneLotView bethuneLotView46 = new views.BethuneLotView(main45);
        java.awt.Font font47 = null;
        bethuneLotView46.setFont(font47);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior49 = bethuneLotView46.getBaselineResizeBehavior();
        int int50 = bethuneLotView1.checkImage(image29, 2, (int) (byte) -1, (java.awt.image.ImageObserver) bethuneLotView46);
        java.awt.Image image51 = bethuneLotView1.getIconImage();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior49 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior49.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(image51);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.Window.Type type10 = bethuneLotView1.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
        bethuneLotView1.addHierarchyBoundsListener(hierarchyBoundsListener11);
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Font font15 = null;
        bethuneLotView14.setFont(font15);
        java.awt.Container container17 = bethuneLotView14.getFocusCycleRootAncestor();
        bethuneLotView14.setOpacity((float) (short) 1);
        java.awt.Point point20 = bethuneLotView14.location();
        java.awt.Point point21 = bethuneLotView1.getLocation(point20);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertNotNull(point20);
        org.junit.Assert.assertNotNull(point21);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        views.Main main0 = new views.Main();
        java.awt.Container container1 = main0.getOriginalContentPane();
        views.LassondeLotView lassondeLotView2 = new views.LassondeLotView(main0);
        views.Main main3 = new views.Main();
        java.awt.Cursor cursor4 = null;
        main3.setCursor(cursor4);
        boolean boolean8 = main3.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView9 = null; // flaky: new views.CheckoutView(main3);
        javax.swing.JTextField jTextField10 = null; // flaky: checkoutView9.cardNumberField;
        java.util.Locale locale11 = null;
// flaky:         checkoutView9.setLocale(locale11);
        javax.swing.JButton jButton13 = null; // flaky: checkoutView9.backButton;
// flaky:         lassondeLotView2.setColorButton(jButton13);
        views.AlertStateContext alertStateContext15 = lassondeLotView2.getParkingSpotState();
        boolean boolean16 = lassondeLotView2.isFocused();
        org.junit.Assert.assertNotNull(container1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField10);
// flaky:         org.junit.Assert.assertNotNull(jButton13);
        org.junit.Assert.assertNotNull(alertStateContext15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        long long7 = 0L; // flaky: checkoutView6.hoursBookedFor;
        javax.swing.JRadioButton jRadioButton8 = null; // flaky: checkoutView6.creditRadioButton;
// flaky:         jRadioButton8.invalidate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.parkingFee = (byte) -1;
        boolean boolean9 = controllers.UserController.approveUser(user5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.layout();
        bethuneLotView13.enable(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Rectangle rectangle7 = bethuneLotView1.bounds();
        java.awt.Event event8 = null;
        boolean boolean10 = bethuneLotView1.keyUp(event8, 12);
        boolean boolean11 = bethuneLotView1.hasFocus();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        java.awt.Graphics graphics7 = null;
        bethuneLotView1.update(graphics7);
        java.awt.Event event9 = null;
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        boolean boolean14 = bethuneLotView11.isOpaque();
        bethuneLotView11.repaint();
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView11.removeHierarchyListener(hierarchyListener16);
        boolean boolean18 = bethuneLotView1.gotFocus(event9, (java.lang.Object) bethuneLotView11);
        java.lang.Class<?> wildcardClass19 = bethuneLotView1.getClass();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView25.removeWindowListener(windowListener30);
        bethuneLotView13.setLocationRelativeTo((java.awt.Component) bethuneLotView25);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = bethuneLotView25.getPropertyChangeListeners("Vanier,Bethune,Calumet,Schulich");
        java.awt.event.ContainerListener containerListener35 = null;
        bethuneLotView25.addContainerListener(containerListener35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        user5.setCvvNumber("Email invalid.");
        boolean boolean10 = user5.getApproved();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = null; // flaky: new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = null; // flaky: checkoutView14.cardNumberField;
        javax.swing.JRadioButton jRadioButton16 = null;
// flaky:         checkoutView14.debitRadioButton = jRadioButton16;
        views.Main main18 = new views.Main();
        java.awt.Cursor cursor19 = null;
        main18.setCursor(cursor19);
        boolean boolean23 = main18.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView24 = null; // flaky: new views.CheckoutView(main18);
        javax.swing.JTextField jTextField25 = null; // flaky: checkoutView24.cvvField;
        javax.swing.JLabel jLabel26 = null; // flaky: checkoutView24.nameCard;
// flaky:         checkoutView14.nameCard = jLabel26;
// flaky:         checkoutView6.cvvLabel = jLabel26;
// flaky:         jLabel26.validate();
// flaky:         jLabel26.resize(4, (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField25);
// flaky:         org.junit.Assert.assertNotNull(jLabel26);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        java.awt.Event event14 = null;
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        bethuneLotView16.toBack();
        java.awt.Event event20 = null;
        boolean boolean23 = bethuneLotView16.mouseDrag(event20, 0, 1);
        bethuneLotView16.remove(0);
        bethuneLotView16.doLayout();
        bethuneLotView16.disable();
        java.awt.Component component30 = bethuneLotView16.locate((int) (short) -1, 12);
        boolean boolean31 = bethuneLotView1.action(event14, (java.lang.Object) bethuneLotView16);
        javax.accessibility.AccessibleContext accessibleContext32 = bethuneLotView16.getAccessibleContext();
        java.awt.Event event33 = null;
        boolean boolean36 = bethuneLotView16.mouseDrag(event33, (int) (byte) -1, (int) (short) 10);
        java.awt.ComponentOrientation componentOrientation37 = bethuneLotView16.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(accessibleContext32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(componentOrientation37);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        numberPasswordBuilder5.setLowerCase();
        numberPasswordBuilder5.setLowerCase();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Rectangle rectangle22 = bethuneLotView13.getBounds();
        java.awt.Window window23 = bethuneLotView13.getOwner();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener24 = null;
        bethuneLotView13.addHierarchyBoundsListener(hierarchyBoundsListener24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNull(window23);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        int int9 = bethuneLotView6.getY();
        bethuneLotView6.disable();
        boolean boolean11 = bethuneLotView6.isValidateRoot();
        java.awt.Font font12 = bethuneLotView6.getFont();
        java.awt.Graphics graphics13 = null;
        bethuneLotView6.update(graphics13);
        bethuneLotView1.setLocationRelativeTo((java.awt.Component) bethuneLotView6);
        boolean boolean16 = bethuneLotView1.hasFocus();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setDefaultCloseOperation(1055);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 291 + "'", int9 == 291);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bethuneLotView13.getPropertyChangeListeners("Email not registered.");
        bethuneLotView13.setTitle("Invalid plate number");
        bethuneLotView13.reshape((int) (short) -1, (int) (short) 10, (int) (byte) 1, 1055);
        bethuneLotView13.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        bethuneLotView1.addWindowFocusListener(windowFocusListener14);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        model.MaintainUser maintainUser0 = model.MaintainUser.getInstance();
        java.util.ArrayList<objects.User> userList1 = maintainUser0.users;
        objects.User user7 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        user7.setParkingStartTime(localDateTime8);
        int int10 = user7.parkingFee;
        java.time.LocalDateTime localDateTime11 = null;
        user7.parkingEndTime = localDateTime11;
        maintainUser0.loggedInUser = user7;
        objects.User user19 = new objects.User("hi!", (int) '4', "", "", "");
        user19.setPrice((int) (byte) -1);
        user19.chargeUser("Email not registered.", (int) (byte) 0);
        java.lang.String str25 = user19.paymentType;
        maintainUser0.loggedInUser = user19;
        int int27 = user19.getId();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.cardName;
        user5.lotName = "0";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        java.lang.String str11 = user5.getLotName();
        int int12 = user5.parkingFee;
        user5.setApproved(false);
        user5.addPrice(128);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        bethuneLotView1.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener9);
        bethuneLotView1.layout();
        views.Main main12 = new views.Main();
        java.awt.Cursor cursor13 = null;
        main12.setCursor(cursor13);
        boolean boolean17 = main12.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView18 = new views.CheckoutView(main12);
        javax.swing.JTextField jTextField19 = checkoutView18.cardNumberField;
        java.util.Locale locale20 = null;
        checkoutView18.setLocale(locale20);
        javax.swing.JButton jButton22 = checkoutView18.backButton;
        bethuneLotView1.setColorButton(jButton22);
        javax.swing.JLayeredPane jLayeredPane24 = bethuneLotView1.getLayeredPane();
        java.awt.event.ContainerListener[] containerListenerArray25 = bethuneLotView1.getContainerListeners();
        java.awt.event.MouseMotionListener mouseMotionListener26 = null;
        bethuneLotView1.removeMouseMotionListener(mouseMotionListener26);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNotNull(jButton22);
        org.junit.Assert.assertNotNull(jLayeredPane24);
        org.junit.Assert.assertNotNull(containerListenerArray25);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str2 = controllers.ManagerController.logInManager("Nissan", "Honda");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Account does not exist." + "'", str2, "Account does not exist.");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.image.VolatileImage volatileImage6 = bethuneLotView1.createVolatileImage((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNull(volatileImage6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.setName("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        user5.parkingStartTime = localDateTime11;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView25.removeWindowListener(windowListener30);
        bethuneLotView13.setLocationRelativeTo((java.awt.Component) bethuneLotView25);
        java.awt.event.KeyListener[] keyListenerArray33 = bethuneLotView25.getKeyListeners();
        java.awt.Point point35 = bethuneLotView25.getMousePosition(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(keyListenerArray33);
        org.junit.Assert.assertNull(point35);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        javax.swing.JRadioButton jRadioButton16 = null;
        checkoutView14.debitRadioButton = jRadioButton16;
        views.Main main18 = new views.Main();
        java.awt.Cursor cursor19 = null;
        main18.setCursor(cursor19);
        boolean boolean23 = main18.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView24 = new views.CheckoutView(main18);
        javax.swing.JTextField jTextField25 = checkoutView24.cvvField;
        javax.swing.JLabel jLabel26 = checkoutView24.nameCard;
        checkoutView14.nameCard = jLabel26;
        checkoutView6.cvvLabel = jLabel26;
        javax.swing.JTextField jTextField29 = checkoutView6.cardNumberField;
        javax.swing.JLabel jLabel30 = checkoutView6.nameCard;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel30);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.addParkingSpot("Vanier,Bethune", "frame34");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        objects.Sensor sensor5 = new objects.Sensor();
        java.lang.String str6 = sensor5.getRandArrayElement2();
        java.lang.String[] strArray10 = new java.lang.String[] { "Hyundai", "frame14", "hi!" };
        sensor5.carModel = strArray10;
        sensor0.carType = strArray10;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
        org.junit.Assert.assertNull(random4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BMW" + "'", str6, "BMW");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Dimension dimension7 = null;
        java.awt.Dimension dimension8 = bethuneLotView6.getSize(dimension7);
        bethuneLotView1.setMinimumSize(dimension8);
        java.awt.Point point10 = null;
        java.awt.Point point11 = bethuneLotView1.getLocation(point10);
        bethuneLotView1.nextFocus();
        int int13 = bethuneLotView1.getCursorType();
        bethuneLotView1.setAutoRequestFocus(true);
        bethuneLotView1.setAutoRequestFocus(false);
        boolean boolean18 = bethuneLotView1.isResizable();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        int int28 = bethuneLotView25.getHeight();
        java.awt.Event event29 = null;
        boolean boolean31 = bethuneLotView25.gotFocus(event29, (java.lang.Object) 0);
        bethuneLotView25.setFocusTraversalPolicyProvider(false);
        java.awt.image.ImageProducer imageProducer34 = null;
        java.awt.Image image35 = bethuneLotView25.createImage(imageProducer34);
        bethuneLotView1.setIconImage(image35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 450 + "'", int28 == 450);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(image35);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.MenuBar menuBar22 = null;
        bethuneLotView13.setMenuBar(menuBar22);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Point point27 = bethuneLotView25.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener28 = null;
        bethuneLotView25.addHierarchyListener(hierarchyListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView25.removeWindowListener(windowListener30);
        bethuneLotView13.setLocationRelativeTo((java.awt.Component) bethuneLotView25);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        bethuneLotView25.addPropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = checkoutView6.cardNumberField;
        checkoutView6.price = "frame14";
        checkoutView6.dateConfirmed = false;
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        bethuneLotView26.addPropertyChangeListener("", propertyChangeListener30);
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Point point35 = bethuneLotView33.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener36 = null;
        bethuneLotView33.addHierarchyListener(hierarchyListener36);
        boolean boolean38 = bethuneLotView33.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = bethuneLotView33.createImage(imageProducer39);
        boolean boolean46 = bethuneLotView26.imageUpdate(image40, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation47 = bethuneLotView26.getComponentOrientation();
        checkoutView6.setComponentOrientation(componentOrientation47);
        views.Main main49 = new views.Main();
        java.awt.Cursor cursor50 = null;
        main49.setCursor(cursor50);
        boolean boolean54 = main49.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView55 = new views.CheckoutView(main49);
        javax.swing.JTextField jTextField56 = checkoutView55.cvvField;
        java.awt.Cursor cursor57 = null;
        checkoutView55.setCursor(cursor57);
        long long59 = checkoutView55.hoursBookedFor;
        javax.swing.JTextField jTextField60 = checkoutView55.cardNumberField;
        checkoutView6.cardNumberField = jTextField60;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNull(point35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(componentOrientation47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTextField56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(jTextField60);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        float float7 = bethuneLotView1.getAlignmentX();
        bethuneLotView1.enableInputMethods(false);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        views.Main main18 = new views.Main();
        java.awt.Cursor cursor19 = null;
        main18.setCursor(cursor19);
        boolean boolean23 = main18.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView24 = new views.CheckoutView(main18);
        javax.swing.JTextField jTextField25 = checkoutView24.cardNumberField;
        javax.swing.JRadioButton jRadioButton26 = null;
        checkoutView24.debitRadioButton = jRadioButton26;
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cvvField;
        javax.swing.JLabel jLabel36 = checkoutView34.nameCard;
        checkoutView24.nameCard = jLabel36;
        checkoutView16.cvvLabel = jLabel36;
        boolean boolean39 = bethuneLotView1.isAncestorOf((java.awt.Component) checkoutView16);
        java.awt.event.WindowListener[] windowListenerArray40 = checkoutView16.getWindowListeners();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jLabel36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(windowListenerArray40);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        double double13 = user5.getRate();
        user5.accountType = "frame34";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str2 = parkingSpot1.code;
        java.lang.String str3 = parkingSpot1.code;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str2, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str3, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JRadioButton jRadioButton9 = checkoutView6.creditRadioButton;
        java.util.Locale locale10 = null;
        checkoutView6.setLocale(locale10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jRadioButton9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.getFocusableWindowState();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        bethuneLotView12.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = bethuneLotView12.isFocusable();
        java.awt.Container container19 = bethuneLotView12.getFocusCycleRootAncestor();
        boolean boolean20 = bethuneLotView1.isAncestorOf((java.awt.Component) bethuneLotView12);
        java.awt.Dimension dimension21 = bethuneLotView1.getSize();
        java.awt.event.HierarchyListener hierarchyListener22 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener22);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dimension21);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener("", propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Point point10 = bethuneLotView8.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        bethuneLotView8.addHierarchyListener(hierarchyListener11);
        boolean boolean13 = bethuneLotView8.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = bethuneLotView8.createImage(imageProducer14);
        boolean boolean21 = bethuneLotView1.imageUpdate(image15, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.Point point22 = bethuneLotView1.location();
        bethuneLotView1.setResizable(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet26 = bethuneLotView1.getFocusTraversalKeys(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(point22);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        objects.Sensor sensor0 = new objects.Sensor();
        java.util.Random random1 = sensor0.rand1;
        org.junit.Assert.assertNotNull(random1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        int int7 = bethuneLotView1.countComponents();
        bethuneLotView1.validate();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = bethuneLotView1.getComponent(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        views.Main main7 = new views.Main();
        java.awt.Cursor cursor8 = null;
        main7.setCursor(cursor8);
        boolean boolean12 = main7.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView13 = new views.CheckoutView(main7);
        javax.swing.JTextField jTextField14 = checkoutView13.cardNumberField;
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView21 = new views.CheckoutView(main15);
        javax.swing.JTextField jTextField22 = checkoutView21.cardNumberField;
        javax.swing.JRadioButton jRadioButton23 = null;
        checkoutView21.debitRadioButton = jRadioButton23;
        views.Main main25 = new views.Main();
        java.awt.Cursor cursor26 = null;
        main25.setCursor(cursor26);
        boolean boolean30 = main25.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView31 = new views.CheckoutView(main25);
        javax.swing.JTextField jTextField32 = checkoutView31.cvvField;
        javax.swing.JLabel jLabel33 = checkoutView31.nameCard;
        checkoutView21.nameCard = jLabel33;
        checkoutView13.cvvLabel = jLabel33;
        checkoutView6.cardNumberLabel = jLabel33;
        java.awt.event.WindowListener windowListener37 = null;
        checkoutView6.removeWindowListener(windowListener37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertNotNull(jLabel33);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        java.awt.Event event14 = null;
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        bethuneLotView16.toBack();
        java.awt.Event event20 = null;
        boolean boolean23 = bethuneLotView16.mouseDrag(event20, 0, 1);
        bethuneLotView16.remove(0);
        bethuneLotView16.doLayout();
        bethuneLotView16.disable();
        java.awt.Component component30 = bethuneLotView16.locate((int) (short) -1, 12);
        boolean boolean31 = bethuneLotView1.action(event14, (java.lang.Object) bethuneLotView16);
        javax.accessibility.AccessibleContext accessibleContext32 = bethuneLotView16.getAccessibleContext();
        java.awt.Event event33 = null;
        boolean boolean36 = bethuneLotView16.mouseDrag(event33, (int) (byte) -1, (int) (short) 10);
        bethuneLotView16.layout();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(accessibleContext32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        views.Main main0 = new views.Main();
        java.awt.Container container1 = main0.getOriginalContentPane();
        views.LassondeLotView lassondeLotView2 = new views.LassondeLotView(main0);
        views.Main main3 = new views.Main();
        java.awt.Cursor cursor4 = null;
        main3.setCursor(cursor4);
        boolean boolean8 = main3.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView9 = new views.CheckoutView(main3);
        javax.swing.JTextField jTextField10 = checkoutView9.cardNumberField;
        java.util.Locale locale11 = null;
        checkoutView9.setLocale(locale11);
        javax.swing.JButton jButton13 = checkoutView9.backButton;
        lassondeLotView2.setColorButton(jButton13);
        boolean boolean15 = lassondeLotView2.isAutoRequestFocus();
        org.junit.Assert.assertNotNull(container1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jButton13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        views.Available available0 = new views.Available();
        views.AlertStateContext alertStateContext1 = null;
        java.lang.String str2 = available0.alert(alertStateContext1);
        views.Main main3 = null;
        views.BethuneLotView bethuneLotView4 = new views.BethuneLotView(main3);
        java.awt.Font font5 = null;
        bethuneLotView4.setFont(font5);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = bethuneLotView4.getBaselineResizeBehavior();
        views.AlertStateContext alertStateContext8 = bethuneLotView4.getParkingSpotState();
        java.lang.String str9 = alertStateContext8.alert();
        java.lang.String str10 = available0.alert(alertStateContext8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Available" + "'", str2, "Available");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(alertStateContext8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingEndTime = localDateTime9;
        java.lang.String str11 = user5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int10 = bethuneLotView1.getY();
        bethuneLotView1.firePropertyChange("Can not change booking time", (float) (short) 10, (float) (byte) 10);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 291 + "'", int10 == 291);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.event.KeyListener keyListener22 = null;
        bethuneLotView1.removeKeyListener(keyListener22);
        java.awt.event.FocusListener[] focusListenerArray24 = bethuneLotView1.getFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(focusListenerArray24);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.list(printStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseDrag(event4, 9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setCursor(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bethuneLotView1.getPropertyChangeListeners();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        bethuneLotView10.addPropertyChangeListener("", propertyChangeListener14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        boolean boolean22 = bethuneLotView17.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView17.createImage(imageProducer23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        bethuneLotView26.remove(0);
        bethuneLotView26.enable();
        int int37 = bethuneLotView10.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView26);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Point point41 = bethuneLotView39.getMousePosition(false);
        java.awt.Container container42 = bethuneLotView39.getFocusCycleRootAncestor();
        java.awt.Event event43 = null;
        java.lang.Object obj44 = null;
        boolean boolean45 = bethuneLotView39.lostFocus(event43, obj44);
        int int46 = bethuneLotView1.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView39);
        java.awt.event.MouseListener mouseListener47 = null;
        bethuneLotView39.removeMouseListener(mouseListener47);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(point41);
        org.junit.Assert.assertNull(container42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.setVisible(true);
        views.CalumetLotView calumetLotView7 = new views.CalumetLotView(main0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String str2 = sensor0.getRandArrayElement1();
        java.lang.String[] strArray3 = sensor0.carModel;
        java.util.Random random4 = null;
        sensor0.rand1 = random4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sensor0.getRandArrayElement1();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BMW" + "'", str1, "BMW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sedan" + "'", str2, "Sedan");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.MenuComponent menuComponent15 = null;
        bethuneLotView1.remove(menuComponent15);
        boolean boolean17 = bethuneLotView1.isOpaque();
        boolean boolean18 = bethuneLotView1.isPreferredSizeSet();
        int int19 = bethuneLotView1.getComponentCount();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setParkingSpot("Email invalid.");
        java.time.LocalDateTime localDateTime11 = user5.parkingEndTime;
        user5.lotName = "Nissan";
        java.lang.String str14 = user5.getPaymentType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        model.MaintainUser maintainUser0 = model.MaintainUser.getInstance();
        java.util.ArrayList<objects.User> userList1 = maintainUser0.users;
        objects.User user7 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        user7.setParkingStartTime(localDateTime8);
        int int10 = user7.parkingFee;
        java.time.LocalDateTime localDateTime11 = null;
        user7.parkingEndTime = localDateTime11;
        maintainUser0.loggedInUser = user7;
        objects.User user19 = new objects.User("hi!", (int) '4', "", "", "");
        user19.setPrice((int) (byte) -1);
        user19.chargeUser("Email not registered.", (int) (byte) 0);
        java.lang.String str25 = user19.paymentType;
        maintainUser0.loggedInUser = user19;
        java.util.ArrayList<objects.User> userList27 = maintainUser0.users;
        java.util.ArrayList<objects.User> userList28 = maintainUser0.users;
        objects.User user34 = new objects.User("hi!", (int) '4', "", "", "");
        double double35 = user34.getRate();
        java.lang.String str36 = user34.getEmail();
        java.lang.String str37 = user34.accountType;
        maintainUser0.loggedInUser = user34;
        java.util.ArrayList<objects.User> userList39 = maintainUser0.users;
        maintainUser0.load();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        java.awt.Image image9 = null;
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Font font14 = null;
        bethuneLotView13.setFont(font14);
        bethuneLotView13.toBack();
        java.awt.Event event17 = null;
        boolean boolean20 = bethuneLotView13.mouseDrag(event17, 0, 1);
        boolean boolean21 = bethuneLotView1.prepareImage(image9, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView13);
        java.awt.Cursor cursor22 = null;
        bethuneLotView1.setCursor(cursor22);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray24 = bethuneLotView1.getWindowFocusListeners();
        boolean boolean27 = bethuneLotView1.contains((int) (short) 1, (int) (short) 10);
        bethuneLotView1.layout();
        java.awt.event.WindowListener windowListener29 = null;
        bethuneLotView1.removeWindowListener(windowListener29);
        java.awt.Font font31 = bethuneLotView1.getFont();
        java.awt.Image image32 = bethuneLotView1.getIconImage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(font31);
        org.junit.Assert.assertNull(image32);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.paymentType;
        java.lang.String str8 = user5.email;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = checkoutView6.cardNumberField;
        checkoutView6.price = "frame14";
        checkoutView6.price = "Nissan";
        java.time.LocalDateTime localDateTime25 = null;
        checkoutView6.currentTime = localDateTime25;
        checkoutView6.transferFocusDownCycle();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        int int13 = bethuneLotView10.getY();
        bethuneLotView10.disable();
        java.awt.Dimension dimension15 = bethuneLotView10.getMinimumSize();
        main0.setMaximumSize(dimension15);
        main0.resize((int) '4', 1055);
        float float20 = main0.getAlignmentX();
        // The following exception was thrown during execution in test generation
        try {
            views.ManagerActionsView managerActionsView21 = new views.ManagerActionsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = bethuneLotView8.getSize(dimension9);
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = bethuneLotView8.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView8.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.remove((java.awt.Component) bethuneLotView8);
        java.awt.Component component15 = bethuneLotView1.getFocusOwner();
        java.awt.Graphics graphics16 = null;
        bethuneLotView1.print(graphics16);
        java.awt.Rectangle rectangle18 = bethuneLotView1.getMaximizedBounds();
        bethuneLotView1.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertNull(rectangle18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        java.lang.String str11 = user5.getCvvNumber();
        // The following exception was thrown during execution in test generation
        try {
            user5.setDebitBalance("Account does not exist.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Account does not exist.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email not registered." + "'", str11, "Email not registered.");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = bethuneLotView1.getHierarchyBoundsListeners();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        boolean boolean17 = bethuneLotView12.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = bethuneLotView12.createImage(imageProducer18);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        bethuneLotView23.addPropertyChangeListener(propertyChangeListener27);
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Dimension dimension31 = null;
        java.awt.Dimension dimension32 = bethuneLotView30.getSize(dimension31);
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = bethuneLotView30.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener(propertyChangeListener34);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView30);
        bethuneLotView30.repaint();
        boolean boolean38 = bethuneLotView1.prepareImage(image19, 16, (int) (byte) 0, (java.awt.image.ImageObserver) bethuneLotView30);
        boolean boolean39 = bethuneLotView1.isAlwaysOnTop();
        boolean boolean40 = bethuneLotView1.isActive();
        boolean boolean41 = bethuneLotView1.isPreferredSizeSet();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        bethuneLotView1.removeAll();
        java.awt.Event event11 = null;
        objects.User user17 = new objects.User("hi!", (int) '4', "", "", "");
        double double18 = user17.getRate();
        java.lang.String str19 = user17.parkingSpotName;
        boolean boolean20 = bethuneLotView1.gotFocus(event11, (java.lang.Object) user17);
        java.awt.Event event21 = null;
        boolean boolean24 = bethuneLotView1.mouseExit(event21, (int) (short) 100, (int) (short) 10);
        java.awt.Insets insets25 = bethuneLotView1.insets();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(insets25);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.paymentType = "";
        java.lang.String str10 = user5.getParkingSpotName();
        user5.parkingSpotName = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        user5.setPassword("Hyundai");
        user5.setplateNumber("BMW");
        java.time.LocalDateTime localDateTime16 = user5.parkingEndTime;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        java.lang.String str9 = user5.cardName;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        user5.plateNumber = "hi!";
        user5.setCardNumber("frame14");
        java.lang.String str17 = user5.lotName;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bethuneLotView1.getPropertyChangeListeners();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        bethuneLotView10.addPropertyChangeListener("", propertyChangeListener14);
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        boolean boolean22 = bethuneLotView17.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView17.createImage(imageProducer23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        bethuneLotView26.remove(0);
        bethuneLotView26.enable();
        int int37 = bethuneLotView10.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView26);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Point point41 = bethuneLotView39.getMousePosition(false);
        java.awt.Container container42 = bethuneLotView39.getFocusCycleRootAncestor();
        java.awt.Event event43 = null;
        java.lang.Object obj44 = null;
        boolean boolean45 = bethuneLotView39.lostFocus(event43, obj44);
        int int46 = bethuneLotView1.checkImage(image24, (java.awt.image.ImageObserver) bethuneLotView39);
        java.io.PrintStream printStream47 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView39.list(printStream47, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(point41);
        org.junit.Assert.assertNull(container42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Sensor sensor2 = new objects.Sensor();
        java.lang.String str3 = sensor2.getRandArrayElement2();
        java.util.Random random4 = null;
        sensor2.rand2 = random4;
        parkingSpot1.setSensor(sensor2);
        parkingSpot1.code = "Nissan";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nissan" + "'", str3, "Nissan");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean3 = main0.requestFocusInWindow();
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.Dimension dimension6 = null;
        java.awt.Dimension dimension7 = bethuneLotView5.getSize(dimension6);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = bethuneLotView5.getModalExclusionType();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = bethuneLotView10.getBaselineResizeBehavior();
        bethuneLotView10.addNotify();
        bethuneLotView10.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        bethuneLotView10.addPropertyChangeListener(propertyChangeListener19);
        java.awt.Graphics graphics21 = bethuneLotView10.getGraphics();
        bethuneLotView5.printAll(graphics21);
        main0.printAll(graphics21);
        java.awt.event.WindowListener[] windowListenerArray24 = main0.getWindowListeners();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertNotNull(windowListenerArray24);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        javax.swing.JTextField jTextField20 = checkoutView6.cardNumberField;
        checkoutView6.price = "frame14";
        checkoutView6.price = "Nissan";
        java.time.LocalDateTime localDateTime25 = null;
        checkoutView6.currentTime = localDateTime25;
        checkoutView6.price = "frame14";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLength();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        bethuneLotView1.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener9);
        bethuneLotView1.layout();
        bethuneLotView1.setFocusableWindowState(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray14 = bethuneLotView1.getInputMethodListeners();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertNotNull(inputMethodListenerArray14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int13 = bethuneLotView1.getY();
        java.awt.event.WindowListener windowListener14 = null;
        bethuneLotView1.addWindowListener(windowListener14);
        boolean boolean18 = bethuneLotView1.inside(1, (int) (byte) 100);
        bethuneLotView1.disable();
        bethuneLotView1.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        java.lang.String str3 = lotChoiceView1.getLblMessage();
        lotChoiceView1.enableInputMethods(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        bethuneLotView1.setOpacity((float) (short) 1);
        java.awt.event.FocusListener[] focusListenerArray7 = bethuneLotView1.getFocusListeners();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.applyResourceBundle("Sedan");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name Sedan, locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(focusListenerArray7);
    }
}
