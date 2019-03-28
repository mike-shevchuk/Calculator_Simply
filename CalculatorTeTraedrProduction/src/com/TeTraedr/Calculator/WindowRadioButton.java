package com.TeTraedr.Calculator;

import javax.swing.*;
import java.awt.event.*;

public class WindowRadioButton extends JFrame implements ActionListener {

    JRadioButton rb1, rb2;
    JButton b;

    WindowRadioButton() {
        rb1 = new JRadioButton("Sound on");
        rb1.setBounds(100, 50, 100, 30);
        rb2 = new JRadioButton("Sound off");
        rb2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b = new JButton("click");
        b.setBounds(100, 150, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Sound on");
            new Windows().setSound(true);
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Sound off");
            new Windows().setSound(false);
        }
    }
}

