package com.hfad.Fifteen;

public class TestSyncTest
{
    public static void main(String args[])
    {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}

class TestSync implements Runnable
{
    private int balance;

    @Override
    public void run()
    {
        for(int i = 0 ; i < 50 ; i++)
        {
            increment();
        }
    }

    public synchronized void increment()
    {
        int i = balance;
        balance = i + 1;
    }
}