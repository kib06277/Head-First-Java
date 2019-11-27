package com.hfad.twelveclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuilB implements ActionListener
{
    JButton button;

    public static void main(String args[])
    {
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this); //向按鈕登記事件
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        button.setText("I've been clicked!");
    }
}
