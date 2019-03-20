package com.TeTraedr.Calculator;

import javax.swing.*;

import javax.swing.border.Border;
import java.awt.*;


public class Window {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2, 10);


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


    public Window() {
        frame.setSize(340, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");


        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 7);


        panel.add(textarea);
        panel.setBorder(border);

        textarea.setBackground(Color.GRAY);
        Border tborder = BorderFactory.createLineBorder(Color.ORANGE, 3);
        textarea.setBorder(tborder);
        Font font = new Font("Arial", Font.BOLD, 33);
        textarea.setFont(font);
        textarea.setForeground(Color.BLUE);

        textarea.setPreferredSize(new Dimension(2, 10));
        textarea.setLineWrap(true);

        String dir = "C:\\Users\\mikls\\git\\Calculator_Simply\\CalculatorTeTraedrProduction\\res";
        button0.setPreferredSize(new Dimension(50, 20));
        button0.setIcon(new ImageIcon(dir + "\\icons8-0-50.png"));

        button1.setPreferredSize(new Dimension(50, 20));
        button1.setIcon(new ImageIcon(dir + "\\icons8-1-50.png"));

        button2.setPreferredSize(new Dimension(50, 20));
        button2.setIcon(new ImageIcon(dir + "\\icons8-2-50.png"));

        button3.setPreferredSize(new Dimension(50, 20));
        button3.setIcon(new ImageIcon(dir + "\\icons8-3-48.png"));

        button4.setPreferredSize(new Dimension(50, 20));
        button4.setIcon(new ImageIcon(dir + "\\icons8-4-50.png"));

        button5.setPreferredSize(new Dimension(50, 20));
        button5.setIcon(new ImageIcon(dir + "\\icons8-5-48.png"));

        button6.setPreferredSize(new Dimension(50, 20));
        button6.setIcon(new ImageIcon(dir + "\\icons8-6-50.png"));

        button7.setPreferredSize(new Dimension(50, 20));
        button7.setIcon(new ImageIcon(dir + "icons8-7-48.png"));

        button8.setPreferredSize(new Dimension(50, 20));
        button8.setIcon(new ImageIcon(dir + "\\icons8-8-48.png"));

        button9.setPreferredSize(new Dimension(50, 20));
        button9.setIcon(new ImageIcon(dir + "\\icons8-9-48.png"));


        buttonadd.setPreferredSize(new Dimension(70, 50));
        buttonadd.setIcon(new ImageIcon(dir + "//icons8-add-50.png"));

        buttonsub.setPreferredSize(new Dimension(70, 50));
        buttonsub.setIcon(new ImageIcon(dir + "//icons8-minus-50.png"));

        buttonmul.setPreferredSize(new Dimension(70, 50));
        buttonmul.setIcon(new ImageIcon(dir + "//icons8-cross-out-50.png"));

        buttondiv.setPreferredSize(new Dimension(70, 50));
        buttondiv.setIcon(new ImageIcon(dir + "icons8-division-40.png"));
    }


}


