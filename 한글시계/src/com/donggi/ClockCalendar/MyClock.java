package com.donggi.ClockCalendar;

import java.time.LocalTime;

public class MyClock {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {
    board();
  }

  public static void clock() {
    board();
  }

  private static void board() {
    String[][] board = {{"한", "두", "세", "네", "다", "섯"},
        {"여", "섯", "일", "곱", "여", "덟"},
        {"아", "홉", "열", "한", "두", "시"},
        {"자", "이", "삼", "사", "오", "십"},
        {"정", "일", "이", "삼", "사", "육"},
        {"오", "오", "칠", "팔", "구", "분"}};

    LocalTime localtime = LocalTime.now();
    int hour;
    if (localtime.getHour() > 12) {
      hour = localtime.getHour() - 12;
    } else {
      hour = localtime.getHour();
    }








    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("현재 시간은 : " + ANSI_GREEN + localtime + ANSI_RESET + " 입니다");
    System.out.println(hour);
//    System.out.println(hourTen);
//    System.out.println(hourOne);
//    System.out.println(minuteTen);
//    System.out.println(minuteOne);
//    System.out.println(Arrays.toString(board));
//    System.out.println(board.length);
  }

}
