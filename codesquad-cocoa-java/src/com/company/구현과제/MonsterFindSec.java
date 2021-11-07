package com.company.구현과제;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterFindSec {

  static String[][] arr = new String[5][5];
  static int myX = 2;
  static int myY = 2;

  public static void main(String[] args) {
	// 배열을 "O"로 초기화
    for (int i = 0; i < 5; i++) {
      Arrays.fill(arr[i], "O");
    }
	// 현재 캐릭터 위치
    arr[myX][myY] = "H";
	// 랜덤하게 폭탄 설치
    isBomb();
	// 랜덤하게 몬스터 설치
    isMonster();
	// input, wasd 등 방향 입력 받기
    Input();

	In
  }

  public static void Input() {
    Scanner sc = new Scanner(System.in);
	// 입력을 언제까지 요청할거냐? H 가 폭탄이나 몬스터에 겹쳐질때까지
    System.out.println("입력해주세요 : ");
    String key = sc.nextLine();
    if (key == "w" && myX < 4) {
      myX++;
      Print();
      System.out.println("과연 myX의 값은? : " + myX);
      System.out.println("어떻게 하면 ? : " + myX);
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
