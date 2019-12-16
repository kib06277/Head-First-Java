package com.hfad.OneClass;

//whlie 迴圈範例
public class Loopy
{
    public static void main(String[] args)
    {
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4)
        {
            System.out.println("in the Loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}
