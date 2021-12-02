package 홀짝게임;

import java.util.InputMismatchException;
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
  // 1. 새로운 스테이지 들어갈 때 컴퓨터 포인트에 지수 계산 적용이 안됨 -> 되고있으나 이 점수가 맞나..
  // 2. 예외처리 (가진 포인트만큼 베팅 걸 수 있는 등) -> 했으나 외 않되
  // 3. 게임 오버시 이름을 입력받고 랭킹을 출력한다. (랭킹은 소지금이 많을수록, 턴이 작을수록 높아진다.)
  // 4. 게임 종료후 재시작시 이어하기 기능.




  public static void main(String[] args) {

    start();
    betting();
    game();
  }

  public static void betting() {
    UserInput in = new UserInput();
    try {
      in.inputBet();
    } catch (Exception e) {
      Validation.printErrorMessage();
      betting();
    }
  }

  public static void game() {
    for (; GameMachine.point > 0; ) {
      GameMachine.gameOddEven();
    }
  }

  public static void start() {

    UserInput in = new UserInput();

    System.out.println("이름을 입력해주세요 : ");
    GameMachine.userName = in.input();
    System.out.printf("%s님 게임을 시작하겠습니다. 당신은 \'100\' 포인트를 가지게 되고, 상대는 \'120\' 포인트를 가지게 됩니다. \n", GameMachine.userName);
  }
}