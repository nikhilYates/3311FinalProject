package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonFacultyRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nonFaculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setYear(10);
        java.lang.String str7 = nonFaculty3.getDepartment();
        nonFaculty3.setDepartment("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        userManagement.RentalTransaction rentalTransaction5 = null;
        nonFaculty3.removeFromRentalList(rentalTransaction5);
        java.lang.String str7 = nonFaculty3.getDepartment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setMajor("");
        java.util.List<userManagement.RentalTransaction> rentalTransactionList7 = nonFaculty3.getRentalList();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(rentalTransactionList7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setYear(10);
        java.lang.String str7 = nonFaculty3.getDepartment();
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFaculty3.getRentalList();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        nonFaculty3.comprehensiveReport();
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = nonFaculty3.getRentalList();
        org.junit.Assert.assertNotNull(rentalTransactionList5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        java.lang.String str5 = nonFaculty3.getDepartment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 0, "hi!", (int) (short) 10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = nonFaculty3.getRentalList();
        org.junit.Assert.assertNotNull(rentalTransactionList4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        java.lang.String str4 = nonFaculty3.getEmail();
        int int5 = nonFaculty3.getYear();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        java.lang.String str4 = nonFaculty3.getEmail();
        userManagement.RentalTransaction rentalTransaction5 = null;
        nonFaculty3.removeFromRentalList(rentalTransaction5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList7 = nonFaculty3.getRentalList();
        int int8 = nonFaculty3.getYear();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(rentalTransactionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        java.lang.String str5 = nonFaculty3.getUsertype();
        nonFaculty3.setYear((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NonFaculty" + "'", str5, "NonFaculty");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setYear(10);
        java.lang.Class<?> wildcardClass7 = nonFaculty3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setMajor("");
        nonFaculty3.setYear((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        nonFaculty3.comprehensiveReport();
        java.lang.String str5 = nonFaculty3.getUsertype();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NonFaculty" + "'", str5, "NonFaculty");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) ' ', "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nonFaculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.NonFaculty nonFaculty3 = new userManagement.NonFaculty((int) (short) 1, "", (int) (short) -1);
        int int4 = nonFaculty3.getYear();
        nonFaculty3.setYear(10);
        java.lang.String str7 = nonFaculty3.getDepartment();
        java.lang.String str8 = nonFaculty3.getMajor();
        java.lang.String str9 = nonFaculty3.getDepartment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }
}

