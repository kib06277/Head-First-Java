package com.hfad.sixteenclass;
import java.util.*;
import java.io.*;

public class Jukebox1
{
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args)
    {
        new Jukebox1().go();
    }

    public void go()
    {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs()
    {
        try
        {
            File file = new File("D:/Case/HelloWorld/SixteenClass/src/main/java/com/hfad/sixteenclass/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                addSong(line);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse)
    {
        String[]tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
