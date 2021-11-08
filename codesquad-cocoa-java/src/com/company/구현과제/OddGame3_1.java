package com.company.구현과제;

import java.util.Random;
import java.util.Scanner;

public class OddGame3_1 {
  // 유지되어야 하는 정보 => 내 포인트, 컴퓨터 포인트
  // =======================================
  // 1.이름을 입력받는다.-> 아웃풋이 출력된다.
  // 2.배당할 금액을 입력받는다. -> 아웃풋이 출력된다.
  // 3.홀짝을 입력한다.
  // 4. 계산된다.
  // ========================================
  static int point = 100;
  static int inputPoint = 0;
  static int computerpoint = 120;

  public static void main(String[] args) {

    System.out.println("이름을 입력해주세요 : ");
    System.out.printf("%s님 게임을 시작하겠습니다. 당신은 100원을 가지게 되고, 상대는 120원을 가지게 됩니다. \n", Input());
    inputPoint = IntegerInput();

    for (; point > 0; ) {
      myOddEven();
    }
  }

  public static void myOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    String input = Input();
    int cnt = 0;

    if (input.equals(computerOddEven())) {
      System.out.println("You Win!!!");
      cnt++;
      point += inputPoint;
      System.out.printf("이겼을 때 나의 점수는 \'%d\' \n", point);
      computerPoint(cnt);
      inputPoint = IntegerInput();

    } else {
      System.out.println("Lose.");
      cnt--;
      point -= inputPoint;
      System.out.printf("졌을 때 나의 점수는 \'%d\' \n", point);
      computerPoint(cnt);

      if (point > 0) {
        inputPoint = IntegerInput();
      } else {
        System.out.println("패배");
      }
    }
  }

  public static void newComputer() {
    double numStage = 2;
    computerpoint = point * (int) (Math.pow(1.2, numStage));
    System.out.printf("새롭게 시작한 컴퓨터의 점수는 : \n", computerpoint);
  }

  public static void computerPoint(int cnt) {
    int count = cnt;
    if (computerpoint < 0) {
      newComputer();
    }

    if (count == 1) {
      computerpoint -= inputPoint;
      System.out.printf("상대 점수는 \'%d\' : \n", computerpoint);
    } else {
      computerpoint += inputPoint;
      System.out.printf("상대 점수는 \'%d\' : \n", computerpoint);
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
    return a;
  }

  public static String Input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }
}
