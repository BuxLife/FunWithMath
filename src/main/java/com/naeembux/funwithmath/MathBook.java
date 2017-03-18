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
    private JButton exitBtn = new JButton ("Exit");
    private JButton clearBtn = new JButton ("Clear");

    /*Labels*/
    private JLabel num1Lbl = new JLabel("1st Number");
    private JLabel num2Lbl = new JLabel("2nd Number");
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
        textPanel.add(num2Lbl);
        textPanel.add(num2Txt);
        textPanel.add(resultLbl);
        textPanel.add(resultTxt);
        textPanel.add(descriptionTxt);
        resultTxt.setEditable(false);

        /*Button Panel*/
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        buttonPanel.setLayout(new GridBagLayout());

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

        clearBtn.addActionListener(this);
        exitBtn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        try {


            if (e.getSource() == addBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                    double num1 = Double.parseDouble(num1Txt.getText());
                    double num2 = Double.parseDouble(num2Txt.getText());

                    double result = MathLab.addition(num1, num2);
                    resultTxt.setText(Double.toString(result));
                }


            } else if (e.getSource() == subtractBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {
                    double num1 = Float.parseFloat(num1Txt.getText());
                    double num2 = Float.parseFloat(num2Txt.getText());

                    double result = MathLab.subtraction(num1, num2);
                    resultTxt.setText(Double.toString(result));
                }
            } else if (e.getSource() == multiplyBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {
                    double num1 = Double.parseDouble(num1Txt.getText());
                    double num2 = Double.parseDouble(num2Txt.getText());

                    double result = MathLab.multiplication(num1, num2);
                    resultTxt.setText(Double.toString(result));
                }

            } else if (e.getSource() == divisionBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {
                    double num1 = Float.parseFloat(num1Txt.getText());
                    double num2 = Float.parseFloat(num2Txt.getText());

                    double result = MathLab.division(num1, num2);
                    resultTxt.setText(Double.toString(result));
                }
            } else if (e.getSource() == isDivBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                }
            } else if (e.getSource() == concatBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                }
            } else if (e.getSource() == medianBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                }
            } else if (e.getSource() == percentBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                }
            } else if (e.getSource() == largerBtn) {
                if ((num1Txt.getText().isEmpty()) || (num2Txt.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left Blank.");
                } else {

                }
            } else if (e.getSource() == clearBtn) {
                num1Txt.setText("");
                num2Txt.setText("");
                resultTxt.setText("");
            } else if (e.getSource() == exitBtn) {
                System.exit(0);
            }
        }catch (Exception exc)
        {
            JOptionPane.showMessageDialog(null, "Oops. Please enter a number");
        }
    }



}

