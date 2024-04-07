package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentalRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.lang.Class<?> wildcardClass4 = rental3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = null;
        rental3.setRentDate(date4);
        java.lang.Class<?> wildcardClass6 = rental3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = null;
        rental3.setItem(item4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        java.util.Date date5 = rental3.getDueDate();
        java.util.Date date6 = null;
        rental3.setRentDate(date6);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = rental3.getDueDate();
        itemManagement.Item item5 = rental3.getItem();
        java.util.Date date6 = rental3.getDueDate();
        java.util.Date date7 = null;
        rental3.setDueDate(date7);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = rental3.getRentDate();
        java.util.Date date5 = rental3.getDueDate();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        java.util.Date date5 = rental3.getDueDate();
        java.util.Date date6 = rental3.getRentDate();
        java.util.Date date7 = rental3.getDueDate();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        itemManagement.Item item5 = null;
        rental3.setItem(item5);
        java.util.Date date7 = null;
        rental3.setDueDate(date7);
        java.lang.Class<?> wildcardClass9 = rental3.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = rental3.getDueDate();
        itemManagement.Item item5 = rental3.getItem();
        itemManagement.Item item6 = rental3.getItem();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = rental3.getDueDate();
        itemManagement.Item item5 = rental3.getItem();
        java.util.Date date6 = rental3.getDueDate();
        itemManagement.Item item7 = rental3.getItem();
        itemManagement.Item item8 = null;
        rental3.setItem(item8);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        itemManagement.Item item5 = null;
        rental3.setItem(item5);
        java.lang.Class<?> wildcardClass7 = rental3.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        java.util.Date date5 = rental3.getDueDate();
        java.util.Date date6 = rental3.getRentDate();
        itemManagement.Item item7 = rental3.getItem();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = null;
        rental3.setRentDate(date4);
        itemManagement.Item item6 = rental3.getItem();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        itemManagement.Item item4 = rental3.getItem();
        java.util.Date date5 = rental3.getDueDate();
        java.util.Date date6 = rental3.getRentDate();
        java.util.Date date7 = null;
        rental3.setRentDate(date7);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = null;
        rental3.setRentDate(date4);
        java.util.Date date6 = null;
        rental3.setRentDate(date6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        itemManagement.Item item0 = null;
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        itemManagement.Rental rental3 = new itemManagement.Rental(item0, date1, date2);
        java.util.Date date4 = null;
        rental3.setRentDate(date4);
        itemManagement.Item item6 = null;
        rental3.setItem(item6);
        itemManagement.Item item8 = rental3.getItem();
        org.junit.Assert.assertNull(item8);
    }
}

