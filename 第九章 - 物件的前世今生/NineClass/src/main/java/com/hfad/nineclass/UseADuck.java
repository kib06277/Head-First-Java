package com.hfad.nineclass;

public class UseADuck
{
    public static void main(String args[])
    {
        //Duck d = new Duck();
        //d.setSize(42);

        Duck d = new Duck(42);

        Duck2 a = new Duck2(15); //知道大小時
        Duck2 b = new Duck2(); //不知道大小時
    }
}

class Duck
{
    int size;

//    public Duck()
//    {
//        System.out.println("Quack");
//    }
//
//    public void setSize(int newSize)
//    {
//        size = newSize;
//    }

    public Duck(int duckSize)
    {
        System.out.println("Quack");
        size = duckSize;
        System.out.println("size is " + size);
    }
}

class Duck2
{
    int size;

    //不知道大小時
    public Duck2()
    {
        //指定預設值
        size = 27;
    }

    // 知道大小時
    public Duck2(int duckSize)
    {
        //使用參數
        size = duckSize;
    }
}