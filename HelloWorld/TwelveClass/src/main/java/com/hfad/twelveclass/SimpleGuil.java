package com.hfad.twelveclass;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuil
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame(); //製作 frame 畫布
        JButton button = new JButton("click me"); //製作 click me 按鈕

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //在 window 關閉時把程式結束
        frame.getContentPane().add(button); //將按鈕加到畫布上
        frame.setSize(300,300); //設定畫布大笑
        frame.setVisible(true); //將畫布顯示出來
    }
}
