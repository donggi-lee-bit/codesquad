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

    x = getXY(x);

    y = getXY(y);

    boardArr[characterX][characterY] = 0;
    characterX = x;
    characterY = y;

    int check = boardArr[x][y];
    reaction(check);

    boardArr[x][y] = myCharacter;
    printBoard();

  }

  private void reaction(int check) {
    if (check == myBomb) {
      System.out.println("폭탄을 밟아버렸습니다~~~~~~~~~~~~~~");
    }

    if (check == myMonster) {
      System.out.println("모오오오오오온스터야야야야야야~~~~~~~~~~");
    }
  }

  private int getXY(int x) {
    if (x < 0) {
      x = 0;
    }

    if (x > 4) {
      x = 4;
    }
    return x;
  }

  public static void printBoard() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < boardArr.length; i++) {
      for (int j = 0; j < boardArr[i].length; j++) {

        if (boardArr[i][j] == checkZero) {
          sb.append("[ ]");
        }

        if (boardArr[i][j] == myBomb) {
          sb.append("[ ]");
        }

        if (boardArr[i][j] == myMonster) {
          sb.append("[M]");
        }

        if (boardArr[i][j] == myCharacter) {
          sb.append("[H]");
        }
      }
      sb.append("\n");
    }
    System.out.println();
    System.out.println(sb);
  }
}