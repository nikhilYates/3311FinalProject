package randoopTests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseManagementRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        courseManagement1.notifyUnavailability("");
        java.lang.Class<?> wildcardClass4 = courseManagement1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyNewEditions("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        java.util.List<itemManagement.Textbook> textbookList6 = courseManagement1.getTextbooksUsed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textbookList6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyNewEditions("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        courseManagement1.trackCourses("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyUnavailability("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        courseManagement1.notifyUnavailability("hi!");
        courseManagement1.trackCourses("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyNewEditions("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        java.lang.String str6 = courseManagement1.getFacultyID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyUnavailability("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        courseManagement1.trackCourses("");
        java.lang.String str8 = courseManagement1.getFacultyID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.util.List<itemManagement.Textbook> textbookList2 = courseManagement1.getTextbooksUsed();
        courseManagement1.notifyUnavailability("hi!");
        courseManagement1.notifyUnavailability("");
        org.junit.Assert.assertNotNull(textbookList2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        courseManagement1.notifyUnavailability("");
        java.util.List<itemManagement.Course> courseList4 = courseManagement1.getCoursesTaught();
        java.lang.Class<?> wildcardClass5 = courseList4.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.util.List<itemManagement.Textbook> textbookList2 = courseManagement1.getTextbooksUsed();
        courseManagement1.notifyUnavailability("");
        courseManagement1.notifyNewEditions("");
        org.junit.Assert.assertNotNull(textbookList2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        courseManagement1.notifyUnavailability("");
        courseManagement1.trackCourses("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.Class<?> wildcardClass2 = courseManagement1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.util.List<itemManagement.Textbook> textbookList2 = courseManagement1.getTextbooksUsed();
        courseManagement1.notifyUnavailability("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        java.lang.String str6 = courseManagement1.getFacultyID();
        java.util.List<itemManagement.Course> courseList7 = courseManagement1.getCoursesTaught();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.lang.String str2 = courseManagement1.getFacultyID();
        courseManagement1.notifyUnavailability("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        java.lang.Class<?> wildcardClass6 = courseManagement1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.CourseManagement courseManagement1 = new itemManagement.CourseManagement("");
        java.util.List<itemManagement.Textbook> textbookList2 = courseManagement1.getTextbooksUsed();
        courseManagement1.notifyUnavailability("");
        java.lang.String str5 = courseManagement1.getFacultyID();
        java.lang.String str6 = courseManagement1.getFacultyID();
        courseManagement1.notifyUnavailability("hi!");
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

