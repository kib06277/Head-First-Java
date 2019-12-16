package com.hfad.sixteenclass;

import java.util.ArrayList;

public class TestGeneriscs1
{
    public static void main(String args[])
    {
        new TestGeneriscs1().go();
    }

    public void go()
    {
        Animal[] animals = {new Dog(),new Cat(),new Dog()};
        Dog[] dogs = {new Dog(),new Dog(),new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);

        ArrayList<Animal> animals1 = new ArrayList<Animal>();
        animals1.add(new Dog());
        animals1.add(new Cat());
        animals1.add(new Dog());
        takeAnimals(animals1);
    }

    public void takeAnimals(Animal[] animals)
    {
        for (Animal a:animals)
        {
            a.eat();
        }
    }

    public void takeAnimals(ArrayList<? extends Animal> animals)
    {
        for (Animal a:animals)
        {
            a.eat();
        }
    }
}
