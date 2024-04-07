package randoopTests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiscountedNotificationRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = discountedNotification1.processPurchase(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Item.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        itemManagement.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = discountedNotification1.processPurchase(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Item.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList2 = discountedNotification1.listDiscountedItems();
        boolean boolean4 = discountedNotification1.selectItemForPurchase("hi!");
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("");
        discountedNotification1.notifyDiscounts();
        boolean boolean4 = discountedNotification1.selectItemForPurchase("hi!");
        java.lang.Class<?> wildcardClass5 = discountedNotification1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList4 = discountedNotification1.listDiscountedItems();
        itemManagement.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = discountedNotification1.processPurchase(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Item.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList4 = discountedNotification1.listDiscountedItems();
        discountedNotification1.setClientID("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        discountedNotification1.notifyDiscounts();
        boolean boolean6 = discountedNotification1.selectItemForPurchase("");
        itemManagement.DiscountedNotification discountedNotification8 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean10 = discountedNotification8.selectItemForPurchase("hi!");
        discountedNotification8.notifyDiscounts();
        boolean boolean13 = discountedNotification8.selectItemForPurchase("");
        itemManagement.DiscountedNotification discountedNotification15 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean17 = discountedNotification15.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList18 = discountedNotification15.listDiscountedItems();
        itemManagement.DiscountedNotification discountedNotification20 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.DiscountedNotification discountedNotification22 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean24 = discountedNotification22.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList25 = discountedNotification22.listDiscountedItems();
        discountedNotification20.setDiscountedItems(itemList25);
        discountedNotification15.setDiscountedItems(itemList25);
        discountedNotification8.setDiscountedItems(itemList25);
        itemManagement.DiscountedNotification discountedNotification30 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList31 = discountedNotification30.listDiscountedItems();
        discountedNotification8.setDiscountedItems(itemList31);
        discountedNotification1.setDiscountedItems(itemList31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList31);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList2 = discountedNotification1.listDiscountedItems();
        discountedNotification1.notifyDiscounts();
        java.util.List<itemManagement.Item> itemList4 = discountedNotification1.listDiscountedItems();
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList2 = discountedNotification1.listDiscountedItems();
        discountedNotification1.notifyDiscounts();
        discountedNotification1.setClientID("");
        org.junit.Assert.assertNotNull(itemList2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        discountedNotification1.notifyDiscounts();
        boolean boolean6 = discountedNotification1.selectItemForPurchase("");
        itemManagement.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = discountedNotification1.processPurchase(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Item.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList4 = discountedNotification1.listDiscountedItems();
        itemManagement.DiscountedNotification discountedNotification6 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.DiscountedNotification discountedNotification8 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean10 = discountedNotification8.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList11 = discountedNotification8.listDiscountedItems();
        discountedNotification6.setDiscountedItems(itemList11);
        discountedNotification1.setDiscountedItems(itemList11);
        itemManagement.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = discountedNotification1.processPurchase(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Item.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(itemList11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList4 = discountedNotification1.listDiscountedItems();
        itemManagement.DiscountedNotification discountedNotification6 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean8 = discountedNotification6.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList9 = discountedNotification6.listDiscountedItems();
        itemManagement.DiscountedNotification discountedNotification11 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.DiscountedNotification discountedNotification13 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean15 = discountedNotification13.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList16 = discountedNotification13.listDiscountedItems();
        discountedNotification11.setDiscountedItems(itemList16);
        discountedNotification6.setDiscountedItems(itemList16);
        discountedNotification1.setDiscountedItems(itemList16);
        itemManagement.DiscountedNotification discountedNotification21 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.DiscountedNotification discountedNotification23 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean25 = discountedNotification23.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList26 = discountedNotification23.listDiscountedItems();
        discountedNotification21.setDiscountedItems(itemList26);
        discountedNotification1.setDiscountedItems(itemList26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(itemList26);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        discountedNotification1.notifyDiscounts();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean3 = discountedNotification1.selectItemForPurchase("hi!");
        discountedNotification1.notifyDiscounts();
        boolean boolean6 = discountedNotification1.selectItemForPurchase("");
        itemManagement.DiscountedNotification discountedNotification8 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean10 = discountedNotification8.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList11 = discountedNotification8.listDiscountedItems();
        itemManagement.DiscountedNotification discountedNotification13 = new itemManagement.DiscountedNotification("hi!");
        itemManagement.DiscountedNotification discountedNotification15 = new itemManagement.DiscountedNotification("hi!");
        boolean boolean17 = discountedNotification15.selectItemForPurchase("hi!");
        java.util.List<itemManagement.Item> itemList18 = discountedNotification15.listDiscountedItems();
        discountedNotification13.setDiscountedItems(itemList18);
        discountedNotification8.setDiscountedItems(itemList18);
        discountedNotification1.setDiscountedItems(itemList18);
        itemManagement.DiscountedNotification discountedNotification23 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList24 = discountedNotification23.listDiscountedItems();
        discountedNotification1.setDiscountedItems(itemList24);
        discountedNotification1.setClientID("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList24);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.DiscountedNotification discountedNotification1 = new itemManagement.DiscountedNotification("");
        java.util.List<itemManagement.Item> itemList2 = discountedNotification1.listDiscountedItems();
        discountedNotification1.notifyDiscounts();
        boolean boolean5 = discountedNotification1.selectItemForPurchase("");
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

