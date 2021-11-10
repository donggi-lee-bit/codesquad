package 홀짝게임;

import java.util.Scanner;

public class UserInput {

  public String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }

  public static void printErrorMessage() {
    System.out.println("올바르지 않은 형식입니다.");
  }

  public int inputBet() {
    System.out.println("베팅할 포인트를 입력해주세요 : ");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    GameMachine.inputUserPoint = num;
    return GameMachine.inputUserPoint;
  }

  public String inputOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    String str = input();
    return str;
  }
}

