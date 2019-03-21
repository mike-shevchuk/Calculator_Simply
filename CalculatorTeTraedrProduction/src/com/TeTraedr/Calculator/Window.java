package com.TeTraedr.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Windows {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2, 10);
    JScrollPane scroll = new JScrollPane(textarea);

    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclear = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();

    String str;
    double result;


    public Windows() {
        frame.setSize(340, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setFocusable(true);


        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.GRAY);
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 7);


        panel.add(textarea);
        panel.setBorder(border);

        textarea.add(scroll);
        textarea.setBackground(Color.BLACK);
        textarea.setToolTipText("Press 'Enter'");
        textarea.setVisible(true);

        Border tborder = BorderFactory.createLineBorder(Color.ORANGE, 3);
        textarea.setBorder(tborder);
        Font font = new Font("Arial", Font.BOLD, 33);
        textarea.setFont(font);
        textarea.setForeground(Color.GREEN);

        textarea.setPreferredSize(new Dimension(2, 10));
        textarea.setLineWrap(true);

        String dir = "D:\\workspace\\git\\Calculator_Simply\\CalculatorTeTraedrProduction\\res";

        button0.setPreferredSize(new Dimension(50, 50));
        button0.setIcon(new ImageIcon(dir + "\\icons-0.png"));
        button0.setBackground(Color.RED);


        button1.setPreferredSize(new Dimension(50, 50));
        button1.setIcon(new ImageIcon(dir + "\\icons-1.png"));
        button1.setBackground(Color.RED);


        button2.setPreferredSize(new Dimension(50, 50));
        button2.setIcon(new ImageIcon(dir + "\\icons-2.png"));
        button2.setBackground(Color.RED);


        button3.setPreferredSize(new Dimension(50, 50));
        button3.setIcon(new ImageIcon(dir + "\\icons-3.png"));
        button3.setBackground(Color.RED);


        button4.setPreferredSize(new Dimension(50, 50));
        button4.setIcon(new ImageIcon(dir + "\\icons-4.png"));
        button4.setBackground(Color.RED);


        button5.setPreferredSize(new Dimension(50, 50));
        button5.setIcon(new ImageIcon(dir + "\\icons-5.png"));
        button5.setBackground(Color.RED);


        button6.setPreferredSize(new Dimension(50, 50));
        button6.setIcon(new ImageIcon(dir + "\\icons-6.png"));
        button6.setBackground(Color.RED);


        button7.setPreferredSize(new Dimension(50, 50));
        button7.setIcon(new ImageIcon(dir + "\\icons-7.png"));
        button7.setBackground(Color.RED);


        button8.setPreferredSize(new Dimension(50, 50));
        button8.setIcon(new ImageIcon(dir + "\\icons-8.png"));
        button8.setBackground(Color.RED);


        button9.setPreferredSize(new Dimension(50, 50));
        button9.setIcon(new ImageIcon(dir + "\\icons-9.png"));
        button9.setBackground(Color.RED);

        buttonequal.setPreferredSize(new Dimension(50,50));
        buttonequal.setIcon(new ImageIcon(dir + "\\icons-equal.png"));
        buttonequal.setBackground(Color.YELLOW);

        buttonadd.setPreferredSize(new Dimension(50,50));
        buttonadd.setIcon(new ImageIcon(dir + "\\icons-add.png"));
        buttonadd.setBackground(Color.YELLOW);

        buttonclear.setPreferredSize(new Dimension(50,50));
        buttonclear.setIcon(new ImageIcon(dir + "\\icons-clear.png"));
        buttonclear.setBackground(Color.YELLOW);

        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonequal);
        panel.add(buttonadd);
        panel.add(buttonclear);


        button0.addActionListener((ActionListener)  this);
        button1.addActionListener((ActionListener)  this);
        button2.addActionListener((ActionListener)  this);
        button3.addActionListener((ActionListener)  this);
        button4.addActionListener((ActionListener)  this);
        button5.addActionListener((ActionListener)  this);
        button6.addActionListener((ActionListener)  this);
        button7.addActionListener((ActionListener)  this);
        button8.addActionListener((ActionListener)  this);
        button9.addActionListener((ActionListener)  this);
        buttonclear.addActionListener((ActionListener) this);




    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==buttonclear) textarea.setText("");
        if (source==button0) textarea.append("0");
        if (source==button1) textarea.append("1");
        if (source==button2) textarea.append("2");
        if (source==button3) textarea.append("3");
        if (source==button4) textarea.append("4");
        if (source==button5) textarea.append("5");
        if (source==button6) textarea.append("6");
        if (source==button7) textarea.append("7");
        if (source==button8) textarea.append("8");
        if (source==button9) textarea.append("9");



            }


}


