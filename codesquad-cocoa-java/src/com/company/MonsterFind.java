package com.company;

import java.util.Scanner;

public class MonsterFind {

  public static void main(String[] args) {

    // 다시 구현dd2
     int point=0;

    do {
      String[][] array=new String[5][5];

      int stX=2;
      int stY=2;

      String bomb="bomb";
      String monster="monster";


      int coX=(int)(Math.random()*5);
      int coY=(int)(Math.random()*5);

      int mX=(int)(Math.random()*5);
      int mY=(int)(Math.random()*5);

      if(coX!=stX||coY!=stY) {
        array[coX][coY]=bomb;



      }
      if(mX != stX || mY != stY){
        if(mX!=coX || mY!=coY) {
          array[mX][mY]=monster;
        }
      }
      Scanner sc = new Scanner(System.in);

      while((coX!=stX||coY!=stY)&&(stX!=mX||stY!=mY)) {
        String key=sc.nextLine();

        switch (key) {
          case "w":if(stY<4) {stY+=1;}
            break;
          case "a": if(stX>0) {stX-=1;}
            break;
          case "s": if(stY>0) {stY-=1;}
            break;
          case "d": if(stX<4) {stX+=1;}
            break;
        }
        System.out.println("stX : "+stX+"stY : "+stY);
      }

      if(array[stX][stY]== bomb) {
        System.out.println("뒤짐");
        break;
      }

      if(array[stX][stY]== monster) {
        System.out.println("오세준이다");
        point++;
        System.out.println(point);
        continue;
      }
    }while(true);
  }
}
