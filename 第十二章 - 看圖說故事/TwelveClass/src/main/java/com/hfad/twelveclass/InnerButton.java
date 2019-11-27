package com.hfad.twelveclass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerButton
{
    JFrame frame;
    JButton b;

    public static void main(String args[])
    {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        b.addActionListener(new BListener());
        frame.getContentPane().add(BorderLayout.SOUTH,b);
        frame.setSize(200 , 100);
        frame.setVisible(true);
    }

    class BListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            if(b.getText().equals("A"))
            {
                b.setText("B");
            }
            else
            {
                b.setText("A");
            }
        }
    }
}
