package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseRandoop {

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
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        java.lang.Class<?> wildcardClass4 = course2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseName("hi!");
        java.lang.String str6 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseName("hi!");
        java.lang.Class<?> wildcardClass6 = course2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Course course2 = new itemManagement.Course("hi!", "hi!");
        java.lang.String str3 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseID("hi!");
        course2.setCourseName("hi!");
        java.lang.String str8 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Course course2 = new itemManagement.Course("hi!", "hi!");
        course2.setCourseName("");
        course2.setCourseID("");
        course2.setCourseID("hi!");
        java.lang.Class<?> wildcardClass9 = course2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        course2.setCourseName("");
        course2.setCourseID("hi!");
        java.lang.String str7 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Course course2 = new itemManagement.Course("hi!", "hi!");
        course2.setCourseName("");
        course2.setCourseID("");
        course2.setCourseID("hi!");
        java.lang.String str9 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        course2.setCourseName("");
        java.lang.String str5 = course2.getCourseID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseName("");
        course2.setCourseID("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseID("hi!");
        course2.setCourseName("hi!");
        course2.setCourseID("");
        java.lang.Class<?> wildcardClass10 = course2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.Course course2 = new itemManagement.Course("hi!", "hi!");
        course2.setCourseName("");
        course2.setCourseName("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseName("");
        java.lang.Class<?> wildcardClass6 = course2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseID("hi!");
        course2.setCourseName("hi!");
        course2.setCourseName("");
        course2.setCourseName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.Course course2 = new itemManagement.Course("", "");
        java.lang.String str3 = course2.getCourseName();
        course2.setCourseID("hi!");
        java.lang.String str6 = course2.getCourseName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

