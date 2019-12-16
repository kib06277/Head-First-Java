package com.hfad.sixclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper
{
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;


    public String getUserInput(String prompt)
    {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 )
            {
                return null;
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize)
    {
        // line 19
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];      // holds 'f6' type coords 保存字串
        String temp = null;                                // temporary String for concat 暫用字串
        int [] coords = new int[comSize];                  // current candidate coords 現有字串
        int attempts = 0;                                  // current attempts counter 目前測試字串
        boolean success = false;                           // flag = found a good location ? 找到適合位置?
        int location = 0;                                  // current starting location 目前起點

        comCount++;                                        // nth dot com to place 現在處理道第 N 個
        int incr = 1;                                      // set horizontal increment 水平增量
        if ((comCount % 2) == 1)
        {
            // if odd dot com  (place vertically) 如果是單數號的
            incr = gridLength;                               // set vertical increment 垂直增量
        }

        while ( !success & attempts++ < 200 )
        {
            // main search loop  (32) 主要搜尋迴圈
            location = (int) (Math.random() * gridSize);      // get random starting point 隨機起點
            //System.out.print(" try " + location);
            int x = 0;                                        // nth position in dotcom to place 第 N 個位置
            success = true;                                 // assume success 假定成功
            while (success && x < comSize)
            {
                // look for adjacent unused spots 找尋未使用的點
                if (grid[location] == 0)
                {
                    // if not already used 如果有沒使用
                    coords[x++] = location;                    // save location 儲存位置
                    location += incr;                          // try 'next' adjacent 嘗試下一個點
                    if (location >= gridSize)
                    {
                        // out of bounds - 'bottom' 超出底線
                        success = false;                         // failure 失敗
                    }
                    if (x>0 & (location % gridLength == 0))
                    {
                        // out of bounds - right edge 超出右線
                        success = false;                         // failure 失敗
                    }
                }
                else
                {
                    // found already used location 找到已經使用的位置
                    // System.out.print(" used " + location);
                    success = false;                          // failure 失敗中的失敗
                }
            }
        }                                                   // end while 結束迴圈

        int x = 0;                                          // turn good location into alpha coords 將位置轉換成字串形式
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize)
        {
            grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
            row = (int) (coords[x] / gridLength);             // get row value
            column = coords[x] % gridLength;                  // get numeric column value
            temp = String.valueOf(alphabet.charAt(column));   // convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;

            // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
        }
        // System.out.println("\n");

        return alphaCells;
    }
}
