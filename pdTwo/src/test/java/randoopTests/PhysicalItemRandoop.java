package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PhysicalItemRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem2 = new itemManagement.PhysicalItem();
        physicalItem1.setState((itemManagement.PhysicalItemState) physicalItem2);
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem2);
        physicalItem0.setTitle("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        physicalItem0.setLocation("hi!");
        physicalItem0.setTitle("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        java.lang.String str1 = physicalItem0.getItemID();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem1);
        physicalItem1.setAvailableCopies(0);
        itemManagement.PhysicalItem physicalItem5 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem6 = new itemManagement.PhysicalItem();
        physicalItem5.setState((itemManagement.PhysicalItemState) physicalItem6);
        physicalItem6.setAvailableCopies(0);
        physicalItem1.setState((itemManagement.PhysicalItemState) physicalItem6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        boolean boolean1 = physicalItem0.displayState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        physicalItem0.setLocation("hi!");
        physicalItem0.setPurchaseOption(true);
        itemManagement.PhysicalItem physicalItem5 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem6 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem7 = new itemManagement.PhysicalItem();
        physicalItem6.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem5.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem7);
        java.lang.Class<?> wildcardClass11 = physicalItem7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = null;
        physicalItem0.returnItem(physicalItem1);
        java.lang.String str3 = physicalItem0.getLocation();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem2 = new itemManagement.PhysicalItem();
        physicalItem1.setState((itemManagement.PhysicalItemState) physicalItem2);
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem2);
        itemManagement.PhysicalItem physicalItem9 = new itemManagement.PhysicalItem("", "", "hi!", true);
        physicalItem2.setState((itemManagement.PhysicalItemState) physicalItem9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.PhysicalItem physicalItem4 = new itemManagement.PhysicalItem("", "", "", false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        physicalItem0.setLocation("hi!");
        physicalItem0.setPurchaseOption(true);
        itemManagement.PhysicalItem physicalItem5 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem6 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem7 = new itemManagement.PhysicalItem();
        physicalItem6.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem5.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem7);
        int int11 = physicalItem7.getAvailableCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.PhysicalItem physicalItem4 = new itemManagement.PhysicalItem("", "", "hi!", true);
        itemManagement.PhysicalItem physicalItem5 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem6 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem7 = new itemManagement.PhysicalItem();
        physicalItem6.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem5.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem4.returnItem(physicalItem5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.PhysicalItem physicalItem4 = new itemManagement.PhysicalItem("hi!", "", "", true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        physicalItem0.setLocation("hi!");
        physicalItem0.setPurchaseOption(false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        physicalItem0.setLocation("hi!");
        physicalItem0.setPurchaseOption(true);
        itemManagement.PhysicalItem physicalItem5 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem6 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem7 = new itemManagement.PhysicalItem();
        physicalItem6.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem5.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem7);
        physicalItem0.setAvailableCopies((int) (byte) -1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem1);
        physicalItem1.setAvailableCopies(0);
        physicalItem1.setPurchaseOption(true);
        physicalItem1.setTitle("hi!");
        java.lang.String str9 = physicalItem1.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem1);
        physicalItem1.setAvailableCopies(0);
        physicalItem1.setPurchaseOption(true);
        physicalItem1.setLocation("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem1);
        java.lang.String str3 = physicalItem1.getItemID();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = new itemManagement.PhysicalItem();
        physicalItem0.setState((itemManagement.PhysicalItemState) physicalItem1);
        physicalItem0.setTitle("hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        itemManagement.PhysicalItem physicalItem0 = new itemManagement.PhysicalItem();
        itemManagement.PhysicalItem physicalItem1 = null;
        physicalItem0.returnItem(physicalItem1);
        physicalItem0.rentalStatus = true;
    }
}

