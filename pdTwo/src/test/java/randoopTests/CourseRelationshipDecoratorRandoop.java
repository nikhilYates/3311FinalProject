package randoopTests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseRelationshipDecoratorRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        java.lang.Class<?> wildcardClass4 = courseRelationshipDecorator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        java.lang.String str5 = courseRelationshipDecorator1.getCourse();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("hi!");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        java.lang.Class<?> wildcardClass5 = courseRelationshipDecorator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        courseRelationshipDecorator1.setCourse("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("hi!");
        java.lang.String str4 = courseRelationshipDecorator1.getCourse();
        courseRelationshipDecorator1.setCourse("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        java.lang.String str5 = courseRelationshipDecorator4.getCourse();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        courseRelationshipDecorator1.setCourse("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator2 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        java.lang.Class<?> wildcardClass3 = courseRelationshipDecorator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        java.lang.Class<?> wildcardClass5 = courseRelationshipDecorator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator2 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        courseRelationshipDecorator1.setCourse("");
        java.lang.String str5 = courseRelationshipDecorator1.getCourse();
        java.lang.String str6 = courseRelationshipDecorator1.getCourse();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator2 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        courseRelationshipDecorator1.setCourse("");
        java.lang.String str5 = courseRelationshipDecorator1.getCourse();
        java.lang.Class<?> wildcardClass6 = courseRelationshipDecorator1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator2 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        courseRelationshipDecorator1.setCourse("");
        java.lang.String str5 = courseRelationshipDecorator1.getCourse();
        courseRelationshipDecorator1.setCourse("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("");
        java.lang.String str4 = courseRelationshipDecorator1.getCourse();
        java.lang.Class<?> wildcardClass5 = courseRelationshipDecorator1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("hi!");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator5 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.DigitalItem digitalItem0 = null;
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator1 = new itemManagement.CourseRelationshipDecorator(digitalItem0);
        courseRelationshipDecorator1.setCourse("hi!");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator4 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator1);
        courseRelationshipDecorator4.setCourse("");
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator7 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator4);
        itemManagement.CourseRelationshipDecorator courseRelationshipDecorator8 = new itemManagement.CourseRelationshipDecorator((itemManagement.DigitalItem) courseRelationshipDecorator4);
        java.lang.Class<?> wildcardClass9 = courseRelationshipDecorator8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

