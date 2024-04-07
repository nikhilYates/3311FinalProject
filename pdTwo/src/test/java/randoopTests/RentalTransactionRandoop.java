package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentalTransactionRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        rentalTransaction7.setUserid(1);
        java.lang.String str10 = rentalTransaction7.getItemid();
        rentalTransaction7.setTransactionID(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        rentalTransaction7.setUserid(1);
        boolean boolean10 = rentalTransaction7.isReturned();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = rentalTransaction7.getDueDate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"this.rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) 100, 100, "", localDate3, localDate4, (double) 1.0f, false);
        rentalTransaction7.setReturned(true);
        rentalTransaction7.setTransactionID(100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        java.time.LocalDate localDate8 = null;
        rentalTransaction7.setRentalDate(localDate8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        rentalTransaction7.setUserid(1);
        java.lang.String str10 = rentalTransaction7.getItemid();
        java.time.LocalDate localDate11 = rentalTransaction7.getRentalDate();
        java.time.LocalDate localDate12 = rentalTransaction7.getRentalDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        rentalTransaction7.setLatePenalty(10.0d);
        java.lang.String str11 = rentalTransaction7.getItemid();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        java.lang.Class<?> wildcardClass9 = rentalTransaction7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        rentalTransaction7.setLatePenalty(10.0d);
        rentalTransaction7.setReturned(false);
        java.time.LocalDate localDate13 = null;
        rentalTransaction7.setRentalDate(localDate13);
        java.time.LocalDate localDate15 = null;
        rentalTransaction7.setDueDate(localDate15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        rentalTransaction7.setUserid(1);
        java.lang.String str10 = rentalTransaction7.getItemid();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = rentalTransaction7.getDueDate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"this.rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        rentalTransaction7.setUserid(1);
        boolean boolean10 = rentalTransaction7.isReturned();
        rentalTransaction7.setUserid((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        rentalTransaction7.setLatePenalty(10.0d);
        int int11 = rentalTransaction7.getUserid();
        rentalTransaction7.setItemid("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) 100, 100, "", localDate3, localDate4, (double) 1.0f, false);
        rentalTransaction7.setReturned(true);
        boolean boolean10 = rentalTransaction7.isReturned();
        rentalTransaction7.setUserid((int) (short) 1);
        rentalTransaction7.setUserid((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) 100, 100, "", localDate3, localDate4, (double) 1.0f, false);
        rentalTransaction7.setReturned(true);
        boolean boolean10 = rentalTransaction7.isReturned();
        rentalTransaction7.setUserid((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        rentalTransaction7.setLatePenalty(10.0d);
        rentalTransaction7.setReturned(false);
        java.time.LocalDate localDate13 = null;
        rentalTransaction7.setRentalDate(localDate13);
        rentalTransaction7.setReturned(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        java.time.LocalDate localDate8 = rentalTransaction7.getRentalDate();
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        userManagement.RentalTransaction rentalTransaction7 = new userManagement.RentalTransaction((int) (short) -1, (int) (byte) 1, "", localDate3, localDate4, (double) (short) 0, true);
        int int8 = rentalTransaction7.getTransactionID();
        rentalTransaction7.setLatePenalty(10.0d);
        rentalTransaction7.setReturned(false);
        rentalTransaction7.setReturned(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }
}

