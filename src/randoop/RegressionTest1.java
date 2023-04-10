package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = null; // flaky: checkoutView6.creditRadioButton;
        views.Main main9 = new views.Main();
        java.awt.Cursor cursor10 = null;
        main9.setCursor(cursor10);
        boolean boolean14 = main9.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView15 = null; // flaky: new views.CheckoutView(main9);
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = null; // flaky: new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = null; // flaky: checkoutView22.cardNumberField;
        views.Main main24 = new views.Main();
        java.awt.Cursor cursor25 = null;
        main24.setCursor(cursor25);
        boolean boolean29 = main24.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView30 = null; // flaky: new views.CheckoutView(main24);
        javax.swing.JTextField jTextField31 = null; // flaky: checkoutView30.cardNumberField;
        javax.swing.JRadioButton jRadioButton32 = null;
// flaky:         checkoutView30.debitRadioButton = jRadioButton32;
        views.Main main34 = new views.Main();
        java.awt.Cursor cursor35 = null;
        main34.setCursor(cursor35);
        boolean boolean39 = main34.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView40 = null; // flaky: new views.CheckoutView(main34);
        javax.swing.JTextField jTextField41 = null; // flaky: checkoutView40.cvvField;
        javax.swing.JLabel jLabel42 = null; // flaky: checkoutView40.nameCard;
// flaky:         checkoutView30.nameCard = jLabel42;
// flaky:         checkoutView22.cvvLabel = jLabel42;
// flaky:         checkoutView15.cardNumberLabel = jLabel42;
// flaky:         checkoutView6.cvvLabel = jLabel42;
// flaky:         checkoutView6.transferFocus();
        javax.swing.JLabel jLabel48 = null; // flaky: checkoutView6.nameCard;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField41);
// flaky:         org.junit.Assert.assertNotNull(jLabel42);
// flaky:         org.junit.Assert.assertNotNull(jLabel48);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        views.LotFactory lotFactory0 = new views.LotFactory();
        views.Main main1 = null;
        javax.swing.JFrame jFrame3 = lotFactory0.getLot(main1, "SUV");
        org.junit.Assert.assertNull(jFrame3);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        boolean boolean9 = bethuneLotView1.contains(5, 10);
        bethuneLotView1.addNotify();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        java.awt.event.WindowListener windowListener17 = null;
        bethuneLotView12.removeWindowListener(windowListener17);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        bethuneLotView20.toBack();
        java.awt.Event event24 = null;
        boolean boolean27 = bethuneLotView20.mouseDrag(event24, 0, 1);
        java.awt.Image image28 = null;
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Font font33 = null;
        bethuneLotView32.setFont(font33);
        bethuneLotView32.toBack();
        java.awt.Event event36 = null;
        boolean boolean39 = bethuneLotView32.mouseDrag(event36, 0, 1);
        boolean boolean40 = bethuneLotView20.prepareImage(image28, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView32);
        java.awt.Rectangle rectangle41 = bethuneLotView32.getBounds();
        bethuneLotView12.setBounds(rectangle41);
        java.awt.event.WindowStateListener windowStateListener43 = null;
        bethuneLotView12.removeWindowStateListener(windowStateListener43);
        views.Main main45 = null;
        views.BethuneLotView bethuneLotView46 = new views.BethuneLotView(main45);
        java.awt.Font font47 = null;
        bethuneLotView46.setFont(font47);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior49 = bethuneLotView46.getBaselineResizeBehavior();
        bethuneLotView46.addNotify();
        bethuneLotView46.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        bethuneLotView46.addPropertyChangeListener(propertyChangeListener55);
        java.awt.Graphics graphics57 = bethuneLotView46.getGraphics();
        bethuneLotView12.print(graphics57);
        bethuneLotView1.printComponents(graphics57);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(rectangle41);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior49 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior49.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics57);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        int int2 = main0.getComponentCount();
        views.Main main3 = null;
        views.BethuneLotView bethuneLotView4 = new views.BethuneLotView(main3);
        java.awt.Point point6 = bethuneLotView4.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        bethuneLotView4.addHierarchyListener(hierarchyListener7);
        boolean boolean9 = bethuneLotView4.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = bethuneLotView4.createImage(imageProducer10);
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
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Point point25 = bethuneLotView23.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView23.addHierarchyListener(hierarchyListener26);
        java.awt.event.WindowListener windowListener28 = null;
        bethuneLotView23.removeWindowListener(windowListener28);
        java.awt.event.WindowListener windowListener30 = null;
        bethuneLotView23.removeWindowListener(windowListener30);
        java.awt.Window.Type type32 = bethuneLotView23.getType();
        bethuneLotView13.setType(type32);
        bethuneLotView4.setType(type32);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component35 = main0.add((java.awt.Component) bethuneLotView4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + java.awt.Window.Type.NORMAL + "'", type32.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        boolean boolean24 = bethuneLotView1.isOpaque();
        java.awt.Dialog.ModalExclusionType modalExclusionType25 = bethuneLotView1.getModalExclusionType();
        bethuneLotView1.setAutoRequestFocus(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + modalExclusionType25 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType25.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        boolean boolean23 = bethuneLotView1.isFocusableWindow();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        java.lang.String str16 = user5.lotName;
        user5.setEmail("KIA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        java.lang.String str11 = user5.getLotName();
        int int12 = user5.parkingFee;
        // The following exception was thrown during execution in test generation
        try {
            user5.setCreditBalance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        objects.User user33 = new objects.User("hi!", (int) '4', "", "", "");
        user33.setPrice((int) (byte) -1);
        user33.chargeUser("Email not registered.", (int) (byte) 0);
        int int39 = user33.debitBalance;
        maintainUser0.loggedInUser = user33;
        user33.creditBalnce = (byte) -1;
        int int43 = user33.debitBalance;
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1000 + "'", int43 == 1000);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        maintainManager0.update();
        org.junit.Assert.assertNotNull(maintainManager0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        objects.User user33 = new objects.User("hi!", (int) '4', "", "", "");
        user33.setPrice((int) (byte) -1);
        user33.chargeUser("Email not registered.", (int) (byte) 0);
        int int39 = user33.debitBalance;
        maintainUser0.loggedInUser = user33;
        user33.creditBalnce = (byte) -1;
        user33.setName("frame34");
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.awt.Component component15 = bethuneLotView1.getMostRecentFocusOwner();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component15);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        int int9 = bethuneLotView1.getHeight();
        java.lang.String str10 = bethuneLotView1.toString();
        java.awt.Component component13 = bethuneLotView1.getComponentAt(291, 52);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 450 + "'", int9 == 450);
        org.junit.Assert.assertNotNull(component13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        bethuneLotView1.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = bethuneLotView1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        javax.swing.JRadioButton jRadioButton18 = null;
        checkoutView16.debitRadioButton = jRadioButton18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        checkoutView16.nameCard = jLabel28;
        java.awt.Container container30 = checkoutView16.getFocusCycleRootAncestor();
        views.Main main31 = new views.Main();
        java.awt.Cursor cursor32 = null;
        main31.setCursor(cursor32);
        boolean boolean36 = main31.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView37 = new views.CheckoutView(main31);
        javax.swing.JTextField jTextField38 = checkoutView37.cvvField;
        javax.swing.JRadioButton jRadioButton39 = checkoutView37.creditRadioButton;
        javax.swing.JRadioButton jRadioButton40 = checkoutView37.creditRadioButton;
        checkoutView16.debitRadioButton = jRadioButton40;
        checkoutView6.mobilePaymentRadioButton = jRadioButton40;
        java.awt.PopupMenu popupMenu43 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.add(popupMenu43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jTextField38);
        org.junit.Assert.assertNotNull(jRadioButton39);
        org.junit.Assert.assertNotNull(jRadioButton40);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.awt.Color color26 = bethuneLotView1.getForeground();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNull(color26);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = checkoutView6.cardNumberLabel;
        java.awt.Event event11 = null;
        views.Main main12 = new views.Main();
        java.awt.Cursor cursor13 = null;
        main12.setCursor(cursor13);
        boolean boolean17 = main12.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView18 = new views.CheckoutView(main12);
        javax.swing.JTextField jTextField19 = checkoutView18.cvvField;
        java.awt.Cursor cursor20 = null;
        checkoutView18.setCursor(cursor20);
        views.Main main22 = new views.Main();
        java.awt.Cursor cursor23 = null;
        main22.setCursor(cursor23);
        boolean boolean27 = main22.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView28 = new views.CheckoutView(main22);
        javax.swing.JTextField jTextField29 = checkoutView28.cvvField;
        javax.swing.JLabel jLabel30 = checkoutView28.nameCard;
        checkoutView18.nameCard = jLabel30;
        javax.swing.JTextField jTextField32 = checkoutView18.cardNumberField;
        checkoutView18.price = "frame14";
        checkoutView18.price = "Nissan";
        boolean boolean37 = checkoutView6.gotFocus(event11, (java.lang.Object) checkoutView18);
        views.Main main38 = new views.Main();
        java.awt.Cursor cursor39 = null;
        main38.setCursor(cursor39);
        boolean boolean43 = main38.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView44 = new views.CheckoutView(main38);
        javax.swing.JTextField jTextField45 = checkoutView44.cardNumberField;
        views.Main main46 = new views.Main();
        java.awt.Cursor cursor47 = null;
        main46.setCursor(cursor47);
        boolean boolean51 = main46.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView52 = new views.CheckoutView(main46);
        javax.swing.JTextField jTextField53 = checkoutView52.cardNumberField;
        javax.swing.JRadioButton jRadioButton54 = null;
        checkoutView52.debitRadioButton = jRadioButton54;
        views.Main main56 = new views.Main();
        java.awt.Cursor cursor57 = null;
        main56.setCursor(cursor57);
        boolean boolean61 = main56.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView62 = new views.CheckoutView(main56);
        javax.swing.JTextField jTextField63 = checkoutView62.cvvField;
        javax.swing.JLabel jLabel64 = checkoutView62.nameCard;
        checkoutView52.nameCard = jLabel64;
        checkoutView44.cvvLabel = jLabel64;
        jLabel64.validate();
        checkoutView6.nameCard = jLabel64;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel30);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jTextField53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jTextField63);
        org.junit.Assert.assertNotNull(jLabel64);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        boolean boolean27 = bethuneLotView1.isMaximumSizeSet();
        boolean boolean28 = bethuneLotView1.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.awt.Dimension dimension30 = bethuneLotView1.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension30);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.setPaymentType("Vanier,Bethune");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        boolean boolean28 = bethuneLotView13.isLightweight();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        views.LassondeLotView lassondeLotView9 = new views.LassondeLotView(main0);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        java.util.Locale locale18 = null;
        checkoutView16.setLocale(locale18);
        javax.swing.JButton jButton20 = checkoutView16.backButton;
        lassondeLotView9.setColorButton(jButton20);
        java.awt.Event event22 = null;
        boolean boolean25 = lassondeLotView9.mouseUp(event22, 0, 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Point point28 = bethuneLotView26.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener29 = null;
        bethuneLotView26.addHierarchyListener(hierarchyListener29);
        boolean boolean31 = bethuneLotView26.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer32 = null;
        java.awt.Image image33 = bethuneLotView26.createImage(imageProducer32);
        int int34 = bethuneLotView26.getHeight();
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Dimension dimension37 = null;
        java.awt.Dimension dimension38 = bethuneLotView36.getSize(dimension37);
        java.awt.Dialog.ModalExclusionType modalExclusionType39 = bethuneLotView36.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        bethuneLotView36.addPropertyChangeListener(propertyChangeListener40);
        views.Main main42 = null;
        views.BethuneLotView bethuneLotView43 = new views.BethuneLotView(main42);
        java.awt.Dimension dimension44 = null;
        java.awt.Dimension dimension45 = bethuneLotView43.getSize(dimension44);
        java.awt.Dialog.ModalExclusionType modalExclusionType46 = bethuneLotView43.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        bethuneLotView43.addPropertyChangeListener(propertyChangeListener47);
        bethuneLotView36.remove((java.awt.Component) bethuneLotView43);
        java.awt.Component component50 = bethuneLotView36.getFocusOwner();
        java.awt.Dimension dimension51 = bethuneLotView36.getPreferredSize();
        bethuneLotView26.setSize(dimension51);
        bethuneLotView1.setPreferredSize(dimension51);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 450 + "'", int34 == 450);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + modalExclusionType46 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType46.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component50);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        bethuneLotView1.repaint(0L);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        javax.swing.JMenuBar jMenuBar33 = bethuneLotView16.getJMenuBar();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Point point37 = bethuneLotView35.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        bethuneLotView35.addHierarchyListener(hierarchyListener38);
        java.awt.event.WindowListener windowListener40 = null;
        bethuneLotView35.removeWindowListener(windowListener40);
        views.Main main42 = null;
        views.BethuneLotView bethuneLotView43 = new views.BethuneLotView(main42);
        java.awt.Font font44 = null;
        bethuneLotView43.setFont(font44);
        bethuneLotView43.toBack();
        java.awt.Event event47 = null;
        boolean boolean50 = bethuneLotView43.mouseDrag(event47, 0, 1);
        java.awt.Image image51 = null;
        views.Main main54 = null;
        views.BethuneLotView bethuneLotView55 = new views.BethuneLotView(main54);
        java.awt.Font font56 = null;
        bethuneLotView55.setFont(font56);
        bethuneLotView55.toBack();
        java.awt.Event event59 = null;
        boolean boolean62 = bethuneLotView55.mouseDrag(event59, 0, 1);
        boolean boolean63 = bethuneLotView43.prepareImage(image51, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView55);
        java.awt.Rectangle rectangle64 = bethuneLotView55.getBounds();
        bethuneLotView35.setBounds(rectangle64);
        bethuneLotView16.setBounds(rectangle64);
        java.awt.im.InputMethodRequests inputMethodRequests67 = bethuneLotView16.getInputMethodRequests();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(accessibleContext32);
        org.junit.Assert.assertNull(jMenuBar33);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rectangle64);
        org.junit.Assert.assertNull(inputMethodRequests67);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        boolean boolean5 = bethuneLotView1.isVisible();
        java.awt.Event event6 = null;
        objects.User user12 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        user12.setParkingStartTime(localDateTime13);
        boolean boolean15 = bethuneLotView1.gotFocus(event6, (java.lang.Object) user12);
        user12.setAccountType("Email invalid.");
        user12.setAccountType("Account does not exist.");
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        password.Password password4 = numberPasswordBuilder0.getPassword();
        numberPasswordBuilder0.setIncludeNumbers();
        org.junit.Assert.assertNotNull(password4);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        boolean boolean11 = bethuneLotView1.isFocusTraversalPolicyProvider();
        java.awt.Rectangle rectangle12 = bethuneLotView1.getBounds();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        javax.swing.JButton jButton49 = checkoutView6.backButton;
        javax.swing.JTextField jTextField50 = checkoutView6.cardNumberField;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertNotNull(jButton49);
        org.junit.Assert.assertNotNull(jTextField50);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str2 = controllers.ManagerController.logInManager("Vanier,Bethune,Calumet,Schulich", "Can not change booking time");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Password incorrect." + "'", str2, "Password incorrect.");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        int int11 = user5.debitBalance;
        java.time.LocalDateTime localDateTime12 = null;
        user5.parkingStartTime = localDateTime12;
        double double14 = user5.getRate();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setIncludeSymbols();
        strongPasswordBuilder0.setUpperCase();
        password.Password password3 = strongPasswordBuilder0.getPassword();
        org.junit.Assert.assertNotNull(password3);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        float float18 = bethuneLotView1.getAlignmentY();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.setCardNumber("frame18");
        user5.setPayementType("Nissan");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        boolean boolean7 = bethuneLotView1.isDisplayable();
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.removeComponentListener(componentListener8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        bethuneLotView1.invalidate();
        int int23 = bethuneLotView1.getY();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 291 + "'", int23 == 291);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Dimension dimension32 = null;
        java.awt.Dimension dimension33 = bethuneLotView31.getSize(dimension32);
        bethuneLotView26.setMinimumSize(dimension33);
        java.awt.Point point35 = null;
        java.awt.Point point36 = bethuneLotView26.getLocation(point35);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setLocation(point35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertNotNull(point36);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        boolean boolean2 = password0.getincludeLowerCase();
        boolean boolean3 = password0.getIncludeNumbers();
        password0.setLength((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        controllers.LotController.enableLot("Sedan");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JButton jButton10 = checkoutView6.backButton;
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Font font18 = null;
        bethuneLotView17.setFont(font18);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior20 = bethuneLotView17.getBaselineResizeBehavior();
        bethuneLotView17.addNotify();
        bethuneLotView17.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        bethuneLotView17.addPropertyChangeListener(propertyChangeListener26);
        java.awt.Graphics graphics28 = bethuneLotView17.getGraphics();
        bethuneLotView12.printAll(graphics28);
        checkoutView6.print(graphics28);
        boolean boolean31 = checkoutView6.dateConfirmed;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        bethuneLotView1.repaint((-1), (int) (short) -1, (int) (short) 0, 0);
        bethuneLotView1.setLocation((int) (byte) -1, 7);
        bethuneLotView1.firePropertyChange("Mercedes", 0L, 100L);
        bethuneLotView1.hide();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.lang.String str2 = maintainLot0.lotOptions;
        maintainLot0.clear();
        org.junit.Assert.assertNotNull(maintainLot0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sedan,null" + "'", str2, "Sedan,null");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        javax.swing.JRadioButton jRadioButton57 = checkoutView55.creditRadioButton;
        javax.swing.JRadioButton jRadioButton58 = checkoutView55.creditRadioButton;
        checkoutView6.mobilePaymentRadioButton = jRadioButton58;
        javax.swing.JTextField jTextField60 = checkoutView6.nameCardField;
        views.Main main61 = new views.Main();
        java.awt.Cursor cursor62 = null;
        main61.setCursor(cursor62);
        boolean boolean66 = main61.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView67 = new views.CheckoutView(main61);
        javax.swing.JTextField jTextField68 = checkoutView67.cardNumberField;
        javax.swing.JRadioButton jRadioButton69 = null;
        checkoutView67.debitRadioButton = jRadioButton69;
        views.Main main71 = new views.Main();
        java.awt.Cursor cursor72 = null;
        main71.setCursor(cursor72);
        boolean boolean76 = main71.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView77 = new views.CheckoutView(main71);
        javax.swing.JTextField jTextField78 = checkoutView77.cvvField;
        javax.swing.JLabel jLabel79 = checkoutView77.nameCard;
        checkoutView67.nameCard = jLabel79;
        java.time.LocalDateTime localDateTime81 = checkoutView67.currentTime;
        java.awt.Image image82 = checkoutView67.getIconImage();
        boolean boolean83 = checkoutView6.isFocusCycleRoot((java.awt.Container) checkoutView67);
        java.time.LocalDateTime localDateTime84 = checkoutView6.currentTime;
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
        org.junit.Assert.assertNotNull(jRadioButton57);
        org.junit.Assert.assertNotNull(jRadioButton58);
        org.junit.Assert.assertNotNull(jTextField60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jTextField68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jTextField78);
        org.junit.Assert.assertNotNull(jLabel79);
        org.junit.Assert.assertNull(localDateTime81);
        org.junit.Assert.assertNull(image82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(localDateTime84);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        bethuneLotView1.reshape((int) (byte) 10, 100, (int) '#', 1);
        java.awt.Dimension dimension12 = bethuneLotView1.getPreferredSize();
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Font font15 = null;
        bethuneLotView14.setFont(font15);
        bethuneLotView14.toBack();
        java.awt.Event event18 = null;
        boolean boolean21 = bethuneLotView14.mouseDrag(event18, 0, 1);
        java.awt.Image image22 = null;
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Font font27 = null;
        bethuneLotView26.setFont(font27);
        bethuneLotView26.toBack();
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView26.mouseDrag(event30, 0, 1);
        boolean boolean34 = bethuneLotView14.prepareImage(image22, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView26);
        bethuneLotView14.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.Event event39 = null;
        boolean boolean42 = bethuneLotView14.mouseDown(event39, (int) (byte) 100, (int) (short) -1);
        java.lang.Object obj43 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add((java.awt.Component) bethuneLotView14, obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        java.awt.Component component7 = bethuneLotView1.getMostRecentFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        javax.swing.JMenuBar jMenuBar33 = bethuneLotView16.getJMenuBar();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Point point37 = bethuneLotView35.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        bethuneLotView35.addHierarchyListener(hierarchyListener38);
        java.awt.event.WindowListener windowListener40 = null;
        bethuneLotView35.removeWindowListener(windowListener40);
        views.Main main42 = null;
        views.BethuneLotView bethuneLotView43 = new views.BethuneLotView(main42);
        java.awt.Font font44 = null;
        bethuneLotView43.setFont(font44);
        bethuneLotView43.toBack();
        java.awt.Event event47 = null;
        boolean boolean50 = bethuneLotView43.mouseDrag(event47, 0, 1);
        java.awt.Image image51 = null;
        views.Main main54 = null;
        views.BethuneLotView bethuneLotView55 = new views.BethuneLotView(main54);
        java.awt.Font font56 = null;
        bethuneLotView55.setFont(font56);
        bethuneLotView55.toBack();
        java.awt.Event event59 = null;
        boolean boolean62 = bethuneLotView55.mouseDrag(event59, 0, 1);
        boolean boolean63 = bethuneLotView43.prepareImage(image51, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView55);
        java.awt.Rectangle rectangle64 = bethuneLotView55.getBounds();
        bethuneLotView35.setBounds(rectangle64);
        bethuneLotView16.setBounds(rectangle64);
        java.awt.Point point67 = bethuneLotView16.getLocation();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(accessibleContext32);
        org.junit.Assert.assertNull(jMenuBar33);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rectangle64);
        org.junit.Assert.assertNotNull(point67);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.getFocusableWindowState();
        bethuneLotView1.setLocationByPlatform(false);
        bethuneLotView1.setFocusable(true);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        user5.chargeUser("Invalid plate number", 291);
        java.lang.String str19 = user5.getPaymentType();
        user5.chargeUser("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid plate number" + "'", str19, "Invalid plate number");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        java.awt.Color color24 = bethuneLotView1.getBackground();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JButton jButton10 = checkoutView6.backButton;
        views.Main main11 = new views.Main();
        java.awt.Cursor cursor12 = null;
        main11.setCursor(cursor12);
        boolean boolean16 = main11.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView17 = new views.CheckoutView(main11);
        javax.swing.JTextField jTextField18 = checkoutView17.cardNumberField;
        javax.swing.JRadioButton jRadioButton19 = null;
        checkoutView17.debitRadioButton = jRadioButton19;
        views.Main main21 = new views.Main();
        java.awt.Cursor cursor22 = null;
        main21.setCursor(cursor22);
        boolean boolean26 = main21.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView27 = new views.CheckoutView(main21);
        javax.swing.JTextField jTextField28 = checkoutView27.cvvField;
        javax.swing.JLabel jLabel29 = checkoutView27.nameCard;
        checkoutView17.nameCard = jLabel29;
        java.awt.Container container31 = checkoutView17.getFocusCycleRootAncestor();
        views.Main main32 = new views.Main();
        java.awt.Cursor cursor33 = null;
        main32.setCursor(cursor33);
        boolean boolean37 = main32.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView38 = new views.CheckoutView(main32);
        javax.swing.JTextField jTextField39 = checkoutView38.cvvField;
        javax.swing.JRadioButton jRadioButton40 = checkoutView38.creditRadioButton;
        checkoutView17.mobilePaymentRadioButton = jRadioButton40;
        checkoutView6.debitRadioButton = jRadioButton40;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jTextField28);
        org.junit.Assert.assertNotNull(jLabel29);
        org.junit.Assert.assertNull(container31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jTextField39);
        org.junit.Assert.assertNotNull(jRadioButton40);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        java.awt.ComponentOrientation componentOrientation38 = jLabel34.getComponentOrientation();
        boolean boolean39 = jLabel34.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(componentOrientation38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.setIgnoreRepaint(false);
        bethuneLotView1.setLocationByPlatform(false);
        bethuneLotView1.setLocationByPlatform(true);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        int int7 = bethuneLotView1.getHeight();
        bethuneLotView1.setFocusCycleRoot(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 450 + "'", int7 == 450);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        bethuneLotView16.toBack();
        java.awt.Event event20 = null;
        boolean boolean23 = bethuneLotView16.mouseDrag(event20, 0, 1);
        java.awt.Image image24 = null;
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Font font29 = null;
        bethuneLotView28.setFont(font29);
        bethuneLotView28.toBack();
        java.awt.Event event32 = null;
        boolean boolean35 = bethuneLotView28.mouseDrag(event32, 0, 1);
        boolean boolean36 = bethuneLotView16.prepareImage(image24, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView28);
        java.awt.Cursor cursor37 = null;
        bethuneLotView16.setCursor(cursor37);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray39 = bethuneLotView16.getWindowFocusListeners();
        boolean boolean42 = bethuneLotView16.contains((int) (short) 1, (int) (short) 10);
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Point point46 = bethuneLotView44.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener47 = null;
        bethuneLotView44.addHierarchyListener(hierarchyListener47);
        boolean boolean49 = bethuneLotView44.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer50 = null;
        java.awt.Image image51 = bethuneLotView44.createImage(imageProducer50);
        views.Main main54 = null;
        views.BethuneLotView bethuneLotView55 = new views.BethuneLotView(main54);
        java.awt.Dimension dimension56 = null;
        java.awt.Dimension dimension57 = bethuneLotView55.getSize(dimension56);
        java.awt.Dialog.ModalExclusionType modalExclusionType58 = bethuneLotView55.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener59 = null;
        bethuneLotView55.removeInputMethodListener(inputMethodListener59);
        int int61 = bethuneLotView16.checkImage(image51, 8, 291, (java.awt.image.ImageObserver) bethuneLotView55);
        boolean boolean67 = bethuneLotView1.imageUpdate(image51, 100, (int) (short) -1, 1055, 5, 100);
        javax.accessibility.AccessibleContext accessibleContext68 = bethuneLotView1.getAccessibleContext();
        bethuneLotView1.repaint((long) (byte) 0);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(image51);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertTrue("'" + modalExclusionType58 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType58.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(accessibleContext68);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.awt.Container container21 = bethuneLotView1.getContentPane();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(container21);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        objects.Manager manager3 = maintainManager0.loggedInManager;
        maintainManager0.update();
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNull(manager3);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.awt.Point point66 = bethuneLotView1.getLocation();
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
        org.junit.Assert.assertNotNull(point66);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet33 = bethuneLotView1.getFocusTraversalKeys(150);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        user5.setPassword("Hyundai");
        java.lang.String str14 = user5.getCredittBalance();
        user5.rate = 0.0d;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        boolean boolean4 = bethuneLotView1.isBackgroundSet();
        bethuneLotView1.show();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = bethuneLotView1.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior22 = bethuneLotView9.getBaselineResizeBehavior();
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Point point26 = bethuneLotView24.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener27 = null;
        bethuneLotView24.addHierarchyListener(hierarchyListener27);
        java.awt.event.WindowListener windowListener29 = null;
        bethuneLotView24.removeWindowListener(windowListener29);
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Font font33 = null;
        bethuneLotView32.setFont(font33);
        bethuneLotView32.toBack();
        java.awt.Event event36 = null;
        boolean boolean39 = bethuneLotView32.mouseDrag(event36, 0, 1);
        java.awt.Image image40 = null;
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Font font45 = null;
        bethuneLotView44.setFont(font45);
        bethuneLotView44.toBack();
        java.awt.Event event48 = null;
        boolean boolean51 = bethuneLotView44.mouseDrag(event48, 0, 1);
        boolean boolean52 = bethuneLotView32.prepareImage(image40, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView44);
        java.awt.Rectangle rectangle53 = bethuneLotView44.getBounds();
        bethuneLotView24.setBounds(rectangle53);
        java.awt.event.WindowStateListener windowStateListener55 = null;
        bethuneLotView24.removeWindowStateListener(windowStateListener55);
        views.Main main57 = null;
        views.BethuneLotView bethuneLotView58 = new views.BethuneLotView(main57);
        java.awt.Font font59 = null;
        bethuneLotView58.setFont(font59);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior61 = bethuneLotView58.getBaselineResizeBehavior();
        bethuneLotView58.addNotify();
        bethuneLotView58.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        bethuneLotView58.addPropertyChangeListener(propertyChangeListener67);
        java.awt.Graphics graphics69 = bethuneLotView58.getGraphics();
        bethuneLotView24.print(graphics69);
        bethuneLotView9.paintAll(graphics69);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior22 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior22.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point26);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rectangle53);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior61 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior61.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics69);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        boolean boolean7 = bethuneLotView1.isMaximumSizeSet();
        views.Main main8 = new views.Main();
        java.awt.MenuComponent menuComponent9 = null;
        main8.remove(menuComponent9);
        main8.resetContentPane();
        int int12 = main8.getExtendedState();
        java.awt.Container container13 = main8.getOriginalContentPane();
        views.Main main14 = null;
        views.BethuneLotView bethuneLotView15 = new views.BethuneLotView(main14);
        java.awt.Point point17 = bethuneLotView15.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener18 = null;
        bethuneLotView15.addHierarchyListener(hierarchyListener18);
        java.awt.Rectangle rectangle20 = bethuneLotView15.getBounds();
        main8.setMaximizedBounds(rectangle20);
        java.awt.Rectangle rectangle22 = bethuneLotView1.getBounds(rectangle20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertNotNull(rectangle22);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = checkoutView6.cardNumberLabel;
        java.awt.Event event11 = null;
        views.Main main12 = new views.Main();
        java.awt.Cursor cursor13 = null;
        main12.setCursor(cursor13);
        boolean boolean17 = main12.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView18 = new views.CheckoutView(main12);
        javax.swing.JTextField jTextField19 = checkoutView18.cvvField;
        java.awt.Cursor cursor20 = null;
        checkoutView18.setCursor(cursor20);
        views.Main main22 = new views.Main();
        java.awt.Cursor cursor23 = null;
        main22.setCursor(cursor23);
        boolean boolean27 = main22.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView28 = new views.CheckoutView(main22);
        javax.swing.JTextField jTextField29 = checkoutView28.cvvField;
        javax.swing.JLabel jLabel30 = checkoutView28.nameCard;
        checkoutView18.nameCard = jLabel30;
        javax.swing.JTextField jTextField32 = checkoutView18.cardNumberField;
        checkoutView18.price = "frame14";
        checkoutView18.price = "Nissan";
        boolean boolean37 = checkoutView6.gotFocus(event11, (java.lang.Object) checkoutView18);
        views.Main main38 = new views.Main();
        java.awt.Cursor cursor39 = null;
        main38.setCursor(cursor39);
        boolean boolean43 = main38.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView44 = new views.CheckoutView(main38);
        javax.swing.JTextField jTextField45 = checkoutView44.cvvField;
        javax.swing.JLabel jLabel46 = checkoutView44.nameCard;
        javax.swing.JTextField jTextField47 = checkoutView44.cvvField;
        checkoutView18.cvvField = jTextField47;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel30);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertNotNull(jLabel46);
        org.junit.Assert.assertNotNull(jTextField47);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.getParkingLot();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener10);
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Point point15 = bethuneLotView13.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView13.addHierarchyListener(hierarchyListener16);
        bethuneLotView13.show();
        bethuneLotView13.list();
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        bethuneLotView21.toBack();
        java.awt.Event event25 = null;
        boolean boolean28 = bethuneLotView21.mouseDrag(event25, 0, 1);
        bethuneLotView21.remove(0);
        bethuneLotView21.setFocusTraversalPolicyProvider(false);
        bethuneLotView13.remove((java.awt.Component) bethuneLotView21);
        java.awt.Color color34 = bethuneLotView13.getBackground();
        int int35 = bethuneLotView1.getComponentZOrder((java.awt.Component) bethuneLotView13);
        bethuneLotView13.firePropertyChange("Sedan,null", (short) 0, (short) 0);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        views.BookingActionsView bookingActionsView12 = new views.BookingActionsView(main0);
        views.LoginView loginView13 = new views.LoginView(main0);
        views.LoginView loginView14 = new views.LoginView(main0);
        java.awt.Point point15 = loginView14.getLocation();
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(point15);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.awt.Component component16 = bethuneLotView1.getMostRecentFocusOwner();
        bethuneLotView1.setSize(32, 9);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(component16);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.setName("hi!");
        user5.setPayementType("frame14");
        user5.refund((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        boolean boolean33 = bethuneLotView25.isFocusable();
        java.util.Locale locale34 = null;
        bethuneLotView25.setLocale(locale34);
        views.Main main36 = null;
        views.BethuneLotView bethuneLotView37 = new views.BethuneLotView(main36);
        java.awt.Dimension dimension38 = null;
        java.awt.Dimension dimension39 = bethuneLotView37.getSize(dimension38);
        java.awt.Dialog.ModalExclusionType modalExclusionType40 = bethuneLotView37.getModalExclusionType();
        bethuneLotView25.setModalExclusionType(modalExclusionType40);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertTrue("'" + modalExclusionType40 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType40.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray32 = bethuneLotView1.getMouseWheelListeners();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray32);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        int int43 = bethuneLotView30.getBaseline(6, 1000);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.addParkingSpot("", "SUV");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.awt.Cursor cursor50 = bethuneLotView1.getCursor();
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
        org.junit.Assert.assertNotNull(cursor50);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        views.LoginView loginView20 = new views.LoginView(main0);
        main0.transferFocusDownCycle();
        // The following exception was thrown during execution in test generation
        try {
            views.EditBookingView editBookingView22 = new views.EditBookingView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        int int23 = bethuneLotView13.getX();
        boolean boolean24 = bethuneLotView13.isVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1055 + "'", int23 == 1055);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        bethuneLotView21.toBack();
        java.awt.Event event25 = null;
        boolean boolean28 = bethuneLotView21.mouseDrag(event25, 0, 1);
        java.awt.Image image29 = null;
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Font font34 = null;
        bethuneLotView33.setFont(font34);
        bethuneLotView33.toBack();
        java.awt.Event event37 = null;
        boolean boolean40 = bethuneLotView33.mouseDrag(event37, 0, 1);
        boolean boolean41 = bethuneLotView21.prepareImage(image29, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView33);
        java.awt.Cursor cursor42 = null;
        bethuneLotView21.setCursor(cursor42);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray44 = bethuneLotView21.getWindowFocusListeners();
        boolean boolean47 = bethuneLotView21.contains((int) (short) 1, (int) (short) 10);
        views.Main main48 = null;
        views.BethuneLotView bethuneLotView49 = new views.BethuneLotView(main48);
        java.awt.Point point51 = bethuneLotView49.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener52 = null;
        bethuneLotView49.addHierarchyListener(hierarchyListener52);
        boolean boolean54 = bethuneLotView49.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer55 = null;
        java.awt.Image image56 = bethuneLotView49.createImage(imageProducer55);
        views.Main main59 = null;
        views.BethuneLotView bethuneLotView60 = new views.BethuneLotView(main59);
        java.awt.Dimension dimension61 = null;
        java.awt.Dimension dimension62 = bethuneLotView60.getSize(dimension61);
        java.awt.Dialog.ModalExclusionType modalExclusionType63 = bethuneLotView60.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener64 = null;
        bethuneLotView60.removeInputMethodListener(inputMethodListener64);
        int int66 = bethuneLotView21.checkImage(image56, 8, 291, (java.awt.image.ImageObserver) bethuneLotView60);
        views.Main main69 = null;
        views.BethuneLotView bethuneLotView70 = new views.BethuneLotView(main69);
        java.awt.Font font71 = null;
        bethuneLotView70.setFont(font71);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        bethuneLotView70.addPropertyChangeListener("", propertyChangeListener74);
        views.Main main76 = null;
        views.BethuneLotView bethuneLotView77 = new views.BethuneLotView(main76);
        java.awt.Point point79 = bethuneLotView77.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener80 = null;
        bethuneLotView77.addHierarchyListener(hierarchyListener80);
        boolean boolean82 = bethuneLotView77.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer83 = null;
        java.awt.Image image84 = bethuneLotView77.createImage(imageProducer83);
        views.Main main85 = null;
        views.BethuneLotView bethuneLotView86 = new views.BethuneLotView(main85);
        java.awt.Font font87 = null;
        bethuneLotView86.setFont(font87);
        bethuneLotView86.toBack();
        java.awt.Event event90 = null;
        boolean boolean93 = bethuneLotView86.mouseDrag(event90, 0, 1);
        bethuneLotView86.remove(0);
        bethuneLotView86.enable();
        int int97 = bethuneLotView70.checkImage(image84, (java.awt.image.ImageObserver) bethuneLotView86);
        boolean boolean98 = bethuneLotView1.prepareImage(image56, 0, 2, (java.awt.image.ImageObserver) bethuneLotView86);
        java.awt.Dimension dimension99 = bethuneLotView1.getSize();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(point51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(image56);
        org.junit.Assert.assertNotNull(dimension62);
        org.junit.Assert.assertTrue("'" + modalExclusionType63 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType63.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(point79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(image84);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(dimension99);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = main0.getHierarchyListeners();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        bethuneLotView9.addHierarchyListener(hierarchyListener12);
        boolean boolean14 = bethuneLotView9.isFocusTraversable();
        bethuneLotView9.setLocation((-1), (int) '4');
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView9, "KIA");
        boolean boolean20 = bethuneLotView9.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        bethuneLotView1.removeAll();
        bethuneLotView1.firePropertyChange("Email not registered.", (long) 64, (long) (short) 100);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        boolean boolean15 = bethuneLotView1.isEnabled();
        views.AlertStateContext alertStateContext16 = bethuneLotView1.getParkingSpotState();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(alertStateContext16);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.awt.Event event31 = null;
        views.Main main32 = new views.Main();
        java.awt.Cursor cursor33 = null;
        main32.setCursor(cursor33);
        boolean boolean37 = main32.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView38 = new views.CheckoutView(main32);
        javax.swing.JTextField jTextField39 = checkoutView38.cvvField;
        java.awt.Cursor cursor40 = null;
        checkoutView38.setCursor(cursor40);
        views.Main main42 = new views.Main();
        java.awt.Cursor cursor43 = null;
        main42.setCursor(cursor43);
        boolean boolean47 = main42.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView48 = new views.CheckoutView(main42);
        javax.swing.JTextField jTextField49 = checkoutView48.cvvField;
        javax.swing.JLabel jLabel50 = checkoutView48.nameCard;
        checkoutView38.nameCard = jLabel50;
        boolean boolean52 = bethuneLotView13.gotFocus(event31, (java.lang.Object) checkoutView38);
        javax.swing.JRadioButton jRadioButton53 = checkoutView38.creditRadioButton;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jTextField39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jTextField49);
        org.junit.Assert.assertNotNull(jLabel50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jRadioButton53);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        views.AlertStateContext alertStateContext15 = lassondeLotView2.getParkingSpotState();
        java.lang.String str16 = alertStateContext15.alert();
        org.junit.Assert.assertNotNull(container1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jButton13);
        org.junit.Assert.assertNotNull(alertStateContext15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Available" + "'", str16, "Available");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String[] strArray5 = new java.lang.String[] { "Hyundai", "frame14", "hi!" };
        sensor0.carModel = strArray5;
        java.util.Random random7 = sensor0.rand2;
        objects.Sensor sensor8 = new objects.Sensor();
        java.lang.String str9 = sensor8.getRandArrayElement2();
        java.util.Random random10 = null;
        sensor8.rand1 = random10;
        java.util.Random random12 = sensor8.rand1;
        java.util.Random random13 = sensor8.rand1;
        java.lang.String[] strArray14 = sensor8.carModel;
        sensor0.carModel = strArray14;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Honda" + "'", str1, "Honda");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(random7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hyundai" + "'", str9, "Hyundai");
        org.junit.Assert.assertNull(random12);
        org.junit.Assert.assertNull(random13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        checkoutView6.setResizable(true);
        checkoutView6.setCreditLableFalse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        boolean boolean41 = bethuneLotView1.lostFocus(event39, (java.lang.Object) (byte) -1);
        java.awt.event.ContainerListener containerListener42 = null;
        bethuneLotView1.addContainerListener(containerListener42);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.accountType = "Vanier,Bethune,Calumet,Schulich";
        java.time.LocalDateTime localDateTime11 = user5.getParkingStartTime();
        user5.chargeUser("Vanier,Bethune,Calumet,Schulich", 1055);
        double double15 = user5.getRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getName();
        java.lang.String str12 = user5.getAccountType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        bethuneLotView1.setTitle("Vanier,Bethune,Calumet,Schulich");
        java.awt.Dimension dimension14 = bethuneLotView1.getMaximumSize();
        java.util.List<java.awt.Image> imageList15 = bethuneLotView1.getIconImages();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNotNull(imageList15);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        bethuneLotView1.setTitle("Vanier,Bethune,Calumet,Schulich");
        java.awt.Dimension dimension14 = bethuneLotView1.getMaximumSize();
        java.awt.event.MouseListener mouseListener15 = null;
        bethuneLotView1.removeMouseListener(mouseListener15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.awt.Color color22 = bethuneLotView14.getForeground();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(font20);
        org.junit.Assert.assertNull(color22);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        boolean boolean2 = password1.getSymbols();
        password1.addNumbers(true);
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        views.AlertStateContext alertStateContext0 = new views.AlertStateContext();
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        javax.swing.JButton jButton38 = checkoutView6.backButton;
        java.lang.String str39 = checkoutView6.price;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(jButton38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        java.awt.Dimension dimension7 = bethuneLotView1.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bethuneLotView1.areFocusTraversalKeysSet((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        views.Unavailable unavailable0 = new views.Unavailable();
        views.Main main1 = null;
        views.BethuneLotView bethuneLotView2 = new views.BethuneLotView(main1);
        java.awt.Font font3 = null;
        bethuneLotView2.setFont(font3);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = bethuneLotView2.getBaselineResizeBehavior();
        views.AlertStateContext alertStateContext6 = bethuneLotView2.getParkingSpotState();
        java.lang.String str7 = alertStateContext6.alert();
        java.lang.String str8 = unavailable0.alert(alertStateContext6);
        views.Available available9 = new views.Available();
        views.AlertStateContext alertStateContext10 = null;
        java.lang.String str11 = available9.alert(alertStateContext10);
        views.Main main12 = new views.Main();
        java.awt.Container container13 = main12.getOriginalContentPane();
        views.LassondeLotView lassondeLotView14 = new views.LassondeLotView(main12);
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView21 = new views.CheckoutView(main15);
        javax.swing.JTextField jTextField22 = checkoutView21.cardNumberField;
        java.util.Locale locale23 = null;
        checkoutView21.setLocale(locale23);
        javax.swing.JButton jButton25 = checkoutView21.backButton;
        lassondeLotView14.setColorButton(jButton25);
        views.AlertStateContext alertStateContext27 = lassondeLotView14.getParkingSpotState();
        java.lang.String str28 = available9.alert(alertStateContext27);
        java.lang.String str29 = unavailable0.alert(alertStateContext27);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(alertStateContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unavailable" + "'", str8, "Unavailable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertNotNull(jButton25);
        org.junit.Assert.assertNotNull(alertStateContext27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unavailable" + "'", str29, "Unavailable");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.awt.image.BufferStrategy bufferStrategy16 = bethuneLotView6.getBufferStrategy();
        java.awt.dnd.DropTarget dropTarget17 = null;
        bethuneLotView6.setDropTarget(dropTarget17);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 291 + "'", int9 == 291);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNull(bufferStrategy16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.awt.Font font11 = bethuneLotView1.getFont();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener12);
        bethuneLotView1.removeNotify();
        bethuneLotView1.dispose();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.awt.Event event12 = null;
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Point point16 = bethuneLotView14.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener17 = null;
        bethuneLotView14.addHierarchyListener(hierarchyListener17);
        java.awt.event.WindowListener windowListener19 = null;
        bethuneLotView14.removeWindowListener(windowListener19);
        java.awt.event.ComponentListener componentListener21 = null;
        bethuneLotView14.addComponentListener(componentListener21);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bethuneLotView14.addHierarchyListener(hierarchyListener23);
        views.Main main25 = new views.Main();
        java.awt.Container container26 = main25.getOriginalContentPane();
        views.LassondeLotView lassondeLotView27 = new views.LassondeLotView(main25);
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cardNumberField;
        java.util.Locale locale36 = null;
        checkoutView34.setLocale(locale36);
        javax.swing.JButton jButton38 = checkoutView34.backButton;
        lassondeLotView27.setColorButton(jButton38);
        bethuneLotView14.setColorButton(jButton38);
        boolean boolean41 = bethuneLotView4.action(event12, (java.lang.Object) bethuneLotView14);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(container26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jButton38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        bethuneLotView1.setState(291);
        bethuneLotView1.firePropertyChange("Hyundai", '#', ' ');
        int int21 = bethuneLotView1.getCursorType();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.Event event10 = null;
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        bethuneLotView12.addPropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = bethuneLotView12.isUndecorated();
        boolean boolean19 = bethuneLotView1.action(event10, (java.lang.Object) boolean18);
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Point point23 = bethuneLotView21.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        bethuneLotView21.addHierarchyListener(hierarchyListener24);
        boolean boolean26 = bethuneLotView21.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer27 = null;
        java.awt.Image image28 = bethuneLotView21.createImage(imageProducer27);
        int int29 = bethuneLotView21.getHeight();
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Dimension dimension32 = null;
        java.awt.Dimension dimension33 = bethuneLotView31.getSize(dimension32);
        java.awt.Dialog.ModalExclusionType modalExclusionType34 = bethuneLotView31.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        bethuneLotView31.addPropertyChangeListener(propertyChangeListener35);
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Dimension dimension39 = null;
        java.awt.Dimension dimension40 = bethuneLotView38.getSize(dimension39);
        java.awt.Dialog.ModalExclusionType modalExclusionType41 = bethuneLotView38.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        bethuneLotView38.addPropertyChangeListener(propertyChangeListener42);
        bethuneLotView31.remove((java.awt.Component) bethuneLotView38);
        java.awt.Component component45 = bethuneLotView31.getFocusOwner();
        java.awt.Dimension dimension46 = bethuneLotView31.getPreferredSize();
        bethuneLotView21.setSize(dimension46);
        java.awt.Dimension dimension48 = bethuneLotView1.getSize(dimension46);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(image28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 450 + "'", int29 == 450);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertTrue("'" + modalExclusionType34 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType34.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension40);
        org.junit.Assert.assertTrue("'" + modalExclusionType41 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType41.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertNotNull(dimension48);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        bethuneLotView8.firePropertyChange("Invalid plate number", ' ', '#');
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        bethuneLotView20.toBack();
        java.awt.Event event24 = null;
        boolean boolean27 = bethuneLotView20.mouseDrag(event24, 0, 1);
        java.awt.Image image28 = null;
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Font font33 = null;
        bethuneLotView32.setFont(font33);
        bethuneLotView32.toBack();
        java.awt.Event event36 = null;
        boolean boolean39 = bethuneLotView32.mouseDrag(event36, 0, 1);
        boolean boolean40 = bethuneLotView20.prepareImage(image28, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView32);
        java.awt.Cursor cursor41 = null;
        bethuneLotView20.setCursor(cursor41);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray43 = bethuneLotView20.getMouseMotionListeners();
        bethuneLotView20.reshape(0, (int) (byte) 1, 4, (int) (short) 100);
        bethuneLotView20.setFocusableWindowState(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component52 = bethuneLotView8.add((java.awt.Component) bethuneLotView20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray43);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = controllers.UserController.addPlateNumber("Honda", "SUV");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        boolean boolean2 = main0.isEnabled();
        boolean boolean3 = main0.isFocusCycleRoot();
        views.BethuneLotView bethuneLotView4 = new views.BethuneLotView(main0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        javax.swing.TransferHandler transferHandler22 = null;
        bethuneLotView1.setTransferHandler(transferHandler22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        boolean boolean7 = bethuneLotView1.isLightweight();
        bethuneLotView1.setResizable(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.awt.MenuBar menuBar30 = null;
        bethuneLotView17.setMenuBar(menuBar30);
        java.awt.Event event32 = null;
        boolean boolean35 = bethuneLotView17.mouseEnter(event32, 5, (int) (short) 10);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(color29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        int int17 = user5.getId();
        user5.cvvNumber = "SUV";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JLabel jLabel9 = checkoutView6.cvvLabel;
        checkoutView6.transferFocus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        maintainUser0.load();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        javax.swing.JButton jButton49 = checkoutView6.backButton;
        javax.swing.JRadioButton jRadioButton50 = null;
        checkoutView6.creditRadioButton = jRadioButton50;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertNotNull(jButton49);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.paymentType;
        java.lang.String str8 = user5.getCvvNumber();
        user5.setCvvNumber("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        int int11 = user5.parkingFee;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseMove(event5, (int) '#', 4);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = bethuneLotView1.getHierarchyBoundsListeners();
        boolean boolean10 = bethuneLotView1.isAlwaysOnTop();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener11);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseMove(event5, (int) '#', 4);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = bethuneLotView1.getHierarchyBoundsListeners();
        boolean boolean10 = bethuneLotView1.isAlwaysOnTop();
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.deliverEvent(event11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.awt.ComponentOrientation componentOrientation27 = bethuneLotView13.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(font26);
        org.junit.Assert.assertNotNull(componentOrientation27);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        java.time.LocalDateTime localDateTime10 = null;
        checkoutView6.currentTime = localDateTime10;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        java.awt.Point point15 = bethuneLotView1.getLocation();
        int int16 = bethuneLotView1.getState();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.awt.Dimension dimension23 = null;
        java.awt.Dimension dimension24 = bethuneLotView22.getSize(dimension23);
        java.awt.Dialog.ModalExclusionType modalExclusionType25 = bethuneLotView22.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        bethuneLotView22.removeInputMethodListener(inputMethodListener26);
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean31 = main28.requestFocusInWindow();
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Dimension dimension34 = null;
        java.awt.Dimension dimension35 = bethuneLotView33.getSize(dimension34);
        java.awt.Dialog.ModalExclusionType modalExclusionType36 = bethuneLotView33.getModalExclusionType();
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Font font39 = null;
        bethuneLotView38.setFont(font39);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior41 = bethuneLotView38.getBaselineResizeBehavior();
        bethuneLotView38.addNotify();
        bethuneLotView38.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        bethuneLotView38.addPropertyChangeListener(propertyChangeListener47);
        java.awt.Graphics graphics49 = bethuneLotView38.getGraphics();
        bethuneLotView33.printAll(graphics49);
        main28.printAll(graphics49);
        bethuneLotView22.printAll(graphics49);
        bethuneLotView1.update(graphics49);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + modalExclusionType25 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType25.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertTrue("'" + modalExclusionType36 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType36.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior41 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior41.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics49);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.awt.Font font11 = bethuneLotView1.getFont();
        bethuneLotView1.enableInputMethods(false);
        int int14 = bethuneLotView1.getY();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 291 + "'", int14 == 291);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        java.lang.String str11 = user5.getLotName();
        int int12 = user5.parkingFee;
        user5.setApproved(false);
        java.time.LocalDateTime localDateTime15 = null;
        user5.parkingStartTime = localDateTime15;
        user5.paymentType = "frame22";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        int int8 = user5.getPrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        views.Main main0 = new views.Main();
        views.VanierLotView vanierLotView1 = new views.VanierLotView(main0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = vanierLotView1.getPropertyChangeListeners();
        java.awt.event.FocusListener focusListener3 = null;
        vanierLotView1.removeFocusListener(focusListener3);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        boolean boolean30 = bethuneLotView1.inside(0, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        views.Main main9 = new views.Main();
        java.awt.Cursor cursor10 = null;
        main9.setCursor(cursor10);
        boolean boolean14 = main9.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView15 = new views.CheckoutView(main9);
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        views.Main main24 = new views.Main();
        java.awt.Cursor cursor25 = null;
        main24.setCursor(cursor25);
        boolean boolean29 = main24.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView30 = new views.CheckoutView(main24);
        javax.swing.JTextField jTextField31 = checkoutView30.cardNumberField;
        javax.swing.JRadioButton jRadioButton32 = null;
        checkoutView30.debitRadioButton = jRadioButton32;
        views.Main main34 = new views.Main();
        java.awt.Cursor cursor35 = null;
        main34.setCursor(cursor35);
        boolean boolean39 = main34.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView40 = new views.CheckoutView(main34);
        javax.swing.JTextField jTextField41 = checkoutView40.cvvField;
        javax.swing.JLabel jLabel42 = checkoutView40.nameCard;
        checkoutView30.nameCard = jLabel42;
        checkoutView22.cvvLabel = jLabel42;
        checkoutView15.cardNumberLabel = jLabel42;
        checkoutView6.cvvLabel = jLabel42;
        checkoutView6.transferFocus();
        java.awt.event.FocusListener focusListener48 = null;
        checkoutView6.addFocusListener(focusListener48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jTextField31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel42);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener5);
        bethuneLotView1.toBack();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str2 = controllers.UserController.logInUser("frame18", "Password incorrect.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email not registered." + "'", str2, "Email not registered.");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.awt.event.MouseMotionListener mouseMotionListener20 = null;
        main0.addMouseMotionListener(mouseMotionListener20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        checkoutView6.setResizable(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        boolean boolean2 = password1.getSymbols();
        java.lang.String str3 = password1.getPassword1();
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.awt.event.WindowStateListener[] windowStateListenerArray13 = bethuneLotView12.getWindowStateListeners();
        bethuneLotView12.enable(true);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener16);
        java.awt.Point point18 = bethuneLotView12.getLocation();
        bethuneLotView1.setLocation(point18);
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        long long27 = checkoutView26.hoursBookedFor;
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cardNumberField;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cardNumberField;
        javax.swing.JRadioButton jRadioButton44 = null;
        checkoutView42.debitRadioButton = jRadioButton44;
        views.Main main46 = new views.Main();
        java.awt.Cursor cursor47 = null;
        main46.setCursor(cursor47);
        boolean boolean51 = main46.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView52 = new views.CheckoutView(main46);
        javax.swing.JTextField jTextField53 = checkoutView52.cvvField;
        javax.swing.JLabel jLabel54 = checkoutView52.nameCard;
        checkoutView42.nameCard = jLabel54;
        checkoutView34.cvvLabel = jLabel54;
        checkoutView26.nameCard = jLabel54;
        javax.swing.JButton jButton58 = checkoutView26.backButton;
        bethuneLotView1.setColorButton(jButton58);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNotNull(windowStateListenerArray13);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jTextField53);
        org.junit.Assert.assertNotNull(jLabel54);
        org.junit.Assert.assertNotNull(jButton58);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        boolean boolean18 = bethuneLotView1.isBackgroundSet();
        boolean boolean19 = bethuneLotView1.isValid();
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Font font22 = null;
        bethuneLotView21.setFont(font22);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = bethuneLotView21.getBaselineResizeBehavior();
        java.awt.Image image25 = null;
        boolean boolean31 = bethuneLotView21.imageUpdate(image25, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar32 = null;
        bethuneLotView21.setMenuBar(menuBar32);
        java.awt.Event event34 = null;
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Font font37 = null;
        bethuneLotView36.setFont(font37);
        bethuneLotView36.toBack();
        java.awt.Event event40 = null;
        boolean boolean43 = bethuneLotView36.mouseDrag(event40, 0, 1);
        bethuneLotView36.remove(0);
        bethuneLotView36.doLayout();
        bethuneLotView36.disable();
        java.awt.Component component50 = bethuneLotView36.locate((int) (short) -1, 12);
        boolean boolean51 = bethuneLotView21.action(event34, (java.lang.Object) bethuneLotView36);
        views.Main main52 = null;
        views.BethuneLotView bethuneLotView53 = new views.BethuneLotView(main52);
        java.awt.Dimension dimension54 = null;
        java.awt.Dimension dimension55 = bethuneLotView53.getSize(dimension54);
        java.awt.Dialog.ModalExclusionType modalExclusionType56 = bethuneLotView53.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        bethuneLotView53.removeInputMethodListener(inputMethodListener57);
        java.awt.Rectangle rectangle59 = bethuneLotView53.bounds();
        javax.swing.JRootPane jRootPane60 = bethuneLotView53.getRootPane();
        views.Main main61 = null;
        views.BethuneLotView bethuneLotView62 = new views.BethuneLotView(main61);
        java.awt.Point point64 = bethuneLotView62.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener65 = null;
        bethuneLotView62.addHierarchyListener(hierarchyListener65);
        java.awt.event.WindowListener windowListener67 = null;
        bethuneLotView62.removeWindowListener(windowListener67);
        views.Main main69 = null;
        views.BethuneLotView bethuneLotView70 = new views.BethuneLotView(main69);
        java.awt.Font font71 = null;
        bethuneLotView70.setFont(font71);
        bethuneLotView70.toBack();
        java.awt.Event event74 = null;
        boolean boolean77 = bethuneLotView70.mouseDrag(event74, 0, 1);
        java.awt.Image image78 = null;
        views.Main main81 = null;
        views.BethuneLotView bethuneLotView82 = new views.BethuneLotView(main81);
        java.awt.Font font83 = null;
        bethuneLotView82.setFont(font83);
        bethuneLotView82.toBack();
        java.awt.Event event86 = null;
        boolean boolean89 = bethuneLotView82.mouseDrag(event86, 0, 1);
        boolean boolean90 = bethuneLotView70.prepareImage(image78, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView82);
        java.awt.Rectangle rectangle91 = bethuneLotView82.getBounds();
        bethuneLotView62.setBounds(rectangle91);
        java.awt.Rectangle rectangle93 = jRootPane60.getBounds(rectangle91);
        bethuneLotView21.setMaximizedBounds(rectangle93);
        bethuneLotView1.setBounds(rectangle93);
        java.awt.event.MouseListener[] mouseListenerArray96 = bethuneLotView1.getMouseListeners();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(component50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dimension55);
        org.junit.Assert.assertTrue("'" + modalExclusionType56 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType56.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle59);
        org.junit.Assert.assertNotNull(jRootPane60);
        org.junit.Assert.assertNull(point64);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(rectangle91);
        org.junit.Assert.assertNotNull(rectangle93);
        org.junit.Assert.assertNotNull(mouseListenerArray96);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        views.Main main9 = new views.Main();
        java.awt.Cursor cursor10 = null;
        main9.setCursor(cursor10);
        boolean boolean14 = main9.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView15 = new views.CheckoutView(main9);
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        views.Main main24 = new views.Main();
        java.awt.Cursor cursor25 = null;
        main24.setCursor(cursor25);
        boolean boolean29 = main24.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView30 = new views.CheckoutView(main24);
        javax.swing.JTextField jTextField31 = checkoutView30.cardNumberField;
        javax.swing.JRadioButton jRadioButton32 = null;
        checkoutView30.debitRadioButton = jRadioButton32;
        views.Main main34 = new views.Main();
        java.awt.Cursor cursor35 = null;
        main34.setCursor(cursor35);
        boolean boolean39 = main34.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView40 = new views.CheckoutView(main34);
        javax.swing.JTextField jTextField41 = checkoutView40.cvvField;
        javax.swing.JLabel jLabel42 = checkoutView40.nameCard;
        checkoutView30.nameCard = jLabel42;
        checkoutView22.cvvLabel = jLabel42;
        checkoutView15.cardNumberLabel = jLabel42;
        checkoutView6.cvvLabel = jLabel42;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.createBufferStrategy((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jTextField31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel42);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        views.BookingActionsView bookingActionsView12 = new views.BookingActionsView(main0);
        views.LoginView loginView13 = new views.LoginView(main0);
        views.LoginView loginView14 = new views.LoginView(main0);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        loginView14.removeInputMethodListener(inputMethodListener15);
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        loginView14.removeMouseWheelListener(mouseWheelListener17);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Toolkit toolkit7 = bethuneLotView1.getToolkit();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet9 = bethuneLotView1.getFocusTraversalKeys(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(toolkit7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        bethuneLotView13.requestFocus();
        java.awt.Component component30 = bethuneLotView13.findComponentAt(0, 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(container26);
        org.junit.Assert.assertNull(component30);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        int int12 = bethuneLotView1.getCursorType();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = checkoutView6.cardNumberLabel;
        boolean boolean13 = jLabel10.contains(13, 7);
        jLabel10.resize(1000, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        controllers.LotController.removeLot("Mercedes");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        objects.Manager manager3 = new objects.Manager("", 11, "Honda");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = main0.getHierarchyListeners();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        bethuneLotView9.addHierarchyListener(hierarchyListener12);
        boolean boolean14 = bethuneLotView9.isFocusTraversable();
        bethuneLotView9.setLocation((-1), (int) '4');
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView9, "KIA");
        views.BookingActionsView bookingActionsView20 = new views.BookingActionsView(main0);
        java.awt.Point point21 = main0.location();
        boolean boolean22 = main0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(point21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        user5.paymentType = "hi!";
        user5.debitBalance = (short) 10;
        int int15 = user5.debitBalance;
        java.lang.String str16 = user5.getParkingLot();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.awt.event.ComponentListener componentListener23 = null;
        bethuneLotView13.removeComponentListener(componentListener23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(toolkit22);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.awt.Insets insets39 = bethuneLotView1.getInsets();
        boolean boolean40 = bethuneLotView1.isMinimumSizeSet();
        java.awt.Event event41 = null;
        boolean boolean43 = bethuneLotView1.keyDown(event41, (int) '#');
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
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = bethuneLotView13.getBaselineResizeBehavior();
        bethuneLotView13.setFocusable(false);
        java.awt.Rectangle rectangle27 = bethuneLotView13.bounds();
        boolean boolean30 = bethuneLotView13.inside(7, 13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        boolean boolean7 = bethuneLotView1.isCursorSet();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray8 = bethuneLotView1.getMouseMotionListeners();
        bethuneLotView1.firePropertyChange("Hyundai", (float) 13, (float) ' ');
        java.awt.dnd.DropTarget dropTarget13 = bethuneLotView1.getDropTarget();
        bethuneLotView1.repaint((long) '#');
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray8);
        org.junit.Assert.assertNull(dropTarget13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.awt.Component component2 = main0.getGlassPane();
        main0.resize((int) '#', 1);
        org.junit.Assert.assertNotNull(component2);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        bethuneLotView1.setState(291);
        bethuneLotView1.firePropertyChange("Hyundai", '#', ' ');
        bethuneLotView1.setResizable(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        int int6 = bethuneLotView1.getX();
        bethuneLotView1.setState(100);
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Point point12 = bethuneLotView10.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        bethuneLotView10.addHierarchyListener(hierarchyListener13);
        java.awt.event.WindowListener windowListener15 = null;
        bethuneLotView10.removeWindowListener(windowListener15);
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Font font19 = null;
        bethuneLotView18.setFont(font19);
        bethuneLotView18.toBack();
        java.awt.Event event22 = null;
        boolean boolean25 = bethuneLotView18.mouseDrag(event22, 0, 1);
        java.awt.Image image26 = null;
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Font font31 = null;
        bethuneLotView30.setFont(font31);
        bethuneLotView30.toBack();
        java.awt.Event event34 = null;
        boolean boolean37 = bethuneLotView30.mouseDrag(event34, 0, 1);
        boolean boolean38 = bethuneLotView18.prepareImage(image26, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView30);
        java.awt.Rectangle rectangle39 = bethuneLotView30.getBounds();
        bethuneLotView10.setBounds(rectangle39);
        java.awt.event.WindowStateListener windowStateListener41 = null;
        bethuneLotView10.removeWindowStateListener(windowStateListener41);
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Font font45 = null;
        bethuneLotView44.setFont(font45);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior47 = bethuneLotView44.getBaselineResizeBehavior();
        bethuneLotView44.addNotify();
        bethuneLotView44.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        bethuneLotView44.addPropertyChangeListener(propertyChangeListener53);
        java.awt.Graphics graphics55 = bethuneLotView44.getGraphics();
        bethuneLotView10.print(graphics55);
        bethuneLotView1.update(graphics55);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             bethuneLotView1.setOpacity((float) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1055 + "'", int6 == 1055);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(rectangle39);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior47 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior47.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics55);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        java.awt.Component[] componentArray7 = bethuneLotView1.getComponents();
        bethuneLotView1.setBounds((int) '#', (int) ' ', 0, 4);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(componentArray7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getName();
        java.lang.String str11 = user5.parkingSpotName;
        java.time.LocalDateTime localDateTime12 = null;
        user5.setParkingEndTime(localDateTime12);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        bethuneLotView1.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        user5.parkingFee = 10;
        java.lang.String str12 = user5.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        main0.setAutoRequestFocus(false);
        java.awt.Event event6 = null;
        boolean boolean9 = main0.mouseMove(event6, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str5 = controllers.UserController.registerUser("0", "Account does not exist.", "Pick-up", "Mercedes", "frame34");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email invalid." + "'", str5, "Email invalid.");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JRadioButton jRadioButton9 = checkoutView6.creditRadioButton;
        checkoutView6.firePropertyChange("Mercedes", (float) '#', (float) 0);
        boolean boolean14 = checkoutView6.isLightweight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jRadioButton9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeNumbers();
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        password.NumberPasswordBuilder numberPasswordBuilder7 = new password.NumberPasswordBuilder();
        numberPasswordBuilder7.setLowerCase();
        numberPasswordBuilder7.setIncludeSymbols();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder7);
        generator0.generatePassword();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        javax.swing.JButton jButton49 = checkoutView6.backButton;
        java.time.LocalDateTime localDateTime50 = null;
        checkoutView6.endTime = localDateTime50;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertNotNull(jButton49);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeNumbers();
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        int int2 = main0.getComponentCount();
        views.RegisterView registerView3 = new views.RegisterView(main0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        java.lang.String str11 = user5.getCvvNumber();
        java.lang.String str12 = user5.getLotName();
        user5.setCreditBalance("0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email not registered." + "'", str11, "Email not registered.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        int int2 = main0.getComponentCount();
        java.awt.image.BufferStrategy bufferStrategy3 = main0.getBufferStrategy();
        views.CheckoutView checkoutView4 = new views.CheckoutView(main0);
        javax.swing.JLabel jLabel5 = checkoutView4.nameCard;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(jLabel5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        user5.accountType = "BMW";
        int int11 = user5.parkingFee;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = checkoutView6.nameCard;
        java.lang.String str9 = checkoutView6.price;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        boolean boolean11 = bethuneLotView1.isActive();
        java.awt.event.WindowFocusListener windowFocusListener12 = null;
        bethuneLotView1.removeWindowFocusListener(windowFocusListener12);
        boolean boolean14 = bethuneLotView1.isFocusTraversalPolicySet();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = bethuneLotView1.createImage(imageProducer10);
        java.awt.event.MouseListener mouseListener12 = null;
        bethuneLotView1.addMouseListener(mouseListener12);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(image11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        views.Main main0 = new views.Main();
        views.VanierLotView vanierLotView1 = new views.VanierLotView(main0);
        views.Main main2 = null;
        views.BethuneLotView bethuneLotView3 = new views.BethuneLotView(main2);
        java.awt.Font font4 = null;
        bethuneLotView3.setFont(font4);
        bethuneLotView3.toBack();
        java.awt.Event event7 = null;
        boolean boolean10 = bethuneLotView3.mouseDrag(event7, 0, 1);
        bethuneLotView3.remove(0);
        bethuneLotView3.doLayout();
        boolean boolean14 = bethuneLotView3.isFocusCycleRoot();
        int int15 = bethuneLotView3.getExtendedState();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component16 = vanierLotView1.add((java.awt.Component) bethuneLotView3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.applyResourceBundle("0");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name 0, locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.awt.event.FocusListener focusListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            component15.addFocusListener(focusListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(component15);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.enable(true);
        boolean boolean7 = bethuneLotView1.inside(7, 2);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        objects.User user0 = new objects.User();
        java.lang.String str1 = user0.cardNumber;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        maintainManager0.clear();
        maintainManager0.clear();
        objects.SuperManager superManager8 = new objects.SuperManager("BMW", 11, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        maintainManager0.loggedInManager = superManager8;
        org.junit.Assert.assertNotNull(maintainManager0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setUpperCase();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        javax.swing.JMenuBar jMenuBar7 = null;
        bethuneLotView1.setJMenuBar(jMenuBar7);
        java.awt.Event event9 = null;
        boolean boolean11 = bethuneLotView1.keyUp(event9, (int) '4');
        bethuneLotView1.disable();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        boolean boolean49 = checkoutView6.dateConfirmed;
        java.awt.Container container50 = checkoutView6.getContentPane();
        javax.swing.JTextField jTextField51 = checkoutView6.cardNumberField;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(container50);
        org.junit.Assert.assertNotNull(jTextField51);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str5 = bethuneLotView1.getWarningString();
        javax.swing.JMenuBar jMenuBar6 = bethuneLotView1.getJMenuBar();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jMenuBar6);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        views.AlertStateContext alertStateContext15 = lassondeLotView2.getParkingSpotState();
        views.AlertStateContext alertStateContext16 = lassondeLotView2.getParkingSpotState();
        org.junit.Assert.assertNotNull(container1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jButton13);
        org.junit.Assert.assertNotNull(alertStateContext15);
        org.junit.Assert.assertNotNull(alertStateContext16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setCardNumber("Honda");
        user5.addPrice(3);
        java.lang.String str13 = user5.cardName;
        user5.cardNumber = "Nissan";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        java.awt.event.WindowStateListener windowStateListener10 = null;
        checkoutView6.removeWindowStateListener(windowStateListener10);
        java.awt.event.ContainerListener containerListener12 = null;
        checkoutView6.removeContainerListener(containerListener12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.awt.event.WindowListener windowListener25 = null;
        checkoutView6.removeWindowListener(windowListener25);
        javax.swing.JLabel jLabel27 = checkoutView6.nameCard;
        checkoutView6.price = "frame34";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLabel27);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        bethuneLotView1.removeMouseWheelListener(mouseWheelListener14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        bethuneLotView1.addInputMethodListener(inputMethodListener16);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JButton jButton10 = checkoutView6.backButton;
        java.time.LocalDateTime localDateTime11 = null;
        checkoutView6.endTime = localDateTime11;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jButton10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.awt.FocusTraversalPolicy focusTraversalPolicy2 = null;
        main0.setFocusTraversalPolicy(focusTraversalPolicy2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        javax.swing.JMenuBar jMenuBar7 = null;
        bethuneLotView1.setJMenuBar(jMenuBar7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        bethuneLotView1.removeMouseMotionListener(mouseMotionListener9);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.awt.event.KeyListener keyListener15 = null;
        bethuneLotView1.removeKeyListener(keyListener15);
        java.awt.Cursor cursor17 = bethuneLotView1.getCursor();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(cursor17);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
            java.awt.Component component14 = bethuneLotView1.getComponent((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        bethuneLotView8.removeAll();
        java.awt.im.InputContext inputContext20 = bethuneLotView8.getInputContext();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(inputContext20);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.awt.Cursor cursor23 = bethuneLotView1.getCursor();
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertNotNull(cursor23);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        password1.setPassword1("");
        password1.setLength((int) 'a');
        boolean boolean6 = password1.getincludeUpperCase();
        int int7 = password1.getLength();
        password1.addUpperCase(false);
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        double double8 = user5.getRate();
        user5.chargeUser("Account does not exist.", 16);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        int int14 = user5.getPrice();
        double double15 = user5.getRate();
        java.lang.String str16 = user5.cvvNumber;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        password.Password password0 = new password.Password();
        boolean boolean1 = password0.getincludeLowerCase();
        password0.setPassword1("SUV");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        user5.accountType = "BMW";
        int int11 = user5.creditBalnce;
        double double12 = user5.rate;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        javax.swing.JButton jButton38 = checkoutView6.backButton;
        java.time.LocalDateTime localDateTime39 = checkoutView6.currentTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(jButton38);
        org.junit.Assert.assertNull(localDateTime39);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setIncludeSymbols();
        password.Password password2 = strongPasswordBuilder0.getPassword();
        strongPasswordBuilder0.setLength();
        org.junit.Assert.assertNotNull(password2);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setUpperCase();
        numberPasswordBuilder0.setUpperCase();
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        checkoutView6.move(16, 1000);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior40 = checkoutView6.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior40 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior40.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        java.time.LocalDateTime localDateTime11 = user5.getParkingEndTime();
        java.time.LocalDateTime localDateTime12 = user5.getParkingEndTime();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        bethuneLotView13.removePropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.Main main8 = new views.Main();
        java.awt.MenuComponent menuComponent9 = null;
        main8.remove(menuComponent9);
        main8.resetContentPane();
        int int12 = main8.getExtendedState();
        main8.enable(true);
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Point point18 = bethuneLotView16.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        bethuneLotView16.addHierarchyListener(hierarchyListener19);
        java.awt.event.WindowListener windowListener21 = null;
        bethuneLotView16.removeWindowListener(windowListener21);
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
        java.awt.Rectangle rectangle45 = bethuneLotView36.getBounds();
        bethuneLotView16.setBounds(rectangle45);
        java.awt.event.WindowStateListener windowStateListener47 = null;
        bethuneLotView16.removeWindowStateListener(windowStateListener47);
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Font font51 = null;
        bethuneLotView50.setFont(font51);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior53 = bethuneLotView50.getBaselineResizeBehavior();
        bethuneLotView50.addNotify();
        bethuneLotView50.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        bethuneLotView50.addPropertyChangeListener(propertyChangeListener59);
        java.awt.Graphics graphics61 = bethuneLotView50.getGraphics();
        bethuneLotView16.print(graphics61);
        main8.printComponents(graphics61);
        main0.paintAll(graphics61);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(rectangle45);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior53 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior53.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics61);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        java.awt.Event event3 = null;
        boolean boolean5 = bethuneLotView1.keyDown(event3, 0);
        views.Main main6 = null;
        views.BethuneLotView bethuneLotView7 = new views.BethuneLotView(main6);
        java.awt.Font font8 = null;
        bethuneLotView7.setFont(font8);
        bethuneLotView7.toBack();
        java.awt.Event event11 = null;
        boolean boolean14 = bethuneLotView7.mouseDrag(event11, 0, 1);
        java.awt.Image image15 = null;
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Font font20 = null;
        bethuneLotView19.setFont(font20);
        bethuneLotView19.toBack();
        java.awt.Event event23 = null;
        boolean boolean26 = bethuneLotView19.mouseDrag(event23, 0, 1);
        boolean boolean27 = bethuneLotView7.prepareImage(image15, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView19);
        java.awt.MenuBar menuBar28 = null;
        bethuneLotView19.setMenuBar(menuBar28);
        bethuneLotView19.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color34 = bethuneLotView19.getForeground();
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Font font37 = null;
        bethuneLotView36.setFont(font37);
        bethuneLotView36.toBack();
        java.awt.Event event40 = null;
        boolean boolean43 = bethuneLotView36.mouseDrag(event40, 0, 1);
        java.awt.Image image44 = null;
        views.Main main47 = null;
        views.BethuneLotView bethuneLotView48 = new views.BethuneLotView(main47);
        java.awt.Font font49 = null;
        bethuneLotView48.setFont(font49);
        bethuneLotView48.toBack();
        java.awt.Event event52 = null;
        boolean boolean55 = bethuneLotView48.mouseDrag(event52, 0, 1);
        boolean boolean56 = bethuneLotView36.prepareImage(image44, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView48);
        java.awt.Cursor cursor57 = null;
        bethuneLotView36.setCursor(cursor57);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray59 = bethuneLotView36.getWindowFocusListeners();
        boolean boolean62 = bethuneLotView36.contains((int) (short) 1, (int) (short) 10);
        views.Main main63 = null;
        views.BethuneLotView bethuneLotView64 = new views.BethuneLotView(main63);
        java.awt.Point point66 = bethuneLotView64.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener67 = null;
        bethuneLotView64.addHierarchyListener(hierarchyListener67);
        boolean boolean69 = bethuneLotView64.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer70 = null;
        java.awt.Image image71 = bethuneLotView64.createImage(imageProducer70);
        views.Main main74 = null;
        views.BethuneLotView bethuneLotView75 = new views.BethuneLotView(main74);
        java.awt.Dimension dimension76 = null;
        java.awt.Dimension dimension77 = bethuneLotView75.getSize(dimension76);
        java.awt.Dialog.ModalExclusionType modalExclusionType78 = bethuneLotView75.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        bethuneLotView75.removeInputMethodListener(inputMethodListener79);
        int int81 = bethuneLotView36.checkImage(image71, 8, 291, (java.awt.image.ImageObserver) bethuneLotView75);
        views.Main main84 = null;
        views.BethuneLotView bethuneLotView85 = new views.BethuneLotView(main84);
        java.awt.Font font86 = null;
        bethuneLotView85.setFont(font86);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior88 = bethuneLotView85.getBaselineResizeBehavior();
        bethuneLotView85.addNotify();
        bethuneLotView85.firePropertyChange("", '4', ' ');
        boolean boolean94 = bethuneLotView19.prepareImage(image71, (int) ' ', 0, (java.awt.image.ImageObserver) bethuneLotView85);
        bethuneLotView1.setIconImage(image71);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(color34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(point66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(image71);
        org.junit.Assert.assertNotNull(dimension77);
        org.junit.Assert.assertTrue("'" + modalExclusionType78 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType78.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior88 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior88.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        boolean boolean10 = checkoutView6.isFocusTraversalPolicySet();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.list(printWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        bethuneLotView1.setAlwaysOnTop(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setUpperCase();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.setUndecorated(false);
        java.awt.event.KeyListener keyListener11 = null;
        bethuneLotView1.addKeyListener(keyListener11);
        bethuneLotView1.resize(1, 450);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str1 = controllers.UserController.checkEmail("Email invalid.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Email invalid." + "'", str1, "Email invalid.");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        lotChoiceView1.repaint(100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.awt.event.WindowListener windowListener13 = null;
        bethuneLotView1.addWindowListener(windowListener13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Rectangle rectangle7 = bethuneLotView1.bounds();
        javax.swing.JRootPane jRootPane8 = bethuneLotView1.getRootPane();
        views.Main main9 = new views.Main();
        views.LotChoiceView lotChoiceView10 = new views.LotChoiceView(main9);
        boolean boolean11 = main9.isEnabled();
        views.LotChoiceView lotChoiceView12 = new views.LotChoiceView(main9);
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Point point16 = bethuneLotView14.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener17 = null;
        bethuneLotView14.addHierarchyListener(hierarchyListener17);
        java.awt.event.WindowListener windowListener19 = null;
        bethuneLotView14.removeWindowListener(windowListener19);
        java.awt.event.ComponentListener componentListener21 = null;
        bethuneLotView14.addComponentListener(componentListener21);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bethuneLotView14.addHierarchyListener(hierarchyListener23);
        views.Main main25 = new views.Main();
        java.awt.Container container26 = main25.getOriginalContentPane();
        views.LassondeLotView lassondeLotView27 = new views.LassondeLotView(main25);
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cardNumberField;
        java.util.Locale locale36 = null;
        checkoutView34.setLocale(locale36);
        javax.swing.JButton jButton38 = checkoutView34.backButton;
        lassondeLotView27.setColorButton(jButton38);
        bethuneLotView14.setColorButton(jButton38);
        // The following exception was thrown during execution in test generation
        try {
            jRootPane8.add((java.awt.Component) lotChoiceView12, (java.lang.Object) jButton38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(jRootPane8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(container26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jButton38);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        java.awt.Font font11 = bethuneLotView1.getFont();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener12);
        java.awt.Rectangle rectangle14 = bethuneLotView1.bounds();
        java.awt.image.ColorModel colorModel15 = bethuneLotView1.getColorModel();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        bethuneLotView1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(colorModel15);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        java.awt.event.KeyListener[] keyListenerArray7 = bethuneLotView1.getKeyListeners();
        java.awt.event.KeyListener keyListener8 = null;
        bethuneLotView1.removeKeyListener(keyListener8);
        java.awt.image.VolatileImage volatileImage12 = bethuneLotView1.createVolatileImage((int) (byte) 10, 1000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNull(volatileImage12);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        main0.resetContentPane();
        views.LoginView loginView10 = new views.LoginView(main0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        objects.Manager manager5 = new objects.Manager("", 6, "hi!");
        objects.SuperManager superManager9 = new objects.SuperManager("BMW", 11, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Manager manager13 = new objects.Manager("hi!", 0, "Available");
        objects.SuperManager superManager17 = new objects.SuperManager("Vanier,Bethune,Calumet,Schulich", (-1), "Hyundai");
        objects.SuperManager superManager21 = new objects.SuperManager("Invalid plate number", (int) (short) -1, "");
        objects.Manager[] managerArray22 = new objects.Manager[] { manager5, superManager9, manager13, superManager17, superManager21 };
        java.util.ArrayList<objects.Manager> managerList23 = new java.util.ArrayList<objects.Manager>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<objects.Manager>) managerList23, managerArray22);
        maintainManager0.managers = managerList23;
        maintainManager0.clear();
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNotNull(managerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        java.time.LocalDateTime localDateTime11 = user5.getParkingEndTime();
        double double12 = user5.getRate();
        java.lang.String str13 = user5.getCardNumber();
        user5.setCardName("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        bethuneLotView1.setMaximizedBounds(rectangle73);
        boolean boolean75 = bethuneLotView1.isDoubleBuffered();
        java.awt.event.ContainerListener containerListener76 = null;
        bethuneLotView1.removeContainerListener(containerListener76);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        bethuneLotView1.repaint((long) 13, (int) 'a', 4, 128, 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        user17.plateNumber = "frame9";
        user17.lotName = "frame34";
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.setPaymentType("frame49");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        user5.chargeUser("Invalid plate number", 291);
        java.lang.String str19 = user5.getAccountType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        views.Main main0 = new views.Main();
        boolean boolean1 = main0.isUndecorated();
        int int2 = main0.getExtendedState();
        views.LotChoiceView lotChoiceView3 = new views.LotChoiceView(main0);
        java.lang.String str4 = lotChoiceView3.getLblMessage();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        bethuneLotView8.removeAll();
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Point point23 = bethuneLotView21.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        bethuneLotView21.addHierarchyListener(hierarchyListener24);
        bethuneLotView21.show();
        bethuneLotView21.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray28 = bethuneLotView21.getPropertyChangeListeners();
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Font font31 = null;
        bethuneLotView30.setFont(font31);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        bethuneLotView30.addPropertyChangeListener("", propertyChangeListener34);
        views.Main main36 = null;
        views.BethuneLotView bethuneLotView37 = new views.BethuneLotView(main36);
        java.awt.Point point39 = bethuneLotView37.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener40 = null;
        bethuneLotView37.addHierarchyListener(hierarchyListener40);
        boolean boolean42 = bethuneLotView37.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer43 = null;
        java.awt.Image image44 = bethuneLotView37.createImage(imageProducer43);
        views.Main main45 = null;
        views.BethuneLotView bethuneLotView46 = new views.BethuneLotView(main45);
        java.awt.Font font47 = null;
        bethuneLotView46.setFont(font47);
        bethuneLotView46.toBack();
        java.awt.Event event50 = null;
        boolean boolean53 = bethuneLotView46.mouseDrag(event50, 0, 1);
        bethuneLotView46.remove(0);
        bethuneLotView46.enable();
        int int57 = bethuneLotView30.checkImage(image44, (java.awt.image.ImageObserver) bethuneLotView46);
        views.Main main58 = null;
        views.BethuneLotView bethuneLotView59 = new views.BethuneLotView(main58);
        java.awt.Point point61 = bethuneLotView59.getMousePosition(false);
        java.awt.Container container62 = bethuneLotView59.getFocusCycleRootAncestor();
        java.awt.Event event63 = null;
        java.lang.Object obj64 = null;
        boolean boolean65 = bethuneLotView59.lostFocus(event63, obj64);
        int int66 = bethuneLotView21.checkImage(image44, (java.awt.image.ImageObserver) bethuneLotView59);
        bethuneLotView8.setIconImage(image44);
        bethuneLotView8.setUndecorated(true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray28);
        org.junit.Assert.assertNull(point39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(image44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(point61);
        org.junit.Assert.assertNull(container62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        bethuneLotView17.toFront();
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(color29);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        bethuneLotView1.setState((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        int int2 = main0.getComponentCount();
        java.awt.image.BufferStrategy bufferStrategy3 = main0.getBufferStrategy();
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.Point point7 = bethuneLotView5.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        bethuneLotView5.addHierarchyListener(hierarchyListener8);
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView5.removeWindowListener(windowListener10);
        java.awt.event.WindowListener windowListener12 = null;
        bethuneLotView5.removeWindowListener(windowListener12);
        java.awt.Window.Type type14 = bethuneLotView5.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        bethuneLotView5.addHierarchyBoundsListener(hierarchyBoundsListener15);
        java.awt.Color color17 = null;
        bethuneLotView5.setForeground(color17);
        boolean boolean19 = bethuneLotView5.isVisible();
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView5.removeHierarchyListener(hierarchyListener20);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Point point25 = bethuneLotView23.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView23.addHierarchyListener(hierarchyListener26);
        bethuneLotView23.show();
        bethuneLotView23.list();
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        bethuneLotView31.toBack();
        java.awt.Event event35 = null;
        boolean boolean38 = bethuneLotView31.mouseDrag(event35, 0, 1);
        bethuneLotView31.remove(0);
        bethuneLotView31.setFocusTraversalPolicyProvider(false);
        bethuneLotView23.remove((java.awt.Component) bethuneLotView31);
        java.awt.Color color44 = bethuneLotView23.getBackground();
        bethuneLotView5.setBackground(color44);
        main0.setBackground(color44);
        java.awt.event.ComponentListener componentListener47 = null;
        main0.addComponentListener(componentListener47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNull(point7);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + java.awt.Window.Type.NORMAL + "'", type14.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(color44);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = checkoutView26.cvvField;
        checkoutView6.cvvField = jTextField29;
        java.awt.GraphicsConfiguration graphicsConfiguration31 = checkoutView6.getGraphicsConfiguration();
        java.time.LocalDateTime localDateTime32 = checkoutView6.endTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(graphicsConfiguration31);
        org.junit.Assert.assertNull(localDateTime32);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.awt.image.VolatileImage volatileImage28 = bethuneLotView1.createVolatileImage(0, 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(volatileImage28);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        java.lang.String str3 = lotChoiceView1.getLblMessage();
        java.awt.image.ImageProducer imageProducer4 = null;
        java.awt.Image image5 = lotChoiceView1.createImage(imageProducer4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(image5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener10);
        bethuneLotView1.setAlwaysOnTop(false);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        password0.setLength(0);
        boolean boolean5 = password0.getSymbols();
        int int6 = password0.getLength();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.awt.Image image11 = bethuneLotView1.getIconImage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        javax.swing.TransferHandler transferHandler11 = bethuneLotView1.getTransferHandler();
        bethuneLotView1.show();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(transferHandler11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        int int25 = bethuneLotView1.getDefaultCloseOperation();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        bethuneLotView1.removeHierarchyBoundsListener(hierarchyBoundsListener26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        views.Main main0 = new views.Main();
        boolean boolean1 = main0.isUndecorated();
        views.ManagerActionsView managerActionsView2 = new views.ManagerActionsView(main0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        views.BookingActionsView bookingActionsView13 = new views.BookingActionsView(main0);
        java.awt.Point point14 = main0.getLocationOnScreen();
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(point14);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.awt.Insets insets28 = bethuneLotView1.insets();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(insets28);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.awt.event.WindowListener windowListener25 = null;
        checkoutView6.removeWindowListener(windowListener25);
        javax.swing.JLabel jLabel27 = checkoutView6.nameCard;
        java.awt.image.ColorModel colorModel28 = jLabel27.getColorModel();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLabel27);
        org.junit.Assert.assertNotNull(colorModel28);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.addParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "BMW");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Font font23 = null;
        bethuneLotView22.setFont(font23);
        boolean boolean25 = bethuneLotView22.isOpaque();
        bethuneLotView22.setState((int) (byte) 0);
        java.awt.event.ComponentListener[] componentListenerArray28 = bethuneLotView22.getComponentListeners();
        views.Main main29 = null;
        views.BethuneLotView bethuneLotView30 = new views.BethuneLotView(main29);
        java.awt.Font font31 = null;
        bethuneLotView30.setFont(font31);
        bethuneLotView30.toBack();
        java.awt.Event event34 = null;
        boolean boolean37 = bethuneLotView30.mouseDrag(event34, 0, 1);
        java.awt.Image image38 = null;
        views.Main main41 = null;
        views.BethuneLotView bethuneLotView42 = new views.BethuneLotView(main41);
        java.awt.Font font43 = null;
        bethuneLotView42.setFont(font43);
        bethuneLotView42.toBack();
        java.awt.Event event46 = null;
        boolean boolean49 = bethuneLotView42.mouseDrag(event46, 0, 1);
        boolean boolean50 = bethuneLotView30.prepareImage(image38, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView42);
        java.awt.Rectangle rectangle51 = bethuneLotView42.getBounds();
        java.awt.Rectangle rectangle52 = bethuneLotView22.getBounds(rectangle51);
        checkoutView6.setBounds(rectangle52);
        javax.swing.JButton jButton54 = checkoutView6.backButton;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(componentListenerArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rectangle51);
        org.junit.Assert.assertNotNull(rectangle52);
        org.junit.Assert.assertNotNull(jButton54);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.awt.peer.ComponentPeer componentPeer27 = bethuneLotView13.getPeer();
        bethuneLotView13.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNull(container26);
        org.junit.Assert.assertNull(componentPeer27);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        views.Main main7 = new views.Main();
        java.awt.Cursor cursor8 = null;
        main7.setCursor(cursor8);
        boolean boolean10 = main7.requestFocusInWindow();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Font font18 = null;
        bethuneLotView17.setFont(font18);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior20 = bethuneLotView17.getBaselineResizeBehavior();
        bethuneLotView17.addNotify();
        bethuneLotView17.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        bethuneLotView17.addPropertyChangeListener(propertyChangeListener26);
        java.awt.Graphics graphics28 = bethuneLotView17.getGraphics();
        bethuneLotView12.printAll(graphics28);
        main7.printAll(graphics28);
        bethuneLotView1.printAll(graphics28);
        views.Main main32 = null;
        views.BethuneLotView bethuneLotView33 = new views.BethuneLotView(main32);
        java.awt.Point point35 = bethuneLotView33.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener36 = null;
        bethuneLotView33.addHierarchyListener(hierarchyListener36);
        bethuneLotView33.show();
        bethuneLotView33.list();
        views.Main main40 = null;
        views.BethuneLotView bethuneLotView41 = new views.BethuneLotView(main40);
        java.awt.Dimension dimension42 = null;
        java.awt.Dimension dimension43 = bethuneLotView41.getSize(dimension42);
        java.awt.Dialog.ModalExclusionType modalExclusionType44 = bethuneLotView41.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener45 = null;
        bethuneLotView41.removeInputMethodListener(inputMethodListener45);
        java.awt.Rectangle rectangle47 = bethuneLotView41.bounds();
        java.awt.Rectangle rectangle48 = bethuneLotView33.getBounds(rectangle47);
// flaky:         bethuneLotView1.setShape((java.awt.Shape) rectangle48);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics28);
        org.junit.Assert.assertNull(point35);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + modalExclusionType44 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType44.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(rectangle48);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        bethuneLotView13.resize(128, 13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.lang.Class<?> wildcardClass28 = dimension26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        views.Main main0 = null;
        views.LoginView loginView1 = new views.LoginView(main0);
        javax.swing.TransferHandler transferHandler2 = loginView1.getTransferHandler();
        org.junit.Assert.assertNull(transferHandler2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        bethuneLotView1.setMaximizedBounds(rectangle73);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener75 = null;
        bethuneLotView1.removeHierarchyBoundsListener(hierarchyBoundsListener75);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        java.lang.String str11 = user5.getLotName();
        int int12 = user5.parkingFee;
        user5.setApproved(false);
        user5.parkingSpotName = "0";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        checkoutView6.move(16, 1000);
        java.awt.Event event40 = null;
        boolean boolean43 = checkoutView6.mouseEnter(event40, 52, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        boolean boolean20 = bethuneLotView1.isFocusTraversalPolicySet();
        bethuneLotView1.toFront();
        bethuneLotView1.validate();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        bethuneLotView1.setOpacity((float) (short) 1);
        java.awt.Component component7 = bethuneLotView1.getGlassPane();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        int int11 = user5.getPrice();
        double double12 = user5.rate;
        java.lang.String str13 = user5.paymentType;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setParkingSpot("Email invalid.");
        user5.setPayementType("BMW");
        int int13 = user5.debitBalance;
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        main0.removePropertyChangeListener("Email invalid.", propertyChangeListener25);
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Point point30 = bethuneLotView28.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        bethuneLotView28.addHierarchyListener(hierarchyListener31);
        bethuneLotView28.show();
        bethuneLotView28.list();
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Dimension dimension37 = null;
        java.awt.Dimension dimension38 = bethuneLotView36.getSize(dimension37);
        java.awt.Dialog.ModalExclusionType modalExclusionType39 = bethuneLotView36.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        bethuneLotView36.removeInputMethodListener(inputMethodListener40);
        java.awt.Rectangle rectangle42 = bethuneLotView36.bounds();
        java.awt.Rectangle rectangle43 = bethuneLotView28.getBounds(rectangle42);
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView28, "Invalid plate number");
        java.awt.event.MouseListener mouseListener46 = null;
        main0.addMouseListener(mouseListener46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle42);
        org.junit.Assert.assertNotNull(rectangle43);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        int int2 = main0.getComponentCount();
        java.awt.image.BufferStrategy bufferStrategy3 = main0.getBufferStrategy();
        views.CheckoutView checkoutView4 = new views.CheckoutView(main0);
        long long5 = checkoutView4.hoursBookedFor;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        javax.swing.JLayeredPane jLayeredPane24 = bethuneLotView1.getLayeredPane();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jLayeredPane24);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        boolean boolean9 = bethuneLotView1.inside(2, 16);
        java.awt.Component component12 = bethuneLotView1.getComponentAt((int) (byte) 10, 2);
        java.awt.dnd.DropTarget dropTarget13 = null;
        component12.setDropTarget(dropTarget13);
        boolean boolean15 = component12.isFocusOwner();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = checkoutView6.nameCard;
        javax.swing.JTextField jTextField9 = checkoutView6.cvvField;
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
        javax.swing.JTextField jTextField39 = checkoutView16.cardNumberField;
        jTextField39.setName("Mercedes");
        checkoutView6.cardNumberField = jTextField39;
        java.awt.event.InputMethodListener inputMethodListener43 = null;
        jTextField39.addInputMethodListener(inputMethodListener43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNotNull(jTextField9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jLabel36);
        org.junit.Assert.assertNotNull(jTextField39);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        boolean boolean19 = bethuneLotView1.isVisible();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'", type18.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Point point36 = bethuneLotView34.getMousePosition(false);
        java.awt.Container container37 = bethuneLotView34.getFocusCycleRootAncestor();
        java.awt.event.WindowListener windowListener38 = null;
        bethuneLotView34.removeWindowListener(windowListener38);
        java.lang.String str40 = bethuneLotView34.getName();
        int int41 = bethuneLotView13.getComponentZOrder((java.awt.Component) bethuneLotView34);
        views.Main main42 = new views.Main();
        java.awt.Cursor cursor43 = null;
        main42.setCursor(cursor43);
        boolean boolean47 = main42.inside((int) (byte) 100, 0);
        main42.setSize((int) (short) 10, (int) (byte) 10);
        views.Main main51 = null;
        views.BethuneLotView bethuneLotView52 = new views.BethuneLotView(main51);
        java.awt.Font font53 = null;
        bethuneLotView52.setFont(font53);
        int int55 = bethuneLotView52.getY();
        bethuneLotView52.disable();
        java.awt.Dimension dimension57 = bethuneLotView52.getMinimumSize();
        main42.setMaximumSize(dimension57);
        main42.resize((int) '4', 1055);
        boolean boolean62 = bethuneLotView34.isAncestorOf((java.awt.Component) main42);
        views.Main main63 = null;
        views.BethuneLotView bethuneLotView64 = new views.BethuneLotView(main63);
        java.awt.Font font65 = null;
        bethuneLotView64.setFont(font65);
        boolean boolean67 = bethuneLotView64.isOpaque();
        bethuneLotView64.repaint();
        java.awt.event.KeyListener keyListener69 = null;
        bethuneLotView64.removeKeyListener(keyListener69);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView34.setComponentZOrder((java.awt.Component) bethuneLotView64, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNull(point36);
        org.junit.Assert.assertNull(container37);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "frame54" + "'", str40, "frame54");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 291 + "'", int55 == 291);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.awt.Font font11 = bethuneLotView1.getFont();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener12);
        java.awt.Rectangle rectangle14 = bethuneLotView1.bounds();
        java.awt.image.ColorModel colorModel15 = bethuneLotView1.getColorModel();
        bethuneLotView1.repaint(97, 0, (-1), 150);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(colorModel15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.setIgnoreRepaint(false);
        bethuneLotView1.transferFocusBackward();
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.awt.Shape shape14 = bethuneLotView1.getShape();
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        boolean boolean19 = bethuneLotView16.isOpaque();
        bethuneLotView16.setState((int) (byte) 0);
        java.awt.event.ComponentListener[] componentListenerArray22 = bethuneLotView16.getComponentListeners();
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
        java.awt.Rectangle rectangle45 = bethuneLotView36.getBounds();
        java.awt.Rectangle rectangle46 = bethuneLotView16.getBounds(rectangle45);
// flaky:         bethuneLotView1.setShape((java.awt.Shape) rectangle46);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(componentListenerArray22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(rectangle45);
        org.junit.Assert.assertNotNull(rectangle46);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand1;
        java.util.Random random6 = null;
        sensor0.rand1 = random6;
        java.util.Random random8 = sensor0.rand2;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNull(random5);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.awt.Graphics graphics26 = null;
        bethuneLotView13.paintAll(graphics26);
        boolean boolean28 = bethuneLotView13.isFocusTraversable();
        java.awt.Window[] windowArray29 = bethuneLotView13.getOwnedWindows();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(windowArray29);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        views.Main main0 = new views.Main();
        boolean boolean1 = main0.isUndecorated();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        main0.addPropertyChangeListener(propertyChangeListener2);
        views.Main main4 = null;
        views.BethuneLotView bethuneLotView5 = new views.BethuneLotView(main4);
        java.awt.Font font6 = null;
        bethuneLotView5.setFont(font6);
        int int8 = bethuneLotView5.getY();
        bethuneLotView5.disable();
        java.awt.Dimension dimension10 = bethuneLotView5.getMinimumSize();
        bethuneLotView5.remove((int) (short) 0);
        bethuneLotView5.setLocationByPlatform(false);
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Point point18 = bethuneLotView16.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        bethuneLotView16.addHierarchyListener(hierarchyListener19);
        java.awt.event.WindowListener windowListener21 = null;
        bethuneLotView16.removeWindowListener(windowListener21);
        java.awt.event.WindowListener windowListener23 = null;
        bethuneLotView16.removeWindowListener(windowListener23);
        java.awt.event.MouseListener mouseListener25 = null;
        bethuneLotView16.addMouseListener(mouseListener25);
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Dimension dimension29 = null;
        java.awt.Dimension dimension30 = bethuneLotView28.getSize(dimension29);
        java.awt.Dialog.ModalExclusionType modalExclusionType31 = bethuneLotView28.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        bethuneLotView28.addPropertyChangeListener(propertyChangeListener32);
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Dimension dimension36 = null;
        java.awt.Dimension dimension37 = bethuneLotView35.getSize(dimension36);
        java.awt.Dialog.ModalExclusionType modalExclusionType38 = bethuneLotView35.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        bethuneLotView35.addPropertyChangeListener(propertyChangeListener39);
        bethuneLotView28.remove((java.awt.Component) bethuneLotView35);
        java.awt.Component component42 = bethuneLotView28.getFocusOwner();
        bethuneLotView28.firePropertyChange("hi!", ' ', '4');
        bethuneLotView28.requestFocus();
        views.Main main48 = null;
        views.BethuneLotView bethuneLotView49 = new views.BethuneLotView(main48);
        java.awt.Font font50 = null;
        bethuneLotView49.setFont(font50);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior52 = bethuneLotView49.getBaselineResizeBehavior();
        bethuneLotView49.addNotify();
        bethuneLotView49.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        bethuneLotView49.addPropertyChangeListener(propertyChangeListener58);
        java.awt.Graphics graphics60 = bethuneLotView49.getGraphics();
        bethuneLotView28.printComponents(graphics60);
        bethuneLotView16.printComponents(graphics60);
        bethuneLotView5.update(graphics60);
        main0.paintAll(graphics60);
        views.ManagerActionsView managerActionsView65 = new views.ManagerActionsView(main0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 291 + "'", int8 == 291);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + modalExclusionType31 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType31.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + modalExclusionType38 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType38.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component42);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior52 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior52.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics60);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        javax.swing.JLayeredPane jLayeredPane25 = checkoutView6.getLayeredPane();
        java.lang.Object obj26 = checkoutView6.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLayeredPane25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        javax.swing.JRadioButton jRadioButton18 = null;
        checkoutView16.debitRadioButton = jRadioButton18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        checkoutView16.nameCard = jLabel28;
        java.awt.Container container30 = checkoutView16.getFocusCycleRootAncestor();
        views.Main main31 = new views.Main();
        java.awt.Cursor cursor32 = null;
        main31.setCursor(cursor32);
        boolean boolean36 = main31.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView37 = new views.CheckoutView(main31);
        javax.swing.JTextField jTextField38 = checkoutView37.cvvField;
        javax.swing.JRadioButton jRadioButton39 = checkoutView37.creditRadioButton;
        javax.swing.JRadioButton jRadioButton40 = checkoutView37.creditRadioButton;
        checkoutView16.debitRadioButton = jRadioButton40;
        checkoutView6.mobilePaymentRadioButton = jRadioButton40;
        java.awt.Rectangle rectangle43 = checkoutView6.getBounds();
        views.Main main44 = new views.Main();
        java.awt.Cursor cursor45 = null;
        main44.setCursor(cursor45);
        boolean boolean49 = main44.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView50 = new views.CheckoutView(main44);
        javax.swing.JTextField jTextField51 = checkoutView50.cvvField;
        java.awt.Cursor cursor52 = null;
        checkoutView50.setCursor(cursor52);
        views.Main main54 = new views.Main();
        java.awt.Cursor cursor55 = null;
        main54.setCursor(cursor55);
        boolean boolean59 = main54.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView60 = new views.CheckoutView(main54);
        javax.swing.JTextField jTextField61 = checkoutView60.cvvField;
        javax.swing.JLabel jLabel62 = checkoutView60.nameCard;
        checkoutView50.nameCard = jLabel62;
        javax.swing.JTextField jTextField64 = checkoutView50.cardNumberField;
        checkoutView50.price = "frame14";
        checkoutView50.dateConfirmed = false;
        javax.swing.JRadioButton jRadioButton69 = checkoutView50.creditRadioButton;
        checkoutView6.creditRadioButton = jRadioButton69;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jTextField38);
        org.junit.Assert.assertNotNull(jRadioButton39);
        org.junit.Assert.assertNotNull(jRadioButton40);
        org.junit.Assert.assertNotNull(rectangle43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jTextField51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jTextField61);
        org.junit.Assert.assertNotNull(jLabel62);
        org.junit.Assert.assertNotNull(jTextField64);
        org.junit.Assert.assertNotNull(jRadioButton69);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        bethuneLotView13.revalidate();
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Dimension dimension27 = null;
        java.awt.Dimension dimension28 = bethuneLotView26.getSize(dimension27);
        java.awt.Dialog.ModalExclusionType modalExclusionType29 = bethuneLotView26.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        bethuneLotView26.removeInputMethodListener(inputMethodListener30);
        java.awt.Rectangle rectangle32 = bethuneLotView26.bounds();
        javax.swing.JRootPane jRootPane33 = bethuneLotView26.getRootPane();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Point point37 = bethuneLotView35.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        bethuneLotView35.addHierarchyListener(hierarchyListener38);
        java.awt.event.WindowListener windowListener40 = null;
        bethuneLotView35.removeWindowListener(windowListener40);
        views.Main main42 = null;
        views.BethuneLotView bethuneLotView43 = new views.BethuneLotView(main42);
        java.awt.Font font44 = null;
        bethuneLotView43.setFont(font44);
        bethuneLotView43.toBack();
        java.awt.Event event47 = null;
        boolean boolean50 = bethuneLotView43.mouseDrag(event47, 0, 1);
        java.awt.Image image51 = null;
        views.Main main54 = null;
        views.BethuneLotView bethuneLotView55 = new views.BethuneLotView(main54);
        java.awt.Font font56 = null;
        bethuneLotView55.setFont(font56);
        bethuneLotView55.toBack();
        java.awt.Event event59 = null;
        boolean boolean62 = bethuneLotView55.mouseDrag(event59, 0, 1);
        boolean boolean63 = bethuneLotView43.prepareImage(image51, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView55);
        java.awt.Rectangle rectangle64 = bethuneLotView55.getBounds();
        bethuneLotView35.setBounds(rectangle64);
        java.awt.Rectangle rectangle66 = jRootPane33.getBounds(rectangle64);
        java.awt.Rectangle rectangle67 = bethuneLotView13.getBounds(rectangle64);
        views.Main main68 = null;
        views.BethuneLotView bethuneLotView69 = new views.BethuneLotView(main68);
        java.awt.Font font70 = null;
        bethuneLotView69.setFont(font70);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        bethuneLotView69.addPropertyChangeListener("", propertyChangeListener73);
        views.Main main75 = null;
        views.BethuneLotView bethuneLotView76 = new views.BethuneLotView(main75);
        java.awt.Point point78 = bethuneLotView76.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener79 = null;
        bethuneLotView76.addHierarchyListener(hierarchyListener79);
        boolean boolean81 = bethuneLotView76.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer82 = null;
        java.awt.Image image83 = bethuneLotView76.createImage(imageProducer82);
        boolean boolean89 = bethuneLotView69.imageUpdate(image83, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation90 = bethuneLotView69.getComponentOrientation();
        bethuneLotView13.applyComponentOrientation(componentOrientation90);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + modalExclusionType29 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType29.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(jRootPane33);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rectangle64);
        org.junit.Assert.assertNotNull(rectangle66);
        org.junit.Assert.assertNotNull(rectangle67);
        org.junit.Assert.assertNull(point78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(image83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(componentOrientation90);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        component7.firePropertyChange("SUV", (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        bethuneLotView1.enable(true);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        javax.swing.JButton jButton38 = checkoutView6.backButton;
        views.Main main39 = new views.Main();
        java.awt.Cursor cursor40 = null;
        main39.setCursor(cursor40);
        boolean boolean44 = main39.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView45 = new views.CheckoutView(main39);
        javax.swing.JTextField jTextField46 = checkoutView45.cvvField;
        java.awt.Cursor cursor47 = null;
        checkoutView45.setCursor(cursor47);
        views.Main main49 = new views.Main();
        java.awt.Cursor cursor50 = null;
        main49.setCursor(cursor50);
        boolean boolean54 = main49.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView55 = new views.CheckoutView(main49);
        javax.swing.JTextField jTextField56 = checkoutView55.cvvField;
        javax.swing.JLabel jLabel57 = checkoutView55.nameCard;
        checkoutView45.nameCard = jLabel57;
        javax.swing.JTextField jTextField59 = checkoutView45.cardNumberField;
        checkoutView45.price = "frame14";
        checkoutView45.dateConfirmed = false;
        views.Main main64 = null;
        views.BethuneLotView bethuneLotView65 = new views.BethuneLotView(main64);
        java.awt.Point point67 = bethuneLotView65.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener68 = null;
        bethuneLotView65.addHierarchyListener(hierarchyListener68);
        java.awt.GraphicsConfiguration graphicsConfiguration70 = bethuneLotView65.getGraphicsConfiguration();
        bethuneLotView65.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        bethuneLotView65.addPropertyChangeListener(propertyChangeListener73);
        bethuneLotView65.layout();
        views.Main main76 = new views.Main();
        java.awt.Cursor cursor77 = null;
        main76.setCursor(cursor77);
        boolean boolean81 = main76.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView82 = new views.CheckoutView(main76);
        javax.swing.JTextField jTextField83 = checkoutView82.cardNumberField;
        java.util.Locale locale84 = null;
        checkoutView82.setLocale(locale84);
        javax.swing.JButton jButton86 = checkoutView82.backButton;
        bethuneLotView65.setColorButton(jButton86);
        checkoutView45.backButton = jButton86;
        java.time.LocalDateTime localDateTime89 = null;
        checkoutView45.startTime = localDateTime89;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component92 = checkoutView6.add((java.awt.Component) checkoutView45, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(jButton38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jTextField46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTextField56);
        org.junit.Assert.assertNotNull(jLabel57);
        org.junit.Assert.assertNotNull(jTextField59);
        org.junit.Assert.assertNull(point67);
        org.junit.Assert.assertNotNull(graphicsConfiguration70);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jTextField83);
        org.junit.Assert.assertNotNull(jButton86);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        views.LotFactory lotFactory0 = new views.LotFactory();
        views.Main main1 = new views.Main();
        java.awt.MenuComponent menuComponent2 = null;
        main1.remove(menuComponent2);
        main1.resetContentPane();
        javax.swing.JFrame jFrame6 = lotFactory0.getLot(main1, "");
        views.Main main7 = null;
        javax.swing.JFrame jFrame9 = lotFactory0.getLot(main7, "Email invalid.");
        org.junit.Assert.assertNull(jFrame6);
        org.junit.Assert.assertNull(jFrame9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JButton jButton9 = null;
        checkoutView6.backButton = jButton9;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jRadioButton8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        java.awt.Container container20 = checkoutView6.getFocusCycleRootAncestor();
        views.Main main21 = new views.Main();
        java.awt.Cursor cursor22 = null;
        main21.setCursor(cursor22);
        boolean boolean26 = main21.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView27 = new views.CheckoutView(main21);
        javax.swing.JTextField jTextField28 = checkoutView27.cvvField;
        javax.swing.JRadioButton jRadioButton29 = checkoutView27.creditRadioButton;
        checkoutView6.mobilePaymentRadioButton = jRadioButton29;
        checkoutView6.doLayout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jTextField28);
        org.junit.Assert.assertNotNull(jRadioButton29);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        java.awt.Container container20 = checkoutView6.getFocusCycleRootAncestor();
        views.Main main21 = new views.Main();
        java.awt.Cursor cursor22 = null;
        main21.setCursor(cursor22);
        boolean boolean26 = main21.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView27 = new views.CheckoutView(main21);
        javax.swing.JTextField jTextField28 = checkoutView27.cvvField;
        javax.swing.JRadioButton jRadioButton29 = checkoutView27.creditRadioButton;
        javax.swing.JRadioButton jRadioButton30 = checkoutView27.creditRadioButton;
        checkoutView6.debitRadioButton = jRadioButton30;
        long long32 = checkoutView6.hoursBookedFor;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jTextField28);
        org.junit.Assert.assertNotNull(jRadioButton29);
        org.junit.Assert.assertNotNull(jRadioButton30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        boolean boolean20 = checkoutView6.isDisplayable();
        checkoutView6.price = "frame22";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseDrag(event4, 9, (int) (byte) 1);
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        int int12 = bethuneLotView9.getY();
        bethuneLotView9.disable();
        java.awt.Dimension dimension14 = bethuneLotView9.getMinimumSize();
        bethuneLotView9.remove((int) (short) 0);
        bethuneLotView9.setLocationByPlatform(false);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Point point22 = bethuneLotView20.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bethuneLotView20.addHierarchyListener(hierarchyListener23);
        java.awt.event.WindowListener windowListener25 = null;
        bethuneLotView20.removeWindowListener(windowListener25);
        java.awt.event.WindowListener windowListener27 = null;
        bethuneLotView20.removeWindowListener(windowListener27);
        java.awt.event.MouseListener mouseListener29 = null;
        bethuneLotView20.addMouseListener(mouseListener29);
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Dimension dimension33 = null;
        java.awt.Dimension dimension34 = bethuneLotView32.getSize(dimension33);
        java.awt.Dialog.ModalExclusionType modalExclusionType35 = bethuneLotView32.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        bethuneLotView32.addPropertyChangeListener(propertyChangeListener36);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Dimension dimension40 = null;
        java.awt.Dimension dimension41 = bethuneLotView39.getSize(dimension40);
        java.awt.Dialog.ModalExclusionType modalExclusionType42 = bethuneLotView39.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        bethuneLotView39.addPropertyChangeListener(propertyChangeListener43);
        bethuneLotView32.remove((java.awt.Component) bethuneLotView39);
        java.awt.Component component46 = bethuneLotView32.getFocusOwner();
        bethuneLotView32.firePropertyChange("hi!", ' ', '4');
        bethuneLotView32.requestFocus();
        views.Main main52 = null;
        views.BethuneLotView bethuneLotView53 = new views.BethuneLotView(main52);
        java.awt.Font font54 = null;
        bethuneLotView53.setFont(font54);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior56 = bethuneLotView53.getBaselineResizeBehavior();
        bethuneLotView53.addNotify();
        bethuneLotView53.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        bethuneLotView53.addPropertyChangeListener(propertyChangeListener62);
        java.awt.Graphics graphics64 = bethuneLotView53.getGraphics();
        bethuneLotView32.printComponents(graphics64);
        bethuneLotView20.printComponents(graphics64);
        bethuneLotView9.update(graphics64);
        bethuneLotView1.update(graphics64);
        views.Main main69 = null;
        views.BethuneLotView bethuneLotView70 = new views.BethuneLotView(main69);
        java.awt.Font font71 = null;
        bethuneLotView70.setFont(font71);
        java.awt.Container container73 = bethuneLotView70.getFocusCycleRootAncestor();
        java.lang.String str74 = bethuneLotView70.getWarningString();
        java.awt.Event event75 = null;
        boolean boolean78 = bethuneLotView70.mouseEnter(event75, 450, 3);
        views.Main main79 = null;
        views.BethuneLotView bethuneLotView80 = new views.BethuneLotView(main79);
        java.awt.Font font81 = null;
        bethuneLotView80.setFont(font81);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior83 = bethuneLotView80.getBaselineResizeBehavior();
        bethuneLotView80.addNotify();
        bethuneLotView80.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener89 = null;
        bethuneLotView80.removeWindowListener(windowListener89);
        bethuneLotView80.setTitle("Vanier,Bethune,Calumet,Schulich");
        java.awt.Dimension dimension93 = bethuneLotView80.getMaximumSize();
        bethuneLotView70.resize(dimension93);
        java.awt.Dimension dimension95 = bethuneLotView1.getSize(dimension93);
        java.awt.Window[] windowArray96 = bethuneLotView1.getOwnedWindows();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 291 + "'", int12 == 291);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(point22);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + modalExclusionType35 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType35.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertTrue("'" + modalExclusionType42 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType42.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior56 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior56.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics64);
        org.junit.Assert.assertNull(container73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior83 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior83.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension93);
        org.junit.Assert.assertNotNull(dimension95);
        org.junit.Assert.assertNotNull(windowArray96);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseUp(event5, (int) '#', (int) (byte) 100);
        bethuneLotView1.repaint((long) (short) -1);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        java.lang.String str16 = user5.lotName;
        // The following exception was thrown during execution in test generation
        try {
            user5.setDebitBalance("Email not registered.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Email not registered.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        int int14 = bethuneLotView11.getY();
        bethuneLotView11.disable();
        java.awt.Dimension dimension16 = bethuneLotView11.getMinimumSize();
        checkoutView6.setMinimumSize(dimension16);
        boolean boolean18 = checkoutView6.isFocusable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 291 + "'", int14 == 291);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand2;
        objects.Sensor sensor6 = new objects.Sensor();
        java.lang.String str7 = sensor6.getRandArrayElement2();
        java.util.Random random8 = null;
        sensor6.rand1 = random8;
        java.lang.String[] strArray10 = sensor6.carType;
        java.util.Random random11 = sensor6.rand2;
        sensor0.rand2 = random11;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNotNull(random5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hyundai" + "'", str7, "Hyundai");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(random11);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        controllers.ManagerController.logOutManager();
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.awt.event.HierarchyListener hierarchyListener25 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener25);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + java.awt.Window.Type.NORMAL + "'", type20.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        bethuneLotView1.setFocusTraversalPolicy(focusTraversalPolicy12);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        bethuneLotView1.layout();
        int int11 = bethuneLotView1.getHeight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 450 + "'", int11 == 450);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        int int2 = password1.getLength();
        boolean boolean3 = password1.getincludeUpperCase();
        int int4 = password1.getLength();
        password1.addNumbers(false);
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        objects.Manager manager3 = new objects.Manager("hi!", 0, "Available");
        java.lang.String str4 = manager3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        // The following exception was thrown during execution in test generation
        try {
            views.ManageAccountsView manageAccountsView13 = new views.ManageAccountsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        boolean boolean27 = bethuneLotView1.isAlwaysOnTop();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        maintainUser0.update();
        java.util.ArrayList<objects.User> userList28 = maintainUser0.users;
        maintainUser0.update();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        int int11 = user5.getPrice();
        double double12 = user5.rate;
        // The following exception was thrown during execution in test generation
        try {
            user5.setDebitBalance("YorkUParking - Bethune");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"YorkUParking - Bethune\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.setState((int) (byte) 0);
        java.lang.String str7 = bethuneLotView1.getTitle();
        java.awt.Component[] componentArray8 = bethuneLotView1.getComponents();
        bethuneLotView1.transferFocusBackward();
        bethuneLotView1.doLayout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "YorkUParking - Bethune" + "'", str7, "YorkUParking - Bethune");
        org.junit.Assert.assertNotNull(componentArray8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        controllers.LotController.removeLot("Hyundai");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.CalumetLotView calumetLotView9 = new views.CalumetLotView(main0);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        java.util.Locale locale18 = null;
        checkoutView16.setLocale(locale18);
        javax.swing.JButton jButton20 = checkoutView16.backButton;
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Dimension dimension23 = null;
        java.awt.Dimension dimension24 = bethuneLotView22.getSize(dimension23);
        java.awt.Dialog.ModalExclusionType modalExclusionType25 = bethuneLotView22.getModalExclusionType();
        views.Main main26 = null;
        views.BethuneLotView bethuneLotView27 = new views.BethuneLotView(main26);
        java.awt.Font font28 = null;
        bethuneLotView27.setFont(font28);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior30 = bethuneLotView27.getBaselineResizeBehavior();
        bethuneLotView27.addNotify();
        bethuneLotView27.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        bethuneLotView27.addPropertyChangeListener(propertyChangeListener36);
        java.awt.Graphics graphics38 = bethuneLotView27.getGraphics();
        bethuneLotView22.printAll(graphics38);
        checkoutView16.print(graphics38);
        javax.swing.JButton jButton41 = checkoutView16.backButton;
        calumetLotView9.setColorButton(jButton41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + modalExclusionType25 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType25.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior30 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior30.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics38);
        org.junit.Assert.assertNotNull(jButton41);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.Event event10 = null;
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        bethuneLotView12.addPropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = bethuneLotView12.isUndecorated();
        boolean boolean19 = bethuneLotView1.action(event10, (java.lang.Object) boolean18);
        java.awt.event.ContainerListener[] containerListenerArray20 = bethuneLotView1.getContainerListeners();
        bethuneLotView1.firePropertyChange("Vanier,Bethune", (double) 100L, (double) 12);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(containerListenerArray20);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.checkoutInfo("Account does not exist.", "frame14", "Honda", "Mercedes", 291, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.awt.MenuBar menuBar28 = null;
        bethuneLotView1.setMenuBar(menuBar28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        int int11 = user5.getPrice();
        double double12 = user5.rate;
        user5.parkingFee = 1055;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        javax.swing.JRadioButton jRadioButton18 = null;
        checkoutView16.debitRadioButton = jRadioButton18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        checkoutView16.nameCard = jLabel28;
        java.awt.Container container30 = checkoutView16.getFocusCycleRootAncestor();
        views.Main main31 = new views.Main();
        java.awt.Cursor cursor32 = null;
        main31.setCursor(cursor32);
        boolean boolean36 = main31.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView37 = new views.CheckoutView(main31);
        javax.swing.JTextField jTextField38 = checkoutView37.cvvField;
        javax.swing.JRadioButton jRadioButton39 = checkoutView37.creditRadioButton;
        javax.swing.JRadioButton jRadioButton40 = checkoutView37.creditRadioButton;
        checkoutView16.debitRadioButton = jRadioButton40;
        checkoutView6.mobilePaymentRadioButton = jRadioButton40;
        java.awt.Rectangle rectangle43 = checkoutView6.getBounds();
        java.awt.event.KeyListener keyListener44 = null;
        checkoutView6.addKeyListener(keyListener44);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jTextField38);
        org.junit.Assert.assertNotNull(jRadioButton39);
        org.junit.Assert.assertNotNull(jRadioButton40);
        org.junit.Assert.assertNotNull(rectangle43);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        views.LassondeLotView lassondeLotView9 = new views.LassondeLotView(main0);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        java.util.Locale locale18 = null;
        checkoutView16.setLocale(locale18);
        javax.swing.JButton jButton20 = checkoutView16.backButton;
        lassondeLotView9.setColorButton(jButton20);
        java.awt.Event event22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = lassondeLotView9.postEvent(event22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jButton20);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Point point36 = bethuneLotView34.getMousePosition(false);
        java.awt.Container container37 = bethuneLotView34.getFocusCycleRootAncestor();
        java.awt.event.WindowListener windowListener38 = null;
        bethuneLotView34.removeWindowListener(windowListener38);
        java.lang.String str40 = bethuneLotView34.getName();
        int int41 = bethuneLotView13.getComponentZOrder((java.awt.Component) bethuneLotView34);
        boolean boolean42 = bethuneLotView34.isUndecorated();
        bethuneLotView34.repaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNull(point36);
        org.junit.Assert.assertNull(container37);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "frame55" + "'", str40, "frame55");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.awt.Dimension dimension22 = bethuneLotView1.preferredSize();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setDefaultCloseOperation(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(windowArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(font20);
        org.junit.Assert.assertNotNull(dimension22);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        int int11 = user5.debitBalance;
        java.time.LocalDateTime localDateTime12 = null;
        user5.parkingStartTime = localDateTime12;
        user5.setPaymentType("Account does not exist.");
        java.lang.String str16 = user5.getCredittBalance();
        boolean boolean17 = controllers.UserController.approveUser(user5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = main0.getHierarchyListeners();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        bethuneLotView9.addHierarchyListener(hierarchyListener12);
        boolean boolean14 = bethuneLotView9.isFocusTraversable();
        bethuneLotView9.setLocation((-1), (int) '4');
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView9, "KIA");
        views.BookingActionsView bookingActionsView20 = new views.BookingActionsView(main0);
        views.ManageLotsView manageLotsView21 = new views.ManageLotsView(main0);
        java.awt.Dimension dimension22 = main0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dimension22);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.setCardNumber("frame18");
        boolean boolean9 = user5.getApproved();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.checkoutInfo("", "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "frame14", "Mercedes", 100, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.paymentType;
        java.lang.String str8 = user5.getPaymentType();
        java.lang.String str9 = user5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = checkoutView6.cardNumberLabel;
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Point point14 = bethuneLotView12.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener15);
        java.awt.event.WindowListener windowListener17 = null;
        bethuneLotView12.removeWindowListener(windowListener17);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        bethuneLotView20.toBack();
        java.awt.Event event24 = null;
        boolean boolean27 = bethuneLotView20.mouseDrag(event24, 0, 1);
        java.awt.Image image28 = null;
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Font font33 = null;
        bethuneLotView32.setFont(font33);
        bethuneLotView32.toBack();
        java.awt.Event event36 = null;
        boolean boolean39 = bethuneLotView32.mouseDrag(event36, 0, 1);
        boolean boolean40 = bethuneLotView20.prepareImage(image28, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView32);
        java.awt.Rectangle rectangle41 = bethuneLotView32.getBounds();
        bethuneLotView12.setBounds(rectangle41);
        java.awt.Rectangle rectangle43 = jLabel10.getBounds(rectangle41);
        java.awt.Point point44 = jLabel10.getMousePosition();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(rectangle41);
        org.junit.Assert.assertNotNull(rectangle43);
        org.junit.Assert.assertNull(point44);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        bethuneLotView1.repaint((-1), (int) (short) -1, (int) (short) 0, 0);
        boolean boolean14 = bethuneLotView1.isFocusCycleRoot();
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Point point18 = bethuneLotView16.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        bethuneLotView16.addHierarchyListener(hierarchyListener19);
        java.awt.event.WindowListener windowListener21 = null;
        bethuneLotView16.removeWindowListener(windowListener21);
        java.awt.event.WindowListener windowListener23 = null;
        bethuneLotView16.removeWindowListener(windowListener23);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray25 = bethuneLotView16.getHierarchyBoundsListeners();
        javax.swing.TransferHandler transferHandler26 = bethuneLotView16.getTransferHandler();
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Point point30 = bethuneLotView28.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        bethuneLotView28.addHierarchyListener(hierarchyListener31);
        boolean boolean33 = bethuneLotView28.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer34 = null;
        java.awt.Image image35 = bethuneLotView28.createImage(imageProducer34);
        int int36 = bethuneLotView28.getHeight();
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Dimension dimension39 = null;
        java.awt.Dimension dimension40 = bethuneLotView38.getSize(dimension39);
        java.awt.Dialog.ModalExclusionType modalExclusionType41 = bethuneLotView38.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        bethuneLotView38.addPropertyChangeListener(propertyChangeListener42);
        views.Main main44 = null;
        views.BethuneLotView bethuneLotView45 = new views.BethuneLotView(main44);
        java.awt.Dimension dimension46 = null;
        java.awt.Dimension dimension47 = bethuneLotView45.getSize(dimension46);
        java.awt.Dialog.ModalExclusionType modalExclusionType48 = bethuneLotView45.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        bethuneLotView45.addPropertyChangeListener(propertyChangeListener49);
        bethuneLotView38.remove((java.awt.Component) bethuneLotView45);
        java.awt.Component component52 = bethuneLotView38.getFocusOwner();
        java.awt.Dimension dimension53 = bethuneLotView38.getPreferredSize();
        bethuneLotView28.setSize(dimension53);
        bethuneLotView16.setMinimumSize(dimension53);
        bethuneLotView1.setMaximumSize(dimension53);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray25);
        org.junit.Assert.assertNull(transferHandler26);
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(image35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 450 + "'", int36 == 450);
        org.junit.Assert.assertNotNull(dimension40);
        org.junit.Assert.assertTrue("'" + modalExclusionType41 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType41.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertTrue("'" + modalExclusionType48 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType48.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component52);
        org.junit.Assert.assertNotNull(dimension53);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        views.Unavailable unavailable0 = new views.Unavailable();
        views.Main main1 = null;
        views.BethuneLotView bethuneLotView2 = new views.BethuneLotView(main1);
        java.awt.Font font3 = null;
        bethuneLotView2.setFont(font3);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = bethuneLotView2.getBaselineResizeBehavior();
        views.AlertStateContext alertStateContext6 = bethuneLotView2.getParkingSpotState();
        java.lang.String str7 = alertStateContext6.alert();
        java.lang.String str8 = unavailable0.alert(alertStateContext6);
        views.Available available9 = new views.Available();
        views.AlertStateContext alertStateContext10 = null;
        java.lang.String str11 = available9.alert(alertStateContext10);
        views.Main main12 = new views.Main();
        java.awt.Container container13 = main12.getOriginalContentPane();
        views.LassondeLotView lassondeLotView14 = new views.LassondeLotView(main12);
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView21 = new views.CheckoutView(main15);
        javax.swing.JTextField jTextField22 = checkoutView21.cardNumberField;
        java.util.Locale locale23 = null;
        checkoutView21.setLocale(locale23);
        javax.swing.JButton jButton25 = checkoutView21.backButton;
        lassondeLotView14.setColorButton(jButton25);
        views.AlertStateContext alertStateContext27 = lassondeLotView14.getParkingSpotState();
        java.lang.String str28 = available9.alert(alertStateContext27);
        java.lang.String str29 = alertStateContext27.alert();
        java.lang.String str30 = unavailable0.alert(alertStateContext27);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(alertStateContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unavailable" + "'", str8, "Unavailable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertNotNull(jButton25);
        org.junit.Assert.assertNotNull(alertStateContext27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Available" + "'", str29, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Unavailable" + "'", str30, "Unavailable");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.setIgnoreRepaint(false);
        bethuneLotView1.setLocationByPlatform(false);
        int int7 = bethuneLotView1.getComponentCount();
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        user5.plateNumber = "hi!";
        user5.setCardNumber("frame14");
        user5.rate = 0.0f;
        java.lang.String str19 = user5.getPaymentType();
        user5.setplateNumber("Vanier,Bethune,Calumet,Schulich");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        javax.swing.JMenuBar jMenuBar10 = checkoutView6.getJMenuBar();
        boolean boolean11 = checkoutView6.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNull(jMenuBar10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.awt.dnd.DropTarget dropTarget13 = bethuneLotView1.getDropTarget();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet15 = bethuneLotView1.getFocusTraversalKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNull(dropTarget13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        int int24 = bethuneLotView13.getY();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNull(window23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingEndTime = localDateTime9;
        java.lang.String str11 = user5.getPaymentType();
        user5.cardName = "Can not change booking time";
        java.lang.String str14 = user5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        int int2 = password1.getLength();
        boolean boolean3 = password1.getincludeUpperCase();
        int int4 = password1.getLength();
        boolean boolean5 = password1.getincludeLowerCase();
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.setVisible(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = main0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        user5.setId(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.setSize((int) (short) 1, 97);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setUpperCase();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setLength();
        numberPasswordBuilder0.setIncludeSymbols();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.awt.event.WindowStateListener windowStateListener32 = null;
        bethuneLotView1.removeWindowStateListener(windowStateListener32);
        java.awt.ComponentOrientation componentOrientation34 = bethuneLotView1.getComponentOrientation();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangle30);
        org.junit.Assert.assertNotNull(componentOrientation34);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.setState((int) (byte) 0);
        java.lang.String str7 = bethuneLotView1.getTitle();
        java.awt.Component[] componentArray8 = bethuneLotView1.getComponents();
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        bethuneLotView1.addMouseMotionListener(mouseMotionListener9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "YorkUParking - Bethune" + "'", str7, "YorkUParking - Bethune");
        org.junit.Assert.assertNotNull(componentArray8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        main0.removeAll();
        boolean boolean10 = main0.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        boolean boolean26 = bethuneLotView1.isValid();
        java.awt.event.ComponentListener componentListener27 = null;
        bethuneLotView1.removeComponentListener(componentListener27);
        java.awt.event.MouseWheelListener mouseWheelListener29 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener29);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.CalumetLotView calumetLotView9 = new views.CalumetLotView(main0);
        views.AlertStateContext alertStateContext10 = calumetLotView9.getParkingSpotState();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(alertStateContext10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.awt.GraphicsConfiguration graphicsConfiguration67 = bethuneLotView1.getGraphicsConfiguration();
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
        org.junit.Assert.assertNotNull(graphicsConfiguration67);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        views.LotFactory lotFactory0 = new views.LotFactory();
        views.Main main1 = new views.Main();
        java.awt.MenuComponent menuComponent2 = null;
        main1.remove(menuComponent2);
        main1.resetContentPane();
        javax.swing.JFrame jFrame6 = lotFactory0.getLot(main1, "");
        java.awt.Event event7 = null;
        objects.User user13 = new objects.User("hi!", (int) '4', "", "", "");
        double double14 = user13.getRate();
        java.lang.String str15 = user13.getEmail();
        java.time.LocalDateTime localDateTime16 = user13.parkingEndTime;
        user13.setCardNumber("Honda");
        boolean boolean19 = main1.action(event7, (java.lang.Object) user13);
        org.junit.Assert.assertNull(jFrame6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        objects.User user5 = new objects.User("", 100, "hi!", "Honda", "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str6 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Honda" + "'", str6, "Honda");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        boolean boolean18 = bethuneLotView1.isBackgroundSet();
        boolean boolean19 = bethuneLotView1.isValid();
        java.awt.event.KeyListener keyListener20 = null;
        bethuneLotView1.removeKeyListener(keyListener20);
        java.awt.Event event22 = null;
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Dimension dimension25 = null;
        java.awt.Dimension dimension26 = bethuneLotView24.getSize(dimension25);
        java.awt.Dialog.ModalExclusionType modalExclusionType27 = bethuneLotView24.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        bethuneLotView24.addPropertyChangeListener(propertyChangeListener28);
        java.awt.Graphics graphics30 = null;
        bethuneLotView24.update(graphics30);
        boolean boolean32 = bethuneLotView1.lostFocus(event22, (java.lang.Object) graphics30);
        bethuneLotView1.transferFocusUpCycle();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + modalExclusionType27 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType27.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        bethuneLotView1.setUndecorated(false);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.awt.LayoutManager layoutManager20 = main0.getLayout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(layoutManager20);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.awt.event.WindowStateListener[] windowStateListenerArray13 = bethuneLotView12.getWindowStateListeners();
        bethuneLotView12.enable(true);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView12.addHierarchyListener(hierarchyListener16);
        java.awt.Point point18 = bethuneLotView12.getLocation();
        bethuneLotView1.setLocation(point18);
        bethuneLotView1.setFocusCycleRoot(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNotNull(windowStateListenerArray13);
        org.junit.Assert.assertNotNull(point18);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        javax.accessibility.AccessibleContext accessibleContext8 = bethuneLotView1.getAccessibleContext();
        boolean boolean9 = bethuneLotView1.getFocusableWindowState();
        java.awt.Point point10 = bethuneLotView1.getMousePosition();
        java.awt.GraphicsConfiguration graphicsConfiguration11 = bethuneLotView1.getGraphicsConfiguration();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(graphicsConfiguration11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener10);
        views.Main main12 = new views.Main();
        java.awt.Container container13 = main12.getOriginalContentPane();
        views.LassondeLotView lassondeLotView14 = new views.LassondeLotView(main12);
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView21 = new views.CheckoutView(main15);
        javax.swing.JTextField jTextField22 = checkoutView21.cardNumberField;
        java.util.Locale locale23 = null;
        checkoutView21.setLocale(locale23);
        javax.swing.JButton jButton25 = checkoutView21.backButton;
        lassondeLotView14.setColorButton(jButton25);
        bethuneLotView1.setColorButton(jButton25);
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
        bethuneLotView36.repaint();
        java.awt.Component component46 = bethuneLotView36.locate(4, (int) ' ');
        java.awt.Cursor cursor47 = bethuneLotView36.getCursor();
        bethuneLotView1.setCursor(cursor47);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertNotNull(jButton25);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertTrue("'" + modalExclusionType32 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType32.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component46);
        org.junit.Assert.assertNotNull(cursor47);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        java.awt.Point point20 = checkoutView6.getMousePosition();
        java.awt.Event event21 = null;
        boolean boolean24 = checkoutView6.mouseExit(event21, (int) (byte) 100, (int) (short) -1);
        checkoutView6.price = "Available";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        int int13 = bethuneLotView1.countComponents();
        java.awt.event.HierarchyListener hierarchyListener14 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        java.lang.String str9 = user5.getPlateNumber();
        user5.accountType = "";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.event.HierarchyListener hierarchyListener5 = null;
        bethuneLotView1.removeHierarchyListener(hierarchyListener5);
        bethuneLotView1.repaint((long) (-1));
        java.awt.Window window9 = bethuneLotView1.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel10 = window9.getColorModel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertNull(window9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.cardName;
        java.lang.String str8 = user5.getParkingLot();
        user5.addPrice(3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        views.BookingActionsView bookingActionsView12 = new views.BookingActionsView(main0);
        views.LoginView loginView13 = new views.LoginView(main0);
        views.LoginView loginView14 = new views.LoginView(main0);
        main0.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        maintainLot0.load();
        maintainLot0.lotOptions = "Email not registered.";
        maintainLot0.load();
        org.junit.Assert.assertNotNull(maintainLot0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        user5.setPrice(32);
        user5.setId(3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        views.Main main7 = new views.Main();
        java.awt.Cursor cursor8 = null;
        main7.setCursor(cursor8);
        boolean boolean10 = main7.requestFocusInWindow();
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = bethuneLotView12.getModalExclusionType();
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Font font18 = null;
        bethuneLotView17.setFont(font18);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior20 = bethuneLotView17.getBaselineResizeBehavior();
        bethuneLotView17.addNotify();
        bethuneLotView17.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        bethuneLotView17.addPropertyChangeListener(propertyChangeListener26);
        java.awt.Graphics graphics28 = bethuneLotView17.getGraphics();
        bethuneLotView12.printAll(graphics28);
        main7.printAll(graphics28);
        bethuneLotView1.printAll(graphics28);
        java.lang.String str32 = bethuneLotView1.getName();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics28);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "frame58" + "'", str32, "frame58");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.awt.image.ImageProducer imageProducer13 = null;
        java.awt.Image image14 = registerView12.createImage(imageProducer13);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(image14);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        javax.swing.JButton jButton49 = checkoutView6.backButton;
        views.Main main50 = new views.Main();
        java.awt.Cursor cursor51 = null;
        main50.setCursor(cursor51);
        boolean boolean55 = main50.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView56 = new views.CheckoutView(main50);
        javax.swing.JTextField jTextField57 = checkoutView56.cvvField;
        java.awt.Cursor cursor58 = null;
        checkoutView56.setCursor(cursor58);
        views.Main main60 = new views.Main();
        java.awt.Cursor cursor61 = null;
        main60.setCursor(cursor61);
        boolean boolean65 = main60.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView66 = new views.CheckoutView(main60);
        javax.swing.JTextField jTextField67 = checkoutView66.cvvField;
        javax.swing.JLabel jLabel68 = checkoutView66.nameCard;
        checkoutView56.nameCard = jLabel68;
        checkoutView6.cardNumberLabel = jLabel68;
        java.awt.Dimension dimension71 = checkoutView6.minimumSize();
        boolean boolean72 = checkoutView6.isBackgroundSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertNotNull(jButton49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jTextField57);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jTextField67);
        org.junit.Assert.assertNotNull(jLabel68);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        views.Main main3 = null;
        views.BethuneLotView bethuneLotView4 = new views.BethuneLotView(main3);
        java.awt.Dimension dimension5 = null;
        java.awt.Dimension dimension6 = bethuneLotView4.getSize(dimension5);
        java.awt.Dialog.ModalExclusionType modalExclusionType7 = bethuneLotView4.getModalExclusionType();
        main0.setModalExclusionType(modalExclusionType7);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + modalExclusionType7 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType7.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        numberPasswordBuilder5.setLength();
        numberPasswordBuilder5.setIncludeSymbols();
        numberPasswordBuilder5.setLength();
        numberPasswordBuilder5.setIncludeNumbers();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
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
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cvvField;
        javax.swing.JLabel jLabel36 = checkoutView34.nameCard;
        javax.swing.JTextField jTextField37 = checkoutView34.cvvField;
        checkoutView14.cvvField = jTextField37;
        checkoutView6.cardNumberField = jTextField37;
        boolean boolean40 = jTextField37.isMinimumSizeSet();
        int int41 = jTextField37.getY();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jLabel36);
        org.junit.Assert.assertNotNull(jTextField37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        bethuneLotView1.repaint((long) 16);
        java.awt.Component component12 = bethuneLotView1.locate(6, 16);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = component12.getBaselineResizeBehavior();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        views.Main main0 = new views.Main();
        views.VanierLotView vanierLotView1 = new views.VanierLotView(main0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = vanierLotView1.getPropertyChangeListeners();
        views.AlertStateContext alertStateContext3 = vanierLotView1.getParkingSpotState();
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertNotNull(alertStateContext3);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        checkoutView6.openWebPage("frame14");
        java.time.LocalDateTime localDateTime12 = checkoutView6.currentTime;
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Dimension dimension15 = null;
        java.awt.Dimension dimension16 = bethuneLotView14.getSize(dimension15);
        java.awt.Dialog.ModalExclusionType modalExclusionType17 = bethuneLotView14.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        bethuneLotView14.removeInputMethodListener(inputMethodListener18);
        java.awt.Rectangle rectangle20 = bethuneLotView14.bounds();
        java.awt.Event event21 = null;
        boolean boolean23 = bethuneLotView14.keyUp(event21, 12);
        checkoutView6.remove((java.awt.Component) bethuneLotView14);
        views.Main main25 = new views.Main();
        java.awt.Cursor cursor26 = null;
        main25.setCursor(cursor26);
        boolean boolean30 = main25.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView31 = new views.CheckoutView(main25);
        views.Main main32 = new views.Main();
        java.awt.Cursor cursor33 = null;
        main32.setCursor(cursor33);
        boolean boolean37 = main32.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView38 = new views.CheckoutView(main32);
        javax.swing.JTextField jTextField39 = checkoutView38.cardNumberField;
        views.Main main40 = new views.Main();
        java.awt.Cursor cursor41 = null;
        main40.setCursor(cursor41);
        boolean boolean45 = main40.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView46 = new views.CheckoutView(main40);
        javax.swing.JTextField jTextField47 = checkoutView46.cardNumberField;
        javax.swing.JRadioButton jRadioButton48 = null;
        checkoutView46.debitRadioButton = jRadioButton48;
        views.Main main50 = new views.Main();
        java.awt.Cursor cursor51 = null;
        main50.setCursor(cursor51);
        boolean boolean55 = main50.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView56 = new views.CheckoutView(main50);
        javax.swing.JTextField jTextField57 = checkoutView56.cvvField;
        javax.swing.JLabel jLabel58 = checkoutView56.nameCard;
        checkoutView46.nameCard = jLabel58;
        checkoutView38.cvvLabel = jLabel58;
        checkoutView31.cardNumberLabel = jLabel58;
        checkoutView31.move(16, 1000);
        javax.swing.JButton jButton65 = checkoutView31.backButton;
        boolean boolean68 = checkoutView31.inside((int) (short) 100, (int) (byte) 100);
        javax.swing.JButton jButton69 = checkoutView31.backButton;
        java.awt.event.InputMethodListener inputMethodListener70 = null;
        jButton69.addInputMethodListener(inputMethodListener70);
        jButton69.transferFocusUpCycle();
        bethuneLotView14.setColorButton(jButton69);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + modalExclusionType17 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType17.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jTextField39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jTextField47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jTextField57);
        org.junit.Assert.assertNotNull(jLabel58);
        org.junit.Assert.assertNotNull(jButton65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jButton69);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        java.awt.Event event5 = null;
        views.Main main6 = null;
        views.BethuneLotView bethuneLotView7 = new views.BethuneLotView(main6);
        java.awt.Font font8 = null;
        bethuneLotView7.setFont(font8);
        bethuneLotView7.toBack();
        java.awt.Event event11 = null;
        boolean boolean14 = bethuneLotView7.mouseDrag(event11, 0, 1);
        java.awt.Image image15 = null;
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Font font20 = null;
        bethuneLotView19.setFont(font20);
        bethuneLotView19.toBack();
        java.awt.Event event23 = null;
        boolean boolean26 = bethuneLotView19.mouseDrag(event23, 0, 1);
        boolean boolean27 = bethuneLotView7.prepareImage(image15, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView19);
        java.awt.Cursor cursor28 = null;
        bethuneLotView7.setCursor(cursor28);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray30 = bethuneLotView7.getMouseMotionListeners();
        javax.swing.JRootPane jRootPane31 = bethuneLotView7.getRootPane();
        boolean boolean32 = bethuneLotView1.gotFocus(event5, (java.lang.Object) bethuneLotView7);
        java.awt.Font font33 = bethuneLotView1.getFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray30);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(font33);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        int int4 = bethuneLotView1.getHeight();
        java.awt.Event event5 = null;
        boolean boolean7 = bethuneLotView1.gotFocus(event5, (java.lang.Object) 0);
        java.awt.event.WindowListener[] windowListenerArray8 = bethuneLotView1.getWindowListeners();
        bethuneLotView1.pack();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 450 + "'", int4 == 450);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(windowListenerArray8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.awt.Shape shape14 = bethuneLotView1.getShape();
        bethuneLotView1.setFocusableWindowState(false);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior24 = bethuneLotView13.getBaselineResizeBehavior();
        bethuneLotView13.setFocusable(false);
        java.awt.event.MouseListener mouseListener27 = null;
        bethuneLotView13.removeMouseListener(mouseListener27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        checkoutView6.price = "Honda";
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        java.awt.Cursor cursor18 = null;
        checkoutView16.setCursor(cursor18);
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        checkoutView16.nameCard = jLabel28;
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        jLabel28.removePropertyChangeListener(propertyChangeListener30);
        checkoutView6.cardNumberLabel = jLabel28;
        java.awt.event.WindowFocusListener[] windowFocusListenerArray33 = checkoutView6.getWindowFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(windowFocusListenerArray33);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        bethuneLotView1.transferFocusBackward();
        boolean boolean16 = bethuneLotView1.getFocusTraversalKeysEnabled();
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Font font19 = null;
        bethuneLotView18.setFont(font19);
        bethuneLotView18.toBack();
        java.awt.Event event22 = null;
        boolean boolean25 = bethuneLotView18.mouseDrag(event22, 0, 1);
        bethuneLotView18.remove(0);
        bethuneLotView18.enable();
        int int29 = bethuneLotView1.getComponentZOrder((java.awt.Component) bethuneLotView18);
        java.awt.Event event30 = null;
        boolean boolean33 = bethuneLotView1.mouseExit(event30, 128, 5);
        java.io.PrintStream printStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        javax.swing.JMenuBar jMenuBar10 = null;
        bethuneLotView1.setJMenuBar(jMenuBar10);
        boolean boolean12 = bethuneLotView1.isPreferredSizeSet();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.awt.MenuComponent menuComponent25 = null;
        bethuneLotView1.remove(menuComponent25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray24);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        bethuneLotView1.setFocusTraversalPolicyProvider(true);
        javax.swing.JMenuBar jMenuBar14 = null;
        bethuneLotView1.setJMenuBar(jMenuBar14);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        bethuneLotView1.addMouseMotionListener(mouseMotionListener16);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.ComponentListener componentListener8 = null;
        bethuneLotView1.addComponentListener(componentListener8);
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener10);
        java.awt.Window.Type type12 = bethuneLotView1.getType();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + java.awt.Window.Type.NORMAL + "'", type12.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.WindowStateListener windowStateListener5 = null;
        bethuneLotView1.removeWindowStateListener(windowStateListener5);
        java.awt.Event event7 = null;
        boolean boolean9 = bethuneLotView1.keyUp(event7, 64);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        java.time.LocalDateTime localDateTime27 = null;
        checkoutView6.endTime = localDateTime27;
        javax.swing.JLabel jLabel29 = checkoutView6.cvvLabel;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLabel29);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.isFocusableWindow();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.awt.Font font11 = bethuneLotView1.getFont();
        javax.swing.TransferHandler transferHandler12 = bethuneLotView1.getTransferHandler();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(transferHandler12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.lang.String str8 = user5.accountType;
        user5.price = ' ';
        user5.parkingFee = 4;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        boolean boolean7 = bethuneLotView1.isFocusable();
        java.awt.Container container8 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str9 = bethuneLotView1.getWarningString();
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Dimension dimension12 = null;
        java.awt.Dimension dimension13 = bethuneLotView11.getSize(dimension12);
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = bethuneLotView11.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        bethuneLotView11.addPropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = bethuneLotView11.isUndecorated();
        boolean boolean18 = bethuneLotView11.isResizable();
        boolean boolean19 = bethuneLotView1.isFocusCycleRoot((java.awt.Container) bethuneLotView11);
        bethuneLotView11.show(true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(container8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + modalExclusionType14 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType14.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        int int13 = bethuneLotView1.getExtendedState();
        views.Main main14 = null;
        views.BethuneLotView bethuneLotView15 = new views.BethuneLotView(main14);
        java.awt.Font font16 = null;
        bethuneLotView15.setFont(font16);
        bethuneLotView15.toBack();
        java.awt.Event event19 = null;
        boolean boolean22 = bethuneLotView15.mouseDrag(event19, 0, 1);
        java.awt.Image image23 = null;
        views.Main main26 = null;
        views.BethuneLotView bethuneLotView27 = new views.BethuneLotView(main26);
        java.awt.Font font28 = null;
        bethuneLotView27.setFont(font28);
        bethuneLotView27.toBack();
        java.awt.Event event31 = null;
        boolean boolean34 = bethuneLotView27.mouseDrag(event31, 0, 1);
        boolean boolean35 = bethuneLotView15.prepareImage(image23, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView27);
        bethuneLotView15.firePropertyChange("", (byte) 1, (byte) 100);
        java.awt.Dimension dimension40 = bethuneLotView15.minimumSize();
        bethuneLotView1.setSize(dimension40);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dimension40);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.awt.Color color29 = bethuneLotView17.getBackground();
        bethuneLotView17.setLocation((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        user5.setPrice(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        java.awt.event.ComponentListener[] componentListenerArray7 = main0.getComponentListeners();
        java.awt.Dimension dimension8 = main0.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(componentListenerArray7);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        javax.swing.JButton jButton20 = checkoutView6.finalConfirmButton;
        checkoutView6.dispose();
        javax.swing.TransferHandler transferHandler22 = checkoutView6.getTransferHandler();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertNull(transferHandler22);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        views.Main main19 = new views.Main();
        java.awt.MenuComponent menuComponent20 = null;
        main19.remove(menuComponent20);
        main19.resetContentPane();
        int int23 = main19.getExtendedState();
        java.awt.Container container24 = main19.getOriginalContentPane();
        java.awt.Container container25 = main19.getOriginalContentPane();
        java.awt.Font font26 = main19.getFont();
        java.awt.FontMetrics fontMetrics27 = bethuneLotView1.getFontMetrics(font26);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'", type18.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(container24);
        org.junit.Assert.assertNotNull(container25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(fontMetrics27);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        main0.removePropertyChangeListener("Email invalid.", propertyChangeListener25);
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Point point30 = bethuneLotView28.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        bethuneLotView28.addHierarchyListener(hierarchyListener31);
        bethuneLotView28.show();
        bethuneLotView28.list();
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Dimension dimension37 = null;
        java.awt.Dimension dimension38 = bethuneLotView36.getSize(dimension37);
        java.awt.Dialog.ModalExclusionType modalExclusionType39 = bethuneLotView36.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        bethuneLotView36.removeInputMethodListener(inputMethodListener40);
        java.awt.Rectangle rectangle42 = bethuneLotView36.bounds();
        java.awt.Rectangle rectangle43 = bethuneLotView28.getBounds(rectangle42);
        main0.changeContentPane((javax.swing.JFrame) bethuneLotView28, "Invalid plate number");
        views.Main main47 = null;
        views.BethuneLotView bethuneLotView48 = new views.BethuneLotView(main47);
        java.awt.Font font49 = null;
        bethuneLotView48.setFont(font49);
        bethuneLotView48.toBack();
        java.awt.Event event52 = null;
        boolean boolean55 = bethuneLotView48.mouseDrag(event52, 0, 1);
        java.awt.Image image56 = null;
        views.Main main59 = null;
        views.BethuneLotView bethuneLotView60 = new views.BethuneLotView(main59);
        java.awt.Font font61 = null;
        bethuneLotView60.setFont(font61);
        bethuneLotView60.toBack();
        java.awt.Event event64 = null;
        boolean boolean67 = bethuneLotView60.mouseDrag(event64, 0, 1);
        boolean boolean68 = bethuneLotView48.prepareImage(image56, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView60);
        java.awt.event.KeyListener keyListener69 = null;
        bethuneLotView48.removeKeyListener(keyListener69);
        java.awt.LayoutManager layoutManager71 = null;
        bethuneLotView48.setLayout(layoutManager71);
        bethuneLotView48.setVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component75 = main0.add("frame18", (java.awt.Component) bethuneLotView48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle42);
        org.junit.Assert.assertNotNull(rectangle43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        views.Main main16 = null;
        views.BethuneLotView bethuneLotView17 = new views.BethuneLotView(main16);
        java.awt.Point point19 = bethuneLotView17.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        bethuneLotView17.addHierarchyListener(hierarchyListener20);
        boolean boolean22 = bethuneLotView17.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView17.createImage(imageProducer23);
        bethuneLotView17.repaint((-1), (int) (short) -1, (int) (short) 0, 0);
        boolean boolean30 = bethuneLotView1.action(event15, (java.lang.Object) (-1));
        java.awt.image.ColorModel colorModel31 = bethuneLotView1.getColorModel();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(colorModel31);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        boolean boolean11 = bethuneLotView1.isFocused();
        views.Main main12 = null;
        views.LoginView loginView13 = new views.LoginView(main12);
        bethuneLotView1.remove((java.awt.Component) loginView13);
        java.awt.event.WindowFocusListener windowFocusListener15 = null;
        loginView13.addWindowFocusListener(windowFocusListener15);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        password1.setPassword1("");
        password1.setLength((int) ' ');
        password1.addUpperCase(false);
        org.junit.Assert.assertNotNull(password1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.util.ArrayList<objects.User> userList2 = controllers.UserController.getUsers();
        maintainLot0.users = userList2;
        java.lang.String str4 = maintainLot0.lotOptions;
        maintainLot0.resetLotOptions();
        org.junit.Assert.assertNotNull(maintainLot0);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email not registered." + "'", str4, "Email not registered.");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        user5.paymentType = "hi!";
        user5.debitBalance = (short) 10;
        user5.cardName = "BMW";
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        bethuneLotView1.setFocusableWindowState(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        boolean boolean6 = main0.isAlwaysOnTopSupported();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        bethuneLotView1.reshape(52, (int) (short) -1, (int) (short) -1, 1);
        boolean boolean31 = bethuneLotView1.isShowing();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        bethuneLotView1.setVisible(false);
        boolean boolean27 = bethuneLotView1.isLightweight();
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        bethuneLotView1.setState(291);
        bethuneLotView1.firePropertyChange("Hyundai", '#', ' ');
        java.awt.Component component23 = bethuneLotView1.findComponentAt(11, (int) (short) 0);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            component23.addHierarchyListener(hierarchyListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNull(component23);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        controllers.LotController.enableLot("Vanier,Bethune,Calumet,Schulich");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.setParkingSpot("Can not change booking time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        javax.swing.JMenuBar jMenuBar10 = checkoutView6.getJMenuBar();
        javax.swing.JRadioButton jRadioButton11 = checkoutView6.debitRadioButton;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNull(jMenuBar10);
        org.junit.Assert.assertNotNull(jRadioButton11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        java.awt.event.KeyListener keyListener6 = null;
        bethuneLotView1.removeKeyListener(keyListener6);
        boolean boolean8 = bethuneLotView1.isFocusTraversalPolicySet();
        boolean boolean9 = bethuneLotView1.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.CalumetLotView calumetLotView9 = new views.CalumetLotView(main0);
        java.awt.Dimension dimension10 = calumetLotView9.minimumSize();
        views.Main main11 = new views.Main();
        java.awt.Cursor cursor12 = null;
        main11.setCursor(cursor12);
        boolean boolean16 = main11.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView17 = new views.CheckoutView(main11);
        javax.swing.JTextField jTextField18 = checkoutView17.cardNumberField;
        java.util.Locale locale19 = null;
        checkoutView17.setLocale(locale19);
        javax.swing.JButton jButton21 = checkoutView17.backButton;
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = bethuneLotView23.getSize(dimension24);
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = bethuneLotView23.getModalExclusionType();
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Font font29 = null;
        bethuneLotView28.setFont(font29);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior31 = bethuneLotView28.getBaselineResizeBehavior();
        bethuneLotView28.addNotify();
        bethuneLotView28.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        bethuneLotView28.addPropertyChangeListener(propertyChangeListener37);
        java.awt.Graphics graphics39 = bethuneLotView28.getGraphics();
        bethuneLotView23.printAll(graphics39);
        checkoutView17.print(graphics39);
        javax.swing.JButton jButton42 = checkoutView17.backButton;
        calumetLotView9.setColorButton(jButton42);
        java.awt.AWTEvent aWTEvent44 = null;
        // The following exception was thrown during execution in test generation
        try {
            jButton42.dispatchEvent(aWTEvent44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertNotNull(jButton21);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior31 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior31.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics39);
        org.junit.Assert.assertNotNull(jButton42);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        objects.SuperManager superManager3 = new objects.SuperManager("Sedan", (int) (short) 10, "frame34");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        boolean boolean39 = bethuneLotView13.isLocationByPlatform();
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        int int9 = bethuneLotView1.getHeight();
        java.awt.Event event10 = null;
        boolean boolean12 = bethuneLotView1.keyDown(event10, 13);
        java.awt.image.ColorModel colorModel13 = bethuneLotView1.getColorModel();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 450 + "'", int9 == 450);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(colorModel13);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        boolean boolean49 = checkoutView6.dateConfirmed;
        java.awt.Event event50 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = checkoutView6.postEvent(event50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        java.lang.String str3 = lotChoiceView1.getLblMessage();
        lotChoiceView1.firePropertyChange("Honda", '4', ' ');
        lotChoiceView1.firePropertyChange("Can not change booking time", (long) (-1), (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        javax.swing.JTextField jTextField15 = checkoutView14.cardNumberField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        checkoutView14.cvvLabel = jLabel34;
        checkoutView6.nameCard = jLabel34;
        jLabel34.enableInputMethods(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        user5.cardNumber = "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        password.Password password1 = numberPasswordBuilder0.getPassword();
        password1.setPassword1("");
        password1.setLength((int) 'a');
        boolean boolean6 = password1.getincludeUpperCase();
        int int7 = password1.getLength();
        password1.addSymbols(false);
        org.junit.Assert.assertNotNull(password1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        lotChoiceView8.setFocusCycleRoot(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = lotChoiceView8.getPropertyChangeListeners("Available");
        java.lang.String str13 = lotChoiceView8.getLblMessage();
        lotChoiceView8.pack();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.lang.String str4 = sensor0.getRandArrayElement2();
        java.lang.String[] strArray5 = sensor0.carModel;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BMW" + "'", str1, "BMW");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mercedes" + "'", str4, "Mercedes");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setUpperCase();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLowerCase();
        password.Password password7 = numberPasswordBuilder0.getPassword();
        org.junit.Assert.assertNotNull(password7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        boolean boolean7 = bethuneLotView1.isFocusable();
        java.awt.Container container8 = bethuneLotView1.getFocusCycleRootAncestor();
        java.lang.String str9 = bethuneLotView1.getWarningString();
        views.Main main10 = null;
        views.BethuneLotView bethuneLotView11 = new views.BethuneLotView(main10);
        java.awt.Font font12 = null;
        bethuneLotView11.setFont(font12);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        bethuneLotView11.addPropertyChangeListener("", propertyChangeListener15);
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Point point20 = bethuneLotView18.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener21 = null;
        bethuneLotView18.addHierarchyListener(hierarchyListener21);
        boolean boolean23 = bethuneLotView18.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = bethuneLotView18.createImage(imageProducer24);
        boolean boolean31 = bethuneLotView11.imageUpdate(image25, (int) (short) 10, 10, (-1), 3, 291);
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Point point37 = bethuneLotView35.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        bethuneLotView35.addHierarchyListener(hierarchyListener38);
        java.awt.GraphicsConfiguration graphicsConfiguration40 = bethuneLotView35.getGraphicsConfiguration();
        bethuneLotView35.setResizable(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = bethuneLotView1.prepareImage(image25, 3, 150, (java.awt.image.ImageObserver) bethuneLotView35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(container8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertNotNull(graphicsConfiguration40);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        views.Available available0 = new views.Available();
        views.AlertStateContext alertStateContext1 = null;
        java.lang.String str2 = available0.alert(alertStateContext1);
        views.Main main3 = new views.Main();
        java.awt.Container container4 = main3.getOriginalContentPane();
        views.LassondeLotView lassondeLotView5 = new views.LassondeLotView(main3);
        views.Main main6 = new views.Main();
        java.awt.Cursor cursor7 = null;
        main6.setCursor(cursor7);
        boolean boolean11 = main6.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView12 = new views.CheckoutView(main6);
        javax.swing.JTextField jTextField13 = checkoutView12.cardNumberField;
        java.util.Locale locale14 = null;
        checkoutView12.setLocale(locale14);
        javax.swing.JButton jButton16 = checkoutView12.backButton;
        lassondeLotView5.setColorButton(jButton16);
        views.AlertStateContext alertStateContext18 = lassondeLotView5.getParkingSpotState();
        java.lang.String str19 = available0.alert(alertStateContext18);
        views.Available available20 = new views.Available();
        views.Available available21 = new views.Available();
        views.AlertStateContext alertStateContext22 = null;
        java.lang.String str23 = available21.alert(alertStateContext22);
        views.Main main24 = new views.Main();
        java.awt.Container container25 = main24.getOriginalContentPane();
        views.LassondeLotView lassondeLotView26 = new views.LassondeLotView(main24);
        views.Main main27 = new views.Main();
        java.awt.Cursor cursor28 = null;
        main27.setCursor(cursor28);
        boolean boolean32 = main27.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView33 = new views.CheckoutView(main27);
        javax.swing.JTextField jTextField34 = checkoutView33.cardNumberField;
        java.util.Locale locale35 = null;
        checkoutView33.setLocale(locale35);
        javax.swing.JButton jButton37 = checkoutView33.backButton;
        lassondeLotView26.setColorButton(jButton37);
        views.AlertStateContext alertStateContext39 = lassondeLotView26.getParkingSpotState();
        java.lang.String str40 = available21.alert(alertStateContext39);
        java.lang.String str41 = available20.alert(alertStateContext39);
        java.lang.String str42 = available0.alert(alertStateContext39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Available" + "'", str2, "Available");
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jTextField13);
        org.junit.Assert.assertNotNull(jButton16);
        org.junit.Assert.assertNotNull(alertStateContext18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Available" + "'", str19, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertNotNull(container25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jTextField34);
        org.junit.Assert.assertNotNull(jButton37);
        org.junit.Assert.assertNotNull(alertStateContext39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Available" + "'", str40, "Available");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Available" + "'", str41, "Available");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Available" + "'", str42, "Available");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        boolean boolean3 = password0.getincludeLowerCase();
        boolean boolean4 = password0.getIncludeNumbers();
        password0.setPassword1("Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        views.BookingActionsView bookingActionsView12 = new views.BookingActionsView(main0);
        views.LoginView loginView13 = new views.LoginView(main0);
        views.LoginView loginView14 = new views.LoginView(main0);
        // The following exception was thrown during execution in test generation
        try {
            views.ManageAccountsView manageAccountsView15 = new views.ManageAccountsView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = controllers.UserController.addPlateNumber("Honda", "frame49");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        parkingSpot1.code = "Nissan";
        java.lang.String str4 = parkingSpot1.getCode();
        parkingSpot1.code = "Vanier,Bethune,Calumet,Schulich";
        parkingSpot1.code = "Account does not exist.";
        objects.Sensor sensor9 = parkingSpot1.getSensor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nissan" + "'", str4, "Nissan");
        org.junit.Assert.assertNull(sensor9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        int int47 = bethuneLotView39.getWidth();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 450 + "'", int47 == 450);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        bethuneLotView1.setOpacity((float) (short) 1);
        java.awt.Point point7 = bethuneLotView1.location();
        java.awt.event.ContainerListener[] containerListenerArray8 = bethuneLotView1.getContainerListeners();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(point7);
        org.junit.Assert.assertNotNull(containerListenerArray8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        checkoutView6.openWebPage("Minivan");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertNotNull(jTextField29);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.setName("hi!");
        user5.setCvvNumber("Invalid plate number");
        user5.price = 13;
        user5.cardNumber = "Minivan";
        java.lang.String str17 = user5.getCvvNumber();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid plate number" + "'", str17, "Invalid plate number");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        javax.swing.JRadioButton jRadioButton57 = checkoutView55.creditRadioButton;
        javax.swing.JRadioButton jRadioButton58 = checkoutView55.creditRadioButton;
        checkoutView6.mobilePaymentRadioButton = jRadioButton58;
        javax.swing.JTextField jTextField60 = checkoutView6.nameCardField;
        java.time.LocalDateTime localDateTime61 = checkoutView6.startTime;
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
        org.junit.Assert.assertNotNull(jRadioButton57);
        org.junit.Assert.assertNotNull(jRadioButton58);
        org.junit.Assert.assertNotNull(jTextField60);
        org.junit.Assert.assertNull(localDateTime61);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        user5.accountType = "frame55";
        java.time.LocalDateTime localDateTime18 = null;
        user5.parkingStartTime = localDateTime18;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        views.Main main14 = new views.Main();
        java.awt.Cursor cursor15 = null;
        main14.setCursor(cursor15);
        boolean boolean19 = main14.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView20 = new views.CheckoutView(main14);
        javax.swing.JTextField jTextField21 = checkoutView20.cardNumberField;
        java.util.Locale locale22 = null;
        checkoutView20.setLocale(locale22);
        javax.swing.JLabel jLabel24 = checkoutView20.cardNumberLabel;
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Point point28 = bethuneLotView26.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener29 = null;
        bethuneLotView26.addHierarchyListener(hierarchyListener29);
        java.awt.event.WindowListener windowListener31 = null;
        bethuneLotView26.removeWindowListener(windowListener31);
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Font font35 = null;
        bethuneLotView34.setFont(font35);
        bethuneLotView34.toBack();
        java.awt.Event event38 = null;
        boolean boolean41 = bethuneLotView34.mouseDrag(event38, 0, 1);
        java.awt.Image image42 = null;
        views.Main main45 = null;
        views.BethuneLotView bethuneLotView46 = new views.BethuneLotView(main45);
        java.awt.Font font47 = null;
        bethuneLotView46.setFont(font47);
        bethuneLotView46.toBack();
        java.awt.Event event50 = null;
        boolean boolean53 = bethuneLotView46.mouseDrag(event50, 0, 1);
        boolean boolean54 = bethuneLotView34.prepareImage(image42, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView46);
        java.awt.Rectangle rectangle55 = bethuneLotView46.getBounds();
        bethuneLotView26.setBounds(rectangle55);
        java.awt.Rectangle rectangle57 = jLabel24.getBounds(rectangle55);
        bethuneLotView1.setBounds(rectangle57);
        java.awt.event.MouseMotionListener mouseMotionListener59 = null;
        bethuneLotView1.addMouseMotionListener(mouseMotionListener59);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jTextField21);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(rectangle55);
        org.junit.Assert.assertNotNull(rectangle57);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.awt.event.ContainerListener containerListener13 = null;
        bethuneLotView1.removeContainerListener(containerListener13);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        long long7 = checkoutView6.hoursBookedFor;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        java.time.LocalDateTime localDateTime9 = checkoutView6.endTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        java.util.ArrayList<objects.Manager> managerList2 = maintainManager0.managers;
        maintainManager0.clear();
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNotNull(managerList2);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.awt.event.WindowStateListener windowStateListener24 = null;
        bethuneLotView1.addWindowStateListener(windowStateListener24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Sensor sensor2 = new objects.Sensor();
        java.lang.String str3 = sensor2.getRandArrayElement2();
        java.util.Random random4 = null;
        sensor2.rand2 = random4;
        parkingSpot1.setSensor(sensor2);
        java.lang.String str7 = parkingSpot1.code;
        parkingSpot1.code = "Mercedes";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BMW" + "'", str3, "BMW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.enable();
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Point point15 = bethuneLotView13.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView13.addHierarchyListener(hierarchyListener16);
        java.awt.event.WindowListener windowListener18 = null;
        bethuneLotView13.removeWindowListener(windowListener18);
        java.awt.event.WindowListener windowListener20 = null;
        bethuneLotView13.removeWindowListener(windowListener20);
        java.awt.Window.Type type22 = bethuneLotView13.getType();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener23 = null;
        bethuneLotView13.addHierarchyBoundsListener(hierarchyBoundsListener23);
        java.awt.Color color25 = null;
        bethuneLotView13.setForeground(color25);
        boolean boolean27 = bethuneLotView13.isVisible();
        java.awt.Dialog.ModalExclusionType modalExclusionType28 = bethuneLotView13.getModalExclusionType();
        bethuneLotView1.setModalExclusionType(modalExclusionType28);
        bethuneLotView1.setLocationByPlatform(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + java.awt.Window.Type.NORMAL + "'", type22.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType28 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType28.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        maintainManager0.clear();
        java.util.ArrayList<objects.Manager> managerList4 = maintainManager0.managers;
        java.util.ArrayList<objects.Manager> managerList5 = maintainManager0.managers;
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNotNull(managerList4);
        org.junit.Assert.assertNotNull(managerList5);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        java.time.LocalDateTime localDateTime20 = checkoutView6.currentTime;
        java.awt.Image image21 = checkoutView6.getIconImage();
        views.Main main22 = new views.Main();
        java.awt.Cursor cursor23 = null;
        main22.setCursor(cursor23);
        boolean boolean27 = main22.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView28 = new views.CheckoutView(main22);
        javax.swing.JTextField jTextField29 = checkoutView28.cardNumberField;
        javax.swing.JRadioButton jRadioButton30 = null;
        checkoutView28.debitRadioButton = jRadioButton30;
        views.Main main32 = new views.Main();
        java.awt.Cursor cursor33 = null;
        main32.setCursor(cursor33);
        boolean boolean37 = main32.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView38 = new views.CheckoutView(main32);
        javax.swing.JTextField jTextField39 = checkoutView38.cvvField;
        javax.swing.JLabel jLabel40 = checkoutView38.nameCard;
        checkoutView28.nameCard = jLabel40;
        views.Main main42 = new views.Main();
        java.awt.Cursor cursor43 = null;
        main42.setCursor(cursor43);
        boolean boolean47 = main42.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView48 = new views.CheckoutView(main42);
        javax.swing.JTextField jTextField49 = checkoutView48.cvvField;
        java.awt.Cursor cursor50 = null;
        checkoutView48.setCursor(cursor50);
        views.Main main52 = new views.Main();
        java.awt.Cursor cursor53 = null;
        main52.setCursor(cursor53);
        boolean boolean57 = main52.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView58 = new views.CheckoutView(main52);
        javax.swing.JTextField jTextField59 = checkoutView58.cvvField;
        javax.swing.JLabel jLabel60 = checkoutView58.nameCard;
        checkoutView48.nameCard = jLabel60;
        javax.swing.JTextField jTextField62 = checkoutView48.cardNumberField;
        checkoutView48.price = "frame14";
        checkoutView48.dateConfirmed = false;
        views.Main main67 = null;
        views.BethuneLotView bethuneLotView68 = new views.BethuneLotView(main67);
        java.awt.Font font69 = null;
        bethuneLotView68.setFont(font69);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        bethuneLotView68.addPropertyChangeListener("", propertyChangeListener72);
        views.Main main74 = null;
        views.BethuneLotView bethuneLotView75 = new views.BethuneLotView(main74);
        java.awt.Point point77 = bethuneLotView75.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener78 = null;
        bethuneLotView75.addHierarchyListener(hierarchyListener78);
        boolean boolean80 = bethuneLotView75.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer81 = null;
        java.awt.Image image82 = bethuneLotView75.createImage(imageProducer81);
        boolean boolean88 = bethuneLotView68.imageUpdate(image82, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation89 = bethuneLotView68.getComponentOrientation();
        checkoutView48.setComponentOrientation(componentOrientation89);
        jLabel40.applyComponentOrientation(componentOrientation89);
        boolean boolean92 = checkoutView6.isFocusCycleRoot((java.awt.Container) jLabel40);
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.applyResourceBundle("0");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name 0, locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jTextField39);
        org.junit.Assert.assertNotNull(jLabel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jTextField49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jTextField59);
        org.junit.Assert.assertNotNull(jLabel60);
        org.junit.Assert.assertNotNull(jTextField62);
        org.junit.Assert.assertNull(point77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(image82);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(componentOrientation89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.setPaymentType("frame55");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = main0.getHierarchyBoundsListeners();
        // The following exception was thrown during execution in test generation
        try {
            views.EditBookingView editBookingView8 = new views.EditBookingView(main0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        bethuneLotView1.setFocusableWindowState(true);
        javax.swing.JRootPane jRootPane7 = bethuneLotView1.getRootPane();
        java.awt.Image image8 = bethuneLotView1.getIconImage();
        org.junit.Assert.assertNotNull(jRootPane7);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        main0.setSize((int) (short) 10, (int) (byte) 10);
        views.CalumetLotView calumetLotView9 = new views.CalumetLotView(main0);
        java.awt.event.WindowFocusListener windowFocusListener10 = null;
        calumetLotView9.removeWindowFocusListener(windowFocusListener10);
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Point point15 = bethuneLotView13.getMousePosition(false);
        java.lang.String str16 = bethuneLotView13.getWarningString();
        java.awt.Font font17 = null;
        bethuneLotView13.setFont(font17);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.event.WindowStateListener[] windowStateListenerArray21 = bethuneLotView20.getWindowStateListeners();
        bethuneLotView20.enable(true);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        bethuneLotView20.addHierarchyListener(hierarchyListener24);
        java.awt.Point point26 = bethuneLotView20.getLocation();
        boolean boolean27 = bethuneLotView13.contains(point26);
        calumetLotView9.setLocation(point26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(windowStateListenerArray21);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.parkingFee = (byte) -1;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingStartTime = localDateTime9;
        user5.setEmail("Email not registered.");
        java.time.LocalDateTime localDateTime13 = null;
        user5.parkingStartTime = localDateTime13;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.awt.event.WindowListener windowListener16 = null;
        bethuneLotView1.removeWindowListener(windowListener16);
        bethuneLotView1.setExtendedState((int) (short) 10);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        maintainUser0.update();
        maintainUser0.load();
        maintainUser0.update();
        maintainUser0.update();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        bethuneLotView1.toFront();
        java.awt.image.BufferStrategy bufferStrategy14 = bethuneLotView1.getBufferStrategy();
        java.awt.event.ContainerListener containerListener15 = null;
        bethuneLotView1.addContainerListener(containerListener15);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertNull(bufferStrategy14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        views.Main main0 = new views.Main();
        views.VanierLotView vanierLotView1 = new views.VanierLotView(main0);
        views.AlertStateContext alertStateContext2 = vanierLotView1.getParkingSpotState();
        org.junit.Assert.assertNotNull(alertStateContext2);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        user17.plateNumber = "frame9";
        user17.setParkingLot("Hyundai");
        java.lang.String str25 = user17.getCardNumber();
        java.lang.String str26 = user17.getPassword();
        user17.setCardName("frame22");
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.paymentType;
        java.lang.String str8 = user5.getCvvNumber();
        user5.setCvvNumber("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        // The following exception was thrown during execution in test generation
        try {
            user5.setDebitBalance("Hyundai");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hyundai\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        user5.accountType = "BMW";
        user5.setEmail("Honda");
        user5.setCardName("KIA");
        int int15 = user5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        boolean boolean6 = bethuneLotView1.isValidateRoot();
        java.awt.Font font7 = bethuneLotView1.getFont();
        javax.accessibility.AccessibleContext accessibleContext8 = bethuneLotView1.getAccessibleContext();
        java.awt.event.WindowStateListener windowStateListener9 = null;
        bethuneLotView1.addWindowStateListener(windowStateListener9);
        boolean boolean11 = bethuneLotView1.isResizable();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        views.LassondeLotView lassondeLotView9 = new views.LassondeLotView(main0);
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cardNumberField;
        java.util.Locale locale18 = null;
        checkoutView16.setLocale(locale18);
        javax.swing.JButton jButton20 = checkoutView16.backButton;
        lassondeLotView9.setColorButton(jButton20);
        int int22 = lassondeLotView9.getX();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1055 + "'", int22 == 1055);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        javax.swing.JTextField jTextField15 = checkoutView14.cvvField;
        views.Main main16 = new views.Main();
        java.awt.Cursor cursor17 = null;
        main16.setCursor(cursor17);
        boolean boolean21 = main16.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView22 = new views.CheckoutView(main16);
        javax.swing.JTextField jTextField23 = checkoutView22.cardNumberField;
        javax.swing.JRadioButton jRadioButton24 = null;
        checkoutView22.debitRadioButton = jRadioButton24;
        views.Main main26 = new views.Main();
        java.awt.Cursor cursor27 = null;
        main26.setCursor(cursor27);
        boolean boolean31 = main26.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView32 = new views.CheckoutView(main26);
        javax.swing.JTextField jTextField33 = checkoutView32.cvvField;
        javax.swing.JLabel jLabel34 = checkoutView32.nameCard;
        checkoutView22.nameCard = jLabel34;
        views.Main main36 = new views.Main();
        java.awt.Cursor cursor37 = null;
        main36.setCursor(cursor37);
        boolean boolean41 = main36.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView42 = new views.CheckoutView(main36);
        javax.swing.JTextField jTextField43 = checkoutView42.cvvField;
        javax.swing.JLabel jLabel44 = checkoutView42.nameCard;
        javax.swing.JTextField jTextField45 = checkoutView42.cvvField;
        checkoutView22.cvvField = jTextField45;
        checkoutView14.cardNumberField = jTextField45;
        checkoutView6.nameCardField = jTextField45;
        boolean boolean49 = checkoutView6.dateConfirmed;
        java.awt.Container container50 = checkoutView6.getContentPane();
        views.Main main51 = new views.Main();
        java.awt.Cursor cursor52 = null;
        main51.setCursor(cursor52);
        boolean boolean56 = main51.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView57 = new views.CheckoutView(main51);
        javax.swing.JTextField jTextField58 = checkoutView57.cardNumberField;
        views.Main main59 = new views.Main();
        java.awt.Cursor cursor60 = null;
        main59.setCursor(cursor60);
        boolean boolean64 = main59.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView65 = new views.CheckoutView(main59);
        javax.swing.JTextField jTextField66 = checkoutView65.cardNumberField;
        javax.swing.JRadioButton jRadioButton67 = null;
        checkoutView65.debitRadioButton = jRadioButton67;
        views.Main main69 = new views.Main();
        java.awt.Cursor cursor70 = null;
        main69.setCursor(cursor70);
        boolean boolean74 = main69.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView75 = new views.CheckoutView(main69);
        javax.swing.JTextField jTextField76 = checkoutView75.cvvField;
        javax.swing.JLabel jLabel77 = checkoutView75.nameCard;
        checkoutView65.nameCard = jLabel77;
        checkoutView57.cvvLabel = jLabel77;
        javax.swing.JTextField jTextField80 = checkoutView57.cardNumberField;
        checkoutView6.cardNumberField = jTextField80;
        java.awt.image.ColorModel colorModel82 = checkoutView6.getColorModel();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jTextField23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jTextField43);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(jTextField45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(container50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jTextField58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jTextField66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jTextField76);
        org.junit.Assert.assertNotNull(jLabel77);
        org.junit.Assert.assertNotNull(jTextField80);
        org.junit.Assert.assertNotNull(colorModel82);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        user5.setCardName("Vanier,Bethune,Calumet,Schulich");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        boolean boolean3 = password0.getincludeLowerCase();
        boolean boolean4 = password0.getIncludeNumbers();
        password0.setLength(7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        views.Main main0 = null;
        views.ManageLotsView manageLotsView1 = new views.ManageLotsView(main0);
        manageLotsView1.validate();
        java.awt.Dimension dimension3 = manageLotsView1.size();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        manageLotsView1.removeWindowFocusListener(windowFocusListener4);
        java.awt.event.MouseListener[] mouseListenerArray6 = manageLotsView1.getMouseListeners();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        password0.addSymbols(true);
        password0.setLength((int) '#');
        boolean boolean7 = password0.getSymbols();
        password0.addUpperCase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        bethuneLotView8.revalidate();
        java.awt.Event event16 = null;
        boolean boolean18 = bethuneLotView8.keyDown(event16, 291);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand1;
        java.util.Random random6 = null;
        sensor0.rand1 = random6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sensor0.getRandArrayElement1();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KIA" + "'", str1, "KIA");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNull(random5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        bethuneLotView13.layout();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = checkoutView26.cvvField;
        checkoutView6.cvvField = jTextField29;
        java.time.LocalDateTime localDateTime31 = null;
        checkoutView6.endTime = localDateTime31;
        javax.swing.JLabel jLabel33 = checkoutView6.cvvLabel;
        checkoutView6.setCreditLableFalse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel33);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        boolean boolean40 = bethuneLotView30.isDisplayable();
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        jLabel18.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = jLabel18.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = checkoutView26.cvvField;
        checkoutView6.cvvField = jTextField29;
        java.time.LocalDateTime localDateTime31 = null;
        checkoutView6.endTime = localDateTime31;
        javax.swing.JLabel jLabel33 = checkoutView6.cvvLabel;
        checkoutView6.price = "Email not registered.";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel33);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        password.Generator generator0 = new password.Generator();
        password.NumberPasswordBuilder numberPasswordBuilder1 = new password.NumberPasswordBuilder();
        numberPasswordBuilder1.setIncludeSymbols();
        numberPasswordBuilder1.setIncludeNumbers();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder1);
        password.NumberPasswordBuilder numberPasswordBuilder5 = new password.NumberPasswordBuilder();
        generator0.setPasswordBuilder((password.PasswordBuilder) numberPasswordBuilder5);
        numberPasswordBuilder5.setIncludeSymbols();
        password.Password password8 = numberPasswordBuilder5.getPassword();
        org.junit.Assert.assertNotNull(password8);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseDrag(event4, 9, (int) (byte) 1);
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Font font10 = null;
        bethuneLotView9.setFont(font10);
        int int12 = bethuneLotView9.getY();
        bethuneLotView9.disable();
        java.awt.Dimension dimension14 = bethuneLotView9.getMinimumSize();
        bethuneLotView9.remove((int) (short) 0);
        bethuneLotView9.setLocationByPlatform(false);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Point point22 = bethuneLotView20.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bethuneLotView20.addHierarchyListener(hierarchyListener23);
        java.awt.event.WindowListener windowListener25 = null;
        bethuneLotView20.removeWindowListener(windowListener25);
        java.awt.event.WindowListener windowListener27 = null;
        bethuneLotView20.removeWindowListener(windowListener27);
        java.awt.event.MouseListener mouseListener29 = null;
        bethuneLotView20.addMouseListener(mouseListener29);
        views.Main main31 = null;
        views.BethuneLotView bethuneLotView32 = new views.BethuneLotView(main31);
        java.awt.Dimension dimension33 = null;
        java.awt.Dimension dimension34 = bethuneLotView32.getSize(dimension33);
        java.awt.Dialog.ModalExclusionType modalExclusionType35 = bethuneLotView32.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        bethuneLotView32.addPropertyChangeListener(propertyChangeListener36);
        views.Main main38 = null;
        views.BethuneLotView bethuneLotView39 = new views.BethuneLotView(main38);
        java.awt.Dimension dimension40 = null;
        java.awt.Dimension dimension41 = bethuneLotView39.getSize(dimension40);
        java.awt.Dialog.ModalExclusionType modalExclusionType42 = bethuneLotView39.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        bethuneLotView39.addPropertyChangeListener(propertyChangeListener43);
        bethuneLotView32.remove((java.awt.Component) bethuneLotView39);
        java.awt.Component component46 = bethuneLotView32.getFocusOwner();
        bethuneLotView32.firePropertyChange("hi!", ' ', '4');
        bethuneLotView32.requestFocus();
        views.Main main52 = null;
        views.BethuneLotView bethuneLotView53 = new views.BethuneLotView(main52);
        java.awt.Font font54 = null;
        bethuneLotView53.setFont(font54);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior56 = bethuneLotView53.getBaselineResizeBehavior();
        bethuneLotView53.addNotify();
        bethuneLotView53.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        bethuneLotView53.addPropertyChangeListener(propertyChangeListener62);
        java.awt.Graphics graphics64 = bethuneLotView53.getGraphics();
        bethuneLotView32.printComponents(graphics64);
        bethuneLotView20.printComponents(graphics64);
        bethuneLotView9.update(graphics64);
        bethuneLotView1.update(graphics64);
        views.Main main69 = null;
        views.BethuneLotView bethuneLotView70 = new views.BethuneLotView(main69);
        java.awt.Point point72 = bethuneLotView70.getMousePosition(false);
        java.lang.String str73 = bethuneLotView70.getWarningString();
        java.awt.Font font74 = null;
        bethuneLotView70.setFont(font74);
        views.Main main76 = null;
        views.BethuneLotView bethuneLotView77 = new views.BethuneLotView(main76);
        java.awt.event.WindowStateListener[] windowStateListenerArray78 = bethuneLotView77.getWindowStateListeners();
        bethuneLotView77.enable(true);
        java.awt.event.HierarchyListener hierarchyListener81 = null;
        bethuneLotView77.addHierarchyListener(hierarchyListener81);
        java.awt.Point point83 = bethuneLotView77.getLocation();
        boolean boolean84 = bethuneLotView70.contains(point83);
        java.awt.Component component85 = bethuneLotView1.getComponentAt(point83);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 291 + "'", int12 == 291);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(point22);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + modalExclusionType35 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType35.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertTrue("'" + modalExclusionType42 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType42.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior56 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior56.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics64);
        org.junit.Assert.assertNull(point72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(windowStateListenerArray78);
        org.junit.Assert.assertNotNull(point83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(component85);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        bethuneLotView8.revalidate();
        java.awt.Component component16 = bethuneLotView8.getFocusOwner();
        boolean boolean17 = bethuneLotView8.isAutoRequestFocus();
        javax.swing.TransferHandler transferHandler18 = bethuneLotView8.getTransferHandler();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(transferHandler18);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setIncludeSymbols();
        strongPasswordBuilder0.setIncludeNumbers();
        password.Password password3 = strongPasswordBuilder0.getPassword();
        password3.addUpperCase(true);
        org.junit.Assert.assertNotNull(password3);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        user5.setCvvNumber("Email invalid.");
        user5.setName("Sedan");
        user5.setApproved(true);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        objects.User user5 = new objects.User("frame18", (int) ' ', "", "YorkUParking - Bethune", "Nissan");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        int int23 = bethuneLotView13.getX();
        java.awt.ImageCapabilities imageCapabilities26 = null;
        java.awt.image.VolatileImage volatileImage27 = bethuneLotView13.createVolatileImage(1055, 64, imageCapabilities26);
        javax.accessibility.AccessibleContext accessibleContext28 = bethuneLotView13.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1055 + "'", int23 == 1055);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertNotNull(accessibleContext28);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        main0.setFocusTraversalPolicyProvider(true);
        main0.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = bethuneLotView1.createImage(imageProducer7);
        int int9 = bethuneLotView1.getHeight();
        java.awt.Point point10 = bethuneLotView1.location();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 450 + "'", int9 == 450);
        org.junit.Assert.assertNotNull(point10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        objects.User user5 = new objects.User("YorkUParking - Bethune", (int) (short) 100, "frame9", "Invalid plate number", "Account does not exist.");
        user5.paymentType = "YorkUParking - Bethune";
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        int int7 = bethuneLotView1.countComponents();
        boolean boolean8 = bethuneLotView1.isActive();
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Font font11 = null;
        bethuneLotView10.setFont(font11);
        bethuneLotView10.toBack();
        java.awt.Event event14 = null;
        boolean boolean17 = bethuneLotView10.mouseDrag(event14, 0, 1);
        java.awt.Image image18 = null;
        views.Main main21 = null;
        views.BethuneLotView bethuneLotView22 = new views.BethuneLotView(main21);
        java.awt.Font font23 = null;
        bethuneLotView22.setFont(font23);
        bethuneLotView22.toBack();
        java.awt.Event event26 = null;
        boolean boolean29 = bethuneLotView22.mouseDrag(event26, 0, 1);
        boolean boolean30 = bethuneLotView10.prepareImage(image18, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView22);
        java.awt.Cursor cursor31 = null;
        bethuneLotView10.setCursor(cursor31);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray33 = bethuneLotView10.getWindowFocusListeners();
        boolean boolean36 = bethuneLotView10.contains((int) (short) 1, (int) (short) 10);
        views.Main main37 = null;
        views.BethuneLotView bethuneLotView38 = new views.BethuneLotView(main37);
        java.awt.Point point40 = bethuneLotView38.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener41 = null;
        bethuneLotView38.addHierarchyListener(hierarchyListener41);
        boolean boolean43 = bethuneLotView38.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer44 = null;
        java.awt.Image image45 = bethuneLotView38.createImage(imageProducer44);
        views.Main main48 = null;
        views.BethuneLotView bethuneLotView49 = new views.BethuneLotView(main48);
        java.awt.Dimension dimension50 = null;
        java.awt.Dimension dimension51 = bethuneLotView49.getSize(dimension50);
        java.awt.Dialog.ModalExclusionType modalExclusionType52 = bethuneLotView49.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener53 = null;
        bethuneLotView49.removeInputMethodListener(inputMethodListener53);
        int int55 = bethuneLotView10.checkImage(image45, 8, 291, (java.awt.image.ImageObserver) bethuneLotView49);
        boolean boolean56 = bethuneLotView49.isFocused();
        java.awt.Component component59 = bethuneLotView49.locate((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setGlassPane((java.awt.Component) bethuneLotView49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(point40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(image45);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertTrue("'" + modalExclusionType52 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType52.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(component59);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setUpperCase();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand1;
        java.lang.String[] strArray6 = sensor0.carType;
        objects.Sensor sensor7 = new objects.Sensor();
        java.lang.String str8 = sensor7.getRandArrayElement2();
        java.lang.String str9 = sensor7.getRandArrayElement1();
        java.lang.String[] strArray10 = sensor7.carModel;
        java.util.Random random11 = null;
        sensor7.rand1 = random11;
        java.util.Random random13 = sensor7.rand2;
        sensor0.rand1 = random13;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nissan" + "'", str1, "Nissan");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNull(random5);
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Honda" + "'", str8, "Honda");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Minivan" + "'", str9, "Minivan");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(random13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        javax.swing.JLabel jLabel18 = checkoutView16.nameCard;
        checkoutView6.nameCard = jLabel18;
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        javax.swing.JTextField jTextField29 = checkoutView26.cvvField;
        checkoutView6.cvvField = jTextField29;
        java.awt.GraphicsConfiguration graphicsConfiguration31 = checkoutView6.getGraphicsConfiguration();
        long long32 = checkoutView6.hoursBookedFor;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(graphicsConfiguration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        bethuneLotView1.setFocusableWindowState(true);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Point point10 = bethuneLotView8.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        bethuneLotView8.addHierarchyListener(hierarchyListener11);
        boolean boolean13 = bethuneLotView8.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = bethuneLotView8.createImage(imageProducer14);
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Font font20 = null;
        bethuneLotView19.setFont(font20);
        bethuneLotView19.toBack();
        java.awt.Event event23 = null;
        boolean boolean26 = bethuneLotView19.mouseDrag(event23, 0, 1);
        java.awt.Image image27 = null;
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Font font32 = null;
        bethuneLotView31.setFont(font32);
        bethuneLotView31.toBack();
        java.awt.Event event35 = null;
        boolean boolean38 = bethuneLotView31.mouseDrag(event35, 0, 1);
        boolean boolean39 = bethuneLotView19.prepareImage(image27, (-1), 11, (java.awt.image.ImageObserver) bethuneLotView31);
        java.awt.MenuBar menuBar40 = null;
        bethuneLotView31.setMenuBar(menuBar40);
        bethuneLotView31.firePropertyChange("", (long) (short) 100, (long) ' ');
        java.awt.Color color46 = bethuneLotView31.getForeground();
        boolean boolean47 = bethuneLotView31.isFocusTraversalPolicySet();
        int int48 = bethuneLotView1.checkImage(image15, 4, 3, (java.awt.image.ImageObserver) bethuneLotView31);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(color46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String str2 = sensor0.getRandArrayElement1();
        objects.Sensor sensor3 = new objects.Sensor();
        java.lang.String str4 = sensor3.getRandArrayElement2();
        java.lang.String[] strArray8 = new java.lang.String[] { "Hyundai", "frame14", "hi!" };
        sensor3.carModel = strArray8;
        java.util.Random random10 = null;
        sensor3.rand1 = random10;
        java.lang.String[] strArray12 = sensor3.carType;
        sensor0.carModel = strArray12;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BMW" + "'", str1, "BMW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sedan" + "'", str2, "Sedan");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hyundai" + "'", str4, "Hyundai");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        parkingSpot1.code = "Nissan";
        java.lang.String str4 = parkingSpot1.getCode();
        parkingSpot1.code = "Vanier,Bethune,Calumet,Schulich";
        java.lang.String str7 = parkingSpot1.code;
        objects.Sensor sensor8 = new objects.Sensor();
        java.lang.String str9 = sensor8.getRandArrayElement2();
        java.lang.String str10 = sensor8.getRandArrayElement1();
        java.lang.String[] strArray11 = sensor8.carModel;
        parkingSpot1.setSensor(sensor8);
        parkingSpot1.code = "YorkUParking - Bethune";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nissan" + "'", str4, "Nissan");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vanier,Bethune,Calumet,Schulich" + "'", str7, "Vanier,Bethune,Calumet,Schulich");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KIA" + "'", str9, "KIA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Minivan" + "'", str10, "Minivan");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        boolean boolean3 = main0.isMaximumSizeSet();
        int int4 = main0.countComponents();
        java.awt.event.KeyListener keyListener5 = null;
        main0.removeKeyListener(keyListener5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JRadioButton jRadioButton9 = checkoutView6.creditRadioButton;
        checkoutView6.firePropertyChange("Mercedes", (float) '#', (float) 0);
        boolean boolean16 = checkoutView6.contains(150, 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jRadioButton9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.awt.Component component21 = bethuneLotView1.findComponentAt(0, 5);
        bethuneLotView1.transferFocusUpCycle();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setCursor(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(component21);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        objects.User user28 = maintainUser0.loggedInUser;
        objects.User user34 = new objects.User("hi!", (int) '4', "", "", "");
        user34.setPrice((int) (byte) -1);
        user34.chargeUser("Email not registered.", (int) (byte) 0);
        user34.paymentType = "hi!";
        user34.debitBalance = (short) 10;
        maintainUser0.loggedInUser = user34;
        objects.User user50 = new objects.User("hi!", (int) '4', "", "", "");
        double double51 = user50.getRate();
        java.lang.String str52 = user50.getEmail();
        java.time.LocalDateTime localDateTime53 = user50.parkingEndTime;
        user50.setParkingSpot("Email invalid.");
        java.time.LocalDateTime localDateTime56 = user50.parkingEndTime;
        maintainUser0.loggedInUser = user50;
        maintainUser0.clear();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(localDateTime53);
        org.junit.Assert.assertNull(localDateTime56);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand1;
        java.lang.String[] strArray6 = sensor0.carModel;
        objects.Sensor sensor7 = new objects.Sensor();
        java.lang.String str8 = sensor7.getRandArrayElement2();
        java.util.Random random9 = null;
        sensor7.rand1 = random9;
        java.util.Random random11 = sensor7.rand1;
        java.util.Random random12 = sensor7.rand1;
        java.lang.String[] strArray13 = sensor7.carType;
        java.lang.String[] strArray14 = sensor7.carType;
        sensor0.carType = strArray14;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KIA" + "'", str1, "KIA");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNull(random5);
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "BMW" + "'", str8, "BMW");
        org.junit.Assert.assertNull(random11);
        org.junit.Assert.assertNull(random12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        java.lang.String str12 = user5.cardNumber;
        java.lang.String str13 = user5.getParkingLot();
        java.time.LocalDateTime localDateTime14 = null;
        user5.setParkingEndTime(localDateTime14);
        user5.chargeUser("Invalid plate number", 291);
        user5.setPaymentType("frame55");
        user5.setEmail("Invalid plate number");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Point point21 = bethuneLotView19.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener22 = null;
        bethuneLotView19.addHierarchyListener(hierarchyListener22);
        bethuneLotView19.show();
        bethuneLotView19.list();
        views.Main main26 = null;
        views.BethuneLotView bethuneLotView27 = new views.BethuneLotView(main26);
        java.awt.Font font28 = null;
        bethuneLotView27.setFont(font28);
        bethuneLotView27.toBack();
        java.awt.Event event31 = null;
        boolean boolean34 = bethuneLotView27.mouseDrag(event31, 0, 1);
        bethuneLotView27.remove(0);
        bethuneLotView27.setFocusTraversalPolicyProvider(false);
        bethuneLotView19.remove((java.awt.Component) bethuneLotView27);
        java.awt.Color color40 = bethuneLotView19.getBackground();
        bethuneLotView1.setBackground(color40);
        java.awt.dnd.DropTarget dropTarget42 = null;
        bethuneLotView1.setDropTarget(dropTarget42);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        views.Main main0 = null;
        views.SchulichLotView schulichLotView1 = new views.SchulichLotView(main0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        user17.plateNumber = "frame9";
        user17.setParkingLot("Hyundai");
        java.lang.String str25 = user17.getCardNumber();
        java.lang.String str26 = user17.getPassword();
        java.time.LocalDateTime localDateTime27 = user17.getParkingStartTime();
        java.lang.String str28 = user17.lotName;
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hyundai" + "'", str28, "Hyundai");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        user17.accountType = "YorkUParking - Bethune";
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        user5.parkingFee = (byte) -1;
        java.time.LocalDateTime localDateTime9 = null;
        user5.parkingStartTime = localDateTime9;
        user5.setEmail("Email not registered.");
        java.lang.String str13 = user5.getLotName();
        user5.setPayementType("Unavailable");
        user5.setplateNumber("frame55");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        bethuneLotView1.repaint();
        bethuneLotView1.firePropertyChange("frame22", ' ', 'a');
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.awt.event.WindowListener windowListener25 = null;
        checkoutView6.removeWindowListener(windowListener25);
        java.time.LocalDateTime localDateTime27 = checkoutView6.currentTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        checkoutView6.price = "Honda";
        views.Main main10 = new views.Main();
        java.awt.Cursor cursor11 = null;
        main10.setCursor(cursor11);
        boolean boolean15 = main10.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView16 = new views.CheckoutView(main10);
        javax.swing.JTextField jTextField17 = checkoutView16.cvvField;
        java.awt.Cursor cursor18 = null;
        checkoutView16.setCursor(cursor18);
        views.Main main20 = new views.Main();
        java.awt.Cursor cursor21 = null;
        main20.setCursor(cursor21);
        boolean boolean25 = main20.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView26 = new views.CheckoutView(main20);
        javax.swing.JTextField jTextField27 = checkoutView26.cvvField;
        javax.swing.JLabel jLabel28 = checkoutView26.nameCard;
        checkoutView16.nameCard = jLabel28;
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        jLabel28.removePropertyChangeListener(propertyChangeListener30);
        checkoutView6.cardNumberLabel = jLabel28;
        views.Main main33 = new views.Main();
        java.awt.Cursor cursor34 = null;
        main33.setCursor(cursor34);
        boolean boolean38 = main33.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView39 = new views.CheckoutView(main33);
        javax.swing.JTextField jTextField40 = checkoutView39.cvvField;
        java.awt.Cursor cursor41 = null;
        checkoutView39.setCursor(cursor41);
        long long43 = checkoutView39.hoursBookedFor;
        javax.swing.JTextField jTextField44 = checkoutView39.cardNumberField;
        views.Main main45 = new views.Main();
        java.awt.Cursor cursor46 = null;
        main45.setCursor(cursor46);
        boolean boolean50 = main45.inside((int) (byte) 100, 0);
        main45.setSize((int) (short) 10, (int) (byte) 10);
        views.Main main54 = null;
        views.BethuneLotView bethuneLotView55 = new views.BethuneLotView(main54);
        java.awt.Font font56 = null;
        bethuneLotView55.setFont(font56);
        int int58 = bethuneLotView55.getY();
        bethuneLotView55.disable();
        java.awt.Dimension dimension60 = bethuneLotView55.getMinimumSize();
        main45.setMaximumSize(dimension60);
        main45.resize((int) '4', 1055);
        views.LoginView loginView65 = new views.LoginView(main45);
        views.Main main66 = null;
        views.BethuneLotView bethuneLotView67 = new views.BethuneLotView(main66);
        java.awt.Font font68 = null;
        bethuneLotView67.setFont(font68);
        int int70 = bethuneLotView67.getY();
        bethuneLotView67.disable();
        java.awt.Dimension dimension72 = bethuneLotView67.getMinimumSize();
        loginView65.setMinimumSize(dimension72);
        jTextField44.setMaximumSize(dimension72);
        checkoutView6.nameCardField = jTextField44;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jTextField40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(jTextField44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 291 + "'", int58 == 291);
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 291 + "'", int70 == 291);
        org.junit.Assert.assertNotNull(dimension72);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        java.lang.String str13 = user5.cvvNumber;
        java.lang.String str14 = user5.lotName;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        int int28 = bethuneLotView1.getY();
        bethuneLotView1.reshape(0, 0, 52, 291);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 291 + "'", int28 == 291);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        views.AlertStateContext alertStateContext30 = bethuneLotView17.getParkingSpotState();
        java.lang.String str31 = alertStateContext30.alert();
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(font29);
        org.junit.Assert.assertNotNull(alertStateContext30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Available" + "'", str31, "Available");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        password.Password password0 = new password.Password();
        password0.addLowerCase(false);
        password0.addSymbols(true);
        password0.addSymbols(false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        checkoutView6.move(16, 1000);
        checkoutView6.price = "Mercedes";
        javax.swing.JLabel jLabel42 = checkoutView6.cardNumberLabel;
        java.awt.PopupMenu popupMenu43 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.add(popupMenu43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(jLabel42);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.accountType = "Vanier,Bethune,Calumet,Schulich";
        java.time.LocalDateTime localDateTime11 = user5.getParkingStartTime();
        int int12 = user5.debitBalance;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
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
        views.Main main28 = new views.Main();
        java.awt.Cursor cursor29 = null;
        main28.setCursor(cursor29);
        boolean boolean33 = main28.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView34 = new views.CheckoutView(main28);
        javax.swing.JTextField jTextField35 = checkoutView34.cvvField;
        javax.swing.JLabel jLabel36 = checkoutView34.nameCard;
        javax.swing.JTextField jTextField37 = checkoutView34.cvvField;
        checkoutView14.cvvField = jTextField37;
        checkoutView6.cardNumberField = jTextField37;
        checkoutView6.firePropertyChange("KIA", (long) 1000, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jTextField25);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertNotNull(jLabel36);
        org.junit.Assert.assertNotNull(jTextField37);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        java.awt.event.ComponentListener[] componentListenerArray7 = bethuneLotView1.getComponentListeners();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(componentListenerArray7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = checkoutView6.cardNumberLabel;
        javax.swing.JLabel jLabel11 = checkoutView6.nameCard;
        int int12 = checkoutView6.getCursorType();
        java.lang.String str13 = checkoutView6.price;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertNotNull(jLabel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String[] strArray5 = new java.lang.String[] { "Hyundai", "frame14", "hi!" };
        sensor0.carModel = strArray5;
        java.util.Random random7 = sensor0.rand2;
        java.util.Random random8 = sensor0.rand2;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        user5.setId(0);
        java.time.LocalDateTime localDateTime13 = user5.parkingStartTime;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getName();
        java.lang.String str11 = user5.parkingSpotName;
        boolean boolean12 = user5.getApproved();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        maintainUser0.update();
        objects.User user28 = maintainUser0.loggedInUser;
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        bethuneLotView1.doLayout();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'", type18.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        views.LassondeLotView lassondeLotView9 = new views.LassondeLotView(main0);
        java.awt.Window.Type type10 = main0.getType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.parkingFee;
        user5.lotName = "Invalid plate number";
        user5.creditBalnce = 13;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        views.Main main26 = new views.Main();
        java.awt.MenuComponent menuComponent27 = null;
        main26.remove(menuComponent27);
        main26.resetContentPane();
        int int30 = main26.getExtendedState();
        bethuneLotView1.remove((java.awt.Component) main26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        checkoutView6.move(16, 1000);
        javax.swing.JButton jButton40 = checkoutView6.backButton;
        boolean boolean41 = checkoutView6.dateConfirmed;
        java.time.LocalDateTime localDateTime42 = checkoutView6.startTime;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jTextField32);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(jButton40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(localDateTime42);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.awt.event.WindowStateListener windowStateListener13 = null;
        bethuneLotView1.removeWindowStateListener(windowStateListener13);
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        int int19 = bethuneLotView16.getY();
        bethuneLotView16.disable();
        java.awt.Dimension dimension21 = bethuneLotView16.getMinimumSize();
        java.awt.Dimension dimension22 = bethuneLotView1.getSize(dimension21);
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Font font25 = null;
        bethuneLotView24.setFont(font25);
        int int27 = bethuneLotView24.getY();
        bethuneLotView24.disable();
        boolean boolean29 = bethuneLotView24.isValidateRoot();
        java.awt.Font font30 = bethuneLotView24.getFont();
        javax.accessibility.AccessibleContext accessibleContext31 = bethuneLotView24.getAccessibleContext();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        bethuneLotView24.addWindowStateListener(windowStateListener32);
        java.awt.Cursor cursor34 = bethuneLotView24.getCursor();
        bethuneLotView1.setCursor(cursor34);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 291 + "'", int19 == 291);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 291 + "'", int27 == 291);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(font30);
        org.junit.Assert.assertNotNull(accessibleContext31);
        org.junit.Assert.assertNotNull(cursor34);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        bethuneLotView1.setName("Email invalid.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }
}
