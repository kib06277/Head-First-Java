package com.hfad.tenclass;

public class TestFormats
{
    public static void main(String args[])
    {
        String s = String.format("% , d" , 1000000);
        System.out.println(s);
    }
}
