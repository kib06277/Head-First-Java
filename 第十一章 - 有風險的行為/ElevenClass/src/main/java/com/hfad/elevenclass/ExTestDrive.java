package com.hfad.elevenclass;

public class ExTestDrive
{
    public static void main(String args[])
    {
        String test = args[0];
        try
        {
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        }
        catch (MyEx e)
        {
            System.out.print("a");
        }
        finally
        {
            System.out.print("w");
        }
        System.out.print("s");
    }

    static void doRisky(String t)throws MyEx
    {
        System.out.print("h");

        if("yes".equals(t))
        {
            throw new MyEx();
        }
        System.out.print("r");
    }
}

class MyEx extends Exception
{

}
