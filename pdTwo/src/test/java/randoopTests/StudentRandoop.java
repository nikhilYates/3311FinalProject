package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRandoop {

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
        userManagement.Student student5 = new userManagement.Student((int) 'a', "", 100, "hi!", (int) (byte) 10);
        userManagement.RentalTransaction rentalTransaction6 = null;
        student5.removeFromRentalList(rentalTransaction6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.Student student5 = new userManagement.Student((int) (short) 0, "hi!", (int) (short) 10, "", (int) (short) 10);
        student5.comprehensiveReport();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.Student student5 = new userManagement.Student((int) (short) 0, "hi!", (int) (short) 10, "", (int) (short) 10);
        student5.comprehensiveReport();
        java.lang.String str7 = student5.getEmail();
        int int8 = student5.getUserID();
        student5.setDepartment("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.Student student5 = new userManagement.Student((int) 'a', "", 100, "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        student5.setDepartment("");
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = student5.getRentalList();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        student5.setDepartment("");
        student5.comprehensiveReport();
        student5.setDepartment("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = student5.getRentalList();
        org.junit.Assert.assertNotNull(rentalTransactionList6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        student5.setDepartment("");
        student5.comprehensiveReport();
        student5.setDepartment("");
        java.lang.String str11 = student5.getDepartment();
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.Student student5 = new userManagement.Student((int) 'a', "", 100, "hi!", (int) (byte) 10);
        java.lang.String str6 = student5.getEmail();
        student5.comprehensiveReport();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.Student student5 = new userManagement.Student((-1), "hi!", 100, "hi!", 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.Student student5 = new userManagement.Student((int) (short) 0, "hi!", (int) (short) 10, "", (int) (short) 10);
        student5.comprehensiveReport();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUsertype();
        java.util.List<userManagement.RentalTransaction> rentalTransactionList9 = student5.getRentalList();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(rentalTransactionList9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        student5.setDepartment("");
        student5.comprehensiveReport();
        java.util.List<userManagement.RentalTransaction> rentalTransactionList9 = student5.getRentalList();
        org.junit.Assert.assertNotNull(rentalTransactionList9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.Student student5 = new userManagement.Student((int) (short) 0, "hi!", (int) (short) 10, "", (int) (short) 10);
        student5.comprehensiveReport();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUsertype();
        student5.comprehensiveReport();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.Student student5 = new userManagement.Student((int) (byte) 10, "Student", (int) (byte) 100, "", (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.Student student5 = new userManagement.Student((int) (byte) 100, "", (int) ' ', "hi!", (int) (byte) 1);
        java.lang.String str6 = student5.getMajor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        userManagement.Student student5 = new userManagement.Student((int) ' ', "hi!", (int) (byte) 100, "", 0);
        student5.setDepartment("");
        student5.comprehensiveReport();
        student5.setDepartment("Student");
    }
}

