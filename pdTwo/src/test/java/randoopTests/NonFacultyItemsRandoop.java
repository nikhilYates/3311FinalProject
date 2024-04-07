package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonFacultyItemsRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = nonFacultyItems0.rentalDueSoonPrompt(rentalTransaction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getDueDate()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = nonFacultyItems0.checkRentalAbility(rentalTransactionList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.size()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems1 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = nonFacultyItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.lang.Class<?> wildcardClass7 = rentalTransactionList3.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyItems0.updatePhysicalItemInventory(rentalTransaction5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems1 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = nonFacultyItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.NonFacultyItems nonFacultyItems7 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems8 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = nonFacultyItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = nonFacultyItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        boolean boolean14 = nonFacultyItems0.checkRentalAbility(rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = nonFacultyItems0.checkRentalAbility(rentalTransactionList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.size()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.NonFacultyItems nonFacultyItems6 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems7 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        boolean boolean11 = nonFacultyItems7.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = nonFacultyItems6.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        nonFacultyItems0.returnItem((int) (byte) 100, rentalTransactionList12);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyItems0.returnItem(1, rentalTransactionList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems11 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = nonFacultyItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = nonFacultyItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.NonFacultyItems nonFacultyItems17 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems18 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = nonFacultyItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = nonFacultyItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.NonFacultyItems nonFacultyItems24 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems25 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = nonFacultyItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = nonFacultyItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = nonFacultyItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.NonFacultyItems nonFacultyItems34 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems36 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems37 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray38 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList39 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList39, rentalTransactionArray38);
        boolean boolean41 = nonFacultyItems37.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList39);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList42 = nonFacultyItems36.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList39);
        nonFacultyItems34.returnItem((int) (byte) 0, rentalTransactionList42);
        userManagement.NonFacultyItems nonFacultyItems44 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems45 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray46 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList47 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList47, rentalTransactionArray46);
        boolean boolean49 = nonFacultyItems45.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList47);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList50 = nonFacultyItems44.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList47);
        userManagement.NonFacultyItems nonFacultyItems51 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems52 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray53 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList54 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList54, rentalTransactionArray53);
        boolean boolean56 = nonFacultyItems52.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList54);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList57 = nonFacultyItems51.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList54);
        userManagement.NonFacultyItems nonFacultyItems58 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems59 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray60 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList61 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList61, rentalTransactionArray60);
        boolean boolean63 = nonFacultyItems59.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList61);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList64 = nonFacultyItems58.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList61);
        boolean boolean65 = nonFacultyItems51.checkRentalAbility(rentalTransactionList64);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList66 = nonFacultyItems44.getCurrentHardcoverRentals(rentalTransactionList64);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList67 = nonFacultyItems34.getCurrentHardcoverRentals(rentalTransactionList66);
        double double68 = nonFacultyItems0.calculateLateFees(rentalTransactionList66);
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList16);
        org.junit.Assert.assertNotNull(rentalTransactionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList23);
        org.junit.Assert.assertNotNull(rentalTransactionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList42);
        org.junit.Assert.assertNotNull(rentalTransactionArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList50);
        org.junit.Assert.assertNotNull(rentalTransactionArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList57);
        org.junit.Assert.assertNotNull(rentalTransactionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList66);
        org.junit.Assert.assertNotNull(rentalTransactionList67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems1 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = nonFacultyItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.NonFacultyItems nonFacultyItems7 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems8 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = nonFacultyItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = nonFacultyItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        userManagement.NonFacultyItems nonFacultyItems14 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems15 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray16 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList17 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList17, rentalTransactionArray16);
        boolean boolean19 = nonFacultyItems15.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList17);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList20 = nonFacultyItems14.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList17);
        boolean boolean21 = nonFacultyItems7.checkRentalAbility(rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList22 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList20);
        java.lang.Class<?> wildcardClass23 = nonFacultyItems0.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList13);
        org.junit.Assert.assertNotNull(rentalTransactionArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems12 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems13 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray14 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList15 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList15, rentalTransactionArray14);
        boolean boolean17 = nonFacultyItems13.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList15);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList18 = nonFacultyItems12.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList15);
        nonFacultyItems10.returnItem((int) (byte) 0, rentalTransactionList18);
        userManagement.NonFacultyItems nonFacultyItems20 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems21 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray22 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList23 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList23, rentalTransactionArray22);
        boolean boolean25 = nonFacultyItems21.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList23);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList26 = nonFacultyItems20.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList23);
        userManagement.NonFacultyItems nonFacultyItems27 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems28 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray29 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList30 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList30, rentalTransactionArray29);
        boolean boolean32 = nonFacultyItems28.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems27.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList30);
        userManagement.NonFacultyItems nonFacultyItems34 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems35 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray36 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList37 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList37, rentalTransactionArray36);
        boolean boolean39 = nonFacultyItems35.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList37);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList40 = nonFacultyItems34.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList37);
        boolean boolean41 = nonFacultyItems27.checkRentalAbility(rentalTransactionList40);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList42 = nonFacultyItems20.getCurrentHardcoverRentals(rentalTransactionList40);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList43 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList42);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList44 = nonFacultyItems0.countOverdueItems(rentalTransactionList42);
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList18);
        org.junit.Assert.assertNotNull(rentalTransactionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList26);
        org.junit.Assert.assertNotNull(rentalTransactionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList42);
        org.junit.Assert.assertNotNull(rentalTransactionList43);
        org.junit.Assert.assertNotNull(rentalTransactionList44);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        java.lang.Class<?> wildcardClass10 = nonFacultyItems0.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems11 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = nonFacultyItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = nonFacultyItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.NonFacultyItems nonFacultyItems17 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems18 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = nonFacultyItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = nonFacultyItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.NonFacultyItems nonFacultyItems24 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems25 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = nonFacultyItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = nonFacultyItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = nonFacultyItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.NonFacultyItems nonFacultyItems34 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray35 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList36 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList36, rentalTransactionArray35);
        boolean boolean38 = nonFacultyItems34.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList39 = nonFacultyItems0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        userManagement.RentalTransaction rentalTransaction40 = null;
        userManagement.NonFacultyItems nonFacultyItems41 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems42 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray43 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList44 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList44, rentalTransactionArray43);
        boolean boolean46 = nonFacultyItems42.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList44);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList47 = nonFacultyItems41.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList44);
        userManagement.NonFacultyItems nonFacultyItems48 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems49 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray50 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList51 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList51, rentalTransactionArray50);
        boolean boolean53 = nonFacultyItems49.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList51);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList54 = nonFacultyItems48.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList51);
        userManagement.NonFacultyItems nonFacultyItems55 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems56 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray57 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList58 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList58, rentalTransactionArray57);
        boolean boolean60 = nonFacultyItems56.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList58);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList61 = nonFacultyItems55.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList58);
        boolean boolean62 = nonFacultyItems48.checkRentalAbility(rentalTransactionList61);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList63 = nonFacultyItems41.getCurrentHardcoverRentals(rentalTransactionList61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = nonFacultyItems0.rentPhysicalItem(rentalTransaction40, rentalTransactionList61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList16);
        org.junit.Assert.assertNotNull(rentalTransactionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList23);
        org.junit.Assert.assertNotNull(rentalTransactionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList39);
        org.junit.Assert.assertNotNull(rentalTransactionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList47);
        org.junit.Assert.assertNotNull(rentalTransactionArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList54);
        org.junit.Assert.assertNotNull(rentalTransactionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList63);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"rentalList\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        userManagement.NonFacultyItems nonFacultyItems6 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems7 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        boolean boolean11 = nonFacultyItems7.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = nonFacultyItems6.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = nonFacultyItems0.rentPhysicalItem(rentalTransaction5, rentalTransactionList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList12);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems11 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = nonFacultyItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = nonFacultyItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.NonFacultyItems nonFacultyItems17 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems18 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = nonFacultyItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = nonFacultyItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.NonFacultyItems nonFacultyItems24 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems25 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = nonFacultyItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = nonFacultyItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = nonFacultyItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        java.lang.Class<?> wildcardClass34 = rentalTransactionList33.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList16);
        org.junit.Assert.assertNotNull(rentalTransactionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList23);
        org.junit.Assert.assertNotNull(rentalTransactionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = nonFacultyItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        userManagement.NonFacultyItems nonFacultyItems6 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems8 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems9 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray10 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList11 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList11, rentalTransactionArray10);
        boolean boolean13 = nonFacultyItems9.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList11);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList14 = nonFacultyItems8.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList11);
        nonFacultyItems6.returnItem((int) (byte) 0, rentalTransactionList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = nonFacultyItems0.rentPhysicalItem(rentalTransaction5, rentalTransactionList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList14);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems11 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = nonFacultyItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = nonFacultyItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.NonFacultyItems nonFacultyItems17 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems18 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = nonFacultyItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = nonFacultyItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.NonFacultyItems nonFacultyItems24 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems25 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = nonFacultyItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = nonFacultyItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = nonFacultyItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.RentalTransaction[] rentalTransactionArray34 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList35 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList35, rentalTransactionArray34);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList37 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList35);
        userManagement.NonFacultyItems nonFacultyItems39 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems40 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray41 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList42 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList42, rentalTransactionArray41);
        boolean boolean44 = nonFacultyItems40.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList42);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList45 = nonFacultyItems39.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList42);
        userManagement.NonFacultyItems nonFacultyItems46 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems47 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray48 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList49 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList49, rentalTransactionArray48);
        boolean boolean51 = nonFacultyItems47.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList49);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList52 = nonFacultyItems46.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList49);
        boolean boolean53 = nonFacultyItems39.checkRentalAbility(rentalTransactionList52);
        nonFacultyItems0.returnItem((-1), rentalTransactionList52);
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList16);
        org.junit.Assert.assertNotNull(rentalTransactionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList23);
        org.junit.Assert.assertNotNull(rentalTransactionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(rentalTransactionList37);
        org.junit.Assert.assertNotNull(rentalTransactionArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList45);
        org.junit.Assert.assertNotNull(rentalTransactionArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems1 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = nonFacultyItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.RentalTransaction rentalTransaction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyItems0.updatePhysicalItemInventory(rentalTransaction7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems1 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = nonFacultyItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = nonFacultyItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.NonFacultyItems nonFacultyItems7 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems8 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = nonFacultyItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = nonFacultyItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        boolean boolean14 = nonFacultyItems0.checkRentalAbility(rentalTransactionList13);
        userManagement.RentalTransaction rentalTransaction15 = null;
        userManagement.NonFacultyItems nonFacultyItems16 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray17 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList18 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList18, rentalTransactionArray17);
        boolean boolean20 = nonFacultyItems16.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = nonFacultyItems0.rentPhysicalItem(rentalTransaction15, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.RentalTransaction.getItemid()\" because \"physicalItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalTransactionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList6);
        org.junit.Assert.assertNotNull(rentalTransactionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rentalTransactionArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        userManagement.NonFacultyItems nonFacultyItems0 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems2 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems3 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = nonFacultyItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = nonFacultyItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        nonFacultyItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.NonFacultyItems nonFacultyItems10 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems11 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = nonFacultyItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = nonFacultyItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.NonFacultyItems nonFacultyItems17 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems18 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = nonFacultyItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = nonFacultyItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.NonFacultyItems nonFacultyItems24 = new userManagement.NonFacultyItems();
        userManagement.NonFacultyItems nonFacultyItems25 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = nonFacultyItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = nonFacultyItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = nonFacultyItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = nonFacultyItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = nonFacultyItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.NonFacultyItems nonFacultyItems34 = new userManagement.NonFacultyItems();
        userManagement.RentalTransaction[] rentalTransactionArray35 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList36 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList36, rentalTransactionArray35);
        boolean boolean38 = nonFacultyItems34.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList39 = nonFacultyItems0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        java.lang.Class<?> wildcardClass40 = rentalTransactionList36.getClass();
        org.junit.Assert.assertNotNull(rentalTransactionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList8);
        org.junit.Assert.assertNotNull(rentalTransactionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList16);
        org.junit.Assert.assertNotNull(rentalTransactionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList23);
        org.junit.Assert.assertNotNull(rentalTransactionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList32);
        org.junit.Assert.assertNotNull(rentalTransactionList33);
        org.junit.Assert.assertNotNull(rentalTransactionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(rentalTransactionList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }
}

