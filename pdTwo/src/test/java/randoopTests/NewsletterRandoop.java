package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewsletterRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        boolean boolean3 = newsletter2.confirmCancellation();
        java.lang.String str4 = newsletter2.getTitle();
        java.util.List<itemManagement.Newsletter> newsletterList5 = newsletter2.listNewsletters();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(newsletterList5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.setTitle("hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.setNewsletterID("");
        newsletter7.unsubscribe();
        newsletter7.readOnline();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.unsubscribe();
        newsletter7.subscribe();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.setNewsletterID("");
        java.util.List<itemManagement.Subscription> subscriptionList14 = newsletter7.listSubscriptions();
        boolean boolean15 = newsletter7.confirmCancellation();
        org.junit.Assert.assertNotNull(subscriptionList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.setNewsletterID("");
        newsletter7.setSubscriptionStatus(true);
        java.lang.Class<?> wildcardClass16 = newsletter7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        newsletter7.unsubscribe();
        newsletter7.unsubscribe();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.unsubscribe();
        boolean boolean4 = newsletter2.confirmCancellation();
        java.util.List<itemManagement.Subscription> subscriptionList5 = newsletter2.listSubscriptions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(subscriptionList5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        newsletter7.readOnline();
        java.lang.String str12 = newsletter7.getNewsletterID();
        java.util.List<itemManagement.Subscription> subscriptionList13 = newsletter7.listSubscriptions();
        newsletter7.setSubscriptionStatus(true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(subscriptionList13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "hi!");
        newsletter2.setTitle("");
        itemManagement.Newsletter newsletter7 = new itemManagement.Newsletter("", "hi!");
        newsletter7.setTitle("");
        newsletter2.loadNewsletterFrame(newsletter7);
        java.lang.String str11 = newsletter2.getNewsletterID();
        java.util.List<itemManagement.Subscription> subscriptionList12 = newsletter2.listSubscriptions();
        boolean boolean14 = newsletter2.cancelSubscription("");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(subscriptionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Newsletter newsletter2 = new itemManagement.Newsletter("", "");
        boolean boolean4 = newsletter2.cancelSubscription("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

