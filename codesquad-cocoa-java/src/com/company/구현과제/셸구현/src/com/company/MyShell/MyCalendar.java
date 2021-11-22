package com.company.MyShell;

import java.time.LocalDate;
import java.util.Scanner;

public class MyCalendar {

  public static Scanner sc = new Scanner(System.in);
  private static String strWeek = "SUN  MON  TUE  WED  THU  FRI  SAT";

  public static void getCal() {
    System.out.print("확인하고 싶은 연도와 월을 입력해주세요 : ");
    String inputYear = sc.nextLine();
    String[] strArr = inputYear.split("\\.|,| |-|/");
    int year = Integer.parseInt(strArr[0]);
    int month = Integer.parseInt(strArr[1]);
    cal(year, month);
  }

  private static void cal(int year, int month) {

    LocalDate initial = LocalDate.of(year, month, 1);
    int endOfTheDay = initial.lengthOfMonth();
    int changeWeekPoint = initial.getDayOfWeek().getValue();
    // a -> 1, i -> 6 \n

    // 1은 6일때 \n
    // 2는 5일때 \n
    // 3은 4일때 \n
    // 4는 3일때 \n
    // 5은 2일때 \n
    // 6은 1일때 \n

    // 첫째줄 개행해준 뒤로 7번의 for loop가 돌면 개행 출력


    /*
    * 공백을 출력하려는데
    * a -> 5, 공백은 5개
    * a -> 4, 공백은 4개
    * a -> 3, 공백은 3개
    * a -> 2, 공백은 2개
    * a -> 1, 공백은 1개
    *
    * */

    System.out.println(strWeek);
    for (int i = 0; i < changeWeekPoint; i++) {
      System.out.print("     ");
    }

    String[] board = new String[32];
    for (int i = 1; i < endOfTheDay + 1; i++) {
      board[i] = Integer.toString(i);

      if (i < 10) {
        System.out.print("" + board[i] + "    ");
      } else {
        System.out.print("" + board[i] + "   ");
      }

      if ((changeWeekPoint + i) % 7 == 0){
        System.out.println("");
      }
    }
  }

  private void clock(String s) {

    MyThread th = new MyThread();
    if (s.equals("clock")) {
      th.start();
    }
  }
}
