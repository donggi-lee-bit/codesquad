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
  static int characterX = 2;
  static int characterY = 2;
  static int myCharacter = 2;

  public static void board() {


    boardArr[characterX][characterY] = myCharacter;
    checkBoard(myBomb);
    checkBoard(myMonster);
    printBoard();
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

  public void movingCharacter(String command) {
    int x = 0;
    int y = 0;

    if (command.equals("w")) {
      x = characterX - 1;
      y = characterY;
    }

    if (command.equals("a")) {
      x = characterX;
      y = characterY - 1;
    }

    if (command.equals("s")) {
      x = characterX + 1;
      y = characterY;
    }

    if (command.equals("d")) {
      x = characterX;
      y = characterY + 1;
    }

    if (x < 0) {
      x = 0;
    }

    if (y < 0) {
      y = 0;
    }

    if (x > 4) {
      x = 4;
    }

    if (y > 4) {
      y = 4;
    }


    boardArr[characterX][characterY] = 0;
    boardArr[x][y] = myCharacter;
    characterX = x;
    characterY = y;
    printBoard();
  }

  private static void printBoard() {
    for (int i = 0; i < boardArr.length; i++) {
      for (int j = 0; j < boardArr[i].length; j++) {
        System.out.print(boardArr[i][j]);
      }
      System.out.println();
    }
  }
}