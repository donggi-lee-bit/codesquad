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
  public static void board() {
    int[][] boardArr = new int[5][5];
//    int myCharacter = 2;
//    int myMonster = 3;
//    int characterX = 2;
//    int characterY = 2;
//    boardArr[characterX][characterY] = myCharacter;

    for (int i = 0; i < boardArr.length; i++) {
      for (int j = 0; j < boardArr[i].length; j++) {
        System.out.print(boardArr[i][j]);
      }
      System.out.println();
    }
  }
}
