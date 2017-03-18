package com.naeembux.funwithmath;

/**
 * Created by Bux_Life on 2017/03/18.
 */
public class MathLab {

    public static float addition(float a, float b){
        return a + b;
    }
    public static int addition(int a, int b){
        return a+b;
    }
    //--
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static float subtraction(float a, float b){
        return a-b;
    }
    //--
    public static float division(float a, float b){
        return a/b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    //--
    public static float multiplication(float a, float b){
        return a*b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    //--
    public static float average(float a, float b){
        return ((a+b)/2);
    }
    public static int average(int a, int b) {
        return ((a + b) / 2);
    }
    //--
    public static float larger(float a, float b){
        float largest = 0;

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
    public boolean isDivisible(float a, float b){

        boolean choice;

        if ((a % b) == 0)
            choice = true;
        else
            choice = false;

        return choice;
    }
}
