package org.benboby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI implements ActionListener{
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    public GUI() {
        frame = new JFrame();

        JButton button = new JButton("Click me");
        label = new JLabel("Number of Clicks: 0");
        button.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,160,100,160));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new GUI();
    }

    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("Number of clicks: "+count);
    }
}

