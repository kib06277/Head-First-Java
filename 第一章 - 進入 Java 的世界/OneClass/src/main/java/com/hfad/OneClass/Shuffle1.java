package com.hfad.OneClass;

public class Shuffle1
{
    public static void main(String args[])
    {
        int x = 3;
        while(x > 0)
        {
            if(x > 2)
            {
                System.out.print("A");
            }

            x = x - 1;
            System.out.print("-");

            if(x == 2)
            {
                System.out.print("B C");
            }

            if(x == 1)
            {
                System.out.print("D");
                x = x - 1;
            }
        }
    }
}
