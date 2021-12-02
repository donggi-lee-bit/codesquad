package com.company.재귀의기초;

public class CountDown {

  static int num = 10;
  public static void main(String[] args) {

    countDown(num);
  }

  public static void countDown(int num) {
    if (num > 0) {
      System.out.printf("변수 num : %d \n", num);
      countDown(num - 1);
    }
  }

}
