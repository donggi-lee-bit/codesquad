package com.company.구현과제;

import java.util.Random;
import java.util.Scanner;

public class OddGame3_1 {

  static int point = 100;
  static int inputPoint = 0;
  public static void main(String[] args) {

    System.out.println("이름을 입력해주세요 : ");
    System.out.printf("%s님 게임을 시작하겠습니다. 당신은 100원을 가지게 됩니다. \n", Input());
    inputPoint = IntegerInput();

    for (; point > 0; ) {
      myOddEven();
    }
  }

  public static void MyLosePoint() {
    point -= inputPoint;
    System.out.printf("졌을 때 나의 점수는 \'%d\' \n", point);
    IntegerInput();
  }
  public static void MyUpPoint() {
    point += inputPoint;
    System.out.printf("이겼을 때 나의 점수는 \'%d\' \n", point);
    IntegerInput();
  }

  // input 으로 홀 이 들어오면.
  public static void myOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    String input = Input();
    if (input.equals(computerOddEven())) {
      System.out.println("You Win!!!");
      MyUpPoint();
    } else {
      System.out.println("Lose.");
      MyLosePoint();
    }
  }

  public static String computerOddEven() {
    Random rand = new Random();
    int randomInt = rand.nextInt(20) + 1;
    String odds = "홀";
    String evens = "짝";

    if (randomInt % 2 == 0) {
      System.out.println(randomInt);
      return evens;
    } else {
      System.out.println(randomInt);
      return odds;
    }
  }

  public static int IntegerInput() {
    System.out.println("베팅할 금액을 입력하세요 : ");
    String in = Input();

    int a = Integer.parseInt(in);
    inputPoint = 0;
    return a;
  }

  public static String Input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }

}
