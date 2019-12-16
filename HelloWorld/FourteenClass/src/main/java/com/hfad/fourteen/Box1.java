package com.hfad.fourteen;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box1 implements Serializable
{
    private int width , height;

    public void setWidth(int w)
    {
        width = w;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public static void main(String args[])
    {
        Box1 myBox = new Box1();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try
        {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
