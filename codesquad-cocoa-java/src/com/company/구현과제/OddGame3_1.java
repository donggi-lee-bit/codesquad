package com.company.구현과제;

import java.util.Random;
import java.util.Scanner;

public class OddGame3_1 {

  public static void main(String[] args) {

    System.out.println("이름을 입력해주세요 : ");
    System.out.printf("%s님 게임을 시작하겠습니다. 당신은 100원을 가지게 됩니다. ", Input());
    System.out.println("베팅할 금액을 입력하세요 : ");
    IntegerInput(Input());
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    myOddEven(Input());
  }

  // input 으로 홀 이 들어오면.
  public static void myOddEven(String input) {
    if (input == "홀") {
      if (computerOddEven() == input) {
        System.out.println("정답입니다!!!!!!!!!!!!");

      } else if (computerOddEven() != input) {
        System.out.println("오답이다 짜식아~!!!!!!!!!!!!!");
      }
    }
  }

  public static String computerOddEven() {
    Random rand = new Random();
    String odds = "홀";
    String evens = "짝";

    if (rand.nextInt(20) % 2 == 0) {
      return evens;
    } else if (rand.nextInt(20) % 2 == 1) {
      return odds;
    }
    System.out.println(rand.nextInt(20));
  }

  public static int IntegerInput(String s) {
    int a = Integer.parseInt(s);
    return a;
  }

  public static String Input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }

}
