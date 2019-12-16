package com.hfad.thirteenclass;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel1
{
    public static void main(String args[])
    {
        Panel1 gui = new Panel1();
        gui.go();

        Panel1 gui1 = new Panel1();
        gui1.go1();

        Panel1 gui2 = new Panel1();
        gui2.go2();

        Panel1 gui3 = new Panel1();
        gui3.go3();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST , panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go1()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shouck me");
        panel.add(button);
        frame.getContentPane().add(BorderLayout.EAST , panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go2()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shouck me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST , panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go3()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton button = new JButton("shouck me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST , panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
