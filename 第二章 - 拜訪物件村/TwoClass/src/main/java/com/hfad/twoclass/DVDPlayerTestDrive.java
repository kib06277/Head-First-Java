package com.hfad.twoclass;

public class DVDPlayerTestDrive
{
    public static void main(String args[])
    {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord == true)
        {
            d.recordDVD();
        }
    }
}
