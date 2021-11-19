package com.donggi.ClockCalendar;

import java.time.LocalTime;

public class MyClock {

  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String[][] board = {{"한", "두", "세", "네", "다", "섯"},
      {"여", "섯", "일", "곱", "여", "덟"},
      {"아", "홉", "열", "한", "두", "시"},
      {"자", "이", "삼", "사", "오", "십"},
      {"정", "일", "이", "삼", "사", "육"},
      {"오", "오", "칠", "팔", "구", "분"}};

  public static void clock() {
    board();
  }

  private static void board() {


    LocalTime localtime = LocalTime.now();




    int firstMinute = localtime.getMinute() / 10;
    int lastMinute = localtime.getMinute() % 10;
    int hour;
    int minute = localtime.getMinute();

    getFirstMinute(firstMinute);
    getLastMinute(lastMinute);

    if (localtime.getHour() > 12) {
      hour = localtime.getHour() - 12;
    } else {
      hour = localtime.getHour();
    }
    getHour(hour);

    if (hour == 0 && minute == 0) {
      board[3][0] = ANSI_GREEN + board[3][0] + ANSI_RESET;
      board[4][0] = ANSI_GREEN + board[4][0] + ANSI_RESET;
    }
    if (hour == 12 && minute == 0) {
      board[4][0] = ANSI_GREEN + board[4][0] + ANSI_RESET;
      board[5][0] = ANSI_GREEN + board[5][0] + ANSI_RESET;
    }
//    if (hour == 11) {
//      board[2][2] = ANSI_GREEN + board[2][2] + ANSI_RESET;
//      board[2][3] = ANSI_GREEN + board[2][3] + ANSI_RESET;
//    }

    System.out.println("\n");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }

//    System.out.println("현재 시간은 : " + ANSI_GREEN + localtime + ANSI_RESET + " 입니다");
//    System.out.println(hour);
//    System.out.println(hourTen);
//    System.out.println(hourOne);
//    System.out.println(minuteTen);
//    System.out.println(minuteOne);
//    System.out.println(Arrays.toString(board));
//    System.out.println(board.length);
  }

  private static void getHour(int hour) {
    switch (hour) {
      case 0:
        board[2][2] = ANSI_GREEN + board[2][2] + ANSI_RESET;
        board[2][4] = ANSI_GREEN + board[2][4] + ANSI_RESET;
        break;
      case 1:
        board[0][0] = ANSI_GREEN + board[0][0] + ANSI_RESET;
        break;
      case 2:
        board[0][1] = ANSI_GREEN + board[0][1] + ANSI_RESET;
        break;
      case 3:
        board[0][2] = ANSI_GREEN + board[0][2] + ANSI_RESET;
        break;
      case 4:
        board[0][3] = ANSI_GREEN + board[0][3] + ANSI_RESET;
        break;
      case 5:
        board[0][4] = ANSI_GREEN + board[0][4] + ANSI_RESET;
        board[0][5] = ANSI_GREEN + board[0][5] + ANSI_RESET;
        break;
      case 6:
        board[1][0] = ANSI_GREEN + board[1][0] + ANSI_RESET;
        board[1][1] = ANSI_GREEN + board[1][1] + ANSI_RESET;
        break;
      case 7:
        board[1][2] = ANSI_GREEN + board[1][2] + ANSI_RESET;
        board[1][3] = ANSI_GREEN + board[1][3] + ANSI_RESET;
        break;
      case 8:
        board[1][4] = ANSI_GREEN + board[1][4] + ANSI_RESET;
        board[1][5] = ANSI_GREEN + board[1][5] + ANSI_RESET;
        break;
      case 9:
        board[2][0] = ANSI_GREEN + board[2][0] + ANSI_RESET;
        board[2][1] = ANSI_GREEN + board[2][1] + ANSI_RESET;
        break;
      case 10:
        board[2][2] = ANSI_GREEN + board[2][2] + ANSI_RESET;
        break;
      case 11:
        board[2][2] = ANSI_GREEN + board[2][2] + ANSI_RESET;
        board[2][3] = ANSI_GREEN + board[2][3] + ANSI_RESET;
        break;
    }
    board[2][5] = ANSI_GREEN + board[2][5] + ANSI_RESET;
  }

  private static void getLastMinute(int lastMinute) {
    switch (lastMinute) {
      case 1:
        board[4][1] = ANSI_GREEN + board[4][1] + ANSI_RESET;
        break;
      case 2:
        board[4][2] = ANSI_GREEN + board[4][2] + ANSI_RESET;
        break;
      case 3:
        board[4][3] = ANSI_GREEN + board[4][3] + ANSI_RESET;
        break;
      case 4:
        board[4][4] = ANSI_GREEN + board[4][4] + ANSI_RESET;
        break;
      case 5:
        board[5][1] = ANSI_GREEN + board[5][1] + ANSI_RESET;
        break;
      case 6:
        board[4][5] = ANSI_GREEN + board[4][5] + ANSI_RESET;
        break;
      case 7:
        board[5][2] = ANSI_GREEN + board[5][2] + ANSI_RESET;
        break;
      case 8:
        board[5][3] = ANSI_GREEN + board[5][3] + ANSI_RESET;
        break;
      case 9:
        board[5][4] = ANSI_GREEN + board[5][4] + ANSI_RESET;
        break;

    }
    board[5][5] = ANSI_GREEN + board[5][5] + ANSI_RESET;
  }

  private static void getFirstMinute(int firstMinute) {
    // 십
    if (firstMinute != 0) {
      board[3][5] = ANSI_GREEN + board[3][5] + ANSI_RESET;
    }

    switch (firstMinute) {
      case 2:
        board[3][1] = ANSI_GREEN + board[3][1] + ANSI_RESET;
        break;
      case 3:
        board[3][2] = ANSI_GREEN + board[3][2] + ANSI_RESET;
        break;
      case 4:
        board[3][3] = ANSI_GREEN + board[3][3] + ANSI_RESET;
        break;
      case 5:
        board[3][4] = ANSI_GREEN + board[3][4] + ANSI_RESET;
        break;
    }
    board[5][5] = ANSI_GREEN + board[5][5] + ANSI_RESET;
  }

}
