package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRequestRandoop {

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
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isSubmitted();
        bookRequest7.setUserID("hi!");
        java.lang.String str11 = bookRequest7.getRequestType();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isPriority();
        bookRequest7.setUserID("hi!");
        bookRequest7.setSubmitted(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isSubmitted();
        java.lang.Class<?> wildcardClass9 = bookRequest7.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "hi!", (java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        itemManagement.BookRequest bookRequest9 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList7);
        itemManagement.BookRequest bookRequest10 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList7);
        bookRequest10.setSubmitted(true);
        bookRequest10.setSubmitted(true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isSubmitted();
        bookRequest7.setUserID("hi!");
        bookRequest7.setSubmitted(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        bookRequest7.setUserID("");
        java.util.List<java.lang.String> strList10 = bookRequest7.getTopics();
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        itemManagement.BookRequest bookRequest9 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList7);
        itemManagement.BookRequest bookRequest10 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList7);
        boolean boolean11 = bookRequest10.isPriority();
        java.lang.String str12 = bookRequest10.getRequestID();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "REQ-105091ee-53ab-4b37-ae4f-ba66ac6b5dfb" + "'", str12, "REQ-105091ee-53ab-4b37-ae4f-ba66ac6b5dfb");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isSubmitted();
        java.lang.String str9 = bookRequest7.getRequestType();
        bookRequest7.setUserID("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        itemManagement.BookRequest bookRequest11 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList9);
        itemManagement.BookRequest bookRequest12 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList9);
        boolean boolean13 = bookRequest12.isPriority();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        itemManagement.BookRequest bookRequest21 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList19);
        bookRequest21.setUserID("");
        java.util.List<java.lang.String> strList24 = bookRequest21.getTopics();
        bookRequest12.setTopics(strList24);
        itemManagement.BookRequest bookRequest26 = new itemManagement.BookRequest("hi!", "hi!", strList24);
        java.lang.String str27 = bookRequest26.getRequestType();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        bookRequest7.setUserID("");
        java.util.List<java.lang.String> strList10 = bookRequest7.getTopics();
        java.lang.String str11 = bookRequest7.getUserID();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isPriority();
        java.lang.String str9 = bookRequest7.getRequestType();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        bookRequest7.setUserID("");
        java.util.List<java.lang.String> strList10 = bookRequest7.getTopics();
        java.util.List<java.lang.String> strList11 = bookRequest7.getTopics();
        java.util.List<java.lang.String> strList12 = bookRequest7.getTopics();
        bookRequest7.setSubmitted(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        itemManagement.BookRequest bookRequest7 = new itemManagement.BookRequest("", "", (java.util.List<java.lang.String>) strList5);
        boolean boolean8 = bookRequest7.isSubmitted();
        java.lang.String[] strArray10 = new java.lang.String[] { "REQ-105091ee-53ab-4b37-ae4f-ba66ac6b5dfb" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        bookRequest7.setTopics((java.util.List<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}
