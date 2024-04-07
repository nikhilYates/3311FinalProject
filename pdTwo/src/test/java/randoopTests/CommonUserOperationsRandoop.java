package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonUserOperationsRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = commonUserOperations0.checkRentalAbility(rentalTransactionList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.size()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        java.lang.Class<?> wildcardClass7 = rentalTransactionList5.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = commonUserOperations0.checkRentalAbility(rentalTransactionList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.size()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = commonUserOperations0.rentalDueSoonPrompt(rentalTransaction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getDueDate()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<userManagement.RentalTransaction> rentalTransactionList14 = commonUserOperations0.countOverdueItems(rentalTransactionList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        userManagement.RentalTransaction rentalTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonUserOperations0.updatePhysicalItemInventory(rentalTransaction13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        java.lang.Class<?> wildcardClass13 = rentalTransactionList11.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        java.lang.Class<?> wildcardClass5 = commonUserOperations0.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction[] rentalTransactionArray6 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList7 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList7, rentalTransactionArray6);
        commonUserOperations0.returnItem((int) (short) 1, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList7);
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
        org.junit.Assert.assertNotNull(rentalTransactionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        userManagement.CommonUserOperations commonUserOperations13 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations14 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray15 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList16 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList16, rentalTransactionArray15);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList18 = commonUserOperations14.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList16);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList19 = commonUserOperations13.getCurrentHardcoverRentals(rentalTransactionList18);
        userManagement.CommonUserOperations commonUserOperations20 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray21 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList22 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList22, rentalTransactionArray21);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList24 = commonUserOperations20.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList22);
        boolean boolean25 = commonUserOperations13.checkRentalAbility(rentalTransactionList24);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList26 = commonUserOperations0.countOverdueItems(rentalTransactionList24);
        userManagement.CommonUserOperations commonUserOperations27 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations28 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray29 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList30 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList30, rentalTransactionArray29);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = commonUserOperations28.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = commonUserOperations27.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.CommonUserOperations commonUserOperations34 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray35 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList36 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList36, rentalTransactionArray35);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList38 = commonUserOperations34.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        boolean boolean39 = commonUserOperations27.checkRentalAbility(rentalTransactionList38);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList40 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList38);
        userManagement.CommonUserOperations commonUserOperations41 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray43 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList44 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList44, rentalTransactionArray43);
        commonUserOperations41.returnItem((int) (byte) 100, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList44);
        userManagement.RentalTransaction[] rentalTransactionArray47 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList48 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList48, rentalTransactionArray47);
        boolean boolean50 = commonUserOperations41.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList48);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList51 = commonUserOperations0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList48);
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList18);
        org.junit.Assert.assertNotNull(rentalTransactionList19);
        org.junit.Assert.assertNotNull(rentalTransactionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList26);
        org.junit.Assert.assertNotNull(rentalTransactionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList40);
        org.junit.Assert.assertNotNull(rentalTransactionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(rentalTransactionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList51);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonUserOperations0.returnItem((int) (byte) 0, rentalTransactionList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList4 = commonUserOperations0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        userManagement.CommonUserOperations commonUserOperations6 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        commonUserOperations6.returnItem((int) (byte) 100, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        double double15 = commonUserOperations6.calculateLateFees((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = commonUserOperations0.rentPhysicalItem(rentalTransaction5, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList4);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        commonUserOperations0.returnItem((int) (byte) 100, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.RentalTransaction[] rentalTransactionArray6 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList7 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList7, rentalTransactionArray6);
        boolean boolean9 = commonUserOperations0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList7);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = commonUserOperations0.calculateLateFees(rentalTransactionList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations8 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = commonUserOperations8.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = commonUserOperations7.getCurrentHardcoverRentals(rentalTransactionList12);
        userManagement.CommonUserOperations commonUserOperations14 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray15 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList16 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList16, rentalTransactionArray15);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList18 = commonUserOperations14.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList16);
        boolean boolean19 = commonUserOperations7.checkRentalAbility(rentalTransactionList18);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList20 = commonUserOperations0.countOverdueItems(rentalTransactionList18);
        userManagement.CommonUserOperations commonUserOperations21 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray23 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList24 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList24, rentalTransactionArray23);
        commonUserOperations21.returnItem((int) (byte) 100, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList24);
        userManagement.CommonUserOperations commonUserOperations27 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations28 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations29 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray30 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList31 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList31, rentalTransactionArray30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = commonUserOperations29.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList31);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList34 = commonUserOperations28.getCurrentHardcoverRentals(rentalTransactionList33);
        boolean boolean35 = commonUserOperations27.checkRentalAbility(rentalTransactionList34);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList36 = commonUserOperations21.getCurrentHardcoverRentals(rentalTransactionList34);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList37 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList34);
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList12);
        org.junit.Assert.assertNotNull(rentalTransactionList13);
        org.junit.Assert.assertNotNull(rentalTransactionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList20);
        org.junit.Assert.assertNotNull(rentalTransactionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rentalTransactionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList36);
        org.junit.Assert.assertNotNull(rentalTransactionList37);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations8 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = commonUserOperations8.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = commonUserOperations7.getCurrentHardcoverRentals(rentalTransactionList12);
        userManagement.CommonUserOperations commonUserOperations14 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray15 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList16 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList16, rentalTransactionArray15);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList18 = commonUserOperations14.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList16);
        boolean boolean19 = commonUserOperations7.checkRentalAbility(rentalTransactionList18);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList20 = commonUserOperations0.countOverdueItems(rentalTransactionList18);
        userManagement.RentalTransaction[] rentalTransactionArray21 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList22 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList22, rentalTransactionArray21);
        double double24 = commonUserOperations0.calculateLateFees((java.util.List<userManagement.RentalTransaction>) rentalTransactionList22);
        userManagement.CommonUserOperations commonUserOperations25 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations26 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray27 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList28 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList28, rentalTransactionArray27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = commonUserOperations26.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList28);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList31 = commonUserOperations25.getCurrentHardcoverRentals(rentalTransactionList30);
        userManagement.CommonUserOperations commonUserOperations32 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray33 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList34 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList34, rentalTransactionArray33);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList36 = commonUserOperations32.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList34);
        boolean boolean37 = commonUserOperations25.checkRentalAbility(rentalTransactionList36);
        userManagement.CommonUserOperations commonUserOperations38 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations39 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray40 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList41 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList41, rentalTransactionArray40);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList43 = commonUserOperations39.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList41);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList44 = commonUserOperations38.getCurrentHardcoverRentals(rentalTransactionList43);
        userManagement.CommonUserOperations commonUserOperations45 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray46 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList47 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList47, rentalTransactionArray46);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList49 = commonUserOperations45.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList47);
        boolean boolean50 = commonUserOperations38.checkRentalAbility(rentalTransactionList49);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList51 = commonUserOperations25.countOverdueItems(rentalTransactionList49);
        boolean boolean52 = commonUserOperations0.checkRentalAbility(rentalTransactionList49);
        userManagement.RentalTransaction rentalTransaction53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = commonUserOperations0.rentalDueSoonPrompt(rentalTransaction53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getDueDate()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList12);
        org.junit.Assert.assertNotNull(rentalTransactionList13);
        org.junit.Assert.assertNotNull(rentalTransactionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList20);
        org.junit.Assert.assertNotNull(rentalTransactionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(rentalTransactionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertNotNull(rentalTransactionList31);
        org.junit.Assert.assertNotNull(rentalTransactionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList43);
        org.junit.Assert.assertNotNull(rentalTransactionList44);
        org.junit.Assert.assertNotNull(rentalTransactionArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.CommonUserOperations commonUserOperations0 = new userManagement.CommonUserOperations();
        userManagement.CommonUserOperations commonUserOperations1 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = commonUserOperations1.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = commonUserOperations0.getCurrentHardcoverRentals(rentalTransactionList5);
        userManagement.CommonUserOperations commonUserOperations7 = new userManagement.CommonUserOperations();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = commonUserOperations7.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        boolean boolean12 = commonUserOperations0.checkRentalAbility(rentalTransactionList11);
        userManagement.RentalTransaction rentalTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = commonUserOperations0.rentalDueSoonPrompt(rentalTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getDueDate()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList5);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}

