package com.hfad.twoclass;

public class GuessGame
{
    //分別代表三個 player 物件
    Player p1 , p2 , p3;

    public void startGame()
    {
        //建立三個 player 物件
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //宣告三個變數保存數值
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //判斷三個數值有沒有猜中
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //隨機產生猜測數字
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true)
        {
            System.out.println("Number to guess is " + targetNumber);

            //呼叫 player 的 guess()
            p1.guess();
            p2.guess();
            p3.guess();

            //取得每一個玩家所猜測的數字並顯示
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            //檢查是否猜中，若猜中將變數改為猜中
            if (guessp1 == targetNumber)
            {
                p1isRight = true;
            }

            if (guessp2 == targetNumber)
            {
                p2isRight = true;
            }

            if (guessp3 == targetNumber)
            {
                p3isRight = true;
            }

            //如果有一或多個猜中
            if (p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break; //遊戲結束，中斷迴圈
            }
            else
            {
                //都沒猜中，繼續猜
                System.out.println("Players will have to try again.");
            }
        }
    }
}
