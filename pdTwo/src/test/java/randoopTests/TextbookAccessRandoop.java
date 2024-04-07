package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextbookAccessRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.lang.Class<?> wildcardClass2 = textbookAccess1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.lang.String str2 = textbookAccess1.getStudentID();
        itemManagement.Textbook textbook3 = null;
        // The following exception was thrown during execution in test generation
        try {
            textbookAccess1.removeAccess(textbook3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.remove(Object)\" because \"this.textbooks\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.lang.String str2 = textbookAccess1.getStudentID();
        itemManagement.Course[] courseArray3 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList4 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList4, courseArray3);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList4);
        itemManagement.Textbook textbook7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textbookAccess1.removeAccess(textbook7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.remove(Object)\" because \"this.textbooks\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(courseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        itemManagement.Textbook[] textbookArray6 = new itemManagement.Textbook[] {};
        java.util.ArrayList<itemManagement.Textbook> textbookList7 = new java.util.ArrayList<itemManagement.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<itemManagement.Textbook>) textbookList7, textbookArray6);
        textbookAccess1.setTextbooks((java.util.List<itemManagement.Textbook>) textbookList7);
        java.util.List<itemManagement.Textbook> textbookList10 = textbookAccess1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = textbookAccess1.getClass();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertNotNull(textbookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        itemManagement.Textbook[] textbookArray6 = new itemManagement.Textbook[] {};
        java.util.ArrayList<itemManagement.Textbook> textbookList7 = new java.util.ArrayList<itemManagement.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<itemManagement.Textbook>) textbookList7, textbookArray6);
        textbookAccess1.setTextbooks((java.util.List<itemManagement.Textbook>) textbookList7);
        java.lang.String str10 = textbookAccess1.getStudentID();
        itemManagement.Textbook textbook11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textbookAccess1.removeAccess(textbook11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Textbook.getTitle()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertNotNull(textbookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList4 = textbookAccess1.getCoursesEnrolled();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        itemManagement.TextbookAccess textbookAccess5 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList7 = textbookAccess5.listMyCourses("hi!");
        itemManagement.Course[] courseArray8 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList9 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList9, courseArray8);
        textbookAccess5.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList9);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList9);
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList7);
        org.junit.Assert.assertNotNull(courseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        itemManagement.Textbook[] textbookArray6 = new itemManagement.Textbook[] {};
        java.util.ArrayList<itemManagement.Textbook> textbookList7 = new java.util.ArrayList<itemManagement.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<itemManagement.Textbook>) textbookList7, textbookArray6);
        textbookAccess1.setTextbooks((java.util.List<itemManagement.Textbook>) textbookList7);
        java.lang.String str10 = textbookAccess1.getStudentID();
        java.util.List<itemManagement.Textbook> textbookList11 = textbookAccess1.getTextbooks();
        java.lang.String str12 = textbookAccess1.getStudentID();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertNotNull(textbookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        itemManagement.Course[] courseArray4 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList5 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList5, courseArray4);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList5);
        java.util.List<itemManagement.Textbook> textbookList9 = textbookAccess1.listTextbooks("hi!");
        java.util.List<itemManagement.Textbook> textbookList11 = textbookAccess1.listTextbooks("");
        itemManagement.TextbookAccess textbookAccess13 = new itemManagement.TextbookAccess("hi!");
        java.lang.String str14 = textbookAccess13.getStudentID();
        itemManagement.Course[] courseArray15 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList16 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList16, courseArray15);
        textbookAccess13.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList16);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList16);
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNotNull(courseArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(textbookList9);
        org.junit.Assert.assertNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        java.lang.String str6 = textbookAccess1.getStudentID();
        java.lang.String str7 = textbookAccess1.getStudentID();
        java.util.List<itemManagement.Textbook> textbookList9 = textbookAccess1.listTextbooks("");
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(textbookList9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        java.lang.String str6 = textbookAccess1.getStudentID();
        java.lang.String str7 = textbookAccess1.getStudentID();
        java.lang.Class<?> wildcardClass8 = textbookAccess1.getClass();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        textbookAccess1.accessTextbook("hi!");
        org.junit.Assert.assertNull(courseList3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        java.lang.String str6 = textbookAccess1.getStudentID();
        itemManagement.TextbookAccess textbookAccess8 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList10 = textbookAccess8.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList12 = textbookAccess8.listMyCourses("");
        itemManagement.Textbook[] textbookArray13 = new itemManagement.Textbook[] {};
        java.util.ArrayList<itemManagement.Textbook> textbookList14 = new java.util.ArrayList<itemManagement.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<itemManagement.Textbook>) textbookList14, textbookArray13);
        textbookAccess8.setTextbooks((java.util.List<itemManagement.Textbook>) textbookList14);
        java.lang.String str17 = textbookAccess8.getStudentID();
        java.util.List<itemManagement.Textbook> textbookList18 = textbookAccess8.getTextbooks();
        textbookAccess1.setTextbooks(textbookList18);
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(courseList10);
        org.junit.Assert.assertNull(courseList12);
        org.junit.Assert.assertNotNull(textbookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        itemManagement.Course[] courseArray4 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList5 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList5, courseArray4);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList5);
        java.util.List<itemManagement.Textbook> textbookList9 = textbookAccess1.listTextbooks("hi!");
        java.util.List<itemManagement.Textbook> textbookList11 = textbookAccess1.listTextbooks("");
        java.lang.Class<?> wildcardClass12 = textbookAccess1.getClass();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNotNull(courseArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(textbookList9);
        org.junit.Assert.assertNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        itemManagement.Course[] courseArray4 = new itemManagement.Course[] {};
        java.util.ArrayList<itemManagement.Course> courseList5 = new java.util.ArrayList<itemManagement.Course>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<itemManagement.Course>) courseList5, courseArray4);
        textbookAccess1.setCoursesEnrolled((java.util.List<itemManagement.Course>) courseList5);
        java.util.List<itemManagement.Textbook> textbookList9 = textbookAccess1.listTextbooks("hi!");
        java.util.List<itemManagement.Textbook> textbookList11 = textbookAccess1.listTextbooks("");
        itemManagement.Textbook textbook12 = null;
        // The following exception was thrown during execution in test generation
        try {
            textbookAccess1.removeAccess(textbook12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.remove(Object)\" because \"this.textbooks\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNotNull(courseArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(textbookList9);
        org.junit.Assert.assertNull(textbookList11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.TextbookAccess textbookAccess1 = new itemManagement.TextbookAccess("hi!");
        java.util.List<itemManagement.Course> courseList3 = textbookAccess1.listMyCourses("hi!");
        java.util.List<itemManagement.Course> courseList5 = textbookAccess1.listMyCourses("");
        itemManagement.Textbook[] textbookArray6 = new itemManagement.Textbook[] {};
        java.util.ArrayList<itemManagement.Textbook> textbookList7 = new java.util.ArrayList<itemManagement.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<itemManagement.Textbook>) textbookList7, textbookArray6);
        textbookAccess1.setTextbooks((java.util.List<itemManagement.Textbook>) textbookList7);
        java.lang.Class<?> wildcardClass10 = textbookAccess1.getClass();
        org.junit.Assert.assertNull(courseList3);
        org.junit.Assert.assertNull(courseList5);
        org.junit.Assert.assertNotNull(textbookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

