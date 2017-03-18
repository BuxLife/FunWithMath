/*Developed By Naeem Bux*/
package com.naeembux.funwithmath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathBook extends JFrame implements ActionListener
{
    /*TextFields*/
    private JTextField num1Txt = new JTextField(10);
    private JTextField num2Txt = new JTextField(10);
    private JTextField resultTxt = new JTextField(10);
    private final JTextArea descriptionTxt = new JTextArea();

    /*Panels*/
    private JPanel textPanel = new JPanel();
    private JPanel controlPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    /*Buttons*/
    private JButton addBtn = new JButton("Add");
    private JButton subtractBtn = new JButton("Subtract");
    private JButton divisionBtn = new JButton("Divide");
    private JButton multiplyBtn = new JButton("Multiply");
    private JButton largerBtn = new JButton ("IS Larger");
    private JButton isDivBtn = new JButton ("IS Divisible");
    private JButton concatBtn  = new JButton ("Concatenate");
    private JButton medianBtn = new JButton ("Median");
    private JButton percentBtn = new JButton ("Percentage");
    private JButton calculateBtn = new JButton ("Calculate");
    private JButton exitBtn = new JButton ("Exit");
    private JButton clearBtn = new JButton ("Clear");

    /*Labels*/
    private JLabel num1Lbl = new JLabel("1st Number");
    private JLabel num2Lbl = new JLabel("2nd Number");
    private JLabel mathLbl = new JLabel(".");
    private JLabel resultLbl = new JLabel("=");


    public MathBook(String title)
    {
        super(title);

        /*Layout*/
        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.EAST);

        /*Control Panel*/
        controlPanel.setBorder(BorderFactory.createTitledBorder("Mathematics Operations"));
        controlPanel.setLayout(new GridBagLayout());
        controlPanel.add(addBtn);
        controlPanel.add(subtractBtn);
        controlPanel.add(divisionBtn);
        controlPanel.add(multiplyBtn);
        controlPanel.add(largerBtn);
        controlPanel.add(isDivBtn);
        controlPanel.add(concatBtn);
        controlPanel.add(medianBtn);
        controlPanel.add(percentBtn);

        /*Text Panel*/
        textPanel.setBorder(BorderFactory.createTitledBorder("Current Operation"));
        textPanel.setLayout(new GridBagLayout());
        textPanel.add(num1Lbl);
        textPanel.add(num1Txt);
        textPanel.add(mathLbl);
        textPanel.add(num2Lbl);
        textPanel.add(num2Txt);
        textPanel.add(resultLbl);
        textPanel.add(resultTxt);
        textPanel.add(descriptionTxt);
        /*Button Panel*/
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.add(calculateBtn);
        buttonPanel.add(clearBtn);
        buttonPanel.add(exitBtn);


        /*ActionListeners*/
        addBtn.addActionListener(this);
        subtractBtn.addActionListener(this);
        divisionBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);

        largerBtn.addActionListener(this);
        isDivBtn.addActionListener(this);
        concatBtn.addActionListener(this);
        medianBtn.addActionListener(this);
        percentBtn.addActionListener(this);

        exitBtn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == addBtn)
        {
            mathLbl.setText("+");
        }
        else if (e.getSource() == subtractBtn)
        {
            mathLbl.setText("-");
        }
        else if (e.getSource() == multiplyBtn)
        {
            mathLbl.setText("*");

        }
        else if (e.getSource() == divisionBtn)
        {
            mathLbl.setText("/");
        }
        else if (e.getSource() == isDivBtn)
        {

        }
        else if (e.getSource() == concatBtn)
        {

        }
        else if (e.getSource() == medianBtn)
        {

        }
        else if (e.getSource() == percentBtn)
        {

        }
        else if (e.getSource() == largerBtn)
        {

        }
        else if (e.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }

    public int addition(int a, int b)
    {
        return a + b;
    }

    public int subtraction(int a, int b)
    {
        return a-b;
    }
    public float division(int a, int b)
    {
        return a/b;
    }
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    public int average(int a, int b)
    {
        return ((a+b)/2);
    }
    public int larger(int a, int b)
    {
        int largest = 0;

        if ( a > b)
            largest = a;
        else if (b > a)
            largest = b;

        return largest;
    }

    public boolean isDivisible(int a, int b)
    {
        boolean choice;

        if ((a % b) == 0)
            choice = true;
        else
            choice = false;

        return choice;
    }

}

