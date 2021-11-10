package 홀짝게임;

import java.util.Random;
import java.util.Scanner;

public class Main {
  // 유지되어야 하는 정보 => 내 포인트, 컴퓨터 포인트
  // =======================================
  // 1.이름을 입력받는다.-> 아웃풋이 출력된다.
  // 2.배당할 금액을 입력받는다. -> 아웃풋이 출력된다.
  // 3.홀짝을 입력한다.
  // 4. 계산된다.
  // ========================================
  // 현재 구현되지 않은 것
  // 1. 새로운 스테이지 들어갈 때 컴퓨터 포인트에 지수 계산 적용이 안됨
  // 2. 예외처리 (가진 포인트만큼 베팅 걸 수 있는 등)
  // 3. 게임 오버시 이름을 입력받고 랭킹을 출력한다. (랭킹은 소지금이 많을수록, 턴이 작을수록 높아진다.)
  // 4. 게임 종료후 재시작시 이어하기 기능.

  static int point = 100;
  static int inputUserPoint = 0;
  static int computerPoint = 120;
  static int numStage = 1;

  public static void main(String[] args) {

    start();
    inputUserPoint = UserInput.changeInteger();

    for (; point > 0; ) {
      myOddEven();
    }
  }

  public static void start() {
    System.out.println("이름을 입력해주세요 : ");
    System.out.printf("%s님 게임을 시작하겠습니다. 당신은 100원을 가지게 되고, 상대는 120원을 가지게 됩니다. \n", UserInput.input());
  }

  public static void myOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    String input = UserInput.input();
    int cnt = 0;

    if (input.equals(Computer.computerOddEven())) {
      System.out.println("You Win!!!");
      cnt++;
      point += inputUserPoint;
      System.out.printf("게임에서 이겼습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      Computer.computerPoint(cnt);
      inputUserPoint = UserInput.changeInteger();

    } else {
      System.out.println("Lose.");
      cnt--;
      point -= inputUserPoint;
      System.out.printf("졌습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      Computer.computerPoint(cnt);

      if (point > 0) {
        inputUserPoint = UserInput.changeInteger();
      } else {
        System.out.println("패배");
      }
    }
  }

  public static void newStage() {
    if (numStage != 8) {
      ++numStage;
    } else {
      System.out.println("============ 플레이어의 승리입니다 ============");
    }
    int newScore = point * ((int) (Math.pow(1.2, numStage)));
    Computer.computerPoint(newScore);
    System.out.printf("stage%d 새롭게 시작한 컴퓨터의 점수는 : %d \n", numStage, computerPoint);
  }
}