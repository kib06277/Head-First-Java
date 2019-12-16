package com.hfad.thirteenclass;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1
{
    public static void main(String args[])
    {
        Button1 gui = new Button1();
        gui.go();

        Button1 gui1 = new Button1();
        gui1.go1();

        Button1 gui2 = new Button1();
        gui2.go2();

        Button1 gui3 = new Button1();
        gui3.go3();

        Button1 gui4 = new Button1();
        gui4.go4();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST , button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go1()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me you mean it");
        frame.getContentPane().add(BorderLayout.EAST , button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go2()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");
        frame.getContentPane().add(BorderLayout.NORTH , button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go3()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click this!");
        Font bigFont = new Font("serif" , Font.BOLD , 28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH , button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go4()
    {
        JFrame frame = new JFrame();

        JButton east = new JButton("East");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton center = new JButton("center");

        frame.getContentPane().add(BorderLayout.EAST , east);
        frame.getContentPane().add(BorderLayout.WEST , west);
        frame.getContentPane().add(BorderLayout.NORTH , north);
        frame.getContentPane().add(BorderLayout.SOUTH , south);
        frame.getContentPane().add(BorderLayout.CENTER , center);

        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
