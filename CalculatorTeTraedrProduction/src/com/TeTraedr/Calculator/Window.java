package com.TeTraedr.Calculator;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
            panel.setBackground(Color.GREEN);
            Border border = BorderFactory.createLineBorder(Color.BLUE);

            panel.add(textarea);

            textarea.setBackground(Color.GRAY);
            Border tborder =  BorderFactory.createLineBorder(Color.CYAN ,3);
            textarea.setBorder(tborder);
            Font font = new Font("Arial", Font.BOLD, 33);
            textarea.setFont(font);
            textarea.setForeground(Color.WHITE);

            textarea.setPreferredSize(new Dimension(2, 10));
            textarea.setLineWrap(true);

        }




    }


