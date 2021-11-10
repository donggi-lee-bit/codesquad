package 홀짝게임;

import java.util.Scanner;

public class UserInput {

  public String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }

  public int inputInteger() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    return num;
  }

  public static void printErrorMessage() {
    System.out.println("플레이어가 가진 포인트보다 많습니다.");
  }

  public int inputBet() {
    System.out.println("베팅할 포인트를 입력해주세요 : ");
    GameMachine.inputUserPoint = inputInteger();
    return GameMachine.inputUserPoint;
  }
}

