package com.naeembux.funwithmath;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.*;

/**
 * Intellectual Property of Naeem Bux. DO NOT USE WITHOUT PERMISSION
 * Created by Bux_Life on 2017/03/18.
 */
public class MathLabTest {

    protected int value0, value1, value2, value3;
    protected double double1, double2;
    protected String string1;
    protected String string2;

    @Test
    public void testAddition() throws Exception {
        System.out.println("In Addition Test...");

        assertNotNull(value1);
        assertNotNull(value2);

        double result = MathLab.addition(value1, value2);
        assertTrue(result == 10);
    }

    @Test
    public void testSubtraction() throws Exception {
        System.out.println("In Subtraction Test..");

        double result = value1 - value2;
        assertTrue(result == 0);
    }

    @Test
    public void testDivision() throws Exception{
        System.out.println("In Division Test..");
        double result = MathLab.division(value1, value2);
    }

    @Test
    public void isDivisible() throws Exception{
        System.out.println("In Divisible Test..");

        //assertTrue(MathLab.isDivisible(value1, value2));
        assertFalse(MathLab.isDivisible(value1,value3));    //IF assertTrue passes, assertFalse will fail. VICE VERSA
    }

    @Test
    public void concat() throws Exception {
        System.out.println("In Concatenation Test..");
        assertNull("Value Not NULL", string1);
        assertNotNull("Value is Null", string2);

        //REMOVE "//" BELOW FOR TEST TO PASS
        //string1 = "First String_";
        if (string1 == null) {
            fail("Destined to fail. Failure Induced Intentionally");                                         //Intentionally Cause Test to Fail.
        } else {
            assertNotSame(string1, string2);
            //assertSame(string2, "_Test_String");
            string1 = MathLab.concat(string1, string2);

        }
    }

    @Test
    public void percent()
    {
        System.out.println("In Percentage Test..");
        double result = MathLab.percent(double1, double2);
        //
        assertEquals(100.00, result, 0.00);
    }

    @Test(timeout = 100)
    public void testTimeOut()
    {
        System.out.println("In Timeout Test..");
        MathLab.addition(value1, value2);
        MathLab.addition(double1,double2);

        MathLab.subtraction(value1, value2);
        MathLab.subtraction(double1,double2);

    }

    @Test (expected = ArithmeticException.class)
    public void testException() {
        System.out.println("In Arithmetic Exception Test..");
        MathLab.division(value1,value0);        //Cannot divide by zero
        //double result = value1/value0;
    }

    @Test
    public void testClasses()
    {
        System.out.println("In Class Test..");
        assertSame(MathLab.class, com.naeembux.funwithmath.MathLab.class);
        assertNotSame( MathBook.class, MathLab.class);
    }

    @Before
    public void setUp() throws Exception {
        value0 = 0;
        value1 = 5;
        value2 = 5;
        value3 = 6;

        double1 = 10.00;
        double2 = 10.00;

        string2 = "_Test_String";
    }



    @Ignore
    public void ignoreTest()
    {

    }

}
