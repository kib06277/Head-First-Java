package com.hfad.nineclass;

public class TestDuck
{
    public static void main(String args[])
    {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1,2,3,4,5,6};
        boolean canFly = true;
        int airspeed = 22;

        NineClassDuck[] d = new NineClassDuck[7];
        d[0] = new NineClassDuck();
        d[1] = new NineClassDuck(density , weight);
        d[2] = new NineClassDuck(name , feathers);
        d[3] = new NineClassDuck(canFly);
        d[4] = new NineClassDuck(3.3F , airspeed);
        d[5] = new NineClassDuck(false);
        d[6] = new NineClassDuck(airspeed , density);
    }
}
