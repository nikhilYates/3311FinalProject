package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextbookRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTextbookID();
        java.lang.Class<?> wildcardClass4 = textbook2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("", "hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("", "");
        java.lang.Class<?> wildcardClass3 = textbook2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTextbookID();
        java.lang.String str4 = textbook2.getTitle();
        java.lang.String str5 = textbook2.getTextbookID();
        boolean boolean7 = textbook2.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTitle();
        java.lang.String str4 = textbook2.getTextbookID();
        java.lang.String str5 = textbook2.getTextbookID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTitle();
        boolean boolean5 = textbook2.equals((java.lang.Object) 1);
        java.lang.String str6 = textbook2.getTitle();
        java.lang.String str7 = textbook2.getTextbookID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTitle();
        boolean boolean5 = textbook2.equals((java.lang.Object) 1);
        java.lang.String str6 = textbook2.getTitle();
        java.lang.String str7 = textbook2.getTitle();
        java.lang.String str8 = textbook2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("", "");
        boolean boolean4 = textbook2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("", "");
        java.lang.String str3 = textbook2.getTitle();
        boolean boolean5 = textbook2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTextbookID();
        boolean boolean5 = textbook2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("", "");
        java.lang.String str3 = textbook2.getTitle();
        java.lang.String str4 = textbook2.getTextbookID();
        java.lang.String str5 = textbook2.getTextbookID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTitle();
        boolean boolean5 = textbook2.equals((java.lang.Object) 1);
        boolean boolean7 = textbook2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTitle();
        java.lang.String str4 = textbook2.getTitle();
        java.lang.Class<?> wildcardClass5 = textbook2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.Textbook textbook2 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str3 = textbook2.getTextbookID();
        java.lang.String str4 = textbook2.getTitle();
        itemManagement.Textbook textbook7 = new itemManagement.Textbook("hi!", "hi!");
        java.lang.String str8 = textbook7.getTextbookID();
        boolean boolean9 = textbook2.equals((java.lang.Object) textbook7);
        java.lang.String str10 = textbook2.getTextbookID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }
}

