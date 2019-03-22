package com.TeTraedr.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Windows implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(3, 10);
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
    JButton buttonca = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();
    JButton buttonLeftbracket = new JButton();
    JButton buttonRightbracket = new JButton();

    String str;
    double result;


    public Windows() {
        frame.setSize(340, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setFocusable(true);


        frame.setResizable(true);
        frame.add(panel);
        panel.setBackground(Color.GRAY);
        Border border = BorderFactory.createLineBorder(Color.GREEN, 5);


        panel.add(textarea);
        panel.setBorder(border);

        textarea.add(scroll);
        textarea.setBackground(Color.BLACK);
        textarea.setToolTipText("Press 'Enter'");
        textarea.setVisible(true);

        Border tborder = BorderFactory.createLineBorder(Color.ORANGE, 1);
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
        button0.setToolTipText("number 0");

        buttonsub.setPreferredSize(new Dimension(50, 50));
        buttonsub.setIcon(new ImageIcon(dir + "\\icons-sub.png"));
        buttonsub.setBackground(Color.YELLOW);
        buttonsub.setToolTipText("subtraction");

        buttonmul.setPreferredSize(new Dimension(50, 50));
        buttonmul.setIcon(new ImageIcon(dir + "\\icons-multi.png"));
        buttonmul.setBackground(Color.YELLOW);
        buttonmul.setToolTipText("multiplication");

        buttondiv.setPreferredSize(new Dimension(50, 50));
        buttondiv.setIcon(new ImageIcon(dir + "\\icons-div.png"));
        buttondiv.setBackground(Color.YELLOW);
        buttondiv.setToolTipText("division");

        buttondot.setPreferredSize(new Dimension(50, 50));
        buttondot.setIcon(new ImageIcon(dir + "\\icons-dot.png"));
        buttondot.setBackground(Color.YELLOW);
        buttondot.setToolTipText("dot");

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

        buttonequal.setPreferredSize(new Dimension(50, 50));
        buttonequal.setIcon(new ImageIcon(dir + "\\icons-equal.png"));
        buttonequal.setBackground(Color.YELLOW);
        buttonequal.setToolTipText("equal");

        buttonadd.setPreferredSize(new Dimension(50, 50));
        buttonadd.setIcon(new ImageIcon(dir + "\\icons-add.png"));
        buttonadd.setBackground(Color.YELLOW);
        buttonadd.setToolTipText("add");

        buttonclear.setPreferredSize(new Dimension(110, 50));
        buttonclear.setIcon(new ImageIcon(dir + "\\icons-clear.png"));
        buttonclear.setBackground(Color.YELLOW);
        buttonclear.setToolTipText("backspace");

        buttonca.setPreferredSize(new Dimension(270, 50));
        buttonca.setIcon(new ImageIcon(dir + "\\icons-c.png"));
        buttonca.setBackground(Color.YELLOW);
        buttonca.setToolTipText("Clean All(CLS)");

        buttonLeftbracket.setPreferredSize(new Dimension(50, 50));
        buttonLeftbracket.setIcon(new ImageIcon(dir + "\\icons-lbracket.png"));
        buttonLeftbracket.setBackground(Color.RED);

        buttonRightbracket.setPreferredSize(new Dimension(50, 50));
        buttonRightbracket.setIcon(new ImageIcon(dir + "\\icons-rbracket.png"));
        buttonRightbracket.setBackground(Color.RED);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonclear);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttonLeftbracket);
        panel.add(button0);
        panel.add(buttonRightbracket);
        panel.add(buttondot);
        panel.add(buttonequal);
        panel.add(buttonca);


        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonca.addActionListener(this);
        buttondot.addActionListener(this);
        buttonequal.addActionListener(this);
        buttonLeftbracket.addActionListener(this);
        buttonRightbracket.addActionListener(this);
        buttonadd.addActionListener(this);
        buttonsub.addActionListener(this);
        buttonmul.addActionListener(this);
        buttondiv.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonca) textarea.setText("");
        if (source == button0) textarea.append("0");
        if (source == button1) textarea.append("1");
        if (source == button2) textarea.append("2");
        if (source == button3) textarea.append("3");
        if (source == button4) textarea.append("4");
        if (source == button5) textarea.append("5");
        if (source == button6) textarea.append("6");
        if (source == button7) textarea.append("7");
        if (source == button8) textarea.append("8");
        if (source == button9) textarea.append("9");
        if (source == buttonLeftbracket) textarea.append("(");
        if (source == buttonRightbracket) textarea.append(")");
        if (source == buttondot) textarea.append(".");
        if (source == buttonadd) textarea.append("+");
        if (source == buttonsub) textarea.append("-");
        if (source == buttonmul) textarea.append("*");
        if (source == buttondiv) textarea.append("/");
        if (source == buttonequal) {
            String op=textarea.getText();

            Calculator cl = new Calculator();

            textarea.append("=");
            textarea.append(Float.toString(cl.start(op)));

           // textarea.append("\n"+textarea.getText());


        }

    }


}


