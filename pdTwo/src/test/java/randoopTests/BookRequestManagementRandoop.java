package randoopTests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRequestManagementRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.BookRequestManagement bookRequestManagement1 = new itemManagement.BookRequestManagement("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        userManagement.SystemManager systemManager3 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList4 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager3);
        bookRequestManagement0.prioritizeRequest("hi!");
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertNull(bookRequestList4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        java.util.List<java.lang.String> strList5 = null;
        bookRequestManagement0.specifyRequestDetails("hi!", "REQ-d7847bdd-fea7-4c60-b50a-886628b3014e", strList5);
        org.junit.Assert.assertNull(bookRequestList2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.prioritizeRequest("hi!");
        itemManagement.BookRequestManagement bookRequestManagement4 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager5 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList6 = bookRequestManagement4.getRequestsSystemManagerOnly(systemManager5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        bookRequestManagement4.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList11);
        java.lang.String str14 = bookRequestManagement0.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList11);
        java.lang.String str15 = bookRequestManagement0.getUserID();
        userManagement.SystemManager systemManager16 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList17 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager16);
        bookRequestManagement0.prioritizeRequest("REQ-d7847bdd-fea7-4c60-b50a-886628b3014e");
        org.junit.Assert.assertNull(bookRequestList6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "REQ-baa820b3-6705-4f8d-aa7d-770a621dbc68" + "'", str14, "REQ-baa820b3-6705-4f8d-aa7d-770a621dbc68");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(bookRequestList17);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.prioritizeRequest("hi!");
        itemManagement.BookRequestManagement bookRequestManagement4 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager5 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList6 = bookRequestManagement4.getRequestsSystemManagerOnly(systemManager5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        bookRequestManagement4.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList11);
        java.lang.String str14 = bookRequestManagement0.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList11);
        java.util.Collection<itemManagement.BookRequest> bookRequestCollection15 = bookRequestManagement0.getRequests();
        boolean boolean17 = bookRequestManagement0.submitRequest("hi!");
        org.junit.Assert.assertNull(bookRequestList6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "REQ-aa44d5d0-4d6a-4055-8b8b-35e7dbc1a797" + "'", str14, "REQ-aa44d5d0-4d6a-4055-8b8b-35e7dbc1a797");
        org.junit.Assert.assertNotNull(bookRequestCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.setUserID("");
        java.util.Collection<itemManagement.BookRequest> bookRequestCollection3 = bookRequestManagement0.getRequests();
        org.junit.Assert.assertNotNull(bookRequestCollection3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        userManagement.SystemManager systemManager3 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList4 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager3);
        userManagement.SystemManager systemManager5 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList6 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager5);
        java.lang.String[] strArray16 = new java.lang.String[] { "REQ-104cde5d-3707-4a37-9b21-59630dbfb863", "REQ-104cde5d-3707-4a37-9b21-59630dbfb863", "REQ-0da947c2-188d-44d6-86e1-56cd077bfa61", "REQ-0da947c2-188d-44d6-86e1-56cd077bfa61", "", "REQ-4cb47a17-eef6-4d28-bf8b-a4506a6ae661", "REQ-d7847bdd-fea7-4c60-b50a-886628b3014e" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        bookRequestManagement0.specifyRequestDetails("hi!", "", (java.util.List<java.lang.String>) strList17);
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertNull(bookRequestList4);
        org.junit.Assert.assertNull(bookRequestList6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.setUserID("");
        bookRequestManagement0.prioritizeRequest("REQ-0da947c2-188d-44d6-86e1-56cd077bfa61");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        bookRequestManagement0.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList7);
        itemManagement.BookRequestManagement bookRequestManagement11 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager12 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList13 = bookRequestManagement11.getRequestsSystemManagerOnly(systemManager12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        bookRequestManagement11.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList18);
        java.lang.String str21 = bookRequestManagement0.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList18);
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bookRequestList13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "REQ-1aa80147-76f6-4402-a049-128045d27929" + "'", str21, "REQ-1aa80147-76f6-4402-a049-128045d27929");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.setUserID("");
        itemManagement.BookRequestManagement bookRequestManagement5 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager6 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList7 = bookRequestManagement5.getRequestsSystemManagerOnly(systemManager6);
        userManagement.SystemManager systemManager8 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList9 = bookRequestManagement5.getRequestsSystemManagerOnly(systemManager8);
        itemManagement.BookRequestManagement bookRequestManagement12 = new itemManagement.BookRequestManagement();
        bookRequestManagement12.prioritizeRequest("hi!");
        itemManagement.BookRequestManagement bookRequestManagement16 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager17 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList18 = bookRequestManagement16.getRequestsSystemManagerOnly(systemManager17);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        bookRequestManagement16.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList23);
        java.lang.String str26 = bookRequestManagement12.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList23);
        bookRequestManagement5.specifyRequestDetails("hi!", "", (java.util.List<java.lang.String>) strList23);
        bookRequestManagement0.specifyRequestDetails("", "", (java.util.List<java.lang.String>) strList23);
        bookRequestManagement0.setUserID("REQ-a3e2a6c2-0d0b-4330-8e4b-c46517efcef5");
        java.lang.String str31 = bookRequestManagement0.getUserID();
        org.junit.Assert.assertNull(bookRequestList7);
        org.junit.Assert.assertNull(bookRequestList9);
        org.junit.Assert.assertNull(bookRequestList18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "REQ-d31ced19-62e7-4c24-9ffc-b853c7fa5257" + "'", str26, "REQ-d31ced19-62e7-4c24-9ffc-b853c7fa5257");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "REQ-a3e2a6c2-0d0b-4330-8e4b-c46517efcef5" + "'", str31, "REQ-a3e2a6c2-0d0b-4330-8e4b-c46517efcef5");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        bookRequestManagement0.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList7);
        java.util.Collection<itemManagement.BookRequest> bookRequestCollection10 = bookRequestManagement0.getRequests();
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bookRequestCollection10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        boolean boolean4 = bookRequestManagement0.submitRequest("REQ-69e5eb26-683a-4326-b1a1-490190bfa8a1");
        java.lang.Class<?> wildcardClass5 = bookRequestManagement0.getClass();
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        bookRequestManagement0.prioritizeRequest("hi!");
        itemManagement.BookRequestManagement bookRequestManagement4 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager5 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList6 = bookRequestManagement4.getRequestsSystemManagerOnly(systemManager5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        bookRequestManagement4.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList11);
        java.lang.String str14 = bookRequestManagement0.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList11);
        java.lang.String str15 = bookRequestManagement0.getUserID();
        userManagement.SystemManager systemManager16 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList17 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager16);
        bookRequestManagement0.prioritizeRequest("REQ-69e5eb26-683a-4326-b1a1-490190bfa8a1");
        java.util.Collection<itemManagement.BookRequest> bookRequestCollection20 = bookRequestManagement0.getRequests();
        org.junit.Assert.assertNull(bookRequestList6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "REQ-853a6f7b-b200-42e5-ade7-ad34642a3c5d" + "'", str14, "REQ-853a6f7b-b200-42e5-ade7-ad34642a3c5d");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(bookRequestList17);
        org.junit.Assert.assertNotNull(bookRequestCollection20);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.BookRequestManagement bookRequestManagement0 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager1 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList2 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager1);
        userManagement.SystemManager systemManager3 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList4 = bookRequestManagement0.getRequestsSystemManagerOnly(systemManager3);
        itemManagement.BookRequestManagement bookRequestManagement7 = new itemManagement.BookRequestManagement();
        bookRequestManagement7.prioritizeRequest("hi!");
        itemManagement.BookRequestManagement bookRequestManagement11 = new itemManagement.BookRequestManagement();
        userManagement.SystemManager systemManager12 = null;
        java.util.List<itemManagement.BookRequest> bookRequestList13 = bookRequestManagement11.getRequestsSystemManagerOnly(systemManager12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        bookRequestManagement11.specifyRequestDetails("", "hi!", (java.util.List<java.lang.String>) strList18);
        java.lang.String str21 = bookRequestManagement7.initiateBookRequest("hi!", (java.util.List<java.lang.String>) strList18);
        bookRequestManagement0.specifyRequestDetails("hi!", "", (java.util.List<java.lang.String>) strList18);
        java.util.Collection<itemManagement.BookRequest> bookRequestCollection23 = bookRequestManagement0.getRequests();
        org.junit.Assert.assertNull(bookRequestList2);
        org.junit.Assert.assertNull(bookRequestList4);
        org.junit.Assert.assertNull(bookRequestList13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "REQ-a7e978ab-4dc2-467f-af24-c89c1aeb3821" + "'", str21, "REQ-a7e978ab-4dc2-467f-af24-c89c1aeb3821");
        org.junit.Assert.assertNotNull(bookRequestCollection23);
    }
}
