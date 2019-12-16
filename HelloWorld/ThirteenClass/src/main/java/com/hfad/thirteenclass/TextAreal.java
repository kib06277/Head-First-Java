package com.hfad.thirteenclass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextAreal implements ActionListener
{
    JTextArea text;
    public static void main(String args[])
    {
        TextAreal gui = new TextAreal();
        gui.go();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        text.append("button clicked \n");
    }

    public void go()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just click it");
        button.addActionListener(this);
        text = new JTextArea(10 , 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER , panel);
        frame.getContentPane().add(BorderLayout.SOUTH , button);

        frame.setSize(350 , 300);
        frame.setVisible(true);
    }
}
