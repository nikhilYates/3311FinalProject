package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VisitorRandoop {

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
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (short) 1, "", (int) 'a');
        visitor3.setMajor("");
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitor3.getRentalList();
        org.junit.Assert.assertNotNull(rentalTransactionList6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        java.lang.String str5 = visitor3.getUsertype();
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitor3.getRentalList();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertNotNull(rentalTransactionList6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        java.lang.String str5 = visitor3.getUsertype();
        userManagement.RentalTransaction rentalTransaction6 = null;
        visitor3.removeFromRentalList(rentalTransaction6);
        java.lang.String str8 = visitor3.getDepartment();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (short) 1, "", (int) 'a');
        java.lang.String str4 = visitor3.getMajor();
        visitor3.setDepartment("hi!");
        userManagement.RentalTransaction rentalTransaction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor3.addToRentalList(rentalTransaction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"rentedItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (short) 1, "", (int) 'a');
        userManagement.RentalTransaction rentalTransaction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor3.addToRentalList(rentalTransaction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"rentedItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        int int5 = visitor3.getUserID();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) 'a', "", (int) (byte) -1);
        java.lang.String str4 = visitor3.getMajor();
        int int5 = visitor3.getUserID();
        int int6 = visitor3.getUserID();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor3.addToRentalList(rentalTransaction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"rentedItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) '4', "", (int) (short) -1);
        visitor3.setMajor("hi!");
        java.lang.String str6 = visitor3.getDepartment();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        java.lang.String str5 = visitor3.getUsertype();
        java.lang.String str6 = visitor3.getDepartment();
        java.lang.String str7 = visitor3.getEmail();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (short) 0, "", (int) (byte) -1);
        java.lang.String str4 = visitor3.getDepartment();
        java.lang.String str5 = visitor3.getEmail();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.Visitor visitor3 = new userManagement.Visitor((int) (byte) 10, "hi!", (int) (byte) 1);
        java.lang.String str4 = visitor3.getMajor();
        visitor3.comprehensiveReport();
        org.junit.Assert.assertNull(str4);
    }
}

