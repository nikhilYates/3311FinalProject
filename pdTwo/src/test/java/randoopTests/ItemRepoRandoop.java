package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemRepoRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.PhysicalItem physicalItem0 = null;
        itemManagement.ItemRepo.addItem(physicalItem0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemManagement.ItemRepo.printList(physicalItemList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"allPhysicalItems\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = itemManagement.ItemRepo.allPhysicalItems;
        java.lang.Class<?> wildcardClass1 = physicalItemList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.ItemRepo.initializeWithDefaultItems();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.ItemRepo itemRepo0 = new itemManagement.ItemRepo();
        java.lang.Class<?> wildcardClass1 = itemRepo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.ItemRepo.reset();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.ItemRepo.searchItem("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.PhysicalItem[] physicalItemArray0 = new itemManagement.PhysicalItem[] {};
        java.util.ArrayList<itemManagement.PhysicalItem> physicalItemList1 = new java.util.ArrayList<itemManagement.PhysicalItem>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<itemManagement.PhysicalItem>) physicalItemList1, physicalItemArray0);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        java.lang.Class<?> wildcardClass6 = physicalItemList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = itemManagement.ItemRepo.allPhysicalItems;
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        java.lang.Class<?> wildcardClass3 = physicalItemList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemList0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = itemManagement.ItemRepo.allPhysicalItems;
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        java.lang.Class<?> wildcardClass4 = physicalItemList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemList0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.PhysicalItem[] physicalItemArray0 = new itemManagement.PhysicalItem[] {};
        java.util.ArrayList<itemManagement.PhysicalItem> physicalItemList1 = new java.util.ArrayList<itemManagement.PhysicalItem>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<itemManagement.PhysicalItem>) physicalItemList1, physicalItemArray0);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        java.lang.Class<?> wildcardClass5 = physicalItemList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = itemManagement.ItemRepo.allPhysicalItems;
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        java.lang.Class<?> wildcardClass6 = physicalItemList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemList0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.List<itemManagement.PhysicalItem> physicalItemList0 = itemManagement.ItemRepo.allPhysicalItems;
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        itemManagement.ItemRepo.printList(physicalItemList0);
        org.junit.Assert.assertNotNull(physicalItemList0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.PhysicalItem[] physicalItemArray0 = new itemManagement.PhysicalItem[] {};
        java.util.ArrayList<itemManagement.PhysicalItem> physicalItemList1 = new java.util.ArrayList<itemManagement.PhysicalItem>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<itemManagement.PhysicalItem>) physicalItemList1, physicalItemArray0);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        java.lang.Class<?> wildcardClass7 = physicalItemList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        itemManagement.PhysicalItem[] physicalItemArray0 = new itemManagement.PhysicalItem[] {};
        java.util.ArrayList<itemManagement.PhysicalItem> physicalItemList1 = new java.util.ArrayList<itemManagement.PhysicalItem>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<itemManagement.PhysicalItem>) physicalItemList1, physicalItemArray0);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        itemManagement.ItemRepo.printList((java.util.List<itemManagement.PhysicalItem>) physicalItemList1);
        org.junit.Assert.assertNotNull(physicalItemArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

