package com.hfad.twoclass;

public class DrumKitTestDrive
{
    public static void main(String args[])
    {
        Drumkit d = new Drumkit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare == true)
        {
            d.playSnare();
        }
    }
}
