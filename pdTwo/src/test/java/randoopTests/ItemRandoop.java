package randoopTests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemRandoop {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        item2.setPrice((double) 'a');
        double double5 = item2.getPrice();
        java.lang.Class<?> wildcardClass6 = item2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        java.lang.String str3 = item2.getName();
        item2.setId("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        java.lang.String str3 = item2.getName();
        java.lang.Class<?> wildcardClass4 = item2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        itemManagement.Item item2 = new itemManagement.Item("", "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        itemManagement.Item item4 = new itemManagement.Item("", "", (double) (-1L), 0.0d);
        java.lang.String str5 = item4.getId();
        item4.setName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        double double3 = item2.getPrice();
        item2.setName("");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        java.lang.String str3 = item2.getName();
        java.lang.String str4 = item2.getName();
        java.lang.String str5 = item2.getId();
        double double6 = item2.getPrice();
        java.lang.Class<?> wildcardClass7 = item2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        java.lang.String str3 = item2.getName();
        java.lang.String str4 = item2.getName();
        java.lang.String str5 = item2.getId();
        double double6 = item2.getDiscountPrice();
        java.lang.Class<?> wildcardClass7 = item2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        itemManagement.Item item4 = new itemManagement.Item("", "hi!", (double) ' ', (-1.0d));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        itemManagement.Item item4 = new itemManagement.Item("", "", (double) (-1L), 0.0d);
        java.lang.String str5 = item4.getId();
        item4.setId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        itemManagement.Item item4 = new itemManagement.Item("", "hi!", (double) ' ', (double) 10.0f);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        java.lang.String str3 = item2.getName();
        java.lang.String str4 = item2.getName();
        java.lang.String str5 = item2.getId();
        double double6 = item2.getDiscountPrice();
        java.lang.String str7 = item2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        itemManagement.Item item4 = new itemManagement.Item("hi!", "hi!", 1.0d, (double) ' ');
        java.lang.String str5 = item4.getId();
        item4.setName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "hi!");
        item2.setPrice((double) 'a');
        double double5 = item2.getPrice();
        java.lang.String str6 = item2.getId();
        item2.setId("");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        itemManagement.Item item2 = new itemManagement.Item("hi!", "");
        java.lang.String str3 = item2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }
}

