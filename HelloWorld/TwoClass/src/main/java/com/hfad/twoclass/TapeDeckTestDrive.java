package com.hfad.twoclass;

public class TapeDeckTestDrive
{
    public static void main(String args[])
    {
        TapeDeck t = new TapeDeck();
        t.canRecourd = true;
        t.playTape();

        if(t.canRecourd == true)
        {
            t.recordTape();
        }
    }
}
