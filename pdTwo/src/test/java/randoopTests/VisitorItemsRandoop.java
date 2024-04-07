package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VisitorItemsRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = visitorItems0.rentalDueSoonPrompt(rentalTransaction5);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = visitorItems0.checkRentalAbility(rentalTransactionList5);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems1 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = visitorItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitorItems0.updatePhysicalItemInventory(rentalTransaction5, false);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems1 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = visitorItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.VisitorItems visitorItems7 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems8 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = visitorItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = visitorItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        boolean boolean14 = visitorItems0.checkRentalAbility(rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = visitorItems0.checkRentalAbility(rentalTransactionList15);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.VisitorItems visitorItems6 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems7 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        boolean boolean11 = visitorItems7.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = visitorItems6.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        visitorItems0.returnItem((int) (byte) 100, rentalTransactionList12);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitorItems0.returnItem(1, rentalTransactionList15);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems11 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = visitorItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = visitorItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.VisitorItems visitorItems17 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems18 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = visitorItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = visitorItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.VisitorItems visitorItems24 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems25 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = visitorItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = visitorItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = visitorItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.VisitorItems visitorItems34 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems36 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems37 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray38 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList39 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList39, rentalTransactionArray38);
        boolean boolean41 = visitorItems37.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList39);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList42 = visitorItems36.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList39);
        visitorItems34.returnItem((int) (byte) 0, rentalTransactionList42);
        userManagement.VisitorItems visitorItems44 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems45 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray46 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList47 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList47, rentalTransactionArray46);
        boolean boolean49 = visitorItems45.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList47);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList50 = visitorItems44.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList47);
        userManagement.VisitorItems visitorItems51 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems52 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray53 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList54 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList54, rentalTransactionArray53);
        boolean boolean56 = visitorItems52.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList54);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList57 = visitorItems51.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList54);
        userManagement.VisitorItems visitorItems58 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems59 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray60 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList61 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList61, rentalTransactionArray60);
        boolean boolean63 = visitorItems59.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList61);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList64 = visitorItems58.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList61);
        boolean boolean65 = visitorItems51.checkRentalAbility(rentalTransactionList64);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList66 = visitorItems44.getCurrentHardcoverRentals(rentalTransactionList64);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList67 = visitorItems34.getCurrentHardcoverRentals(rentalTransactionList66);
        double double68 = visitorItems0.calculateLateFees(rentalTransactionList66);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems1 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = visitorItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.VisitorItems visitorItems7 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems8 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = visitorItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = visitorItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        userManagement.VisitorItems visitorItems14 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems15 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray16 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList17 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList17, rentalTransactionArray16);
        boolean boolean19 = visitorItems15.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList17);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList20 = visitorItems14.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList17);
        boolean boolean21 = visitorItems7.checkRentalAbility(rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList22 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList20);
        java.lang.Class<?> wildcardClass23 = visitorItems0.getClass();
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems12 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems13 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray14 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList15 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList15, rentalTransactionArray14);
        boolean boolean17 = visitorItems13.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList15);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList18 = visitorItems12.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList15);
        visitorItems10.returnItem((int) (byte) 0, rentalTransactionList18);
        userManagement.VisitorItems visitorItems20 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems21 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray22 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList23 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList23, rentalTransactionArray22);
        boolean boolean25 = visitorItems21.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList23);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList26 = visitorItems20.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList23);
        userManagement.VisitorItems visitorItems27 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems28 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray29 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList30 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList30, rentalTransactionArray29);
        boolean boolean32 = visitorItems28.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems27.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList30);
        userManagement.VisitorItems visitorItems34 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems35 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray36 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList37 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList37, rentalTransactionArray36);
        boolean boolean39 = visitorItems35.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList37);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList40 = visitorItems34.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList37);
        boolean boolean41 = visitorItems27.checkRentalAbility(rentalTransactionList40);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList42 = visitorItems20.getCurrentHardcoverRentals(rentalTransactionList40);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList43 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList42);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList44 = visitorItems0.countOverdueItems(rentalTransactionList42);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        java.lang.Class<?> wildcardClass10 = visitorItems0.getClass();
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems11 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = visitorItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = visitorItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.VisitorItems visitorItems17 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems18 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = visitorItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = visitorItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.VisitorItems visitorItems24 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems25 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = visitorItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = visitorItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = visitorItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.VisitorItems visitorItems34 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray35 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList36 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList36, rentalTransactionArray35);
        boolean boolean38 = visitorItems34.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList39 = visitorItems0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        userManagement.RentalTransaction rentalTransaction40 = null;
        userManagement.VisitorItems visitorItems41 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems42 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray43 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList44 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList44, rentalTransactionArray43);
        boolean boolean46 = visitorItems42.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList44);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList47 = visitorItems41.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList44);
        userManagement.VisitorItems visitorItems48 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems49 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray50 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList51 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList51, rentalTransactionArray50);
        boolean boolean53 = visitorItems49.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList51);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList54 = visitorItems48.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList51);
        userManagement.VisitorItems visitorItems55 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems56 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray57 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList58 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList58, rentalTransactionArray57);
        boolean boolean60 = visitorItems56.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList58);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList61 = visitorItems55.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList58);
        boolean boolean62 = visitorItems48.checkRentalAbility(rentalTransactionList61);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList63 = visitorItems41.getCurrentHardcoverRentals(rentalTransactionList61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = visitorItems0.rentPhysicalItem(rentalTransaction40, rentalTransactionList61);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitorItems0.returnItem((int) (byte) 0, rentalTransactionList11);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        userManagement.VisitorItems visitorItems6 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems7 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray8 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList9 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList9, rentalTransactionArray8);
        boolean boolean11 = visitorItems7.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList12 = visitorItems6.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = visitorItems0.rentPhysicalItem(rentalTransaction5, rentalTransactionList12);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems11 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = visitorItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = visitorItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.VisitorItems visitorItems17 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems18 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = visitorItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = visitorItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.VisitorItems visitorItems24 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems25 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = visitorItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = visitorItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = visitorItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList32);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray1 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList2 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList2, rentalTransactionArray1);
        boolean boolean4 = visitorItems0.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList2);
        userManagement.RentalTransaction rentalTransaction5 = null;
        userManagement.VisitorItems visitorItems6 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems8 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems9 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray10 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList11 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList11, rentalTransactionArray10);
        boolean boolean13 = visitorItems9.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList11);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList14 = visitorItems8.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList11);
        visitorItems6.returnItem((int) (byte) 0, rentalTransactionList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = visitorItems0.rentPhysicalItem(rentalTransaction5, rentalTransactionList14);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems11 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = visitorItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = visitorItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.VisitorItems visitorItems17 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems18 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = visitorItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = visitorItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.VisitorItems visitorItems24 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems25 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = visitorItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = visitorItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = visitorItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.RentalTransaction[] rentalTransactionArray34 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList35 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList35, rentalTransactionArray34);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList37 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList35);
        userManagement.VisitorItems visitorItems39 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems40 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray41 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList42 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList42, rentalTransactionArray41);
        boolean boolean44 = visitorItems40.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList42);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList45 = visitorItems39.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList42);
        userManagement.VisitorItems visitorItems46 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems47 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray48 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList49 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList49, rentalTransactionArray48);
        boolean boolean51 = visitorItems47.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList49);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList52 = visitorItems46.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList49);
        boolean boolean53 = visitorItems39.checkRentalAbility(rentalTransactionList52);
        visitorItems0.returnItem((-1), rentalTransactionList52);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems1 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = visitorItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.RentalTransaction rentalTransaction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitorItems0.updatePhysicalItemInventory(rentalTransaction7, false);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems1 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray2 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList3 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList3, rentalTransactionArray2);
        boolean boolean5 = visitorItems1.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList6 = visitorItems0.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList3);
        userManagement.VisitorItems visitorItems7 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems8 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray9 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList10 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList10, rentalTransactionArray9);
        boolean boolean12 = visitorItems8.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList13 = visitorItems7.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList10);
        boolean boolean14 = visitorItems0.checkRentalAbility(rentalTransactionList13);
        userManagement.RentalTransaction rentalTransaction15 = null;
        userManagement.VisitorItems visitorItems16 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray17 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList18 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList18, rentalTransactionArray17);
        boolean boolean20 = visitorItems16.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = visitorItems0.rentPhysicalItem(rentalTransaction15, (java.util.List<userManagement.RentalTransaction>) rentalTransactionList18);
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
        userManagement.VisitorItems visitorItems0 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems2 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems3 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray4 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList5 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList5, rentalTransactionArray4);
        boolean boolean7 = visitorItems3.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList8 = visitorItems2.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList5);
        visitorItems0.returnItem((int) (byte) 0, rentalTransactionList8);
        userManagement.VisitorItems visitorItems10 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems11 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray12 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList13 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList13, rentalTransactionArray12);
        boolean boolean15 = visitorItems11.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList16 = visitorItems10.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList13);
        userManagement.VisitorItems visitorItems17 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems18 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray19 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList20 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList20, rentalTransactionArray19);
        boolean boolean22 = visitorItems18.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList23 = visitorItems17.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList20);
        userManagement.VisitorItems visitorItems24 = new userManagement.VisitorItems();
        userManagement.VisitorItems visitorItems25 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray26 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList27 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList27, rentalTransactionArray26);
        boolean boolean29 = visitorItems25.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList30 = visitorItems24.getCurrentHardcoverRentals((java.util.List<userManagement.RentalTransaction>) rentalTransactionList27);
        boolean boolean31 = visitorItems17.checkRentalAbility(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList32 = visitorItems10.getCurrentHardcoverRentals(rentalTransactionList30);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList33 = visitorItems0.getCurrentHardcoverRentals(rentalTransactionList32);
        userManagement.VisitorItems visitorItems34 = new userManagement.VisitorItems();
        userManagement.RentalTransaction[] rentalTransactionArray35 = new userManagement.RentalTransaction[] {};
        java.util.ArrayList<userManagement.RentalTransaction> rentalTransactionList36 = new java.util.ArrayList<userManagement.RentalTransaction>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userManagement.RentalTransaction>) rentalTransactionList36, rentalTransactionArray35);
        boolean boolean38 = visitorItems34.checkRentalAbility((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
        java.util.List<userManagement.RentalTransaction> rentalTransactionList39 = visitorItems0.countOverdueItems((java.util.List<userManagement.RentalTransaction>) rentalTransactionList36);
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

