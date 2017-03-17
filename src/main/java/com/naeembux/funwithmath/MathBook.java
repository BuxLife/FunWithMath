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
    private JButton exitBtn = new JButton ("Exit");
    /*Labels*/
    private JLabel mathLbl = new JLabel("IMG");
    private JLabel resultLbl = new JLabel("Answer");

    public MathBook(String title)
    {
        super(title);

        setLayout(new GridLayout(2,2));
        textPanel.setLayout(new GridLayout(4,2));
        controlPanel.setLayout(new GridLayout(5, 2));
        buttonPanel.setLayout(new FlowLayout());

        /*Initialize*/
        controlPanel.add(addBtn);
        controlPanel.add(subtractBtn);
        controlPanel.add(divisionBtn);
        controlPanel.add(multiplyBtn);
        controlPanel.add(largerBtn);
        controlPanel.add(isDivBtn);
        controlPanel.add(concatBtn);
        controlPanel.add(medianBtn);
        controlPanel.add(percentBtn);
        buttonPanel.add(exitBtn);

        textPanel.add(num1Txt);
        textPanel.add(mathLbl);
        textPanel.add(num2Txt);
        textPanel.add(resultLbl);
        textPanel.add(resultTxt);

        add(textPanel);
        add(controlPanel);
        add(buttonPanel);
        /*Assign ActionListeners*/
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
}

