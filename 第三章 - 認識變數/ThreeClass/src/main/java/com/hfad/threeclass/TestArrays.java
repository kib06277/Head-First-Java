package com.hfad.threeclass;

public class TestArrays
{
    public static void main(String args[])
    {
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] inlands = new String[4];
        inlands[0] = "Bermuda";
        inlands[1] = "Fiji";
        inlands[2] = "Azores";
        inlands[3] = "Cozumel";

        int y = 0;
        int ref;
        while (y < 4)
        {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(inlands[ref]);
            y = y + 1;
        }
    }
}
