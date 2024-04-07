package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        java.lang.String str5 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userManagement.Faculty faculty4 = new userManagement.Faculty(0, "hi!", (int) (byte) 0, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getUsertype();
        java.lang.String str10 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getUsertype();
        java.lang.String str10 = faculty4.getUsertype();
        faculty4.setYear((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        int int5 = faculty4.getUserID();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        java.lang.String str7 = faculty4.getDepartment();
        faculty4.setYear((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 0, "hi!", (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getUsertype();
        java.lang.String str10 = faculty4.getUsertype();
        faculty4.setYear(10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        int int7 = faculty4.getYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        java.lang.String str7 = faculty4.getMajor();
        faculty4.setYear(10);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getUsertype();
        java.lang.String str10 = faculty4.getUsertype();
        int int11 = faculty4.getUserID();
        java.lang.String str12 = faculty4.getDepartment();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        int int5 = faculty4.getUserID();
        java.lang.String str6 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getUsertype();
        java.lang.String str10 = faculty4.getDepartment();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (short) 1, "", (int) (short) -1, "hi!");
        faculty4.setYear(10);
        faculty4.setMajor("");
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getDepartment();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        userManagement.Faculty faculty4 = new userManagement.Faculty((int) (byte) 100, "", (int) ' ', "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        userManagement.Faculty faculty4 = new userManagement.Faculty((-1), "hi!", 100, "hi!");
        faculty4.setMajor("");
    }
}

