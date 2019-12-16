package com.hfad.nineclass;

public class NineClassDuck
{
    int pounds = 6;
    float floatability = 2.1F;
    String name = "Generic";
    long[] feathers = {1,2,3,4,5,6,7};
    boolean canFly = true;
    int maxSpeed = 25;

    public NineClassDuck()
    {
        System.out.println("type 1 NineClassDuck");
    }

    public NineClassDuck(boolean fly)
    {
        canFly = fly;
        System.out.println("type 2 NineClassDuck");
    }

    public NineClassDuck(String n , long[] f)
    {
        name = n;
        feathers = f;
        System.out.println("type 3 NineClassDuck");
    }

    public NineClassDuck(int w , float f)
    {
        pounds = w;
        floatability = f;
        System.out.println("type 4 NineClassDuck");
    }

    public NineClassDuck(float density , int max)
    {
        floatability = density;
        maxSpeed = max;
        System.out.println("type 5 NineClassDuck");
    }
}
