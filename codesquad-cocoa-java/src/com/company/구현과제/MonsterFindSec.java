package com.company.구현과제;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterFindSec {

  static String[][] arr = new String[5][5];
  static int myX = 2;
  static int myY = 2;

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      Arrays.fill(arr[i], "O");
    }

    arr[myX][myY] = "H";
    isBomb();
    isMonster();
    Input();

  }

  public static void Input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("입력해주세요 : ");
    String key = sc.nextLine();
    if (key == "w" && myX < 4) {
      myX++;
      Print();
      System.out.println("과연 myX의 값은? : " + myX);
    }
  }

  public static void isBomb() {
    int x = (int) (Math.random() * 5);
    int y = (int) (Math.random() * 5);
    if (arr[x][y] != arr[2][2]) {
      arr[x][y] = "*";
      return;
    }
    isBomb();
  }

  public static void isMonster() {
    int x = (int) (Math.random() * 5);
    int y = (int) (Math.random() * 5);
    if ((arr[x][y] != arr[2][2])) {
      arr[x][y] = "~@m";
      return ;
    }
    isMonster();
  }

  public static void Print() {
    for (int row = 0; row < 5; row++) {
      System.out.println();
      for (int col = 0; col < 5; col++) {
        System.out.print(arr[row][col] + "   ");
      }
    }
  }
}
