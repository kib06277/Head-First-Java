package com.hfad.nineclass;

public abstract class Animal
{
    private String name;

    public Animal()
    {
        System.out.println("Making an Animal");
    }

    public Animal(String theName)
    {
        name = theName;
    }

    public String getName()
    {
        return name;
    }
}
