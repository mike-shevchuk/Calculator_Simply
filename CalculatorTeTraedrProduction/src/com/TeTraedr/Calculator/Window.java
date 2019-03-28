package com.TeTraedr.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Windows implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2, 10);
    JTextArea textarea2 = new JTextArea(1, 10);

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


    public Windows() {
        frame.setSize(340, 475);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setFocusable(true);


        frame.setResizable(true);
        frame.add(panel);
        panel.setBackground(Color.GRAY);
        Border border = BorderFactory.createLineBorder(Color.GREEN, 5);

        panel.add(textarea2);
        panel.add(textarea);
        panel.setBorder(border);


        textarea2.setBackground(Color.BLACK);
        textarea2.setToolTipText("Press 'Enter'");
        textarea2.setVisible(true);

        textarea.setBackground(Color.BLACK);
        textarea.setToolTipText("Press 'Enter'");
        textarea.setVisible(true);

        Border tborder = BorderFactory.createLineBorder(Color.ORANGE, 1);
        textarea.setBorder(tborder);
        textarea2.setBorder(tborder);
        Font font = new Font("Arial", Font.BOLD, 30);
        textarea.setFont(font);
        textarea2.setFont(font);
        textarea.setForeground(Color.GREEN);
        textarea2.setForeground(Color.GREEN);
        textarea.setPreferredSize(new Dimension(5, 10));
        textarea2.setPreferredSize(new Dimension(5, 10));
        textarea.setLineWrap(true);
        textarea2.setLineWrap(true);


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


        buttonsub.setPreferredSize(new Dimension(50, 50));
        Icon iconsub = new ImageIcon("res\\icons-sub.png");
        buttonsub.setIcon(iconsub);
        buttonsub.setBackground(Color.YELLOW);
        buttonsub.setToolTipText("subtraction");

        buttonmul.setPreferredSize(new Dimension(50, 50));
        Icon iconmulti = new ImageIcon("res\\icons-multi.png");
        buttonmul.setIcon(iconmulti);
        buttonmul.setBackground(Color.YELLOW);
        buttonmul.setToolTipText("multiplication");

        buttondiv.setPreferredSize(new Dimension(50, 50));
        Icon icondiv = new ImageIcon("res\\icons-div.png");
        buttondiv.setIcon(icondiv);
        buttondiv.setBackground(Color.YELLOW);
        buttondiv.setToolTipText("division");

        buttondot.setPreferredSize(new Dimension(50, 50));
        Icon icondot = new ImageIcon("res\\icons-dot.png");
        buttondot.setIcon(icondot);
        buttondot.setBackground(Color.YELLOW);
        buttondot.setToolTipText("dot");

        buttonequal.setPreferredSize(new Dimension(50, 50));
        Icon iconequal = new ImageIcon("res\\icons-equal.png");
        buttonequal.setIcon(iconequal);
        buttonequal.setBackground(Color.YELLOW);
        buttonequal.setToolTipText("equal");

        buttonadd.setPreferredSize(new Dimension(50, 50));
        Icon iconadd = new ImageIcon("res\\icons-add.png");
        buttonadd.setIcon(iconadd);
        buttonadd.setBackground(Color.YELLOW);
        buttonadd.setToolTipText("add");

        buttonclear.setPreferredSize(new Dimension(110, 50));
        Icon iconclear = new ImageIcon("res\\icons-clear.png");
        buttonclear.setIcon(iconclear);
        buttonclear.setBackground(Color.YELLOW);
        buttonclear.setToolTipText("backspace");

        buttonca.setPreferredSize(new Dimension(270, 50));
        Icon iconca = new ImageIcon("res\\icons-c.png");
        buttonca.setIcon(iconca);
        buttonca.setBackground(Color.YELLOW);
        buttonca.setToolTipText("Clean All(CLS)");

        button0.setPreferredSize(new Dimension(50, 50));
        Icon icon0 = new ImageIcon("res\\icons-0.png");
        button0.setIcon(icon0);
        button0.setBackground(Color.RED);
        button0.setToolTipText("number 0");

        button1.setPreferredSize(new Dimension(50, 50));
        Icon icon1 = new ImageIcon("res\\icons-1.png");
        button1.setIcon(icon1);
        button1.setBackground(Color.RED);


        button2.setPreferredSize(new Dimension(50, 50));
        Icon icon2 = new ImageIcon("res\\icons-2.png");
        button2.setIcon(icon2);
        button2.setBackground(Color.RED);


        button3.setPreferredSize(new Dimension(50, 50));
        Icon icon3 = new ImageIcon("res\\icons-3.png");
        button3.setIcon(icon3);
        button3.setBackground(Color.RED);


        button4.setPreferredSize(new Dimension(50, 50));
        Icon icon4 = new ImageIcon("res\\icons-4.png");
        button4.setIcon(icon4);
        button4.setBackground(Color.RED);


        button5.setPreferredSize(new Dimension(50, 50));
        Icon icon5 = new ImageIcon("res\\icons-5.png");
        button5.setIcon(icon5);
        button5.setBackground(Color.RED);


        button6.setPreferredSize(new Dimension(50, 50));
        Icon icon6 = new ImageIcon("res\\icons-6.png");
        button6.setIcon(icon6);
        button6.setBackground(Color.RED);


        button7.setPreferredSize(new Dimension(50, 50));
        Icon icon7 = new ImageIcon("res\\icons-7.png");
        button7.setIcon(icon7);
        button7.setBackground(Color.RED);


        button8.setPreferredSize(new Dimension(50, 50));
        Icon icon8 = new ImageIcon("res\\icons-8.png");
        button8.setIcon(icon8);
        button8.setBackground(Color.RED);


        button9.setPreferredSize(new Dimension(50, 50));
        Icon icon9 = new ImageIcon("res\\icons-9.png");
        button9.setIcon(icon9);
        button9.setBackground(Color.RED);

        buttonLeftbracket.setPreferredSize(new Dimension(50, 50));
        Icon iconLbracket = new ImageIcon("res\\icons-lbracket.png");
        buttonLeftbracket.setIcon(iconLbracket);
        buttonLeftbracket.setBackground(Color.RED);

        buttonRightbracket.setPreferredSize(new Dimension(50, 50));
        Icon iconRbracket = new ImageIcon("res\\icons-rbracket.png");
        buttonRightbracket.setIcon(iconRbracket);
        buttonRightbracket.setBackground(Color.RED);


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
        buttonclear.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonca) {
            textarea.setText("");
            textarea2.setText("Введіть приклад");
            buttonca.setBackground(Color.YELLOW);
        }
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
        if (source == buttonclear)
            if (textarea.getText().length() > 0) {
                try {
                    textarea.setText(textarea.getText(0, (textarea.getText().length() - 1)));
                } catch (BadLocationException e1) {
                    e1.printStackTrace();
                }
                if (textarea.getText().length() == 0) {
                    textarea2.setText("Введіть приклад");
                    buttonca.setBackground(Color.YELLOW);
                }
            }
        if (source == buttonequal) {
            String op = textarea.getText();
            if (op != new Help_Methods().controlexample(op)) {
                textarea2.setText(new Help_Methods().controlexample(op));
            }
            Calculator cl = new Calculator();

            textarea.append("=");
            textarea.append(Float.toString(cl.start(op)));
            textarea2.setText("");
            textarea2.append(" Очистіть Екран");
            buttonca.setBackground(Color.magenta);


        }
    }
}


