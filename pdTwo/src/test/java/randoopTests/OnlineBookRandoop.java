package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OnlineBookRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        onlineBook5.printStatus();
        java.lang.String str9 = onlineBook5.getItemID();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook13 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray11, (int) (short) 1);
        onlineBook13.setLocation("hi!");
        onlineBook5.returnItem((itemManagement.PhysicalItem) onlineBook13);
        onlineBook5.openBook();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        onlineBook5.printStatus();
        java.lang.String str9 = onlineBook5.getAuthor();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook13 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray11, (int) (short) 1);
        onlineBook13.setLocation("hi!");
        onlineBook5.returnItem((itemManagement.PhysicalItem) onlineBook13);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook22 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray20, (int) (short) 1);
        onlineBook22.setLocation("hi!");
        onlineBook22.printStatus();
        boolean boolean26 = onlineBook22.displayState();
        onlineBook22.setAuthor("hi!");
        java.lang.String str29 = onlineBook22.getItemID();
        java.lang.String[] strArray30 = onlineBook22.getTopics();
        onlineBook13.rentOut((itemManagement.PhysicalItem) onlineBook22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        onlineBook5.printStatus();
        boolean boolean9 = onlineBook5.displayState();
        onlineBook5.setAuthor("hi!");
        onlineBook5.closeBook();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook13 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray11, (int) (short) 1);
        onlineBook13.setLocation("hi!");
        onlineBook5.returnItem((itemManagement.PhysicalItem) onlineBook13);
        onlineBook5.closeBook();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook8 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray6, (int) (short) 1);
        itemManagement.OnlineBook onlineBook10 = new itemManagement.OnlineBook("", "hi!", "hi!", strArray6, 0);
        boolean boolean11 = onlineBook10.isPurchaseOption();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook8 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray6, (int) (short) 1);
        itemManagement.OnlineBook onlineBook10 = new itemManagement.OnlineBook("", "", "hi!", strArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setBookID("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook13 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray11, (int) (short) 1);
        onlineBook13.setLocation("hi!");
        onlineBook13.printStatus();
        boolean boolean17 = onlineBook13.displayState();
        onlineBook13.setTitle("");
        java.lang.String[] strArray23 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook25 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray23, (int) (short) 1);
        onlineBook25.setLocation("hi!");
        onlineBook13.returnItem((itemManagement.PhysicalItem) onlineBook25);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook34 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray32, (int) (short) 1);
        onlineBook34.setLocation("hi!");
        onlineBook34.printStatus();
        boolean boolean38 = onlineBook34.displayState();
        onlineBook34.setAuthor("hi!");
        java.lang.String str41 = onlineBook34.getItemID();
        java.lang.String[] strArray42 = onlineBook34.getTopics();
        onlineBook25.setTopics(strArray42);
        onlineBook5.setTopics(strArray42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        onlineBook5.printStatus();
        boolean boolean9 = onlineBook5.displayState();
        onlineBook5.setTitle("");
        java.lang.String[] strArray15 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook17 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray15, (int) (short) 1);
        onlineBook17.setLocation("hi!");
        onlineBook17.printStatus();
        boolean boolean21 = onlineBook17.displayState();
        onlineBook17.setTitle("");
        java.lang.String[] strArray27 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook29 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray27, (int) (short) 1);
        onlineBook29.setLocation("hi!");
        onlineBook17.returnItem((itemManagement.PhysicalItem) onlineBook29);
        onlineBook5.setState((itemManagement.PhysicalItemState) onlineBook29);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook39 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray37, (int) (short) 1);
        java.lang.String str40 = onlineBook39.getItemID();
        onlineBook29.returnItem((itemManagement.PhysicalItem) onlineBook39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        java.lang.String str6 = onlineBook5.getItemID();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook12 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray10, (int) (short) 1);
        onlineBook12.setLocation("hi!");
        onlineBook12.printStatus();
        boolean boolean16 = onlineBook12.displayState();
        onlineBook12.setTitle("");
        java.lang.String[] strArray22 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook24 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray22, (int) (short) 1);
        java.lang.String str25 = onlineBook24.getItemID();
        onlineBook24.setAvailableForReading(false);
        onlineBook12.returnItem((itemManagement.PhysicalItem) onlineBook24);
        onlineBook5.setState((itemManagement.PhysicalItemState) onlineBook24);
        java.lang.String str30 = onlineBook24.getAuthor();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        itemManagement.OnlineBook onlineBook5 = new itemManagement.OnlineBook("hi!", "hi!", "hi!", strArray3, (int) (short) 1);
        onlineBook5.setLocation("hi!");
        onlineBook5.printStatus();
        onlineBook5.setAvailableForReading(false);
        org.junit.Assert.assertNotNull(strArray3);
    }
}

