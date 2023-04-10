package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.awt.Window[] windowArray48 = null; // flaky: checkoutView6.getOwnedWindows();
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
// flaky:         org.junit.Assert.assertNotNull(windowArray48);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand1 = random2;
        java.util.Random random4 = sensor0.rand1;
        java.util.Random random5 = sensor0.rand1;
        objects.Sensor sensor6 = new objects.Sensor();
        java.lang.String str7 = sensor6.getRandArrayElement2();
        java.util.Random random8 = null;
        sensor6.rand1 = random8;
        java.util.Random random10 = sensor6.rand1;
        java.util.Random random11 = sensor6.rand1;
        java.lang.String[] strArray12 = sensor6.carType;
        java.lang.String[] strArray13 = sensor6.carType;
        sensor0.carType = strArray13;
        java.lang.String[] strArray15 = sensor0.carModel;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KIA" + "'", str1, "KIA");
        org.junit.Assert.assertNull(random4);
        org.junit.Assert.assertNull(random5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BMW" + "'", str7, "BMW");
        org.junit.Assert.assertNull(random10);
        org.junit.Assert.assertNull(random11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        parkingSpot1.code = "Nissan";
        java.lang.String str4 = parkingSpot1.getCode();
        parkingSpot1.code = "Vanier,Bethune,Calumet,Schulich";
        java.lang.String str7 = parkingSpot1.code;
        java.lang.String str8 = parkingSpot1.getCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nissan" + "'", str4, "Nissan");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vanier,Bethune,Calumet,Schulich" + "'", str7, "Vanier,Bethune,Calumet,Schulich");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vanier,Bethune,Calumet,Schulich" + "'", str8, "Vanier,Bethune,Calumet,Schulich");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.awt.event.MouseWheelListener mouseWheelListener31 = null;
        bethuneLotView13.removeMouseWheelListener(mouseWheelListener31);
        java.awt.Component component33 = bethuneLotView13.getFocusOwner();
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
        boolean boolean55 = bethuneLotView35.imageUpdate(image49, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.Point point56 = bethuneLotView35.location();
        java.awt.Color color57 = bethuneLotView35.getBackground();
        bethuneLotView13.setForeground(color57);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(color28);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(image49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(point56);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.awt.im.InputMethodRequests inputMethodRequests35 = bethuneLotView25.getInputMethodRequests();
        boolean boolean36 = bethuneLotView25.isCursorSet();
        javax.swing.TransferHandler transferHandler37 = null;
        bethuneLotView25.setTransferHandler(transferHandler37);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
        org.junit.Assert.assertNull(inputMethodRequests35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        views.Main main0 = new views.Main();
        boolean boolean1 = main0.isUndecorated();
        int int2 = main0.getExtendedState();
        views.LotChoiceView lotChoiceView3 = new views.LotChoiceView(main0);
        java.awt.Event event4 = null;
        views.Main main5 = null;
        views.BethuneLotView bethuneLotView6 = new views.BethuneLotView(main5);
        java.awt.Font font7 = null;
        bethuneLotView6.setFont(font7);
        int int9 = bethuneLotView6.getY();
        bethuneLotView6.disable();
        boolean boolean11 = bethuneLotView6.isValidateRoot();
        java.awt.Font font12 = bethuneLotView6.getFont();
        boolean boolean13 = main0.gotFocus(event4, (java.lang.Object) font12);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 291 + "'", int9 == 291);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
// flaky:         checkoutView6.setBounds(rectangle52);
        java.lang.String str54 = null; // flaky: checkoutView6.price;
        java.awt.event.InputMethodListener[] inputMethodListenerArray55 = null; // flaky: checkoutView6.getInputMethodListeners();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField17);
// flaky:         org.junit.Assert.assertNotNull(jLabel18);
// flaky:         org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(componentListenerArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rectangle51);
        org.junit.Assert.assertNotNull(rectangle52);
        org.junit.Assert.assertNull(str54);
// flaky:         org.junit.Assert.assertNotNull(inputMethodListenerArray55);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        java.lang.String str13 = user5.cvvNumber;
        java.lang.String str14 = user5.getName();
        user5.setCvvNumber("Unavailable");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        bethuneLotView1.disable();
        java.awt.PopupMenu popupMenu22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.add(popupMenu22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.awt.Point point18 = bethuneLotView16.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        bethuneLotView16.addHierarchyListener(hierarchyListener19);
        bethuneLotView16.show();
        bethuneLotView16.list();
        views.Main main23 = null;
        views.BethuneLotView bethuneLotView24 = new views.BethuneLotView(main23);
        java.awt.Dimension dimension25 = null;
        java.awt.Dimension dimension26 = bethuneLotView24.getSize(dimension25);
        java.awt.Dialog.ModalExclusionType modalExclusionType27 = bethuneLotView24.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        bethuneLotView24.removeInputMethodListener(inputMethodListener28);
        java.awt.Rectangle rectangle30 = bethuneLotView24.bounds();
        java.awt.Rectangle rectangle31 = bethuneLotView16.getBounds(rectangle30);
        bethuneLotView1.setMaximizedBounds(rectangle31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + modalExclusionType27 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType27.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle30);
        org.junit.Assert.assertNotNull(rectangle31);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setIncludeSymbols();
        strongPasswordBuilder0.setIncludeNumbers();
        password.Password password3 = strongPasswordBuilder0.getPassword();
        password3.addLowerCase(true);
        org.junit.Assert.assertNotNull(password3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        main0.setAutoRequestFocus(false);
        views.LassondeLotView lassondeLotView6 = new views.LassondeLotView(main0);
        java.awt.Dimension dimension7 = lassondeLotView6.getPreferredSize();
        lassondeLotView6.transferFocus();
        views.AlertStateContext alertStateContext9 = lassondeLotView6.getParkingSpotState();
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertNotNull(alertStateContext9);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        user5.setCvvNumber("Email not registered.");
        java.lang.String str11 = user5.getCvvNumber();
        java.lang.String str12 = user5.paymentType;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email not registered." + "'", str11, "Email not registered.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid plate number" + "'", str12, "Invalid plate number");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = null; // flaky: new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = null; // flaky: checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
// flaky:         checkoutView6.setLocale(locale8);
        javax.swing.JLabel jLabel10 = null; // flaky: checkoutView6.cardNumberLabel;
        boolean boolean13 = false; // flaky: jLabel10.contains(13, 7);
        boolean boolean14 = false; // flaky: jLabel10.isMaximumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField7);
// flaky:         org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("Invalid plate number");
        java.lang.String str2 = parkingSpot1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid plate number" + "'", str2, "Invalid plate number");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.lang.String str2 = maintainLot0.lotOptions;
        java.lang.String str3 = maintainLot0.lotOptions;
        org.junit.Assert.assertNotNull(maintainLot0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null" + "'", str2, "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null" + "'", str3, "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        views.CheckoutView checkoutView38 = null; // flaky: new views.CheckoutView(main32);
        javax.swing.JTextField jTextField39 = null; // flaky: checkoutView38.cvvField;
        java.awt.Cursor cursor40 = null;
// flaky:         checkoutView38.setCursor(cursor40);
        views.Main main42 = new views.Main();
        java.awt.Cursor cursor43 = null;
        main42.setCursor(cursor43);
        boolean boolean47 = main42.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView48 = null; // flaky: new views.CheckoutView(main42);
        javax.swing.JTextField jTextField49 = null; // flaky: checkoutView48.cvvField;
        javax.swing.JLabel jLabel50 = null; // flaky: checkoutView48.nameCard;
// flaky:         checkoutView38.nameCard = jLabel50;
        boolean boolean52 = bethuneLotView13.gotFocus(event31, (java.lang.Object) checkoutView38);
        java.time.LocalDateTime localDateTime53 = null;
// flaky:         checkoutView38.endTime = localDateTime53;
// flaky:         checkoutView38.hoursBookedFor = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
// flaky:         org.junit.Assert.assertNotNull(jTextField49);
// flaky:         org.junit.Assert.assertNotNull(jLabel50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        java.util.ArrayList<objects.User> userList30 = maintainUser0.users;
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        main0.setAutoRequestFocus(false);
        views.LassondeLotView lassondeLotView6 = new views.LassondeLotView(main0);
        boolean boolean7 = lassondeLotView6.isForegroundSet();
        views.Main main8 = new views.Main();
        java.awt.Cursor cursor9 = null;
        main8.setCursor(cursor9);
        boolean boolean13 = main8.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView14 = new views.CheckoutView(main8);
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView21 = new views.CheckoutView(main15);
        javax.swing.JTextField jTextField22 = checkoutView21.cardNumberField;
        views.Main main23 = new views.Main();
        java.awt.Cursor cursor24 = null;
        main23.setCursor(cursor24);
        boolean boolean28 = main23.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView29 = new views.CheckoutView(main23);
        javax.swing.JTextField jTextField30 = checkoutView29.cardNumberField;
        javax.swing.JRadioButton jRadioButton31 = null;
        checkoutView29.debitRadioButton = jRadioButton31;
        views.Main main33 = new views.Main();
        java.awt.Cursor cursor34 = null;
        main33.setCursor(cursor34);
        boolean boolean38 = main33.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView39 = new views.CheckoutView(main33);
        javax.swing.JTextField jTextField40 = checkoutView39.cvvField;
        javax.swing.JLabel jLabel41 = checkoutView39.nameCard;
        checkoutView29.nameCard = jLabel41;
        checkoutView21.cvvLabel = jLabel41;
        checkoutView14.cardNumberLabel = jLabel41;
        checkoutView14.move(16, 1000);
        javax.swing.JButton jButton48 = checkoutView14.backButton;
        boolean boolean51 = checkoutView14.inside((int) (short) 100, (int) (byte) 100);
        javax.swing.JButton jButton52 = checkoutView14.backButton;
        java.awt.event.InputMethodListener inputMethodListener53 = null;
        jButton52.addInputMethodListener(inputMethodListener53);
        lassondeLotView6.setColorButton(jButton52);
        int int56 = lassondeLotView6.getX();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jTextField30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jTextField40);
        org.junit.Assert.assertNotNull(jLabel41);
        org.junit.Assert.assertNotNull(jButton48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jButton52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1055 + "'", int56 == 1055);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.String str17 = user5.lotName;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        views.Main main15 = new views.Main();
        java.awt.Cursor cursor16 = null;
        main15.setCursor(cursor16);
        boolean boolean20 = main15.inside((int) (byte) 100, 0);
        main15.setSize((int) (short) 10, (int) (byte) 10);
        views.Main main24 = null;
        views.BethuneLotView bethuneLotView25 = new views.BethuneLotView(main24);
        java.awt.Font font26 = null;
        bethuneLotView25.setFont(font26);
        int int28 = bethuneLotView25.getY();
        bethuneLotView25.disable();
        java.awt.Dimension dimension30 = bethuneLotView25.getMinimumSize();
        main15.setMaximumSize(dimension30);
        main15.resize((int) '4', 1055);
        views.LoginView loginView35 = new views.LoginView(main15);
        views.Main main36 = null;
        views.BethuneLotView bethuneLotView37 = new views.BethuneLotView(main36);
        java.awt.Font font38 = null;
        bethuneLotView37.setFont(font38);
        int int40 = bethuneLotView37.getY();
        bethuneLotView37.disable();
        java.awt.Dimension dimension42 = bethuneLotView37.getMinimumSize();
        loginView35.setMinimumSize(dimension42);
        bethuneLotView1.setSize(dimension42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 291 + "'", int28 == 291);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 291 + "'", int40 == 291);
        org.junit.Assert.assertNotNull(dimension42);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.parkingSpotName;
        int int8 = user5.parkingFee;
        user5.accountType = "BMW";
        user5.setEmail("Honda");
        java.lang.String str13 = user5.getName();
        java.lang.String str14 = user5.email;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Honda" + "'", str14, "Honda");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        checkoutView6.setMobileLableFalse();
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        bethuneLotView1.addMouseWheelListener(mouseWheelListener5);
        javax.swing.JRootPane jRootPane7 = bethuneLotView1.getRootPane();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jRootPane7);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        int int11 = user5.getPrice();
        user5.accountType = "Email invalid.";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        boolean boolean11 = bethuneLotView1.isFocusTraversalPolicyProvider();
        java.awt.Event event12 = null;
        boolean boolean14 = bethuneLotView1.keyDown(event12, 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        bethuneLotView1.removeMouseMotionListener(mouseMotionListener10);
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Point point15 = bethuneLotView13.getMousePosition(false);
        java.lang.String str16 = bethuneLotView13.getWarningString();
        float float17 = bethuneLotView13.getAlignmentY();
        boolean boolean18 = bethuneLotView13.isBackgroundSet();
        java.awt.event.FocusListener[] focusListenerArray19 = bethuneLotView13.getFocusListeners();
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Dimension dimension22 = null;
        java.awt.Dimension dimension23 = bethuneLotView21.getSize(dimension22);
        java.awt.Dialog.ModalExclusionType modalExclusionType24 = bethuneLotView21.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        bethuneLotView21.addPropertyChangeListener(propertyChangeListener25);
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Dimension dimension29 = null;
        java.awt.Dimension dimension30 = bethuneLotView28.getSize(dimension29);
        java.awt.Dialog.ModalExclusionType modalExclusionType31 = bethuneLotView28.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        bethuneLotView28.addPropertyChangeListener(propertyChangeListener32);
        bethuneLotView21.remove((java.awt.Component) bethuneLotView28);
        java.awt.Component component35 = bethuneLotView21.getFocusOwner();
        bethuneLotView21.firePropertyChange("hi!", ' ', '4');
        bethuneLotView21.requestFocus();
        views.Main main41 = null;
        views.BethuneLotView bethuneLotView42 = new views.BethuneLotView(main41);
        java.awt.Font font43 = null;
        bethuneLotView42.setFont(font43);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior45 = bethuneLotView42.getBaselineResizeBehavior();
        bethuneLotView42.addNotify();
        bethuneLotView42.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        bethuneLotView42.addPropertyChangeListener(propertyChangeListener51);
        java.awt.Graphics graphics53 = bethuneLotView42.getGraphics();
        bethuneLotView21.printComponents(graphics53);
        bethuneLotView13.printAll(graphics53);
        bethuneLotView1.printAll(graphics53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(focusListenerArray19);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + modalExclusionType24 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType24.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + modalExclusionType31 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType31.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component35);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior45 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior45.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics53);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        user5.paymentType = "hi!";
        java.lang.String str13 = user5.getCardNumber();
        user5.paymentType = "SUV";
        user5.setParkingSpot("Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setLength();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.awt.Component component29 = checkoutView6.getComponent(0);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        checkoutView6.removeInputMethodListener(inputMethodListener30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLabel27);
        org.junit.Assert.assertNotNull(component29);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = checkoutView6.cvvLabel;
        checkoutView6.setFocusCycleRoot(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        bethuneLotView1.reshape((int) (byte) 10, 100, (int) '#', 1);
        java.awt.Dimension dimension12 = bethuneLotView1.getPreferredSize();
        bethuneLotView1.nextFocus();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        bethuneLotView1.firePropertyChange("", (double) (byte) 10, (double) 128);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(component16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.awt.Cursor cursor11 = bethuneLotView1.getCursor();
        java.awt.event.WindowListener[] windowListenerArray12 = bethuneLotView1.getWindowListeners();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(windowListenerArray12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        javax.swing.JMenuBar jMenuBar20 = null;
        checkoutView6.setJMenuBar(jMenuBar20);
        java.awt.Cursor cursor22 = checkoutView6.getCursor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(cursor22);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        views.Main main0 = new views.Main();
        java.awt.Container container1 = main0.getOriginalContentPane();
        views.BookingActionsView bookingActionsView2 = new views.BookingActionsView(main0);
        org.junit.Assert.assertNotNull(container1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        password.Password password5 = numberPasswordBuilder0.getPassword();
        org.junit.Assert.assertNotNull(password5);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        java.awt.Container container5 = main0.getOriginalContentPane();
        int int6 = main0.getX();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1055 + "'", int6 == 1055);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = bethuneLotView1.getPropertyChangeListeners();
        java.lang.String str12 = bethuneLotView1.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        int int14 = bethuneLotView1.getExtendedState();
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Point point18 = bethuneLotView16.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        bethuneLotView16.addHierarchyListener(hierarchyListener19);
        boolean boolean21 = bethuneLotView16.isFocusTraversable();
        bethuneLotView16.setLocation((-1), (int) '4');
        boolean boolean25 = bethuneLotView16.getFocusableWindowState();
        bethuneLotView16.setLocationByPlatform(false);
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
        java.awt.Component component43 = bethuneLotView29.getFocusOwner();
        bethuneLotView29.firePropertyChange("hi!", ' ', '4');
        bethuneLotView29.requestFocus();
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
        bethuneLotView29.printComponents(graphics61);
        bethuneLotView16.printAll(graphics61);
        bethuneLotView16.repaint((long) 291);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component66 = bethuneLotView1.add((java.awt.Component) bethuneLotView16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertTrue("'" + modalExclusionType32 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType32.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + modalExclusionType39 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType39.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component43);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior53 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior53.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics61);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray40 = checkoutView16.getMouseMotionListeners();
        views.Main main41 = new views.Main();
        java.awt.Cursor cursor42 = null;
        main41.setCursor(cursor42);
        boolean boolean46 = main41.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView47 = new views.CheckoutView(main41);
        javax.swing.JTextField jTextField48 = checkoutView47.cardNumberField;
        views.Main main49 = new views.Main();
        java.awt.Cursor cursor50 = null;
        main49.setCursor(cursor50);
        boolean boolean54 = main49.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView55 = new views.CheckoutView(main49);
        javax.swing.JTextField jTextField56 = checkoutView55.cardNumberField;
        javax.swing.JRadioButton jRadioButton57 = null;
        checkoutView55.debitRadioButton = jRadioButton57;
        views.Main main59 = new views.Main();
        java.awt.Cursor cursor60 = null;
        main59.setCursor(cursor60);
        boolean boolean64 = main59.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView65 = new views.CheckoutView(main59);
        javax.swing.JTextField jTextField66 = checkoutView65.cvvField;
        javax.swing.JLabel jLabel67 = checkoutView65.nameCard;
        checkoutView55.nameCard = jLabel67;
        checkoutView47.cvvLabel = jLabel67;
        jLabel67.validate();
        java.awt.event.ComponentListener componentListener71 = null;
        jLabel67.removeComponentListener(componentListener71);
        checkoutView16.cvvLabel = jLabel67;
        java.io.PrintStream printStream74 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView16.list(printStream74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(mouseMotionListenerArray40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jTextField48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTextField56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jTextField66);
        org.junit.Assert.assertNotNull(jLabel67);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        boolean boolean26 = bethuneLotView1.isFontSet();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        java.awt.Container container5 = main0.getOriginalContentPane();
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JRadioButton jRadioButton9 = checkoutView6.creditRadioButton;
        checkoutView6.firePropertyChange("Mercedes", (float) '#', (float) 0);
        boolean boolean14 = checkoutView6.isFocusTraversalPolicyProvider();
        java.awt.Event event15 = null;
        boolean boolean18 = checkoutView6.mouseDown(event15, 8, 4);
        checkoutView6.transferFocusBackward();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jRadioButton9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.awt.MenuComponent menuComponent21 = null;
        main20.remove(menuComponent21);
        main20.resetContentPane();
        int int24 = main20.getExtendedState();
        main20.enable(true);
        java.awt.Component component27 = main20.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView28 = new views.LotChoiceView(main20);
        views.LassondeLotView lassondeLotView29 = new views.LassondeLotView(main20);
        views.Main main30 = new views.Main();
        java.awt.Cursor cursor31 = null;
        main30.setCursor(cursor31);
        boolean boolean35 = main30.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView36 = new views.CheckoutView(main30);
        javax.swing.JTextField jTextField37 = checkoutView36.cardNumberField;
        java.util.Locale locale38 = null;
        checkoutView36.setLocale(locale38);
        javax.swing.JButton jButton40 = checkoutView36.backButton;
        lassondeLotView29.setColorButton(jButton40);
        checkoutView6.finalConfirmButton = jButton40;
        javax.swing.JRadioButton jRadioButton43 = checkoutView6.debitRadioButton;
        java.awt.event.KeyListener keyListener44 = null;
        // The following exception was thrown during execution in test generation
        try {
            jRadioButton43.removeKeyListener(keyListener44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jTextField37);
        org.junit.Assert.assertNotNull(jButton40);
        org.junit.Assert.assertNull(jRadioButton43);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        float float5 = bethuneLotView1.getOpacity();
        boolean boolean6 = bethuneLotView1.isFocusable();
        java.awt.Event event7 = null;
        boolean boolean9 = bethuneLotView1.keyDown(event7, (int) (short) 0);
        boolean boolean10 = bethuneLotView1.isPreferredSizeSet();
        boolean boolean11 = bethuneLotView1.isFocusableWindow();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.price;
        java.lang.String str12 = user5.getEmail();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.util.Random random2 = null;
        sensor0.rand2 = random2;
        objects.Sensor sensor4 = new objects.Sensor();
        java.lang.String str5 = sensor4.getRandArrayElement2();
        java.util.Random random6 = null;
        sensor4.rand1 = random6;
        java.util.Random random8 = sensor4.rand1;
        java.util.Random random9 = sensor4.rand2;
        sensor0.rand2 = random9;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BMW" + "'", str5, "BMW");
        org.junit.Assert.assertNull(random8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.setName("hi!");
        user5.setCvvNumber("Invalid plate number");
        user5.price = 13;
        user5.cardNumber = "Minivan";
        // The following exception was thrown during execution in test generation
        try {
            user5.setCreditBalance("Account does not exist.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Account does not exist.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        lotChoiceView8.setFocusableWindowState(false);
        views.Main main11 = null;
        views.BethuneLotView bethuneLotView12 = new views.BethuneLotView(main11);
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = bethuneLotView12.getSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bethuneLotView12.mouseDrag(event15, 9, (int) (byte) 1);
        views.Main main19 = null;
        views.BethuneLotView bethuneLotView20 = new views.BethuneLotView(main19);
        java.awt.Font font21 = null;
        bethuneLotView20.setFont(font21);
        int int23 = bethuneLotView20.getY();
        bethuneLotView20.disable();
        java.awt.Dimension dimension25 = bethuneLotView20.getMinimumSize();
        bethuneLotView20.remove((int) (short) 0);
        bethuneLotView20.setLocationByPlatform(false);
        views.Main main30 = null;
        views.BethuneLotView bethuneLotView31 = new views.BethuneLotView(main30);
        java.awt.Point point33 = bethuneLotView31.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener34 = null;
        bethuneLotView31.addHierarchyListener(hierarchyListener34);
        java.awt.event.WindowListener windowListener36 = null;
        bethuneLotView31.removeWindowListener(windowListener36);
        java.awt.event.WindowListener windowListener38 = null;
        bethuneLotView31.removeWindowListener(windowListener38);
        java.awt.event.MouseListener mouseListener40 = null;
        bethuneLotView31.addMouseListener(mouseListener40);
        views.Main main42 = null;
        views.BethuneLotView bethuneLotView43 = new views.BethuneLotView(main42);
        java.awt.Dimension dimension44 = null;
        java.awt.Dimension dimension45 = bethuneLotView43.getSize(dimension44);
        java.awt.Dialog.ModalExclusionType modalExclusionType46 = bethuneLotView43.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        bethuneLotView43.addPropertyChangeListener(propertyChangeListener47);
        views.Main main49 = null;
        views.BethuneLotView bethuneLotView50 = new views.BethuneLotView(main49);
        java.awt.Dimension dimension51 = null;
        java.awt.Dimension dimension52 = bethuneLotView50.getSize(dimension51);
        java.awt.Dialog.ModalExclusionType modalExclusionType53 = bethuneLotView50.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        bethuneLotView50.addPropertyChangeListener(propertyChangeListener54);
        bethuneLotView43.remove((java.awt.Component) bethuneLotView50);
        java.awt.Component component57 = bethuneLotView43.getFocusOwner();
        bethuneLotView43.firePropertyChange("hi!", ' ', '4');
        bethuneLotView43.requestFocus();
        views.Main main63 = null;
        views.BethuneLotView bethuneLotView64 = new views.BethuneLotView(main63);
        java.awt.Font font65 = null;
        bethuneLotView64.setFont(font65);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior67 = bethuneLotView64.getBaselineResizeBehavior();
        bethuneLotView64.addNotify();
        bethuneLotView64.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        bethuneLotView64.addPropertyChangeListener(propertyChangeListener73);
        java.awt.Graphics graphics75 = bethuneLotView64.getGraphics();
        bethuneLotView43.printComponents(graphics75);
        bethuneLotView31.printComponents(graphics75);
        bethuneLotView20.update(graphics75);
        bethuneLotView12.update(graphics75);
        boolean boolean80 = lotChoiceView8.isAncestorOf((java.awt.Component) bethuneLotView12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 291 + "'", int23 == 291);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNull(point33);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + modalExclusionType46 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType46.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertTrue("'" + modalExclusionType53 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType53.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component57);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior67 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior67.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        java.awt.Font font5 = null;
        bethuneLotView1.setFont(font5);
        java.awt.Image image7 = bethuneLotView1.getIconImage();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        views.Main main21 = new views.Main();
        java.awt.Cursor cursor22 = null;
        main21.setCursor(cursor22);
        boolean boolean26 = main21.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView27 = new views.CheckoutView(main21);
        javax.swing.JTextField jTextField28 = checkoutView27.cvvField;
        java.awt.Cursor cursor29 = null;
        checkoutView27.setCursor(cursor29);
        views.Main main31 = new views.Main();
        java.awt.Cursor cursor32 = null;
        main31.setCursor(cursor32);
        boolean boolean36 = main31.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView37 = new views.CheckoutView(main31);
        javax.swing.JTextField jTextField38 = checkoutView37.cvvField;
        javax.swing.JLabel jLabel39 = checkoutView37.nameCard;
        checkoutView27.nameCard = jLabel39;
        javax.swing.JTextField jTextField41 = checkoutView27.cardNumberField;
        checkoutView27.price = "frame14";
        checkoutView27.dateConfirmed = false;
        views.Main main46 = null;
        views.BethuneLotView bethuneLotView47 = new views.BethuneLotView(main46);
        java.awt.Font font48 = null;
        bethuneLotView47.setFont(font48);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        bethuneLotView47.addPropertyChangeListener("", propertyChangeListener51);
        views.Main main53 = null;
        views.BethuneLotView bethuneLotView54 = new views.BethuneLotView(main53);
        java.awt.Point point56 = bethuneLotView54.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener57 = null;
        bethuneLotView54.addHierarchyListener(hierarchyListener57);
        boolean boolean59 = bethuneLotView54.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer60 = null;
        java.awt.Image image61 = bethuneLotView54.createImage(imageProducer60);
        boolean boolean67 = bethuneLotView47.imageUpdate(image61, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation68 = bethuneLotView47.getComponentOrientation();
        checkoutView27.setComponentOrientation(componentOrientation68);
        views.Main main70 = new views.Main();
        java.awt.Cursor cursor71 = null;
        main70.setCursor(cursor71);
        boolean boolean75 = main70.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView76 = new views.CheckoutView(main70);
        javax.swing.JTextField jTextField77 = checkoutView76.cvvField;
        javax.swing.JRadioButton jRadioButton78 = checkoutView76.creditRadioButton;
        javax.swing.JRadioButton jRadioButton79 = checkoutView76.creditRadioButton;
        checkoutView27.mobilePaymentRadioButton = jRadioButton79;
        checkoutView6.debitRadioButton = jRadioButton79;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jTextField28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jTextField38);
        org.junit.Assert.assertNotNull(jLabel39);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNull(point56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(image61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(componentOrientation68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jTextField77);
        org.junit.Assert.assertNotNull(jRadioButton78);
        org.junit.Assert.assertNotNull(jRadioButton79);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener10);
        java.awt.Graphics graphics12 = bethuneLotView1.getGraphics();
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Point point16 = bethuneLotView14.getMousePosition(false);
        int int17 = bethuneLotView14.getHeight();
        java.awt.Event event18 = null;
        boolean boolean20 = bethuneLotView14.gotFocus(event18, (java.lang.Object) 0);
        bethuneLotView14.setFocusTraversalPolicyProvider(false);
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = bethuneLotView14.createImage(imageProducer23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        bethuneLotView14.addInputMethodListener(inputMethodListener25);
        views.Main main27 = null;
        views.BethuneLotView bethuneLotView28 = new views.BethuneLotView(main27);
        java.awt.Dimension dimension29 = null;
        java.awt.Dimension dimension30 = bethuneLotView28.getSize(dimension29);
        java.awt.Event event31 = null;
        boolean boolean34 = bethuneLotView28.mouseDrag(event31, 9, (int) (byte) 1);
        views.Main main35 = null;
        views.BethuneLotView bethuneLotView36 = new views.BethuneLotView(main35);
        java.awt.Font font37 = null;
        bethuneLotView36.setFont(font37);
        int int39 = bethuneLotView36.getY();
        bethuneLotView36.disable();
        java.awt.Dimension dimension41 = bethuneLotView36.getMinimumSize();
        bethuneLotView36.remove((int) (short) 0);
        bethuneLotView36.setLocationByPlatform(false);
        views.Main main46 = null;
        views.BethuneLotView bethuneLotView47 = new views.BethuneLotView(main46);
        java.awt.Point point49 = bethuneLotView47.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener50 = null;
        bethuneLotView47.addHierarchyListener(hierarchyListener50);
        java.awt.event.WindowListener windowListener52 = null;
        bethuneLotView47.removeWindowListener(windowListener52);
        java.awt.event.WindowListener windowListener54 = null;
        bethuneLotView47.removeWindowListener(windowListener54);
        java.awt.event.MouseListener mouseListener56 = null;
        bethuneLotView47.addMouseListener(mouseListener56);
        views.Main main58 = null;
        views.BethuneLotView bethuneLotView59 = new views.BethuneLotView(main58);
        java.awt.Dimension dimension60 = null;
        java.awt.Dimension dimension61 = bethuneLotView59.getSize(dimension60);
        java.awt.Dialog.ModalExclusionType modalExclusionType62 = bethuneLotView59.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        bethuneLotView59.addPropertyChangeListener(propertyChangeListener63);
        views.Main main65 = null;
        views.BethuneLotView bethuneLotView66 = new views.BethuneLotView(main65);
        java.awt.Dimension dimension67 = null;
        java.awt.Dimension dimension68 = bethuneLotView66.getSize(dimension67);
        java.awt.Dialog.ModalExclusionType modalExclusionType69 = bethuneLotView66.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        bethuneLotView66.addPropertyChangeListener(propertyChangeListener70);
        bethuneLotView59.remove((java.awt.Component) bethuneLotView66);
        java.awt.Component component73 = bethuneLotView59.getFocusOwner();
        bethuneLotView59.firePropertyChange("hi!", ' ', '4');
        bethuneLotView59.requestFocus();
        views.Main main79 = null;
        views.BethuneLotView bethuneLotView80 = new views.BethuneLotView(main79);
        java.awt.Font font81 = null;
        bethuneLotView80.setFont(font81);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior83 = bethuneLotView80.getBaselineResizeBehavior();
        bethuneLotView80.addNotify();
        bethuneLotView80.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener89 = null;
        bethuneLotView80.addPropertyChangeListener(propertyChangeListener89);
        java.awt.Graphics graphics91 = bethuneLotView80.getGraphics();
        bethuneLotView59.printComponents(graphics91);
        bethuneLotView47.printComponents(graphics91);
        bethuneLotView36.update(graphics91);
        bethuneLotView28.update(graphics91);
        bethuneLotView14.paintAll(graphics91);
        bethuneLotView1.paintComponents(graphics91);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics12);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 450 + "'", int17 == 450);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 291 + "'", int39 == 291);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertNull(point49);
        org.junit.Assert.assertNotNull(dimension61);
        org.junit.Assert.assertTrue("'" + modalExclusionType62 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType62.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension68);
        org.junit.Assert.assertTrue("'" + modalExclusionType69 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType69.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component73);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior83 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior83.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics91);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point27 = checkoutView6.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        main0.resetContentPane();
        boolean boolean3 = main0.isMaximumSizeSet();
        java.awt.Component component6 = main0.findComponentAt(0, 4);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = bethuneLotView8.getBaselineResizeBehavior();
        bethuneLotView8.addNotify();
        boolean boolean13 = bethuneLotView8.isLocationByPlatform();
        bethuneLotView8.reshape((int) (byte) 10, 100, (int) '#', 1);
        java.awt.Dimension dimension19 = bethuneLotView8.getPreferredSize();
        main0.setSize(dimension19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        objects.User user5 = new objects.User("YorkUParking - Bethune", (int) (short) 100, "frame9", "Invalid plate number", "Account does not exist.");
        java.lang.String str6 = user5.getLotName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        views.Main main12 = null;
        views.BethuneLotView bethuneLotView13 = new views.BethuneLotView(main12);
        java.awt.Point point15 = bethuneLotView13.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        bethuneLotView13.addHierarchyListener(hierarchyListener16);
        boolean boolean18 = bethuneLotView13.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer19 = null;
        java.awt.Image image20 = bethuneLotView13.createImage(imageProducer19);
        int int21 = bethuneLotView13.getHeight();
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
        java.awt.Component component37 = bethuneLotView23.getFocusOwner();
        java.awt.Dimension dimension38 = bethuneLotView23.getPreferredSize();
        bethuneLotView13.setSize(dimension38);
        bethuneLotView1.setMinimumSize(dimension38);
        java.awt.Dimension dimension41 = bethuneLotView1.getMinimumSize();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertNull(transferHandler11);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 450 + "'", int21 == 450);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + modalExclusionType33 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType33.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component37);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNotNull(dimension41);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getName();
        user5.setplateNumber("Minivan");
        boolean boolean14 = controllers.UserController.approveUser(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        boolean boolean4 = bethuneLotView1.isBackgroundSet();
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.list(printStream5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        views.LotChoiceView lotChoiceView24 = new views.LotChoiceView(main0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        boolean boolean53 = checkoutView38.isFocusable();
        boolean boolean54 = checkoutView38.dateConfirmed;
        int int55 = checkoutView38.getX();
        java.awt.AWTEvent aWTEvent56 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkoutView38.dispatchEvent(aWTEvent56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1055 + "'", int55 == 1055);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setParkingSpot("Email invalid.");
        java.time.LocalDateTime localDateTime11 = user5.parkingEndTime;
        user5.lotName = "Nissan";
        user5.setApproved(true);
        user5.parkingSpotName = "frame18";
        java.lang.String str18 = user5.email;
        java.lang.String str19 = user5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllers.UserController.checkoutInfo("frame58", "0", "", "", 0, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int15 = bethuneLotView8.getCursorType();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.beans.PropertyChangeListener[] propertyChangeListenerArray21 = loginView20.getPropertyChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray21);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        bethuneLotView1.doLayout();
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        java.awt.image.ColorModel colorModel13 = bethuneLotView1.getColorModel();
        bethuneLotView1.firePropertyChange("Account does not exist.", (float) 12, (float) (byte) 10);
        bethuneLotView1.transferFocusDownCycle();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertNotNull(colorModel13);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        bethuneLotView1.show();
        bethuneLotView1.list();
        bethuneLotView1.firePropertyChange("", (float) 0L, (float) 100L);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        java.awt.Component component15 = bethuneLotView1.findComponentAt(13, (int) (short) 1);
        bethuneLotView1.firePropertyChange("frame14", ' ', 'a');
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertNotNull(component15);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        boolean boolean28 = bethuneLotView13.isPreferredSizeSet();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView13.setOpacity(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        objects.User user5 = new objects.User("YorkUParking - Bethune", (int) (short) 100, "frame9", "Invalid plate number", "Account does not exist.");
        user5.price = 6;
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.getFocusableWindowState();
        bethuneLotView1.setLocationByPlatform(false);
        views.Main main13 = null;
        views.BethuneLotView bethuneLotView14 = new views.BethuneLotView(main13);
        java.awt.Dimension dimension15 = null;
        java.awt.Dimension dimension16 = bethuneLotView14.getSize(dimension15);
        java.awt.Dialog.ModalExclusionType modalExclusionType17 = bethuneLotView14.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        bethuneLotView14.addPropertyChangeListener(propertyChangeListener18);
        views.Main main20 = null;
        views.BethuneLotView bethuneLotView21 = new views.BethuneLotView(main20);
        java.awt.Dimension dimension22 = null;
        java.awt.Dimension dimension23 = bethuneLotView21.getSize(dimension22);
        java.awt.Dialog.ModalExclusionType modalExclusionType24 = bethuneLotView21.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        bethuneLotView21.addPropertyChangeListener(propertyChangeListener25);
        bethuneLotView14.remove((java.awt.Component) bethuneLotView21);
        java.awt.Component component28 = bethuneLotView14.getFocusOwner();
        bethuneLotView14.firePropertyChange("hi!", ' ', '4');
        bethuneLotView14.requestFocus();
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Font font36 = null;
        bethuneLotView35.setFont(font36);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior38 = bethuneLotView35.getBaselineResizeBehavior();
        bethuneLotView35.addNotify();
        bethuneLotView35.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        bethuneLotView35.addPropertyChangeListener(propertyChangeListener44);
        java.awt.Graphics graphics46 = bethuneLotView35.getGraphics();
        bethuneLotView14.printComponents(graphics46);
        bethuneLotView1.printAll(graphics46);
        boolean boolean49 = bethuneLotView1.isFocusableWindow();
        bethuneLotView1.move(64, 1055);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + modalExclusionType17 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType17.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + modalExclusionType24 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType24.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component28);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior38 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior38.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        int int8 = user5.getPrice();
        user5.email = "";
        int int11 = user5.debitBalance;
        boolean boolean12 = controllers.UserController.denyUser(user5);
        user5.setPayementType("Vanier,Bethune,Calumet,Schulich");
        user5.parkingFee = 16;
        user5.lotName = "Available";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.awt.Event event51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = bethuneLotView46.handleEvent(event51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        java.awt.Event event7 = null;
        boolean boolean10 = bethuneLotView1.mouseEnter(event7, (int) (short) 100, (int) (short) 0);
        boolean boolean11 = bethuneLotView1.isVisible();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        main0.setAutoRequestFocus(false);
        views.LassondeLotView lassondeLotView6 = new views.LassondeLotView(main0);
        boolean boolean7 = lassondeLotView6.isForegroundSet();
        views.Main main8 = null;
        views.BethuneLotView bethuneLotView9 = new views.BethuneLotView(main8);
        java.awt.Point point11 = bethuneLotView9.getMousePosition(false);
        int int12 = bethuneLotView9.getHeight();
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        bethuneLotView9.removeHierarchyListener(hierarchyListener13);
        boolean boolean15 = bethuneLotView9.isLightweight();
        // The following exception was thrown during execution in test generation
        try {
            lassondeLotView6.setContentPane((java.awt.Container) bethuneLotView9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 450 + "'", int12 == 450);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean24 = main0.isLocationByPlatform();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.lang.String str26 = user17.cardName;
        user17.setId(97);
        java.lang.String str29 = user17.getDebitBalance();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1000" + "'", str29, "1000");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.awt.Component component58 = bethuneLotView1.getMostRecentFocusOwner();
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
        org.junit.Assert.assertNotNull(component58);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        bethuneLotView13.setFocusableWindowState(true);
        boolean boolean26 = bethuneLotView13.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = bethuneLotView1.handleEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        views.VanierLotView vanierLotView13 = new views.VanierLotView(main0);
        views.Main main14 = new views.Main();
        java.awt.Cursor cursor15 = null;
        main14.setCursor(cursor15);
        boolean boolean19 = main14.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView20 = new views.CheckoutView(main14);
        long long21 = checkoutView20.hoursBookedFor;
        views.Main main22 = new views.Main();
        java.awt.Cursor cursor23 = null;
        main22.setCursor(cursor23);
        boolean boolean27 = main22.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView28 = new views.CheckoutView(main22);
        javax.swing.JTextField jTextField29 = checkoutView28.cardNumberField;
        views.Main main30 = new views.Main();
        java.awt.Cursor cursor31 = null;
        main30.setCursor(cursor31);
        boolean boolean35 = main30.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView36 = new views.CheckoutView(main30);
        javax.swing.JTextField jTextField37 = checkoutView36.cardNumberField;
        javax.swing.JRadioButton jRadioButton38 = null;
        checkoutView36.debitRadioButton = jRadioButton38;
        views.Main main40 = new views.Main();
        java.awt.Cursor cursor41 = null;
        main40.setCursor(cursor41);
        boolean boolean45 = main40.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView46 = new views.CheckoutView(main40);
        javax.swing.JTextField jTextField47 = checkoutView46.cvvField;
        javax.swing.JLabel jLabel48 = checkoutView46.nameCard;
        checkoutView36.nameCard = jLabel48;
        checkoutView28.cvvLabel = jLabel48;
        checkoutView20.nameCard = jLabel48;
        javax.swing.JButton jButton52 = checkoutView20.backButton;
        vanierLotView13.setColorButton(jButton52);
        views.Main main54 = new views.Main();
        java.awt.Cursor cursor55 = null;
        main54.setCursor(cursor55);
        boolean boolean59 = main54.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView60 = new views.CheckoutView(main54);
        long long61 = checkoutView60.hoursBookedFor;
        views.Main main62 = new views.Main();
        java.awt.Cursor cursor63 = null;
        main62.setCursor(cursor63);
        boolean boolean67 = main62.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView68 = new views.CheckoutView(main62);
        javax.swing.JTextField jTextField69 = checkoutView68.cardNumberField;
        views.Main main70 = new views.Main();
        java.awt.Cursor cursor71 = null;
        main70.setCursor(cursor71);
        boolean boolean75 = main70.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView76 = new views.CheckoutView(main70);
        javax.swing.JTextField jTextField77 = checkoutView76.cardNumberField;
        javax.swing.JRadioButton jRadioButton78 = null;
        checkoutView76.debitRadioButton = jRadioButton78;
        views.Main main80 = new views.Main();
        java.awt.Cursor cursor81 = null;
        main80.setCursor(cursor81);
        boolean boolean85 = main80.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView86 = new views.CheckoutView(main80);
        javax.swing.JTextField jTextField87 = checkoutView86.cvvField;
        javax.swing.JLabel jLabel88 = checkoutView86.nameCard;
        checkoutView76.nameCard = jLabel88;
        checkoutView68.cvvLabel = jLabel88;
        checkoutView60.nameCard = jLabel88;
        javax.swing.JButton jButton92 = checkoutView60.backButton;
        vanierLotView13.setColorButton(jButton92);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jTextField37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jTextField47);
        org.junit.Assert.assertNotNull(jLabel48);
        org.junit.Assert.assertNotNull(jButton52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jTextField69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jTextField77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jTextField87);
        org.junit.Assert.assertNotNull(jLabel88);
        org.junit.Assert.assertNotNull(jButton92);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        maintainManager0.update();
        maintainManager0.clear();
        java.util.ArrayList<objects.Manager> managerList4 = maintainManager0.managers;
        maintainManager0.load();
        objects.Manager manager6 = maintainManager0.loggedInManager;
        org.junit.Assert.assertNotNull(maintainManager0);
        org.junit.Assert.assertNotNull(managerList4);
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String str2 = sensor0.getRandArrayElement1();
        java.lang.String[] strArray3 = sensor0.carModel;
        java.util.Random random4 = null;
        sensor0.rand1 = random4;
        java.util.Random random6 = sensor0.rand2;
        objects.Sensor sensor7 = new objects.Sensor();
        java.lang.String str8 = sensor7.getRandArrayElement2();
        java.lang.String str9 = sensor7.getRandArrayElement1();
        java.lang.String[] strArray10 = sensor7.carModel;
        java.util.Random random11 = null;
        sensor7.rand1 = random11;
        java.util.Random random13 = sensor7.rand2;
        sensor0.rand1 = random13;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUV" + "'", str2, "SUV");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(random6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mercedes" + "'", str8, "Mercedes");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Minivan" + "'", str9, "Minivan");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(random13);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        bethuneLotView13.setLocationByPlatform(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener7);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        views.Unavailable unavailable0 = new views.Unavailable();
        views.Main main1 = null;
        views.BethuneLotView bethuneLotView2 = new views.BethuneLotView(main1);
        java.awt.Font font3 = null;
        bethuneLotView2.setFont(font3);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = bethuneLotView2.getBaselineResizeBehavior();
        views.AlertStateContext alertStateContext6 = bethuneLotView2.getParkingSpotState();
        java.lang.String str7 = alertStateContext6.alert();
        java.lang.String str8 = unavailable0.alert(alertStateContext6);
        java.lang.String str9 = alertStateContext6.alert();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(alertStateContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unavailable" + "'", str8, "Unavailable");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        maintainUser0.load();
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.awt.event.MouseMotionListener mouseMotionListener25 = null;
        bethuneLotView13.addMouseMotionListener(mouseMotionListener25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior24 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior24.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        bethuneLotView1.resize(2, 100);
        views.Main main23 = new views.Main();
        java.awt.Cursor cursor24 = null;
        main23.setCursor(cursor24);
        boolean boolean28 = main23.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView29 = new views.CheckoutView(main23);
        javax.swing.JTextField jTextField30 = checkoutView29.cardNumberField;
        java.util.Locale locale31 = null;
        checkoutView29.setLocale(locale31);
        javax.swing.JLabel jLabel33 = checkoutView29.cardNumberLabel;
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
        java.awt.Rectangle rectangle66 = jLabel33.getBounds(rectangle64);
        boolean boolean67 = jLabel33.isPreferredSizeSet();
        java.awt.image.ImageProducer imageProducer68 = null;
        java.awt.Image image69 = jLabel33.createImage(imageProducer68);
        java.awt.Component component70 = bethuneLotView1.add("Email invalid.", (java.awt.Component) jLabel33);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jTextField30);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rectangle64);
        org.junit.Assert.assertNotNull(rectangle66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(image69);
        org.junit.Assert.assertNotNull(component70);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        boolean boolean53 = checkoutView38.isFocusable();
        boolean boolean54 = checkoutView38.dateConfirmed;
        checkoutView38.price = "";
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Font font36 = null;
        bethuneLotView35.setFont(font36);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior38 = bethuneLotView35.getBaselineResizeBehavior();
        bethuneLotView35.addNotify();
        bethuneLotView35.firePropertyChange("", '4', ' ');
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        bethuneLotView35.addPropertyChangeListener(propertyChangeListener44);
        java.awt.Graphics graphics46 = bethuneLotView35.getGraphics();
        bethuneLotView1.print(graphics46);
        views.Main main48 = null;
        views.BethuneLotView bethuneLotView49 = new views.BethuneLotView(main48);
        java.awt.Font font50 = null;
        bethuneLotView49.setFont(font50);
        bethuneLotView49.toBack();
        views.Main main53 = null;
        views.BethuneLotView bethuneLotView54 = new views.BethuneLotView(main53);
        java.awt.Dimension dimension55 = null;
        java.awt.Dimension dimension56 = bethuneLotView54.getSize(dimension55);
        bethuneLotView49.setMinimumSize(dimension56);
        java.awt.Point point58 = null;
        java.awt.Point point59 = bethuneLotView49.getLocation(point58);
        java.awt.Component component60 = bethuneLotView1.findComponentAt(point59);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangle30);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior38 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior38.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics46);
        org.junit.Assert.assertNotNull(dimension56);
        org.junit.Assert.assertNotNull(point59);
        org.junit.Assert.assertNull(component60);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        int int4 = bethuneLotView1.getY();
        bethuneLotView1.disable();
        java.awt.Dimension dimension6 = bethuneLotView1.getMinimumSize();
        bethuneLotView1.remove((int) (short) 0);
        java.awt.Dimension dimension9 = bethuneLotView1.getPreferredSize();
        java.awt.Rectangle rectangle10 = bethuneLotView1.bounds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 291 + "'", int4 == 291);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(rectangle10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.util.ArrayList<objects.User> userList2 = controllers.UserController.getUsers();
        maintainLot0.users = userList2;
        java.lang.String str4 = maintainLot0.lotOptions;
        maintainLot0.load();
        java.util.ArrayList<objects.User> userList6 = controllers.UserController.getApprovedUsers();
        maintainLot0.users = userList6;
        org.junit.Assert.assertNotNull(maintainLot0);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null" + "'", str4, "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null");
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        int int11 = user5.debitBalance;
        java.time.LocalDateTime localDateTime12 = null;
        user5.parkingStartTime = localDateTime12;
        user5.setPaymentType("Account does not exist.");
        int int16 = user5.price;
        java.lang.String str17 = user5.accountType;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.io.PrintWriter printWriter43 = null;
        // The following exception was thrown during execution in test generation
        try {
            jRadioButton40.list(printWriter43, (int) (byte) 0);
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean3 = main0.requestFocusInWindow();
        main0.removeAll();
        views.Main main5 = new views.Main();
        views.LotChoiceView lotChoiceView6 = new views.LotChoiceView(main5);
        views.Main main7 = null;
        views.BethuneLotView bethuneLotView8 = new views.BethuneLotView(main7);
        java.awt.Font font9 = null;
        bethuneLotView8.setFont(font9);
        java.awt.Container container11 = bethuneLotView8.getFocusCycleRootAncestor();
        bethuneLotView8.setOpacity((float) (short) 1);
        java.awt.Point point14 = bethuneLotView8.location();
        lotChoiceView6.setLocation(point14);
        java.awt.Point point16 = main0.getLocation(point14);
        views.Main main17 = null;
        views.BethuneLotView bethuneLotView18 = new views.BethuneLotView(main17);
        java.awt.Dimension dimension19 = null;
        java.awt.Dimension dimension20 = bethuneLotView18.getSize(dimension19);
        java.awt.Dialog.ModalExclusionType modalExclusionType21 = bethuneLotView18.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        bethuneLotView18.removeInputMethodListener(inputMethodListener22);
        bethuneLotView18.setIgnoreRepaint(true);
        views.Main main26 = null;
        views.BethuneLotView bethuneLotView27 = new views.BethuneLotView(main26);
        java.awt.Font font28 = null;
        bethuneLotView27.setFont(font28);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        bethuneLotView27.addPropertyChangeListener("", propertyChangeListener31);
        views.Main main33 = null;
        views.BethuneLotView bethuneLotView34 = new views.BethuneLotView(main33);
        java.awt.Point point36 = bethuneLotView34.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener37 = null;
        bethuneLotView34.addHierarchyListener(hierarchyListener37);
        boolean boolean39 = bethuneLotView34.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer40 = null;
        java.awt.Image image41 = bethuneLotView34.createImage(imageProducer40);
        boolean boolean47 = bethuneLotView27.imageUpdate(image41, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation48 = bethuneLotView27.getComponentOrientation();
        java.awt.Point point49 = bethuneLotView27.location();
        java.awt.Component component50 = bethuneLotView18.findComponentAt(point49);
        boolean boolean51 = main0.contains(point49);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container11);
        org.junit.Assert.assertNotNull(point14);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + modalExclusionType21 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType21.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(point36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(image41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(componentOrientation48);
        org.junit.Assert.assertNotNull(point49);
        org.junit.Assert.assertNull(component50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.lotName = "frame22";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        maintainUser0.load();
        maintainUser0.update();
        maintainUser0.update();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        java.awt.Image image5 = null;
        boolean boolean11 = bethuneLotView1.imageUpdate(image5, 3, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
        java.awt.MenuBar menuBar12 = null;
        bethuneLotView1.setMenuBar(menuBar12);
        bethuneLotView1.firePropertyChange("Can not change booking time", ' ', '4');
        javax.swing.JMenuBar jMenuBar18 = null;
        bethuneLotView1.setJMenuBar(jMenuBar18);
        bethuneLotView1.enableInputMethods(false);
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
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener33 = null;
        bethuneLotView23.addHierarchyBoundsListener(hierarchyBoundsListener33);
        java.awt.Color color35 = null;
        bethuneLotView23.setForeground(color35);
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
        boolean boolean89 = bethuneLotView23.imageUpdate(image73, 100, (int) (short) -1, 1055, 5, 100);
        javax.accessibility.AccessibleContext accessibleContext90 = bethuneLotView23.getAccessibleContext();
        bethuneLotView23.setResizable(true);
        boolean boolean93 = bethuneLotView1.isFocusCycleRoot((java.awt.Container) bethuneLotView23);
        bethuneLotView23.toBack();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + java.awt.Window.Type.NORMAL + "'", type32.equals(java.awt.Window.Type.NORMAL));
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(accessibleContext90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JLabel jLabel8 = checkoutView6.cvvLabel;
        java.awt.Font font9 = checkoutView6.getFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNull(font9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        java.util.Locale locale8 = null;
        checkoutView6.setLocale(locale8);
        javax.swing.JButton jButton10 = checkoutView6.backButton;
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        jButton10.addMouseWheelListener(mouseWheelListener11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jButton10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        float float12 = bethuneLotView1.getOpacity();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        model.MaintainManager maintainManager0 = model.MaintainManager.getInstance();
        maintainManager0.load();
        objects.Manager manager5 = new objects.Manager("hi!", 0, "Available");
        manager5.setId((int) '4');
        maintainManager0.loggedInManager = manager5;
        org.junit.Assert.assertNotNull(maintainManager0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str26 = user17.cardName;
        user17.setId(97);
        user17.parkingFee = 10;
        user17.setApproved(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        model.MaintainUser maintainUser0 = model.MaintainUser.getInstance();
        java.util.ArrayList<objects.User> userList1 = maintainUser0.users;
        objects.User user7 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        user7.setParkingStartTime(localDateTime8);
        int int10 = user7.parkingFee;
        java.time.LocalDateTime localDateTime11 = null;
        user7.parkingEndTime = localDateTime11;
        maintainUser0.loggedInUser = user7;
        java.lang.String str14 = user7.getEmail();
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        boolean boolean6 = bethuneLotView1.isLocationByPlatform();
        bethuneLotView1.reshape((int) (byte) 10, 100, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.remove(450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 450");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.awt.Graphics graphics11 = bethuneLotView1.getGraphics();
        java.awt.Toolkit toolkit12 = bethuneLotView1.getToolkit();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(rectangle10);
        org.junit.Assert.assertNull(graphics11);
        org.junit.Assert.assertNotNull(toolkit12);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        objects.Manager manager3 = new objects.Manager("Vanier,Bethune", (int) (short) 100, "frame14");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.paymentType;
        java.lang.String str8 = user5.getPaymentType();
        java.lang.String str9 = user5.getCardNumber();
        user5.setCardName("SUV");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        views.SchulichLotView schulichLotView27 = new views.SchulichLotView(main0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        javax.swing.JRadioButton jRadioButton8 = checkoutView6.creditRadioButton;
        javax.swing.JLabel jLabel9 = checkoutView6.cvvLabel;
        jLabel9.enable(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jRadioButton8);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        views.VanierLotView vanierLotView13 = new views.VanierLotView(main0);
        views.Main main14 = new views.Main();
        java.awt.Cursor cursor15 = null;
        main14.setCursor(cursor15);
        boolean boolean19 = main14.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView20 = new views.CheckoutView(main14);
        long long21 = checkoutView20.hoursBookedFor;
        views.Main main22 = new views.Main();
        java.awt.Cursor cursor23 = null;
        main22.setCursor(cursor23);
        boolean boolean27 = main22.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView28 = new views.CheckoutView(main22);
        javax.swing.JTextField jTextField29 = checkoutView28.cardNumberField;
        views.Main main30 = new views.Main();
        java.awt.Cursor cursor31 = null;
        main30.setCursor(cursor31);
        boolean boolean35 = main30.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView36 = new views.CheckoutView(main30);
        javax.swing.JTextField jTextField37 = checkoutView36.cardNumberField;
        javax.swing.JRadioButton jRadioButton38 = null;
        checkoutView36.debitRadioButton = jRadioButton38;
        views.Main main40 = new views.Main();
        java.awt.Cursor cursor41 = null;
        main40.setCursor(cursor41);
        boolean boolean45 = main40.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView46 = new views.CheckoutView(main40);
        javax.swing.JTextField jTextField47 = checkoutView46.cvvField;
        javax.swing.JLabel jLabel48 = checkoutView46.nameCard;
        checkoutView36.nameCard = jLabel48;
        checkoutView28.cvvLabel = jLabel48;
        checkoutView20.nameCard = jLabel48;
        javax.swing.JButton jButton52 = checkoutView20.backButton;
        vanierLotView13.setColorButton(jButton52);
        views.Main main55 = null;
        views.BethuneLotView bethuneLotView56 = new views.BethuneLotView(main55);
        java.awt.Point point58 = bethuneLotView56.getMousePosition(false);
        int int59 = bethuneLotView56.getHeight();
        java.awt.Event event60 = null;
        boolean boolean62 = bethuneLotView56.gotFocus(event60, (java.lang.Object) 0);
        bethuneLotView56.setFocusTraversalPolicyProvider(false);
        views.Main main65 = new views.Main();
        int int66 = bethuneLotView56.getComponentZOrder((java.awt.Component) main65);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component67 = vanierLotView13.add("0", (java.awt.Component) main65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jTextField37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jTextField47);
        org.junit.Assert.assertNotNull(jLabel48);
        org.junit.Assert.assertNotNull(jButton52);
        org.junit.Assert.assertNull(point58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 450 + "'", int59 == 450);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        model.MaintainLot maintainLot0 = model.MaintainLot.getInstance();
        maintainLot0.clear();
        java.util.ArrayList<objects.User> userList2 = controllers.UserController.getUsers();
        maintainLot0.users = userList2;
        java.lang.String str4 = maintainLot0.lotOptions;
        maintainLot0.load();
        maintainLot0.update();
        maintainLot0.load();
        org.junit.Assert.assertNotNull(maintainLot0);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null" + "'", str4, "Vanier,Bethune,Calumet,Schulich,Vanier,Bethune,Calumet,Schulich,null");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean15 = bethuneLotView1.getIgnoreRepaint();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.lang.String str4 = bethuneLotView1.getWarningString();
        float float5 = bethuneLotView1.getAlignmentY();
        float float6 = bethuneLotView1.getAlignmentY();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cardNumberField;
        javax.swing.JRadioButton jRadioButton8 = null;
        checkoutView6.debitRadioButton = jRadioButton8;
        checkoutView6.price = "BMW";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        float float4 = bethuneLotView1.getOpacity();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        component18.firePropertyChange("frame9", (float) 3, (float) 0L);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component18);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.awt.Container container67 = bethuneLotView1.getContentPane();
        bethuneLotView1.setCursor(2);
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
        org.junit.Assert.assertNotNull(container67);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        java.awt.Container container5 = main0.getOriginalContentPane();
        views.Main main6 = null;
        views.BethuneLotView bethuneLotView7 = new views.BethuneLotView(main6);
        java.awt.Point point9 = bethuneLotView7.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        bethuneLotView7.addHierarchyListener(hierarchyListener10);
        java.awt.Rectangle rectangle12 = bethuneLotView7.getBounds();
        main0.setMaximizedBounds(rectangle12);
        main0.revalidate();
        java.lang.Object obj15 = main0.getTreeLock();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(container5);
        org.junit.Assert.assertNull(point9);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Sensor sensor2 = new objects.Sensor();
        java.lang.String str3 = sensor2.getRandArrayElement2();
        java.util.Random random4 = null;
        sensor2.rand2 = random4;
        parkingSpot1.setSensor(sensor2);
        java.lang.String str7 = parkingSpot1.code;
        java.lang.String str8 = parkingSpot1.getCode();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BMW" + "'", str3, "BMW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str8, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.awt.Component component29 = checkoutView6.getComponent(0);
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
        checkoutView6.setMaximumSize(dimension46);
        javax.swing.JTextField jTextField48 = checkoutView6.cardNumberField;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertNotNull(jLabel27);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertTrue("'" + modalExclusionType34 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType34.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension40);
        org.junit.Assert.assertTrue("'" + modalExclusionType41 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType41.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertNotNull(jTextField48);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.awt.Point point12 = bethuneLotView1.getLocation();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.String str39 = user34.plateNumber;
        org.junit.Assert.assertNotNull(maintainUser0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email not registered." + "'", str25, "Email not registered.");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        views.LotChoiceView lotChoiceView8 = new views.LotChoiceView(main0);
        views.CheckoutView checkoutView9 = new views.CheckoutView(main0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        int int15 = lassondeLotView2.getX();
        org.junit.Assert.assertNotNull(container1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jButton13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1055 + "'", int15 == 1055);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        checkoutView6.removeAll();
        java.awt.event.WindowListener[] windowListenerArray94 = checkoutView6.getWindowListeners();
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
        org.junit.Assert.assertNotNull(windowListenerArray94);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.awt.Component component29 = null;
        int int30 = checkoutView6.getComponentZOrder(component29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        java.time.LocalDateTime localDateTime8 = user5.parkingEndTime;
        user5.setPayementType("");
        int int11 = user5.getPrice();
        user5.setPayementType("Can not change booking time");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.event.WindowStateListener[] windowStateListenerArray2 = bethuneLotView1.getWindowStateListeners();
        bethuneLotView1.setIgnoreRepaint(false);
        bethuneLotView1.setLocationByPlatform(false);
        java.awt.event.FocusListener focusListener7 = null;
        bethuneLotView1.removeFocusListener(focusListener7);
        org.junit.Assert.assertNotNull(windowStateListenerArray2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        bethuneLotView1.setLocationByPlatform(true);
        java.awt.dnd.DropTarget dropTarget15 = null;
        bethuneLotView1.setDropTarget(dropTarget15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.Rectangle rectangle6 = bethuneLotView1.getBounds();
        float float7 = bethuneLotView1.getAlignmentX();
        java.awt.Component component10 = bethuneLotView1.locate(7, (int) (short) 1);
        bethuneLotView1.setFocusTraversalKeysEnabled(false);
        java.awt.AWTEvent aWTEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.dispatchEvent(aWTEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Container container4 = bethuneLotView1.getFocusCycleRootAncestor();
        float float5 = bethuneLotView1.getOpacity();
        boolean boolean6 = bethuneLotView1.isFocusable();
        java.awt.Component component7 = bethuneLotView1.getFocusOwner();
        java.awt.Event event8 = null;
        boolean boolean11 = bethuneLotView1.mouseEnter(event8, (int) ' ', (int) '#');
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray40 = checkoutView16.getMouseMotionListeners();
        java.time.LocalDateTime localDateTime41 = null;
        checkoutView16.startTime = localDateTime41;
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
        org.junit.Assert.assertNotNull(mouseMotionListenerArray40);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray40 = checkoutView16.getMouseMotionListeners();
        views.Main main41 = new views.Main();
        java.awt.Cursor cursor42 = null;
        main41.setCursor(cursor42);
        boolean boolean46 = main41.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView47 = new views.CheckoutView(main41);
        javax.swing.JTextField jTextField48 = checkoutView47.cardNumberField;
        views.Main main49 = new views.Main();
        java.awt.Cursor cursor50 = null;
        main49.setCursor(cursor50);
        boolean boolean54 = main49.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView55 = new views.CheckoutView(main49);
        javax.swing.JTextField jTextField56 = checkoutView55.cardNumberField;
        javax.swing.JRadioButton jRadioButton57 = null;
        checkoutView55.debitRadioButton = jRadioButton57;
        views.Main main59 = new views.Main();
        java.awt.Cursor cursor60 = null;
        main59.setCursor(cursor60);
        boolean boolean64 = main59.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView65 = new views.CheckoutView(main59);
        javax.swing.JTextField jTextField66 = checkoutView65.cvvField;
        javax.swing.JLabel jLabel67 = checkoutView65.nameCard;
        checkoutView55.nameCard = jLabel67;
        checkoutView47.cvvLabel = jLabel67;
        jLabel67.validate();
        java.awt.event.ComponentListener componentListener71 = null;
        jLabel67.removeComponentListener(componentListener71);
        checkoutView16.cvvLabel = jLabel67;
        jLabel67.setFocusTraversalPolicyProvider(false);
        java.awt.Event event76 = null;
        java.lang.Object obj77 = null;
        boolean boolean78 = jLabel67.action(event76, obj77);
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
        org.junit.Assert.assertNotNull(mouseMotionListenerArray40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jTextField48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTextField56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jTextField66);
        org.junit.Assert.assertNotNull(jLabel67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        bethuneLotView1.setLocationByPlatform(true);
        bethuneLotView1.enableInputMethods(true);
        bethuneLotView1.setName("Email invalid.");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        checkoutView6.openWebPage("frame14");
        boolean boolean12 = checkoutView6.isCursorSet();
        javax.swing.JButton jButton13 = checkoutView6.finalConfirmButton;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jButton13);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        int int14 = bethuneLotView1.getExtendedState();
        views.Main main15 = null;
        views.BethuneLotView bethuneLotView16 = new views.BethuneLotView(main15);
        java.awt.Font font17 = null;
        bethuneLotView16.setFont(font17);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bethuneLotView16.addPropertyChangeListener("", propertyChangeListener20);
        views.Main main22 = null;
        views.BethuneLotView bethuneLotView23 = new views.BethuneLotView(main22);
        java.awt.Point point25 = bethuneLotView23.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener26 = null;
        bethuneLotView23.addHierarchyListener(hierarchyListener26);
        boolean boolean28 = bethuneLotView23.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer29 = null;
        java.awt.Image image30 = bethuneLotView23.createImage(imageProducer29);
        boolean boolean36 = bethuneLotView16.imageUpdate(image30, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.ComponentOrientation componentOrientation37 = bethuneLotView16.getComponentOrientation();
        bethuneLotView1.setComponentOrientation(componentOrientation37);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(image30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(componentOrientation37);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        views.LotFactory lotFactory0 = new views.LotFactory();
        views.Main main1 = new views.Main();
        java.awt.MenuComponent menuComponent2 = null;
        main1.remove(menuComponent2);
        main1.resetContentPane();
        javax.swing.JFrame jFrame6 = lotFactory0.getLot(main1, "");
        float float7 = main1.getAlignmentY();
        boolean boolean8 = main1.isFocusOwner();
        main1.dispose();
        views.SchulichLotView schulichLotView10 = new views.SchulichLotView(main1);
        org.junit.Assert.assertNull(jFrame6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setIncludeNumbers();
        numberPasswordBuilder0.setIncludeSymbols();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setLowerCase();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.cardName;
        user5.setId(1055);
        java.time.LocalDateTime localDateTime10 = user5.parkingStartTime;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Point point46 = bethuneLotView44.getMousePosition(false);
        int int47 = bethuneLotView44.getHeight();
        java.awt.Event event48 = null;
        boolean boolean50 = bethuneLotView44.gotFocus(event48, (java.lang.Object) 0);
        bethuneLotView44.repaint((long) 16);
        java.awt.Component component55 = bethuneLotView44.locate(6, 16);
        // The following exception was thrown during execution in test generation
        try {
            checkoutView6.setComponentZOrder((java.awt.Component) bethuneLotView44, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 450 + "'", int47 == 450);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(component55);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        views.Main main29 = new views.Main();
        java.awt.Cursor cursor30 = null;
        main29.setCursor(cursor30);
        boolean boolean34 = main29.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView35 = new views.CheckoutView(main29);
        long long36 = checkoutView35.hoursBookedFor;
        java.util.Locale locale37 = checkoutView35.getLocale();
        bethuneLotView1.setLocale(locale37);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(windowFocusListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bethuneLotView1.getGraphicsConfiguration();
        bethuneLotView1.setResizable(false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = bethuneLotView1.isFocusable();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        int int28 = bethuneLotView1.getDefaultCloseOperation();
        boolean boolean29 = bethuneLotView1.isActive();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        objects.Manager manager3 = new objects.Manager("Nissan", 10, "SUV");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        javax.swing.JLayeredPane jLayeredPane28 = null;
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setLayeredPane(jLayeredPane28);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.Cursor cursor8 = null;
        checkoutView6.setCursor(cursor8);
        checkoutView6.openWebPage("frame14");
        boolean boolean12 = checkoutView6.isFocusableWindow();
        views.Main main13 = new views.Main();
        java.awt.Cursor cursor14 = null;
        main13.setCursor(cursor14);
        boolean boolean18 = main13.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView19 = new views.CheckoutView(main13);
        javax.swing.JTextField jTextField20 = checkoutView19.cvvField;
        java.awt.Cursor cursor21 = null;
        checkoutView19.setCursor(cursor21);
        long long23 = checkoutView19.hoursBookedFor;
        javax.swing.JTextField jTextField24 = checkoutView19.cardNumberField;
        java.awt.image.ColorModel colorModel25 = jTextField24.getColorModel();
        checkoutView6.cvvField = jTextField24;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(jTextField24);
        org.junit.Assert.assertNotNull(colorModel25);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        int int11 = user5.debitBalance;
        java.time.LocalDateTime localDateTime12 = null;
        user5.parkingStartTime = localDateTime12;
        user5.setPaymentType("Account does not exist.");
        java.lang.String str16 = user5.getCredittBalance();
        java.lang.String str17 = user5.lotName;
        user5.setPayementType("frame9");
        int int20 = user5.price;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        java.awt.event.WindowListener windowListener6 = null;
        bethuneLotView1.removeWindowListener(windowListener6);
        java.awt.event.WindowListener windowListener8 = null;
        bethuneLotView1.removeWindowListener(windowListener8);
        boolean boolean10 = bethuneLotView1.requestFocusInWindow();
        bethuneLotView1.setFocusableWindowState(false);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.awt.Shape shape16 = bethuneLotView1.getShape();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNull(shape16);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        double double25 = user17.getRate();
        user17.setParkingSpot("");
        java.time.LocalDateTime localDateTime28 = null;
        user17.setParkingStartTime(localDateTime28);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        bethuneLotView1.setFocusTraversalPolicyProvider(false);
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet14 = bethuneLotView1.getFocusTraversalKeys(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet14);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        checkoutView6.setLocationByPlatform(false);
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
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        boolean boolean42 = bethuneLotView1.isPreferredSizeSet();
        bethuneLotView1.setLocation(9, 8);
        views.Main main47 = null;
        views.BethuneLotView bethuneLotView48 = new views.BethuneLotView(main47);
        java.awt.Dimension dimension49 = null;
        java.awt.Dimension dimension50 = bethuneLotView48.getSize(dimension49);
        java.awt.Dialog.ModalExclusionType modalExclusionType51 = bethuneLotView48.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        bethuneLotView48.removeInputMethodListener(inputMethodListener52);
        boolean boolean54 = bethuneLotView48.isFocusable();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component55 = bethuneLotView1.add("frame55", (java.awt.Component) bethuneLotView48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + modalExclusionType51 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType51.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        bethuneLotView1.addPropertyChangeListener(propertyChangeListener5);
        java.awt.Graphics graphics7 = null;
        bethuneLotView1.update(graphics7);
        boolean boolean9 = bethuneLotView1.isVisible();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.time.LocalDateTime localDateTime34 = checkoutView6.startTime;
        checkoutView6.repaint(291, 0, 150, (-1));
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
        org.junit.Assert.assertNull(localDateTime34);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        double double18 = user5.rate;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.Shape shape10 = bethuneLotView1.getShape();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        boolean boolean75 = bethuneLotView1.getFocusTraversalKeysEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        bethuneLotView1.toBack();
        java.awt.Event event5 = null;
        boolean boolean8 = bethuneLotView1.mouseDrag(event5, 0, 1);
        bethuneLotView1.remove(0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = bethuneLotView1.getPropertyChangeListeners();
        boolean boolean12 = bethuneLotView1.isAlwaysOnTop();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        javax.swing.JButton jButton31 = checkoutView6.backButton;
        java.time.LocalDateTime localDateTime32 = checkoutView6.endTime;
        boolean boolean33 = checkoutView6.isShowing();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics28);
        org.junit.Assert.assertNotNull(jButton31);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        bethuneLotView1.removeAll();
        float float22 = bethuneLotView1.getAlignmentY();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.time.LocalDateTime localDateTime6 = null;
        user5.setParkingStartTime(localDateTime6);
        user5.setCvvNumber("Email invalid.");
        int int10 = user5.debitBalance;
        user5.setName("Minivan");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str2 = parkingSpot1.code;
        parkingSpot1.code = "Minivan";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str2, "views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        bethuneLotView1.removePropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        int int12 = bethuneLotView1.getState();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        objects.ParkingSpot parkingSpot1 = new objects.ParkingSpot("views.BethuneLotView[frame8,1055,291,450x450,invalid,hidden,layout=java.awt.BorderLayout,title=YorkUParking - Bethune,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        objects.Sensor sensor2 = new objects.Sensor();
        java.lang.String str3 = sensor2.getRandArrayElement2();
        java.util.Random random4 = null;
        sensor2.rand2 = random4;
        parkingSpot1.setSensor(sensor2);
        java.lang.String str7 = sensor2.getRandArrayElement1();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mercedes" + "'", str3, "Mercedes");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pick-up" + "'", str7, "Pick-up");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseMove(event4, 3, (int) (byte) 100);
        boolean boolean8 = bethuneLotView1.isUndecorated();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        user5.email = "";
        int int13 = user5.price;
        int int14 = user5.debitBalance;
        java.time.LocalDateTime localDateTime15 = user5.getParkingEndTime();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bethuneLotView1.addHierarchyListener(hierarchyListener4);
        boolean boolean6 = bethuneLotView1.isFocusTraversable();
        bethuneLotView1.setLocation((-1), (int) '4');
        boolean boolean10 = bethuneLotView1.getFocusableWindowState();
        java.awt.event.ContainerListener containerListener11 = null;
        bethuneLotView1.addContainerListener(containerListener11);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        double double6 = user5.getRate();
        java.lang.String str7 = user5.getEmail();
        int int8 = user5.parkingFee;
        java.lang.String str9 = user5.cardName;
        user5.setPayementType("frame34");
        java.time.LocalDateTime localDateTime12 = null;
        user5.setParkingStartTime(localDateTime12);
        java.lang.String str14 = user5.getParkingLot();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        java.time.LocalDateTime localDateTime7 = user5.getParkingEndTime();
        user5.email = "Email not registered.";
        java.lang.String str10 = user5.getPassword();
        user5.email = "";
        int int13 = user5.price;
        user5.lotName = "Unavailable";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        java.lang.String str6 = user5.getPaymentType();
        user5.setPaymentType("Invalid plate number");
        java.lang.String str9 = user5.getCardNumber();
        user5.plateNumber = "Honda";
        user5.setName("Pick-up");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        boolean boolean34 = bethuneLotView1.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNull(point22);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + java.awt.Window.Type.NORMAL + "'", type29.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
        bethuneLotView14.addHierarchyBoundsListener(hierarchyBoundsListener25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + modalExclusionType17 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType17.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Dimension dimension2 = null;
        java.awt.Dimension dimension3 = bethuneLotView1.getSize(dimension2);
        java.awt.Dialog.ModalExclusionType modalExclusionType4 = bethuneLotView1.getModalExclusionType();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        bethuneLotView1.removeInputMethodListener(inputMethodListener5);
        java.awt.Toolkit toolkit7 = bethuneLotView1.getToolkit();
        java.awt.event.InputMethodListener inputMethodListener8 = null;
        bethuneLotView1.addInputMethodListener(inputMethodListener8);
        java.awt.event.WindowStateListener[] windowStateListenerArray10 = bethuneLotView1.getWindowStateListeners();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(toolkit7);
        org.junit.Assert.assertNotNull(windowStateListenerArray10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = bethuneLotView1.getBaselineResizeBehavior();
        bethuneLotView1.addNotify();
        bethuneLotView1.firePropertyChange("", '4', ' ');
        java.awt.event.WindowListener windowListener10 = null;
        bethuneLotView1.removeWindowListener(windowListener10);
        java.awt.event.ContainerListener[] containerListenerArray12 = bethuneLotView1.getContainerListeners();
        java.awt.image.ColorModel colorModel13 = bethuneLotView1.getColorModel();
        bethuneLotView1.firePropertyChange("Account does not exist.", (float) 12, (float) (byte) 10);
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Font font20 = null;
        bethuneLotView19.setFont(font20);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        bethuneLotView19.addPropertyChangeListener("", propertyChangeListener23);
        bethuneLotView19.setResizable(true);
        java.awt.Graphics graphics27 = null;
        bethuneLotView19.printComponents(graphics27);
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        bethuneLotView19.addInputMethodListener(inputMethodListener29);
        java.awt.Event event31 = null;
        boolean boolean34 = bethuneLotView19.mouseMove(event31, 3, (int) ' ');
        bethuneLotView19.addNotify();
        // The following exception was thrown during execution in test generation
        try {
            bethuneLotView1.setGlassPane((java.awt.Component) bethuneLotView19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertNotNull(colorModel13);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        views.Main main0 = new views.Main();
        java.awt.Cursor cursor1 = null;
        main0.setCursor(cursor1);
        boolean boolean5 = main0.inside((int) (byte) 100, 0);
        views.CheckoutView checkoutView6 = new views.CheckoutView(main0);
        javax.swing.JTextField jTextField7 = checkoutView6.cvvField;
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = jTextField7.getMouseWheelListeners();
        jTextField7.show(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        password.StrongPasswordBuilder strongPasswordBuilder0 = new password.StrongPasswordBuilder();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setLowerCase();
        strongPasswordBuilder0.setUpperCase();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        password.NumberPasswordBuilder numberPasswordBuilder0 = new password.NumberPasswordBuilder();
        numberPasswordBuilder0.setLowerCase();
        numberPasswordBuilder0.setIncludeNumbers();
        password.Password password3 = numberPasswordBuilder0.getPassword();
        java.lang.String str4 = password3.getPassword1();
        password3.addSymbols(false);
        org.junit.Assert.assertNotNull(password3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        java.io.PrintStream printStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            jButton38.list(printStream39, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        objects.Sensor sensor0 = new objects.Sensor();
        java.lang.String str1 = sensor0.getRandArrayElement2();
        java.lang.String str2 = sensor0.getRandArrayElement1();
        java.lang.String[] strArray3 = sensor0.carModel;
        java.util.Random random4 = null;
        sensor0.rand1 = random4;
        java.util.Random random6 = sensor0.rand2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sensor0.getRandArrayElement1();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mercedes" + "'", str1, "Mercedes");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sedan" + "'", str2, "Sedan");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        bethuneLotView1.show();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(point11);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        bethuneLotView1.removeMouseMotionListener(mouseMotionListener10);
        bethuneLotView1.enableInputMethods(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(keyListenerArray7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Point point3 = bethuneLotView1.getMousePosition(false);
        java.awt.Event event4 = null;
        boolean boolean7 = bethuneLotView1.mouseMove(event4, 3, (int) (byte) 100);
        java.awt.event.MouseListener[] mouseListenerArray8 = bethuneLotView1.getMouseListeners();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mouseListenerArray8);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        java.awt.Point point28 = bethuneLotView1.getMousePosition();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(point28);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        objects.User user5 = new objects.User("hi!", (int) '4', "", "", "");
        user5.setPrice((int) (byte) -1);
        user5.chargeUser("Email not registered.", (int) (byte) 0);
        user5.paymentType = "hi!";
        user5.debitBalance = (short) 10;
        java.lang.String str15 = user5.email;
        java.lang.String str16 = user5.lotName;
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str5 = controllers.UserController.registerUser("YorkUParking - Bethune", "Pick-up", "Account does not exist.", "Honda", "frame14");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email invalid." + "'", str5, "Email invalid.");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        views.Main main0 = null;
        views.BethuneLotView bethuneLotView1 = new views.BethuneLotView(main0);
        java.awt.Font font2 = null;
        bethuneLotView1.setFont(font2);
        boolean boolean4 = bethuneLotView1.isOpaque();
        bethuneLotView1.repaint();
        bethuneLotView1.disable();
        java.awt.Graphics graphics7 = null;
        bethuneLotView1.print(graphics7);
        views.Main main9 = null;
        views.BethuneLotView bethuneLotView10 = new views.BethuneLotView(main9);
        java.awt.Point point12 = bethuneLotView10.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        bethuneLotView10.addHierarchyListener(hierarchyListener13);
        bethuneLotView10.show();
        bethuneLotView10.list();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray17 = bethuneLotView10.getPropertyChangeListeners();
        views.Main main18 = null;
        views.BethuneLotView bethuneLotView19 = new views.BethuneLotView(main18);
        java.awt.Font font20 = null;
        bethuneLotView19.setFont(font20);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        bethuneLotView19.addPropertyChangeListener("", propertyChangeListener23);
        views.Main main25 = null;
        views.BethuneLotView bethuneLotView26 = new views.BethuneLotView(main25);
        java.awt.Point point28 = bethuneLotView26.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener29 = null;
        bethuneLotView26.addHierarchyListener(hierarchyListener29);
        boolean boolean31 = bethuneLotView26.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer32 = null;
        java.awt.Image image33 = bethuneLotView26.createImage(imageProducer32);
        views.Main main34 = null;
        views.BethuneLotView bethuneLotView35 = new views.BethuneLotView(main34);
        java.awt.Font font36 = null;
        bethuneLotView35.setFont(font36);
        bethuneLotView35.toBack();
        java.awt.Event event39 = null;
        boolean boolean42 = bethuneLotView35.mouseDrag(event39, 0, 1);
        bethuneLotView35.remove(0);
        bethuneLotView35.enable();
        int int46 = bethuneLotView19.checkImage(image33, (java.awt.image.ImageObserver) bethuneLotView35);
        views.Main main47 = null;
        views.BethuneLotView bethuneLotView48 = new views.BethuneLotView(main47);
        java.awt.Point point50 = bethuneLotView48.getMousePosition(false);
        java.awt.Container container51 = bethuneLotView48.getFocusCycleRootAncestor();
        java.awt.Event event52 = null;
        java.lang.Object obj53 = null;
        boolean boolean54 = bethuneLotView48.lostFocus(event52, obj53);
        int int55 = bethuneLotView10.checkImage(image33, (java.awt.image.ImageObserver) bethuneLotView48);
        bethuneLotView1.setIconImage(image33);
        views.Main main57 = new views.Main();
        views.LotChoiceView lotChoiceView58 = new views.LotChoiceView(main57);
        views.Main main59 = null;
        views.BethuneLotView bethuneLotView60 = new views.BethuneLotView(main59);
        java.awt.Font font61 = null;
        bethuneLotView60.setFont(font61);
        java.awt.Container container63 = bethuneLotView60.getFocusCycleRootAncestor();
        bethuneLotView60.setOpacity((float) (short) 1);
        java.awt.Point point66 = bethuneLotView60.location();
        lotChoiceView58.setLocation(point66);
        views.Main main68 = null;
        views.BethuneLotView bethuneLotView69 = new views.BethuneLotView(main68);
        java.awt.Point point71 = bethuneLotView69.getMousePosition(false);
        java.lang.String str72 = bethuneLotView69.getWarningString();
        java.awt.Font font73 = null;
        bethuneLotView69.setFont(font73);
        views.Main main75 = null;
        views.BethuneLotView bethuneLotView76 = new views.BethuneLotView(main75);
        java.awt.event.WindowStateListener[] windowStateListenerArray77 = bethuneLotView76.getWindowStateListeners();
        bethuneLotView76.enable(true);
        java.awt.event.HierarchyListener hierarchyListener80 = null;
        bethuneLotView76.addHierarchyListener(hierarchyListener80);
        java.awt.Point point82 = bethuneLotView76.getLocation();
        boolean boolean83 = bethuneLotView69.contains(point82);
        java.awt.Point point84 = lotChoiceView58.getLocation(point82);
        java.awt.Component component85 = bethuneLotView1.findComponentAt(point84);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray17);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(point50);
        org.junit.Assert.assertNull(container51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(container63);
        org.junit.Assert.assertNotNull(point66);
        org.junit.Assert.assertNull(point71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(windowStateListenerArray77);
        org.junit.Assert.assertNotNull(point82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(point84);
        org.junit.Assert.assertNull(component85);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        views.Main main0 = new views.Main();
        java.awt.MenuComponent menuComponent1 = null;
        main0.remove(menuComponent1);
        main0.resetContentPane();
        int int4 = main0.getExtendedState();
        main0.enable(true);
        java.awt.Component component7 = main0.getMostRecentFocusOwner();
        java.awt.Event event8 = null;
        objects.Sensor sensor9 = new objects.Sensor();
        java.lang.String str10 = sensor9.getRandArrayElement2();
        java.lang.String str11 = sensor9.getRandArrayElement1();
        boolean boolean12 = main0.lostFocus(event8, (java.lang.Object) str11);
        java.awt.event.ContainerListener containerListener13 = null;
        main0.removeContainerListener(containerListener13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(component7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nissan" + "'", str10, "Nissan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sedan" + "'", str11, "Sedan");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        bethuneLotView1.removeNotify();
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        main0.setFocusable(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.awt.event.ComponentListener componentListener20 = null;
        checkoutView6.removeComponentListener(componentListener20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.awt.event.WindowStateListener windowStateListener34 = null;
        bethuneLotView25.addWindowStateListener(windowStateListener34);
        views.Main main36 = null;
        views.BethuneLotView bethuneLotView37 = new views.BethuneLotView(main36);
        java.awt.Font font38 = null;
        bethuneLotView37.setFont(font38);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        bethuneLotView37.addPropertyChangeListener("", propertyChangeListener41);
        views.Main main43 = null;
        views.BethuneLotView bethuneLotView44 = new views.BethuneLotView(main43);
        java.awt.Point point46 = bethuneLotView44.getMousePosition(false);
        java.awt.event.HierarchyListener hierarchyListener47 = null;
        bethuneLotView44.addHierarchyListener(hierarchyListener47);
        boolean boolean49 = bethuneLotView44.isFocusTraversable();
        java.awt.image.ImageProducer imageProducer50 = null;
        java.awt.Image image51 = bethuneLotView44.createImage(imageProducer50);
        boolean boolean57 = bethuneLotView37.imageUpdate(image51, (int) (short) 10, 10, (-1), 3, 291);
        java.awt.Point point58 = bethuneLotView37.location();
        java.awt.Color color59 = bethuneLotView37.getBackground();
        bethuneLotView25.setBackground(color59);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(image51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        float float17 = bethuneLotView1.getOpacity();
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.awt.Window.Type.NORMAL + "'", type10.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.lang.String str2 = controllers.ManagerController.logInManager("frame55", "Available");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Account does not exist." + "'", str2, "Account does not exist.");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
            bethuneLotView1.setDefaultCloseOperation(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray24);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        views.Main main0 = new views.Main();
        views.LotChoiceView lotChoiceView1 = new views.LotChoiceView(main0);
        java.lang.String str2 = lotChoiceView1.getLblMessage();
        java.lang.String str3 = lotChoiceView1.getLblMessage();
        java.lang.String str4 = lotChoiceView1.getLblMessage();
        boolean boolean5 = lotChoiceView1.requestFocusInWindow();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        lotChoiceView1.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.awt.Window.Type type27 = checkoutView6.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jTextField7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTextField17);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + java.awt.Window.Type.NORMAL + "'", type27.equals(java.awt.Window.Type.NORMAL));
    }
}
