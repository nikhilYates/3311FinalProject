package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubscriptionRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        subscription2.setSubscriptionID("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.setSubscriptionID("hi!");
        subscription2.cancel();
        subscription2.setSubscriptionID("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setUserEmail("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.cancel();
        subscription2.setActive(false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        java.lang.String str3 = subscription2.getUserEmail();
        boolean boolean5 = subscription2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        java.lang.String str3 = subscription2.getSubscriptionID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.setSubscriptionID("hi!");
        java.lang.String str9 = subscription2.getSubscriptionID();
        subscription2.cancel();
        java.lang.Object obj11 = null;
        boolean boolean12 = subscription2.equals(obj11);
        subscription2.setUserEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        boolean boolean6 = subscription2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.setSubscriptionID("hi!");
        java.lang.String str9 = subscription2.getSubscriptionID();
        java.lang.Class<?> wildcardClass10 = subscription2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        boolean boolean5 = subscription2.isActive();
        java.lang.String str6 = subscription2.getSubscriptionID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("", "hi!");
        subscription2.setSubscriptionID("");
        boolean boolean5 = subscription2.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.setSubscriptionID("hi!");
        java.lang.String str9 = subscription2.getSubscriptionID();
        subscription2.cancel();
        java.lang.Object obj11 = null;
        boolean boolean12 = subscription2.equals(obj11);
        subscription2.cancel();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        java.lang.String str3 = subscription2.getUserEmail();
        java.lang.String str4 = subscription2.getSubscriptionID();
        subscription2.setUserEmail("");
        subscription2.setSubscriptionID("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.Subscription subscription2 = new itemManagement.Subscription("hi!", "hi!");
        subscription2.setActive(true);
        java.lang.Object obj5 = null;
        boolean boolean6 = subscription2.equals(obj5);
        subscription2.cancel();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

