package com.naeembux.funwithmath;

import javax.swing.*;
import java.awt.*;
/**
 * Developed By & Property of Naeem Bux.
 *  Student ID: 213003775
 */
public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {

                MathBook math = new MathBook("Fun with Math");
                math.setDefaultLookAndFeelDecorated(true);
                math.setSize(780, 150);
                math.setResizable(false);

                math.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                math.setVisible(true);
            }
        }));
    }

}
