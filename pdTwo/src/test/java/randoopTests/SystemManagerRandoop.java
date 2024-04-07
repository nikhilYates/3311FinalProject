package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemManagerRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) 0);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) '4');
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        long long0 = userManagement.SystemManager.getActualcode();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1162070547L + "'", long0 == 1162070547L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(1L);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.SystemManager systemManager0 = userManagement.SystemManager.getInstance();
        java.lang.Class<?> wildcardClass1 = systemManager0.getClass();
        org.junit.Assert.assertNotNull(systemManager0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.SystemManager systemManager0 = userManagement.SystemManager.getInstance();
        itemManagement.BookRequestManagement bookRequestManagement1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = systemManager0.printRequests(bookRequestManagement1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.BookRequestManagement.getRequestsSystemManagerOnly(userManagement.SystemManager)\" because \"bookRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemManager0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (byte) 0);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((-1L));
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (byte) 100);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(0L);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (byte) 1);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(10L);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(100L);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (byte) 10);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) 'a');
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (short) 1);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) 10);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) ' ');
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) 100);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (short) -1);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) '#');
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(1162070547L);
        itemManagement.BookRequestManagement bookRequestManagement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = systemManager1.printRequests(bookRequestManagement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.BookRequestManagement.getRequestsSystemManagerOnly(userManagement.SystemManager)\" because \"bookRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemManager1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager(1162070547L);
        java.lang.Class<?> wildcardClass2 = systemManager1.getClass();
        org.junit.Assert.assertNotNull(systemManager1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (short) 0);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (short) 10);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) (byte) -1);
        org.junit.Assert.assertNull(systemManager1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        userManagement.SystemManager systemManager1 = userManagement.SystemManager.getSystemManager((long) 1);
        org.junit.Assert.assertNull(systemManager1);
    }
}

