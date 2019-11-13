package com.hfad.twoclass;

public class Player
{
    int number = 0; //被猜測的數字
    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
