package com.donggi.GameMachine;

public class Board {

  /*
  - 5 * 5 의 보드를 만들어보자. 모양은
  [ ] [ ] [ ] [ ] [ ]
  [ ] [ ] [ ] [ ] [ ]
  [ ] [ ] [H] [ ] [ ]
  [ ] [ ] [ ] [ ] [M]
  [ ] [ ] [ ] [ ] [ ]
   */

  static int[][] boardArr = new int[5][5];
  static int myMonster = 3;
  static int myBomb = 4;
  static int checkZero = 0;

  public static void board() {

    int myCharacter = 2;

    int characterX = 2;
    int characterY = 2;

    boardArr[characterX][characterY] = myCharacter;



    checkBoard(myBomb);
    checkBoard(myMonster);

    for (int i = 0; i < boardArr.length; i++) {
      for (int j = 0; j < boardArr[i].length; j++) {
        System.out.print(boardArr[i][j]);
      }
      System.out.println();
    }
  }

  private static void checkBoard(int gameObject) {
    int x = (int) (Math.random() * 5);
    int y = (int) (Math.random() * 5);

    if (boardArr[x][y] == checkZero) {
      boardArr[x][y] = gameObject;
      return ;
    }
    checkBoard(gameObject);
  }
}
