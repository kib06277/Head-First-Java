package com.hfad.threeclass;

public class Dog
{
    String name;
    public static void main(String[] args)
    {
        //建構 Dog 物件
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //建構 Dog 陣列
        Dog[] myDogs = new Dog[3];

        //指派陣列中存放甚麼物件
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //透過陣列參考存取 Dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //myDog[2] 的名字是 ?
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);

        //逐筆執行 Dog 的 bark()
        int x = 0;
        while (x < myDogs.length)
        {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark()
    {
        System.out.println(name + " says Ruff!");
    }

    public void eat()
    {

    }

    public void chaseCat()
    {

    }
}
