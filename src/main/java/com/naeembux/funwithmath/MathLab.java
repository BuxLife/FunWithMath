package com.naeembux.funwithmath;

import org.junit.Test;

/**
 * Created by Bux_Life on 2017/03/18.
 */
public class MathLab {

    public static double addition(double a, double b){
        return a + b;
    }
    public static int addition(int a, int b){
        return a+b;
    }

    //--

    public static int subtraction(int a, int b){
        return a-b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    //--

    public static double division(double a, double b){
        return a/b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    //--

    public static double multiplication(double a, double b){
        return a*b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    //--

    public static double average(double a, double b){
        return ((a+b)/2);
    }
    public static int average(int a, int b) {
        return ((a + b) / 2);
    }
    //--

    public static double larger(double a, double b){
        double largest = 0;

        if ( a > b)
            largest = a;
        else if (b > a)
            largest = b;
        return largest;
    }
    public static int larger(int a, int b){
        int largest = 0;

        if ( a > b)
            largest = a;
        else if (b > a)
            largest = b;
        return largest;
    }
    //--
    public static String concat(String a, String b)
    {
        String result = (a + "" + b);
        return result;
    }
    //--
    public static double percent(double a, double b)
    {
        return ((a * 100) / b);
    }
    //--
    public static boolean isDivisible(double a, double b){

        boolean choice;

        if ((a % b) == 0)
            choice = true;
        else
            choice = false;

        return choice;
    }

}
