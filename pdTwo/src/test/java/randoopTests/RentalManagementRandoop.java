package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentalManagementRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        itemManagement.Rental rental4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentalManagement1.displayRentalDetails(rental4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("");
        itemManagement.Rental rental3 = rentalManagement1.selectRentedItem("");
        org.junit.Assert.assertNull(rental3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        rentalManagement1.displayDueDates();
        itemManagement.Rental rental4 = rentalManagement1.selectRentedItem("");
        rentalManagement1.setUserID("");
        org.junit.Assert.assertNull(rental4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("");
        java.util.List<itemManagement.Rental> rentalList2 = rentalManagement1.listRentedItems();
        org.junit.Assert.assertNotNull(rentalList2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        java.util.List<itemManagement.Rental> rentalList2 = rentalManagement1.listRentedItems();
        itemManagement.Rental rental4 = rentalManagement1.selectRentedItem("");
        org.junit.Assert.assertNotNull(rentalList2);
        org.junit.Assert.assertNull(rental4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        rentalManagement1.setUserID("");
        rentalManagement1.setUserID("");
        // The following exception was thrown during execution in test generation
        try {
            rentalManagement1.displayDueDates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        java.util.List<itemManagement.Rental> rentalList2 = rentalManagement1.listRentedItems();
        java.util.List<itemManagement.Rental> rentalList3 = rentalManagement1.listRentedItems();
        java.lang.Class<?> wildcardClass4 = rentalList3.getClass();
        org.junit.Assert.assertNotNull(rentalList2);
        org.junit.Assert.assertNotNull(rentalList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        java.util.List<itemManagement.Rental> rentalList2 = rentalManagement1.listRentedItems();
        java.util.List<itemManagement.Rental> rentalList3 = rentalManagement1.listRentedItems();
        itemManagement.Rental rental5 = rentalManagement1.selectRentedItem("hi!");
        org.junit.Assert.assertNotNull(rentalList2);
        org.junit.Assert.assertNotNull(rentalList3);
        org.junit.Assert.assertNull(rental5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        rentalManagement1.setUserID("hi!");
        rentalManagement1.setUserID("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        // The following exception was thrown during execution in test generation
        try {
            itemManagement.Rental rental5 = rentalManagement1.selectRentedItem("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        rentalManagement1.displayDueDates();
        itemManagement.Rental rental4 = rentalManagement1.selectRentedItem("");
        java.lang.String str5 = rentalManagement1.getUserID();
        org.junit.Assert.assertNull(rental4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        java.util.List<itemManagement.Rental> rentalList4 = rentalManagement1.listRentedItems();
        // The following exception was thrown during execution in test generation
        try {
            itemManagement.Rental rental6 = rentalManagement1.selectRentedItem("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rentalList4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        rentalManagement1.displayDueDates();
        itemManagement.Rental rental4 = rentalManagement1.selectRentedItem("");
        rentalManagement1.setUserID("hi!");
        rentalManagement1.displayDueDates();
        itemManagement.Rental rental8 = null;
        rentalManagement1.addRental(rental8);
        // The following exception was thrown during execution in test generation
        try {
            itemManagement.Rental rental11 = rentalManagement1.selectRentedItem("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rental4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        itemManagement.Rental rental2 = null;
        rentalManagement1.addRental(rental2);
        rentalManagement1.setUserID("hi!");
        java.lang.String str6 = rentalManagement1.getUserID();
        // The following exception was thrown during execution in test generation
        try {
            rentalManagement1.displayDueDates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"itemManagement.Rental.getItem()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.RentalManagement rentalManagement1 = new itemManagement.RentalManagement("hi!");
        rentalManagement1.displayDueDates();
        itemManagement.Rental rental3 = null;
        rentalManagement1.addRental(rental3);
    }
}

